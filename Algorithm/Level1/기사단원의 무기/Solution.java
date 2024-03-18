// 약수 구하기 시간 체크
// 참고 : https://chwan.tistory.com/entry/Java-%EC%95%BD%EC%88%98%EC%9D%98-%EA%B0%9C%EC%88%98-%EA%B5%AC%ED%95%98%EA%B8%B0

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] factors = new int[number+1];
        
        //  약수 구하기
        for(int n = 1;n<=number;n++){
            int cnt = 0;

            for(int i=1;i * i <=n;i++){
                if(i * i == n) {
                    cnt++;
                } else if(n % i == 0) {
                    cnt += 2;
                }
            }

            factors[n] = cnt;
        }

        for(int i=1;i<=number;i++) {
            if(factors[i] > limit) answer += power;
            else answer += factors[i];
        }
        
        return answer;
    }
}
