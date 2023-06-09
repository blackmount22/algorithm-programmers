class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        //int lottos[] = {44, 1, 0, 0, 31, 25};
		//int win_nums[] = { 31, 10, 45, 1, 6, 19};
		int result[] = {6,5,4,3,2,1};
		
		int sameNums = 0;
		int zeroNums = 0;
		
		for(int i=0;i<lottos.length;i++) {
			for(int j=0;j<win_nums.length;j++) {
				if(lottos[i] == win_nums[j]) sameNums++;
			}
			
			if(lottos[i] == 0) zeroNums++;
		}
		
		int idx1 = 0;
		int idx2 = 0;
		
		if(sameNums + zeroNums > 1) idx1 = sameNums + zeroNums -1;
		if(sameNums > 1) idx2 = sameNums -1;
        
        int answer[] = {result[idx1 ], result[idx2]};
        
        return answer;
    }
}
