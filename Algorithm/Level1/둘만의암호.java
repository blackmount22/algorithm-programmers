
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        char[] word = s.toCharArray();
        for(int i=0;i<word.length;i++) {
            for(int j=0;j<index;j++) {              
                do {
                    word[i]++;
                    if(word[i] >'z') word[i] -= 26;

//                  System.out.println(j);
//                  System.out.println(word[i]);
                }while(skip.contains(String.valueOf(word[i])));
            }
        }

        answer = String.valueOf(word);

        return answer;
    }
}
