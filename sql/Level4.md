[프로그래머스 SQL Level4](https://school.programmers.co.kr/learn/challenges)

## 1. 우유와 요거트가 담긴 장바구니
---
```sql
SELECT cart_id
FROM CART_PRODUCTS
WHERE cart_id in(
    SELECT cart_id
    FROM CART_PRODUCTS
    WHERE NAME = 'Milk'
)
and name = 'Yogurt'
order by cart_id
```
<br>

## 2. 입양 시각 구하기(2)
---
```sql
WITH RECURSIVE num(HOUR) as
(
    SELECT 0
    UNION ALL
    SELECT HOUR+1 FROM num WHERE HOUR < 23
)

SELECT
    A.Hour as HOUR
,   CASE WHEN B.COUNT is null THEN 0
    ELSE B.COUNT END as count
FROM NUM A
LEFT JOIN
    (
        SELECT 
            C.H
        ,   COUNT(C.H) as COUNT
        FROM(
            SELECT 
                HOUR(DATETIME) AS H
            FROM ANIMAL_OUTS tp
        ) as C
        GROUP BY C.H
    ) as B on A.HOUR = B.H
```
<br>

## 3. 보호소에서 중성화한 동물
---
```sql

```
<br>
