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
