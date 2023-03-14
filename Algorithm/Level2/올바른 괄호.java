//Queue에 순서대로 괄호 add
//Queue에서 FIFO 방식으로 하나씩 poll, 
// 1.오른쪽 닫기 괄호로 시작 시 false
// 2.오른쪽 닫기 괄호가 왼쪽 닫기 괄호보다 갯수가 많을 경우 false
// 3.최종적으로 괄호 갯수가 맞지 않을 경우 false

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    boolean solution(String s) {
      boolean answer = true;

      char[] str = s.toCharArray();
      int leftSize = 0;
      int rightSize = 0;

      Queue<Character> block = new LinkedList<>();

      for(int i=0;i<str.length;i++) {
        if(str[0] == ')') {
          answer = false;
                  return answer;
        }

        block.add(str[i]);
      }

      int idx = 0;
      int blockSize = block.size();
      while(idx < blockSize) {
        char cBlock = block.poll();
        if(cBlock == '(') leftSize++;
        else if(cBlock == ')') rightSize++;

        if(rightSize > leftSize) {
          answer = false;
        }

        idx++;
      }

      if(leftSize != rightSize) answer = false;

      return answer;
    }
}
