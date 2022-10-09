
[프로그래머스 SQL Level1](https://programmers.co.kr/learn/challenges?tab=all_challenges)

## 1. 모든 레코드 조회하기
---
```sql
SELECT * 
FROM ANIMAL_INS as ai 
ORDER BY ai.animal_id
```
<br>

## 2. 최대값 구하기
---
```sql
SELECT ai.datetime 
FROM ANIMAL_INS as ai 
ORDER BY ai.datetime desc 
limit 1
```
<br>

## 3. 이름이 없는 동물의 아이디
---
```sql
SELECT animal_id 
FROM ANIMAL_INS 
WHERE name is null
```
<br>

## 4. 역순 정렬하기
---
```sql
SELECT ai.name, ai.datetime 
FROM ANIMAL_INS as ai
order by ai.animal_id desc
```
<br>

## 5. 이름이 있는 동물의 아이디
---
```sql
SELECT animal_id
FROM ANIMAL_INS
WHERE NAME is not null
ORDER BY animal_id
```
<br>

## 6. 아픈 동물 찾기
---
```sql
SELECT ai.animal_id, ai.name
FROM ANIMAL_INS as ai
WHERE ai.intake_condition = 'Sick'
ORDER BY ai.animal_id
```
<br>

## 7. 어린 동물 찾기
---
```sql
SELECT ai.animal_id, ai.name
FROM ANIMAL_INS as ai
WHERE ai.intake_condition != 'Aged'
ORDER BY ai.animal_id
```
<br>

## 8. 동물의 아이디와 이름
---
```sql
SELECT ai.animal_id, ai.name
from ANIMAL_INS as ai
ORDER BY ai.animal_id
```
<br>

## 9. 여러 기준으로 정렬하기
---
```sql
SELECT ai.animal_id, ai.name, ai.datetime
FROM ANIMAL_INS as ai
ORDER BY ai.name, ai.datetime desc
```
<br>

## 10. 상위 n개 레코드
---
```sql
SELECT ai.NAME 
FROM ANIMAL_INS as ai
ORDER BY ai.datetime
limit 1
```
<br>

## 11. 경기도에 위치한 식품창고 목록 출력하기
---
```sql
SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, IFNULL(FREEZER_YN, 'N') as FREEZER_YN
FROM FOOD_WAREHOUSE
WHERE ADDRESS LIKE '경기도%'
ORDER BY WAREHOUSE_ID
```
<br>
