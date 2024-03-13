import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 체육복 가지고 있는 학생
        int result = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 1. 여벌 체육복을 가져왔지만 도난 당한 학생 수
        // 즉, 다른 학생에게 빌려줄 수 없음
        for(int i=0;i<lost.length;i++){
            for(int j=0; j<reserve.length;j++){
                if(lost[i] == reserve[j]){
                    result++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        // 2. 도난 당했지만 체육복을 빌릴 수 있는 학생 수
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]){
                    result++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        return result;
    }
}
