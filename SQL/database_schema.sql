create table Users(
user_id int PRIMARY KEY AUTO_INCREMENT,
fullname varchar(100) NOT NULL,
email varchar(100) UNIQUE NOT NULL,
city varchar(100) NOT NULL,
registration_date date NOT NULL);

create table Events(
event_id int PRIMARY KEY AUTO_INCREMENT,
title varchar(200) NOT NULL,
description text,
city varchar(100) NOT NULL,
start_date datetime NOT NULL,
end_date datetime NOT NULL,
status enum ('upcoming','completed','cancelled'),
organizer_id int,
FOREIGN KEY (organizer_id) REFERENCES Users(user_id)
);
 
 create table Sessions(
 session_id int PRIMARY KEY auto_increment,
 event_id int,
 title varchar(200) NOT NULL,
 speaker_name varchar(100) NOT NULL,
 start_time datetime NOT NULL,
 end_time datetime NOT NULL,
 FOREIGN KEY(event_id) references Events(event_id)
 );
 
 create table Registrations(
 registration_id int PRIMARY KEY AUTO_INCREMENT,
 user_id int,
 event_id int,
 registration_date date NOT NULL,
 FOREIGN KEY (user_id) references Users(user_id),
 FOREIGN KEY (event_id) references Events(event_id)
 );
 
 create table Resources(
 resource_id int PRIMARY KEY AUTO_INCREMENT,
 event_id int,
 resource_type enum ('pdf','image','link'),
 resource_url varchar(225) NOT NULL,
 uploaded_at datetime NOT NULL,
 FOREIGN KEY (event_id) references Events(event_id)
 );

ALTER TABLE Users CHANGE fullname full_name VARCHAR(100) NOT NULL;
desc Users;
