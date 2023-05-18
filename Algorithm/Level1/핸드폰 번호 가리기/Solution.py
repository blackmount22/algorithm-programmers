def solution(phone_number):
    answer = ''
    
    for idx, val in enumerate(phone_number):
        if(idx < len(phone_number) -4):
            answer += '*'
        else :
            answer +=phone_number[idx]
    
    return answer
