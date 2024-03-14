import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        int[] answer = new int[targets.length];

        // HashMap 에 cnt 작은 KeyPad 설정
        // 설정된 HashMap에서 카운트 처리
        
        HashMap<Character, Integer> keyPad = new HashMap<>();

        for(int i=0;i<keymap.length;i++){
            for(int j=0;j<keymap[i].length();j++){
                char key = keymap[i].charAt(j);

                if(keyPad.containsKey(key)){
                    int idx = keyPad.get(key);
                    keyPad.put(key, Math.min(idx, j+1));
                } else {
                    keyPad.put(key, j+1);
                }
            }
        }

        for(int i=0;i<targets.length;i++){
            String targetKey = targets[i];
            int cnt =0;
            boolean hasKey = true;

            for(char curKey : targetKey.toCharArray()){
                if(keyPad.containsKey(curKey)){
                    cnt += keyPad.get(curKey);
                } else {
                    hasKey = false;
                    break;
                }
            }

            answer[i] = hasKey ? cnt : -1;
        }
        
        return answer;
    }
}
