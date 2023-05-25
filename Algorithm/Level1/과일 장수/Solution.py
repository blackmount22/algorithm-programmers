# 내림차순 정렬
# for 문 횟수 => score[] 배열을 m 으로 나눈 몫(만들 수 있는 사과 박스 개수) 만큼 실행
# 배열 Index 값으로 조회 처리

def solution(k, m, score):
    answer = 0
    
    score.sort(reverse=True)
    boxCnt = len(score)//m    

    arr = sorted(score, reverse=True)

    for i in range(0, boxCnt):
        answer += arr[(i * m) + m - 1] * m
    
    return answer
