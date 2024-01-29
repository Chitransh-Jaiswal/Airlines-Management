drop database flight_management;
CREATE DATABASE IF NOT EXISTS Flight_Management;
use Flight_Management;

Create table if not exists Logins (
Username varchar(20) , 
Password Varchar (20),
Type enum('admin','cust'),
Primary Key (Username)
);

Create table if not exists Customer (
Cust_num INT not null auto_increment , 
Username varchar(20) UNIQUE, 
Name varchar(40) ,check (Name not regexp '[0-9]'), 
Email varchar(20) , 
Gender enum("M" , "F") ,
Date_of_birth date not null  ,
passport_number varchar(15) not null , 
foreign key (Username) references Logins(Username) , 
Primary key (Cust_num) 
);

Create table if not exists Airplane (
Flight_num int not null auto_increment , 
num_seats int not null, check (num_seats >0), 
model varchar(20) ,
company varchar(20)  , 
primary key (Flight_num) 
);


Create table if not exists Airport (
Airport_num int not null auto_increment ,
Name Varchar(20) unique , 
Location varchar(20) unique , 
primary key (Airport_num)
) ;


Create table if not exists Flight_legs (
Leg_num int not null auto_increment ,
flight_num int ,
Arrival_Airport int ,
departure_airport int , 
flight_status enum
('ACTIVE','SCHEDULED', 'DELAYED','DEPARTED','LANDED','IN_AIR','ARRIVED','CANCELLED', 'DIVERTED', 'UNKNOWN' ) ,
distance int, check(distance >0),
arrival_time datetime , 
departure_time datetime,
avail_seats int,check(avail_seats > 0),
cost int  , 
primary key (Leg_num),  
foreign key (Arrival_Airport) references Airport(Airport_num)  on DELETE CASCADE,  
foreign key (departure_airport) references Airport(Airport_num) on DELETE CASCADE , 
foreign key (flight_Num) references airplane(flight_num) on DELETE CASCADE  
);


Create table if not exists ticket (
ticket_num int not null auto_increment , 
cust_num int not null , 
status enum( 'PENDING', 'CONFIRMED', 'CANCELLED') , 
leg_num int not null, 
seats int , 
foreign key (cust_num) references Customer(Cust_num)  , 
foreign key (leg_num ) references Flight_legs (Leg_num) on DELETE CASCADE , 
primary key (ticket_num)
) ;


create trigger loginsInsertCustomer after insert on logins for each row insert into customer(username,passport_number,date_of_birth) values (new.username, "0000000","0001-01-01");

insert into logins values ('admin','admin','admin');