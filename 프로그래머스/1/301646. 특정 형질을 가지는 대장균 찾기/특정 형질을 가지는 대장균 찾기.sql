select
    COUNT(*) as COUNT
from
    ECOLI_DATA
where
    NOT(GENOTYPE & 2) and ((GENOTYPE&1)or(GENOTYPE & 4))
;