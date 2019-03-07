package com.grep.sort;

import java.util.Arrays;

public class H_Index {

	public static void main(String[] args) {
		// int[] citations = { 4, 8, 9, 10, 0, 1, 2 };
		int[] citations = { 1, 2, 3, 3, 3, 3, 4, 4, 5, 6, 7, 7, 8, 8, 9, 9, 10, 10, 10 };
		System.out.println(solution(citations));
	}

	public static int solution(int[] citations) {
		int answer = 0;

		Arrays.sort(citations);
		int[] ascend = new int[citations.length];
		System.arraycopy(citations, 0, ascend, 0, citations.length);

		// 5, 4, 3, 2, 1
		for (int i = 0; i < citations.length; i++) {
			citations[i] = ascend[citations.length - 1 - i];
			// System.out.println(citations[i]);
		}

		for (int i = 0; i < citations.length+1; i++) {

//			count++;
//			if (citations[i] <= count) {
//				answer = citations[i];
//				break;
//			}
			
//			if (citations.Min() >= citations.Length)
//				return citations.Length;
			
			if(i == citations.length) {
				answer = i;
			}else if(citations[i] <= i) {
				answer = i;
				break;
			}
			
			if(citations[citations.length-1] >= citations.length) {
				answer = citations.length;
			}

		}

		return answer;
	}

}
