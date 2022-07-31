import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] answers) {
		int[] studentA = {1,2,3,4,5};
		int[] studentB = {2,1,2,3,2,4,2,5};
		int[] studentC = {3,3,1,1,2,2,4,4,5,5};
		int[] result;
		
		int answerA = 0;
		int answerB = 0;
		int answerC = 0;
		
		for(int i=0;i<answers.length;i++) {
			if(studentA[i%studentA.length] == answers[i]) answerA++;
			if(studentB[i%studentB.length] == answers[i]) answerB++;
			if(studentC[i%studentC.length] == answers[i]) answerC++;
		}
		
		int maxCnt = Math.max(Math.max(answerA, answerB), answerC);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		if(maxCnt == answerA) {
			ar.add(1);
		}
		
		if(maxCnt == answerB) {
			ar.add(2);
		}
		
		if(maxCnt == answerC) {
			ar.add(3);
		}
		
		Collections.sort(ar);
		result = new int[ar.size()];
		for(int i=0;i < ar.size();i++) {
			result[i] = ar.get(i);
		}
        
        return result;
    }
}
