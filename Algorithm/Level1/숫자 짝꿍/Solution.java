// 배열 SET 으로 [9~0] 카운트를 저장
// 각 배열 SET에 카운트 while문으로 일치할 경우 answer에 추가

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        int[] xNums = new int[10];
		int[] yNums = new int[10];
		
		for(String x : X.split("")) {
			xNums[Integer.parseInt(x)]++;
		}
		
		for(String y : Y.split("")) {
			yNums[Integer.parseInt(y)]++;
		}
		
		for(int i=9; i>=0;i--) {
			while(xNums[i] > 0 && yNums[i] > 0) {
				sb.append(i);
				
				xNums[i]--;
				yNums[i]--;
			}
		}
		
		if("".equals(sb.toString())) answer = "-1";
		else if("0".equals(sb.toString().substring(0,1))) answer = "0";
		else answer = sb.toString();
        
        return answer;
    }
}
