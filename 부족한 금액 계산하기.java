class Solution {
    public long solution(int price, int money, int count) {
        long answer;
    	
        long total = 0;
        
        	for (int i = 1; i <= count; i++) {
			total += price * i;
		}
		if (money >= total) {
			answer = 0;
		}
		else {
			answer = (long) (total - money);
		}    
        return answer;
    }
}