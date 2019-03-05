package com.grep.sort;

import java.util.Arrays;
import java.util.Comparator;

// 프로그래머스 > 정렬 > 가장 큰 수 
class LargestNumber {

	public static void main(String[] args) {
		int[] numbers = { 3, 30, 34, 5, 9 };
		System.out.println(solution(numbers));
	}

	public static String solution(int[] numbers) {
		String answer = "";
		String[] str_numbers = new String[numbers.length];

		for (int i = numbers.length - 1; i >= 0; i--) {
			str_numbers[i] = String.valueOf(numbers[i]);
		}

		Arrays.sort(str_numbers, new Compare());

		if(str_numbers[str_numbers.length-1].equals("0")) {
			answer += "0";
		}else {
			for (int i = str_numbers.length - 1; i >= 0; i--) {
				answer += str_numbers[i];
			}
		}

		return answer;
	}

}

class Compare implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return (o1 + o2).compareTo(o2 + o1);
	}

}
