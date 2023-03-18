// DFS, 재귀 함수 처리

class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        getDFS(numbers, 0, target, 0);
        return answer;
    }
    
    public void getDFS(int[] numbers, int depth, int target, int sum) {
		if(depth == numbers.length) {
			if(target == sum) answer++; 
		} else {
			getDFS(numbers, depth + 1, target, sum + numbers[depth]);
			getDFS(numbers, depth + 1, target, sum - numbers[depth]);
		}
	}
}
