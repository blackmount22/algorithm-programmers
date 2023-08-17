import java.util.*;

// 2019 KAKAO BLIND RECRUITMENT > 실패율
// 예제를 확인 시, 순차적으로 스테이지를 깨야하기 때문에
// 실패율의 분모 값은 이전 실패수 만큼 감소

/*****************************************************
 1. ArrayList Sorting 확인
 2. HashMap Value 값으로 내림차순 정렬
 3. List 형식 배열 형변환 Integer 일때 stream 활용 예제
******************************************************/

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        
        int pCnt = stages.length;
	HashMap<Integer, Float> map = new HashMap<>();
	
	for(int i=1;i<=N;i++) {
		int stagesStop = 0;
		
		for(int j=0;j<stages.length;j++) {
			if(stages[j] == i) {
				stagesStop++;
			}
		}
		
		float calc = 0;
		if(pCnt != 0) {
			calc = (float)stagesStop/pCnt;
		} 
    
		pCnt -= stagesStop;

		map.put(i, calc);	
	}
	
	List<Integer> keys = new ArrayList<>(map.keySet());
	Collections.sort(keys, (v2, v1) -> (map.get(v1).compareTo(map.get(v2))));
	
	answer = keys.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
