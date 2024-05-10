-- 코드를 입력하세요
SELECT
    U.USER_ID AS USER_ID,
    U.NICKNAME AS NICKNAME,
    CONCAT(
        U.CITY,
        ' ',
        U.STREET_ADDRESS1,
        ' ',
        U.STREET_ADDRESS2
    )AS '전체주소',
    CONCAT(
        SUBSTRING(U.TLNO,1,3),
        '-',
        SUBSTRING(U.TLNO,4,4),
        '-',
        SUBSTRING(U.TLNO,8)
    ) AS '전화번호'
FROM
    USED_GOODS_BOARD B
JOIN 
    USED_GOODS_USER U
ON 
    B.WRITER_ID = U.USER_ID
group by
    USER_ID
HAVING
    COUNT(USER_ID)>=3
ORDER BY
    U.USER_ID DESC
;