# Write your MySQL query statement below
select id
from (select id,
             recordDate,
             temperature,
             LAG(temperature) over(order by recordDate) as prev_temps,
             LAG(recordDate) over(order by recordDate) as prev_date
             from weather
             ) t
where datediff(recordDate,prev_date) = 1 and temperature > prev_temps;