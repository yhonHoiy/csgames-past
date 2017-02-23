#!/bin/bash

# Copyright Dome Systems.
#
# Dome Private License (D-PL) [a369] PubPL 36 (7 Gallium 369)
#
# * URL: http://csgames.org/2016/dome_license.md
# * Type: Software
# * Media: Software
# * Origin: Mines of Morriar
# * Author: R4PaSs

compile()
{
	compile_log=$1
	make compile --no-print-directory > "$compile_log" 2>&1
	return $?
}

run_test()
{
	run_input=$1
	run_output=$2
	bin/citysim.exe "$run_input" 100 > "$run_output" 2>&1
	return $?
}

diff_test()
{
	diff_input1=$1
	diff_input2=$2
	diff_output=$3
	diff -u -- "$diff_input1" "$diff_input2" > "$diff_output"
	return $?
}

run_all()
{
	out_dir=$1
	tests_dir=$2
	rm -rf $out_dir/*

	echo "Compile bin..."
	compile "$out_dir/compile.log"
	if [ "$?" -ne 0 ]; then
		echo " * [FAIL] compile bin (cat $out_dir/compile.log)"
		exit 1
	fi

	echo -e "\nRun tests..."
	OK=0
	KO=0
	ALL=0

	for input in $(ls "$tests_dir"/*.in); do
		ALL=$(($ALL + 1))

		file=$(basename "$input")
		name="${file%.*}"

		out="$out_dir/$name.out"
		exp="$tests_dir/$name.res"

		run_test "$input" "$out"
		diff_test "$out" "$exp" "$out_dir/$name.diff"
		if [ "$?" == 0 ]; then
			echo " * [OK] $name"
			OK=$(($OK + 1))
		else
			echo " * [FAIL] $name (diff $out $exp)"
			KO=$(($KO + 1))
		fi
	done

	echo -e "\n [ALL: $ALL, KO: $KO, OK: $OK]\n"
	if [ $KO -gt 0 ]; then
		echo "Some tests have FAILED!"
		return 1
	else
		echo "All tests are OK!"
		return 0
	fi
}

run_one()
{
	name=$1
	out_dir=$2
	tests_dir=$3

	echo "Compile bin..."
	compile "$out_dir/compile.log"
	if [ "$?" -ne 0 ]; then
		echo "[BUILD FAIL]"
		cat "$out_dir/compile.log"
		return 1
	fi

	input="$tests_dir/$name.in"
	out="$out_dir/$name.out"
	exp="$tests_dir/$name.res"

	echo "Run tests..."
	run_test "$input" "$out"
	diff_test "$out" "$exp" "$out_dir/$name.diff"
	if [ "$?" == 0 ]; then
		echo "[OK] $name"
		return 0
	else
		echo "[FAIL] $name"
		cat "$out_dir/$name.diff"
		return 1
	fi
}

mkdir -p out/
if [ -z "$1" ]; then
	run_all "out" "tests"
else
	run_one "$1" "out" "tests"
fi
exit $?