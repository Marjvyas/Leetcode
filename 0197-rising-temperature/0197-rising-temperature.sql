# Write your MySQL query statement below
select a.id from weather a join weather b on date(a.recorddate-interval 1 day)=date(b.recorddate) where a.temperature>b.temperature;