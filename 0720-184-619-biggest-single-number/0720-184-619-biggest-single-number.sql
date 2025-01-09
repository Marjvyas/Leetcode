# Write your MySQL query statement below
select coalesce(max(num),null) as num from (select num, count(*) from mynumbers group by num having count(*)=1) as n;