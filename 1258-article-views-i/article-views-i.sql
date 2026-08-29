# Write your MySQL query statement below
# no duplicate authors so distinct
select distinct author_id as id from views
where author_id = viewer_id
order by id;