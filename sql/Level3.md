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

## 2. 있었는데요 없었습니다
---
```sql
SELECT 
    ai.ANIMAL_ID
,   ai.NAME
FROM ANIMAL_INS ai
JOIN ANIMAL_OUTS ao on ai.ANIMAL_ID = ao.ANIMAL_ID
WHERE ao.DATETIME < ai.DATETIME
ORDER BY ai.DATETIME
```
<br>

## 3. 오랜 기간 보호한 동물(1)
---
```sql
SELECT 
    ai.NAME
,   ai.DATETIME
FROM ANIMAL_INS ai
LEFT JOIN ANIMAL_OUTS ao on ai.ANIMAL_ID = ao.ANIMAL_ID
WHERE ao.ANIMAL_ID is null
ORDER BY ai.DATETIME
limit 3
```
<br>

## 4. 헤비 유저가 소유한 장소
---
```sql
SELECT 
    pl2.ID
,   pl2.NAME
,   pl2.HOST_ID
FROM PLACES pl2
JOIN (
    SELECT
        pl.ID
    ,   pl.HOST_ID
    ,   COUNT(pl.HOST_ID) as cnt
    FROM PLACES pl
    GROUP BY HOST_ID
    HAVING COUNT(HOST_ID) > 1
) as b on pl2.HOST_ID = b.HOST_ID
```
<br>

## 5. 오랜 기간 보호한 동물(2)
---
```sql
SELECT 
    tp.ANIMAL_ID
,   tp.NAME
FROM (
    SELECT
        ai.ANIMAL_ID
    ,   ai.NAME
    ,   DATEDIFF(ao.DATETIME, ai.DATETIME) as diff
    FROM ANIMAL_INS ai
    JOIN ANIMAL_OUTS ao on ai.ANIMAL_ID = ao.ANIMAL_ID
) as tp
ORDER BY tp.diff desc
limit 2
```
<br>
