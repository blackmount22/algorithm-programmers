
[프로그래머스 SQL Level2](https://school.programmers.co.kr/learn/challenges)

## 1. 고양이와 개는 몇 마리 있을까
---
```sql
SELECT ANIMAL_TYPE, COUNT(ANIMAL_TYPE) as count
FROM ANIMAL_INS ai
GROUP BY ANIMAL_TYPE
order by animal_type
```
<br>

## 2. 루시와 엘라 찾기
---
```sql
SELECT ai.Animal_ID, ai.NAME, ai.SEX_UPON_INTAKE
FROM ANIMAL_INS ai
WHERE ai.Name in ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
ORDER BY ai.ANIMAL_ID
```
<br>
