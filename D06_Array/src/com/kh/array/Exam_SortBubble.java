package com.kh.array;

public class Exam_SortBubble {
	public static void main(String [] args) {
		// 버블 정렬 
		// 인접한 두개의 원소를 검사하여 정렬하는 방법
		// 구현의 쉽다는 장점이 있고. 이미 정렬된 데이터를 정렬할 때 가장 빠름
		// 다른 정렬에 비해 정렬 속도가 느리며, 역순으로 정렬할 떄 가장 느림
		
		int [] nums = {2, 5, 4, 1, 3};
		//2, 5 / 5, 4 / 4, 1 / 1, 3  왼쪽에서 오른쪽으로 인접한 수 비교 크면 오른쪽(비교횟수4)
		//2, 4, 1, 3, "5" -> 2부터 시작해서 비교시작했을 때 5는 계속밀려나서 오른쪽에서 정지(비교횟수3)
		//2, 1, 3, "4", "5" -> 인접한 두 수를 비교시작해서 4도 계속 밀려서 정지(비교횟수2)
		//1, 2, 3, 4, 5 정렬완료

		for(int i = 0; i < nums.length-1; i++) {
		//nums.length는 5이지만 위에 첫번째 비교횟수는 4번이기때문에 -1을 붙여준다
		//-1을 빼도 비교는 하지만 불필요한 동작을 줄이기 위해
			for(int j = 0; j < (nums.length-1)-i; j++) { // for문 횟수 감수
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+ " ");
		}
		
		
	}

}
