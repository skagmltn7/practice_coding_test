select
    COUNT(*) as FISH_COUNT, Month(TIME) as MONTH
from
    FISH_INFO
group by 
    Month(TIME)
order by
    2
;
