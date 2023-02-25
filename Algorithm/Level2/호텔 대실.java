
/*
[실패한 풀이 방향]
1. 종료 시간 + 10분 후 시간 더하기 처리
2. 1번을 배열로 정리 후 for문 한 번에 처리 할 것이라 예상

[풀이 방향]
1. 시간/분 분처리 함수 추가
2. 정렬이 필요하여 PriorityQueue, 우선순위 큐 활용
*/

import java.util.PriorityQueue;

class Solution {
    public int solution(String[][] book_time) {
        PriorityQueue<Integer> in = new PriorityQueue<>();
		PriorityQueue<Integer> out = new PriorityQueue<>();
		
		int max = 0;
		int cnt = 1;
		
		for(String[] time : book_time) {
			in.offer(getMin(time[0]));
			out.offer(getMin(time[1]) + 10);
		}
		
		while(!in.isEmpty() && !out.isEmpty()) {
			int endTime = out.poll();
			cnt--;
			
			while(!in.isEmpty() && in.peek() < endTime) {
				in.poll();
				cnt++;
			}
			
			max = Math.max(max, cnt);
		}
        
        return max;
    }
    
    public int getMin(String str){
		String[] s = str.split(":");
		return Integer.valueOf(s[1]) + Integer.valueOf(s[0]) * 60;
	}
}

