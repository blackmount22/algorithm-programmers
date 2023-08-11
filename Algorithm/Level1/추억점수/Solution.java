import java.util.ArrayList;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        ArrayList<Integer> ar = new ArrayList<>();
		
		for(int i=0;i<photo.length;i++) {
			int score = 0;
			
			for(int j=0;j<photo[i].length;j++) {
				for(int k=0;k<name.length;k++) {
					if(name[k].equals(photo[i][j])) {	
						score += yearning[k];
					}
				}
			}
			
			ar.add(score);
		}
		
		int[] answer = new int[ar.size()];
		
		for(int i=0;i<ar.size();i++) {
			answer[i] = ar.get(i).intValue();
		};
        return answer;
    }
}
