create table User_Role (User_Name varchar(20) primary key,
Password varchar(12),Role_Code varchar(10));

create table Accounts (Account_Number number(10) primary key,
Insured_Name varchar(30),Insured_Street varchar(40),Insured_City varchar(15),
Insured_State varchar(15),Insured_Zip Number(5),Business_Segment varchar(30),
User_Name varchar(20), foreign key (User_Name)  references User_Role(User_Name));

create table Policy (Policy_Number number(10) primary key, Policy_Premium number(8,2),
Account_Number number(10), foreign key (Account_Number) references Accounts(Account_Number));

create table Policy_Details(Policy_Number number(10),Question_ID varchar(15),
Answer varchar(30),
foreign key (Policy_Number)
references Policy(Policy_Number));

create table Business_Segment(Bus_Seg_Id varchar(10) unique,
Bus_Seg_Seq number(3),Bus_Seg_Name varchar(20));

create table Policy_Questions(Pol_Ques_Id varchar(10) primary key,
Pol_Ques_Seq number(3),Bus_Seg_Id varchar(10),Pol_Ques_Desc varchar(80),
Pol_Ques_Ans1 varchar(30),Pol_Ques_Ans1_weightage number(5),
Pol_Ques_Ans2 varchar(30),Pol_Ques_Ans2_weightage number(5),
Pol_Ques_Ans3 varchar(30),Pol_Ques_Ans3_weightage number(5),
Pol_Ques_Ans4 varchar(30),Pol_Ques_Ans4_weightage number(5),
foreign key(Bus_Seg_Id) references Business_Segment(Bus_Seg_Id));

create sequence acc_seq start with 1234567801 increment by 1;
create sequence pol_num_seq start with 1001 increment by 1;
create sequence bus_seg_seq start with 1 increment by 1;
create sequence ques_seq start with 1 increment by 1;

insert into User_Role values('Admin','Admin','Admin');

insert into Business_Segment values(1,bus_seg_seq.nextval,'Restaurant');
insert into Business_Segment values(2,bus_seg_seq.nextval,'Business Auto');
insert into Business_Segment values(3,bus_seg_seq.nextval,'Appartment');
insert into Business_Segment values(4,bus_seg_seq.nextval,'General Merchant');

insert into Policy_Questions values(10,ques_seq.nextVal,1,'Restaurant_Type','Only Dinning',200,'Dinning with Bar',400,'Dinning with Bar and Ent',600,'Take Away',800); 
insert into Policy_Questions values(11,ques_seq.nextVal,1,'Fine Arts','5000 to 15000',200,'15000 to 30000',400,'30000 to 50000',600,'more than 50000',800); 
insert into Policy_Questions values(12,ques_seq.nextVal,1,'Property Damage','upto 500000',200,'from 500000 to 1500000',400,'from 1500000 to 2500000',600,'more than 2500000',800); 
insert into Policy_Questions values(13,ques_seq.nextVal,1,'Liability Coverage','10000 to 15000',200,'15001 to 30000',400,'30001 to 40000',600,'more than 40001',800); 
insert into Policy_Questions values(14,ques_seq.nextVal,1,'Bodily Injury','upto 25000',200,'25001 to 50000',400,'50001 to 70000',600,'more than 70000',800); 

insert into Policy_Questions values(15,ques_seq.nextVal,2,'Vehicle_Type','Light',200,'Heavy',400,'Truck',600,'Two Wheeler',800); 
insert into Policy_Questions values(16,ques_seq.nextVal,2,'Vehicle Model Year','less than 2000',200,'2001 to 2005',400,'2006 to 2010',600,'more than 2011',800); 
insert into Policy_Questions values(17,ques_seq.nextVal,2,'Vehicle Model','High Segment',200,'Mid Segment',400,'Low Segment',600,'Economy',800); 
insert into Policy_Questions values(18,ques_seq.nextVal,2,'Daily Commute Distance','less than 20',200,'21 to 30',400,'31 to 50',600,'greater than 50',800); 
insert into Policy_Questions values(19,ques_seq.nextVal,2,'Bodily Injury Limit','10000 to 30000',200,'30001 to 50000',400,'50001 to 80000',600,'80001 to 100000',800);

insert into Policy_Questions values(20,ques_seq.nextVal,3,'Apartment_Sq_Ft','upto 1500 sq.ft',200,'from 1500 to 2500 sq.ft',400,'2500-5000',600,'more than 5000',800);
insert into Policy_Questions values(21,ques_seq.nextVal,3,'Build Year','before 2000',200,'2000-2010',400,'2010-2015',600,'after 2015',800);
insert into Policy_Questions values(22,ques_seq.nextVal,3,'Number of Fire Exits','1',200,'2 to 3',400,'3 to 5',600,'more than 5 ',800);
insert into Policy_Questions values(23,ques_seq.nextVal,3,'Asset Theft Limit','upto 25000',200,'25000-75000',400,'75000-1,50000',600,'more than 1,5001',800);
insert into Policy_Questions values(24,ques_seq.nextVal,3,'Number of Floors','Less than 5',200,'5 to 10',400,'10-30',600,'more than 30',800);

insert into Policy_Questions values(25,ques_seq.nextval,4,'Business_type','General Store',200,'Hardware',400,'Clothing',600,'Internet Cafe',800); 
insert into Policy_Questions values(26,ques_seq.nextval,4,'Asset Value','less than 1000000',200,'1000001 to 2500000',400,'2500001 to 3000000',600,'more than 3000000',800); 
insert into Policy_Questions values(27,ques_seq.nextval,4,'Property Size','Less than 5000 sq ft',200,'5000 to 10000 sq ft',400,'10000 to 15000 sq ft',600,'more than 15000sq ft',800); 
insert into Policy_Questions values(28,ques_seq.nextval,4,'Property Damage','Upto 500000',200,'500000 to 1000000',400,'1000000 to 1500000',600,'1500000 to 2000000',800); 
insert into Policy_Questions values(29,ques_seq.nextval,4,'Bodily Injury','10000 to 30000',200,'30001 to 50000',400,'50000 to 100000',600,'more than 100000',800);