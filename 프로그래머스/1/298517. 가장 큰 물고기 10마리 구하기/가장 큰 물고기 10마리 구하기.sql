select
    ID, LENGTH
from
    FISH_INFO
where
    LENGTH IS NOT NULL
ORDER BY LENGTH desc, ID asc
Limit 10
;