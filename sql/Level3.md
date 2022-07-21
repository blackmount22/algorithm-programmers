[프로그래머스 SQL Level3](https://school.programmers.co.kr/learn/challenges)

## 1. 없어진 기록 찾기
---
```sql
SELECT 
    ao.ANIMAL_ID
,   ao.NAME
FROM ANIMAL_OUTS ao
LEFT JOIN ANIMAL_INS ai on ao.ANIMAL_ID = ai.ANIMAL_ID
WHERE ai.ANIMAL_ID IS NULL
ORDER BY ao.ANIMAL_ID
```
<br>
