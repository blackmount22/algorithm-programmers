
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

## 3. 최솟값 구하기
---
```sql
SELECT datetime as 시간
FROM ANIMAL_INS ai
ORDER by datetime
limit 1
```
<br>

## 4. 동명 동물 수 찾기
---
```sql
SELECT ai.Name
,   count(ai.Name) as count
FROM ANIMAL_INS ai
GROUP BY ai.Name
HAVING count(ai.Name) > 1
ORDER BY ai.name
```
<br>

## 5. 이름에 el이 들어가는 동물 찾기
---
```sql
SELECT ai.ANIMAL_ID, ai.NAME
FROM ANIMAL_INS ai
WHERE ai.ANIMAL_TYPE = 'Dog'
AND ai.Name like '%el%'
ORDER BY ai.NAME
```
<br>

## 6. 동물 수 구하기
---
```sql
SELECT count(*) as count
FROM ANIMAL_INS ai
```
<br>

## 7. 입양 시각 구하기(1)
---
```sql
SELECT
    ao2.HOUR
,   COUNT(ao2.HOUR) as count
FROM (
    SELECT
    *
    ,   HOUR(ao.DATETIME) as HOUR
    FROM ANIMAL_OUTS ao
) as ao2
WHERE ao2.HOUR > 8 AND ao2.HOUR < 20
GROUP BY HOUR
ORDER BY ao2.hour
```
<br>


## 8. NULL 처리하기
---
```sql
SELECT
    ai.ANIMAL_TYPE
,   IFNULL(ai.NAME, 'No name')
,   ai.SEX_UPON_INTAKE
FROM ANIMAL_INS ai
ORDER BY ai.ANIMAL_ID
```
<br>

## 9. 중성화 여부 파악하기
---
```sql
SELECT 
    ANIMAL_ID
,   NAME
,   case when SEX_UPON_INTAKE like '%Neutered%' OR SEX_UPON_INTAKE like '%Spayed%' THEN 'O'
    else 'X' END as 중성화
FROM ANIMAL_INS 
ORDER BY ANIMAL_ID
```
<br>


## 10. 중복 제거하기
---
```sql
SELECT count(DISTINCT(ai.Name))
FROM ANIMAL_INS ai
WHERE ai.NAME is not null
```
<br>


## 11. DATETIME에서 DATE로 형변환
---
```sql
SELECT 
    ai.ANIMAL_ID
,   ai.NAME
,   date_format(ai.DATETIME, '%Y-%m-%d') as 날짜
FROM ANIMAL_INS ai
```
<br>

