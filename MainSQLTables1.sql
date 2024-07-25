/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 8.0.23 : Database - codewithsameer
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`codewithsameer` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `codewithsameer`;

/*Table structure for table `categories` */

DROP TABLE IF EXISTS `categories`;

CREATE TABLE `categories` (
  `cid` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `categories` */

insert  into `categories`(`cid`,`name`,`description`) values 
(1,'Java Programming','Java is one of the most popular programming language.'),
(2,'Python Programming','Python is one of the most popular programming language , mainly Used for Machine Learning.'),
(3,'HTML ','HTML is Used in Front-end Designing.'),
(4,'CSS','CSS is Used in Front-end Designing.');

/*Table structure for table `liked` */

DROP TABLE IF EXISTS `liked`;

CREATE TABLE `liked` (
  `lid` int NOT NULL AUTO_INCREMENT,
  `pid` int DEFAULT NULL,
  `uid` int DEFAULT NULL,
  PRIMARY KEY (`lid`),
  KEY `pid` (`pid`),
  KEY `uid` (`uid`),
  CONSTRAINT `liked_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `posts` (`pid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `liked_ibfk_2` FOREIGN KEY (`uid`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `liked` */

insert  into `liked`(`lid`,`pid`,`uid`) values 
(6,6,1),
(7,6,3),
(8,5,3),
(9,4,3),
(10,4,3),
(11,6,3),
(12,6,3),
(13,5,3),
(14,5,3),
(15,6,3);

/*Table structure for table `message` */

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `chat_id` int NOT NULL AUTO_INCREMENT,
  `from_user` int NOT NULL,
  `to_user` int NOT NULL,
  `message` varchar(200) NOT NULL,
  `chat_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`chat_id`),
  KEY `fk_from_user` (`from_user`),
  KEY `fk_to_user` (`to_user`),
  CONSTRAINT `message_ibfk_3` FOREIGN KEY (`from_user`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `message_ibfk_4` FOREIGN KEY (`to_user`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=199 DEFAULT CHARSET=latin1;

/*Data for the table `message` */

insert  into `message`(`chat_id`,`from_user`,`to_user`,`message`,`chat_time`) values 
(172,3,2,'hello Naziya im Faizan','2021-04-18 23:09:19'),
(173,2,3,'hii','2021-04-18 23:12:57'),
(182,4,1,'hello Naziya im Faizan','2021-04-19 02:27:35'),
(190,3,1,'hello','2021-04-19 02:47:58'),
(191,2,3,'hello','2021-04-19 02:48:18'),
(192,2,1,'hello Sameer','2021-04-19 02:48:31'),
(194,2,1,'heyyy','2021-04-19 02:48:55'),
(195,3,1,'hello','2021-04-19 02:49:15'),
(196,3,2,'hello Naziya im Faizan','2021-04-19 02:49:27'),
(197,2,3,'how are you','2021-04-19 02:49:42'),
(198,3,2,'im fine','2021-04-19 02:49:54');

/*Table structure for table `message1` */

DROP TABLE IF EXISTS `message1`;

CREATE TABLE `message1` (
  `chat_id` int NOT NULL AUTO_INCREMENT,
  `from_user` int NOT NULL,
  `to_user` int NOT NULL,
  `message` varchar(200) NOT NULL,
  `chat_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`chat_id`),
  KEY `fk_from_user` (`from_user`),
  KEY `fk_to_user` (`to_user`),
  CONSTRAINT `message1_ibfk_1` FOREIGN KEY (`from_user`) REFERENCES `user1` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `message1_ibfk_2` FOREIGN KEY (`to_user`) REFERENCES `user1` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=182 DEFAULT CHARSET=latin1;

/*Data for the table `message1` */

insert  into `message1`(`chat_id`,`from_user`,`to_user`,`message`,`chat_time`) values 
(174,3,1,'hello','2021-04-19 02:47:58'),
(175,2,3,'hello','2021-04-19 02:48:18'),
(176,2,1,'hello Sameer','2021-04-19 02:48:31'),
(177,2,1,'heyyy','2021-04-19 02:48:55'),
(178,3,1,'hello','2021-04-19 02:49:15'),
(179,3,2,'hello Naziya im Faizan','2021-04-19 02:49:27'),
(180,2,3,'how are you','2021-04-19 02:49:42'),
(181,3,2,'im fine','2021-04-19 02:49:54');

/*Table structure for table `posts` */

DROP TABLE IF EXISTS `posts`;

CREATE TABLE `posts` (
  `pid` int NOT NULL AUTO_INCREMENT,
  `pTitle` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `pContent` longtext,
  `pCode` longtext,
  `pPic` varchar(100) DEFAULT NULL,
  `pDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `catId` int DEFAULT NULL,
  `userId` int NOT NULL,
  PRIMARY KEY (`pid`),
  KEY `catId` (`catId`),
  KEY `userId` (`userId`),
  CONSTRAINT `posts_ibfk_1` FOREIGN KEY (`catId`) REFERENCES `categories` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `posts_ibfk_2` FOREIGN KEY (`userId`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `posts` */

insert  into `posts`(`pid`,`pTitle`,`pContent`,`pCode`,`pPic`,`pDate`,`catId`,`userId`) values 
(3,'Hello World Program','A \"Hello, World!\" is a simple program that outputs Hello, World! on the screen. Since it\'s a very simple program, it\'s often used to introduce a new programming language to a newbie.\r\n\r\nLet\'s explore how Java \"Hello, World!\" program works.','class HelloWorld {\r\n    public static void main(String[] args) {\r\n        System.out.println(\"Hello, World!\"); \r\n    }\r\n}','1.png','2021-04-15 16:06:50',1,1),
(4,'Hello World Program','A simple program that displays âHello, World!â. It\'s often used to illustrate the syntax of the language.','print(\'Hello, world!\')','2.jfif','2021-04-15 16:20:23',2,1),
(5,'How To Make A form Using HTML','HTML Forms are required, when you want to collect some data from the site visitor. For example, during user registration you would like to collect information such as name, email address, credit card, etc.\r\n\r\nA form will take input from the site visitor and then will post it to a back-end application such as CGI, ASP Script or PHP script etc. The back-end application will perform required processing on the passed data based on defined business logic inside the application.\r\n\r\nThere are various form elements available like text fields, textarea fields, drop-down menus, radio buttons, checkboxes, etc.\r\n\r\n<!DOCTYPE html>\r\n<html>\r\n\r\n   <head>\r\n      <title>Text Input Control</title>\r\n   </head>\r\n	\r\n   <body>\r\n      <form >\r\n         First name: <input type = \"text\" name = \"first_name\" />\r\n         <br>\r\n         Last name: <input type = \"text\" name = \"last_name\" /> <br>\r\nDescription : <br>\r\n         <textarea rows = \"5\" cols = \"50\" name = \"description\">\r\n            Enter description here...\r\n         </textarea> <br>\r\n<input type = \"submit\" name = \"submit\" value = \"Submit\" />\r\n         <input type = \"reset\" name = \"reset\"  value = \"Reset\" />\r\n         <input type = \"button\" name = \"ok\" value = \"OK\" />\r\n         <input type = \"image\" name = \"imagebutton\" src = \"/html/images/logo.png\" />\r\n      </form>\r\n   </body>\r\n\r\n	\r\n</html>','','3.jpg','2021-04-15 17:05:39',3,2),
(6,'CSS Basic','W3.CSS is Smaller, Faster and Easier to Use.\r\n\r\nw3.CSS is a modern, responsive, mobile first CSS framework.\r\n\r\nW3.CSS provides equality for all browsers: Chrome. Firefox. Edge. IE. Safari. Opera.\r\n\r\nW3.CSS provides equality for all devices: Desktop. Laptop. Tablet. Mobile.\r\n\r\nW3.CSS is standard CSS only (No jQuery or JavaScript library).','<!DOCTYPE html>\r\n<html>\r\n<title>W3.CSS</title>\r\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n<body>\r\n\r\n<div class=\"w3-container w3-teal\">\r\n  <h1>My Car</h1>\r\n</div>\r\n\r\n<img src=\"img_car.jpg\" alt=\"Car\" style=\"width:100%\">\r\n\r\n<div class=\"w3-container\">\r\n  <p>A car is a wheeled, self-powered motor vehicle used for transportation.</p>\r\n</div>\r\n\r\n<div class=\"w3-container w3-teal\">\r\n  <p>My footer information</p>\r\n</div>\r\n\r\n</body>\r\n</html> \r\n','4.jpeg','2021-04-15 23:49:59',4,3);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(600) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `email` varchar(600) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(600) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `gender` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `about` varchar(3000) DEFAULT NULL,
  `rdate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `profile` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`email`,`password`,`gender`,`about`,`rdate`,`profile`) values 
(1,'Sameer Pathan','Sk7869224111@gmail.com','1234','on','Hello i\'m Sameer Khan\r\n                                                \r\n                                                \r\n                                                \r\n                                                \r\n                                                \r\n                                                ','2021-04-05 01:25:53','20190711030124_IMG_5921.JPG'),
(2,'Naziya khan','knaziya2001@gmail.com','Naziya','famale','Myself Naziya Khan and I\'m a Girl\r\n                                                ','2021-04-05 01:51:54','IMG_2923.JPG'),
(3,'Faizan Khan','Faizan0023@gmail.com','1234','male','                   hello                             \r\n                                                ','2021-04-05 01:51:54',''),
(4,'Abdul RashidKhan','abdul@gmail.com','1234','male','                    I am Abdul Rashid Khan                            ','2021-04-19 02:16:26',''),
(5,'FaizaAli','faiza@gmail.com','123','famale','im Faiza','2021-04-19 02:25:35',NULL);

/*Table structure for table `user1` */

DROP TABLE IF EXISTS `user1`;

CREATE TABLE `user1` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `image` varchar(150) DEFAULT 'image/user.png',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `user1` */

insert  into `user1`(`user_id`,`first_name`,`last_name`,`password`,`email`,`image`) values 
(1,'Sameer','Pathan','1234','sk7869224111@gmail.com','20190711030124_IMG_5921.JPG'),
(2,'Naziya','Khan','Naziya','knaziya2001@gmail.com','IMG_2923.JPG'),
(3,'Faizan','Khan','1234','Faizan0023@gmail.com','DSC_0193.JPG'),
(4,'Abdul Rashid','Khan','1234','abdul@gmail.com','image/user.png'),
(5,'Faiza','Ali','123','faiza@gmail.com','image/user.png');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
