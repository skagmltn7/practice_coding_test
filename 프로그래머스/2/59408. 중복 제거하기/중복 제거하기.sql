SELECT
    count(distinct(NAME)) as count
from
    ANIMAL_INS
where
    NAME IS NOT NULL
;