class Solution {
    public String solution(int[] food) {
        String answer = "";
		int[] cnt = new int[food.length];
		
		for(int i=1;i<food.length;i++) {
			int foodCnt = food[i];
			
			if(food[i]%2 == 1) foodCnt = food[i] - 1; 
			cnt[i] = foodCnt / 2;
		}
		
		for(int i=1;i<cnt.length;i++) {
			for(int j=0;j<cnt[i];j++) {
				answer += "" + i;
			}
		}
		
		answer += "0";
		
		for(int i=cnt.length-1;i>0;i--) {
			for(int j=0;j<cnt[i];j++) {
				answer += "" + i;
			}
		}
        
        return answer;
    }
}
