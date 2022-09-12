import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;

        ArrayList<Integer> arrList = new ArrayList<Integer>();

		while (n != 0) {
			arrList.add(n % 3);
			n /= 3;
		}

		// n이 0이 아니면 계속 반복
		// n%3의 나머지값을 리스트에 넣는다
		// n을 n/3 한 값으로 바꾼다
		// 현재 list에 순차적으로 3진법이 들어간다
        
        
        
		int j = 1;
		for (int i = arrList.size() - 1 ; i >= 0; i--) {
			answer += arrList.get(i) * j;
			j *= 3;
		}
        
        // arrList 사이즈(길이)만큼 반복문 선언
		// answer 값에 순차적으로 3의 n승만큼 넣는다.
        
        return answer;
    }
}