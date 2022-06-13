use world;
select * from city;
select * from country;
select * from countrylanguage;

select * from city where Name like 'j%';
select * from country where Name like 'j%';
select * from countrylanguage where Language like 'j%';

select continent from  city inner join country;
