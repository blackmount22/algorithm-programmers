class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int aIdx = 0;
	int bIdx = 0;

	for(int i=0;i<goal.length;i++) {	
		if(aIdx < cards1.length && cards1[aIdx].equals(goal[i])) {
			aIdx++;
		} else if(bIdx < cards2.length && cards2[bIdx].equals(goal[i])) {
			bIdx++;
		} 
	}

	if (aIdx + bIdx < goal.length) answer = "No";
        
        return answer;
    }
}
