insert into user_details(id, birth_date, name)
values(10000, current_date(),'Kanzaki');

insert into user_details(id, birth_date, name)
values(10001, current_date(),'Kurokawa');

insert into user_details(id, birth_date, name)
values(10002, current_date(),'Takabe');

insert into user_details(id, birth_date, name)
values(10003, current_date(), 'Juzo');

-- Post creation
insert into post(id, description, user_id)
values(20000, 'Do you guys think anything is worth it ?', 10000);

insert into post(id, description, user_id)
values(20001, 'That is an interesting guys what do you think', 10003);

insert into post(id, description, user_id)
values(20002, 'Well anything being worth it or not, 
	depends on your state of mind', 10002);

insert into post(id, description, user_id)
values(20003, 'Yep agree with you Takabe. If Kanzaki thinks nothing is worth it,
	then getting in his state of mind is it worth answering this question :-) ', 
	10001);