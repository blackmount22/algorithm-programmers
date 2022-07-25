import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<moves.length;i++){
            int moveIdx = moves[i] - 1;
            
            for(int j=0;j<board.length;j++){
                int k = board[j][moveIdx];
            
                if(k == 0) continue;
                if(!stack.empty() && stack.peek() == k){
                    stack.pop();
                    answer += 2;
                } else {
                    stack.push(k);
                }
                
                board[j][moveIdx] = 0;
                break;
            }
        }
        
        return answer;
    }
}
