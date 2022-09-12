import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();

		int a = 10;				// 비교 정수 선언
			
			// 주어진 arr 배열의 길이 만큼 반복
			// 비교 정수와 같지 않다면
			// ArrayList에 추가 시키고
			// 비교 정수값을 arr[i] 배열 값으로 변경한다
		 
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != a) {
				arrList.add(arr[i]);
				a = arr[i];
			}
		}
			// 중복되지 않고 순서대로 들어간다
		
		
			
		
			// answer 의 배열 길이를 선언한다
			// 배열 길이는 arrList의 사이즈(길이)
			// answer의0번째 배열에 arrList.get(0)번째 값을 가져와서 넣는다.
			// 배열의 길이 만큼 반복
		answer = new int[arrList.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = arrList.get(i);
		}

        return answer;
    }
}