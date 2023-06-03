import java.util.Collection;
import java.util.Collections;

public class pgLv1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
		int[] answer = new int[N];
		
		double[] failure = new double[N];  
		
		for(int i=1;i<=N;i++) {
			int stagesStopCnt = 0;
			int stagesOverCnt = 0;
			
			for(int j=0;j<stages.length;j++) {
				if(stages[j] == i) {
					stagesStopCnt++; 
				} 
				
				if (stages[j] >= i) {
					stagesOverCnt++;
				}
			}
			
			answer[i-1] = i;
			System.out.println("[ "+i+" ] " + stagesStopCnt + "/"+stagesOverCnt);
			
			if(stagesOverCnt > 0 ) {
				failure[i-1] = (double)stagesStopCnt / (double)stagesOverCnt;
			} else {
				failure[i-1] = 0;
			}
		}
		
		for(int i=0;i<failure.length;i++) {
			double temp = 0;
			int tempIdx = 0;
			
			for(int j=1;j<failure.length;j++) {
				if(failure[i] < failure[j]) {
					temp = failure[i];
					failure[i] = failure[j];
					failure[j] = failure[i];
					
					tempIdx = answer[j-1];
					answer[j-1] = j;
					answer[j] = tempIdx;
				}
			}
		}
		
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}

}
