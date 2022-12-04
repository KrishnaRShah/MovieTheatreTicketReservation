-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: create_database
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cards`
--

DROP TABLE IF EXISTS `cards`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cards` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name_on_card` varchar(32) NOT NULL,
  `card_number` varchar(16) NOT NULL,
  `expiry_date` varchar(5) NOT NULL,
  `cvv` char(3) DEFAULT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cards`
--

LOCK TABLES `cards` WRITE;
/*!40000 ALTER TABLE `cards` DISABLE KEYS */;
INSERT INTO `cards` VALUES (1,'User One','0123456789012345','01/20','123',1),(2,'User Two','0123456789012345','01/21','234',2),(3,'User Three','0123456789012345','01/23','345',3),(4,'User Four','0123456789012345','01/24','456',4),(5,'User Five','0123456789012345','01/25','567',5);
/*!40000 ALTER TABLE `cards` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_archive`
--

DROP TABLE IF EXISTS `movie_archive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie_archive` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(256) NOT NULL,
  `summary` varchar(512) NOT NULL,
  `length` int NOT NULL,
  `date_available` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_archive`
--

LOCK TABLES `movie_archive` WRITE;
/*!40000 ALTER TABLE `movie_archive` DISABLE KEYS */;
INSERT INTO `movie_archive` VALUES (1,'Black Panther','Wakandan Super Hero',115, '2022-01-25'),(2,'Dragon Ball','He not beating Goku!',182,'2022-05-06'),(3,'The Dark Knight','Bat guy saves Gotham',145,'2022-08-25'),(4,'Interstellar','Goat movie',190,'2022-06-27'),(5,'Jujutsu Kaisen','Goat anime',170,'2022-03-17'),(6,'Woman is King','Woman warriors in africa',123,'2022-08-25'),(7,'Ant Man','Little super hero',90,'2022-08-21'),(8,'Demon Slayer','Shoutout Zenitsu',180,'2022-02-20'),(9,'Tarzan','Man monkey swings in jungle',123,'2022-08-25'),(10,'Tokyo Drift','Driving cars and allat',120,'2022-12-01'),(11,'The Lego Movie 2','Whole Lotta Blocks!',127,'2023-01-1'),(12,'Wolf Of Wall Street','Completely Legal Activities!',150,'2023-01-07');
/*!40000 ALTER TABLE `movie_archive` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_shows`
--

DROP TABLE IF EXISTS `movie_shows`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie_shows` (
  `id` int NOT NULL AUTO_INCREMENT,
  `movie_id` int NOT NULL,
  `showtime` datetime NOT NULL,
  `seat_price` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_shows`
--

LOCK TABLES `movie_shows` WRITE;
/*!40000 ALTER TABLE `movie_shows` DISABLE KEYS */;
INSERT INTO `movie_shows` VALUES (1,1,'2022-12-07 08:00:00',14.99),(2,1,'2022-12-08 09:00:00',14.99),(3,2,'2022-12-02 17:00:00',24.99),(4,2,'2022-12-03 18:00:00',24.99),(5,3,'2022-12-09 21:30:00',19.99),(6,3,'2022-12-10 22:30:00',19.99),(7,4,'2022-12-12 22:00:00',25.99),(8,4,'2022-12-13 21:00:00',25.99),(9,5,'2022-12-19 17:00:00',29.99),(10,5,'2022-12-20 19:00:00',29.99),(11,6,'2022-12-01 16:30:00',14.99),(12,6,'2022-12-02 17:45:00',14.99),(13,7,'2022-12-02 13:30:00',24.99),(14,7,'2022-12-03 20:00:00',24.99),(15,8,'2022-12-09 12:00:00',19.99),(16,8,'2022-12-10 14:30:00',19.99),(17,9,'2022-12-12 10:00:00',25.99),(18,9,'2022-12-13 12:30:00',25.99),(19,10,'2022-12-19 15:00:00',29.99),(20,10,'2022-12-20 19:30:00',29.99),(21,11,'2023-01-01 15:00:00', 35.99),(22,11,'2023-01-02 17:00:00', 35.99),(23,12,'2023-01-07 13:00:00', 35.99),(24,12,'2023-01-08 15:00:00', 35.99);
/*!40000 ALTER TABLE `movie_shows` ENABLE KEYS */;
UNLOCK TABLES;


--
-- START OF ALL SEATS TABLES
--


--
-- Table structure for table `seats`
--

DROP TABLE IF EXISTS `seats`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seats` (
  `id` int NOT NULL AUTO_INCREMENT,
  `row` int NOT NULL,
  `col` int NOT NULL,
  `number` int NOT NULL,
  `theatre_id` int NOT NULL,
  `reserved` tinyint DEFAULT '1',
  `price` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seats`
--

LOCK TABLES `seats` WRITE;
/*!40000 ALTER TABLE `seats` DISABLE KEYS */;
INSERT INTO `seats` VALUES (1,0,0,1,1,1,14.99),(2,0,1,2,2,1,14.99),(3,1,0,15,3,1,24.99),(4,1,1,16,4,1,24.99),(5,1,2,17,5,1,19.99),(6,1,2,17,6,1,19.99),(7,1,2,17,7,1,25.99),(8,1,2,17,8,1,25.99),(9,1,2,17,9,1,29.99),(10,1,2,17,10,1,29.99),(11,0,0,1,11,1,14.99),(12,0,1,2,12,1,14.99),(13,1,0,15,13,1,24.99),(14,1,1,16,14,1,24.99),(15,1,2,17,15,1,19.99),(16,1,2,17,16,1,19.99),(17,1,2,17,17,1,25.99),(18,1,2,17,18,1,25.99),(19,0,0,1,1,1,14.99),(20,0,1,2,2,1,14.99),(21,1,0,15,3,1,24.99),(22,1,1,16,4,1,24.99),(23,1,2,17,5,1,19.99),(24,1,2,17,6,1,19.99),(25,1,2,17,7,1,25.99),(26,1,2,17,8,1,25.99),(27,1,2,17,9,1,29.99),(28,1,2,17,10,1,29.99),(29,0,0,1,11,1,14.99),(30,0,1,2,12,1,14.99),(31,1,0,15,13,1,24.99),(32,1,1,16,14,1,24.99),(33,1,2,17,15,1,19.99),(34,1,2,17,16,1,19.99),(35,1,2,17,17,1,25.99),(36,1,2,17,18,1,25.99);
/*!40000 ALTER TABLE `seats` ENABLE KEYS */;
UNLOCK TABLES;

--
-- SEATS 1
--

DROP TABLE IF EXISTS `seats1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seats1` (
  `id` int NOT NULL AUTO_INCREMENT,
  `row` int NOT NULL,
  `col` int NOT NULL,
  `number` int NOT NULL,
  `theatre_id` int NOT NULL,
  `reserved` tinyint DEFAULT '1',
  `price` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seats`
--

LOCK TABLES `seats1` WRITE;
/*!40000 ALTER TABLE `seats1` DISABLE KEYS */;
INSERT INTO `seats1` VALUES (1,0,0,1,1,1,14.99),(2,0,1,2,2,1,14.99),(3,1,0,15,3,1,24.99),(4,1,1,16,4,1,24.99),(5,1,2,17,5,1,19.99),(6,1,2,17,6,1,19.99),(7,1,2,17,7,1,25.99),(8,1,2,17,8,1,25.99),(9,1,2,17,9,1,29.99),(10,1,2,17,10,1,29.99),(11,0,0,1,11,1,14.99),(12,0,1,2,12,1,14.99),(13,1,0,15,13,1,24.99),(14,1,1,16,14,1,24.99),(15,1,2,17,15,1,19.99),(16,1,2,17,16,1,19.99),(17,1,2,17,17,1,25.99),(18,1,2,17,18,1,25.99),(19,0,0,1,1,1,14.99),(20,0,1,2,2,1,14.99),(21,1,0,15,3,1,24.99),(22,1,1,16,4,1,24.99),(23,1,2,17,5,1,19.99),(24,1,2,17,6,1,19.99),(25,1,2,17,7,1,25.99),(26,1,2,17,8,1,25.99),(27,1,2,17,9,1,29.99),(28,1,2,17,10,1,29.99),(29,0,0,1,11,1,14.99),(30,0,1,2,12,1,14.99),(31,1,0,15,13,1,24.99),(32,1,1,16,14,1,24.99),(33,1,2,17,15,1,19.99),(34,1,2,17,16,1,19.99),(35,1,2,17,17,1,25.99),(36,1,2,17,18,1,25.99);
/*!40000 ALTER TABLE `seats1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- SEATS 2
--

DROP TABLE IF EXISTS `seats2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seats2` (
  `id` int NOT NULL AUTO_INCREMENT,
  `row` int NOT NULL,
  `col` int NOT NULL,
  `number` int NOT NULL,
  `theatre_id` int NOT NULL,
  `reserved` tinyint DEFAULT '1',
  `price` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seats`
--

LOCK TABLES `seats2` WRITE;
/*!40000 ALTER TABLE `seats2` DISABLE KEYS */;
INSERT INTO `seats2` VALUES (1,0,0,1,1,1,14.99),(2,0,1,2,2,1,14.99),(3,1,0,15,3,1,24.99),(4,1,1,16,4,1,24.99),(5,1,2,17,5,1,19.99),(6,1,2,17,6,1,19.99),(7,1,2,17,7,1,25.99),(8,1,2,17,8,1,25.99),(9,1,2,17,9,1,29.99),(10,1,2,17,10,1,29.99),(11,0,0,1,11,1,14.99),(12,0,1,2,12,1,14.99),(13,1,0,15,13,1,24.99),(14,1,1,16,14,1,24.99),(15,1,2,17,15,1,19.99),(16,1,2,17,16,1,19.99),(17,1,2,17,17,1,25.99),(18,1,2,17,18,1,25.99),(19,0,0,1,1,1,14.99),(20,0,1,2,2,1,14.99),(21,1,0,15,3,1,24.99),(22,1,1,16,4,1,24.99),(23,1,2,17,5,1,19.99),(24,1,2,17,6,1,19.99),(25,1,2,17,7,1,25.99),(26,1,2,17,8,1,25.99),(27,1,2,17,9,1,29.99),(28,1,2,17,10,1,29.99),(29,0,0,1,11,1,14.99),(30,0,1,2,12,1,14.99),(31,1,0,15,13,1,24.99),(32,1,1,16,14,1,24.99),(33,1,2,17,15,1,19.99),(34,1,2,17,16,1,19.99),(35,1,2,17,17,1,25.99),(36,1,2,17,18,1,25.99);
/*!40000 ALTER TABLE `seats2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- SEATS 3
--

DROP TABLE IF EXISTS `seats3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seats3` (
  `id` int NOT NULL AUTO_INCREMENT,
  `row` int NOT NULL,
  `col` int NOT NULL,
  `number` int NOT NULL,
  `theatre_id` int NOT NULL,
  `reserved` tinyint DEFAULT '1',
  `price` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seats`
--

LOCK TABLES `seats3` WRITE;
/*!40000 ALTER TABLE `seats3` DISABLE KEYS */;
INSERT INTO `seats3` VALUES (1,0,0,1,1,1,14.99),(2,0,1,2,2,1,14.99),(3,1,0,15,3,1,24.99),(4,1,1,16,4,1,24.99),(5,1,2,17,5,1,19.99),(6,1,2,17,6,1,19.99),(7,1,2,17,7,1,25.99),(8,1,2,17,8,1,25.99),(9,1,2,17,9,1,29.99),(10,1,2,17,10,1,29.99),(11,0,0,1,11,1,14.99),(12,0,1,2,12,1,14.99),(13,1,0,15,13,1,24.99),(14,1,1,16,14,1,24.99),(15,1,2,17,15,1,19.99),(16,1,2,17,16,1,19.99),(17,1,2,17,17,1,25.99),(18,1,2,17,18,1,25.99),(19,0,0,1,1,1,14.99),(20,0,1,2,2,1,14.99),(21,1,0,15,3,1,24.99),(22,1,1,16,4,1,24.99),(23,1,2,17,5,1,19.99),(24,1,2,17,6,1,19.99),(25,1,2,17,7,1,25.99),(26,1,2,17,8,1,25.99),(27,1,2,17,9,1,29.99),(28,1,2,17,10,1,29.99),(29,0,0,1,11,1,14.99),(30,0,1,2,12,1,14.99),(31,1,0,15,13,1,24.99),(32,1,1,16,14,1,24.99),(33,1,2,17,15,1,19.99),(34,1,2,17,16,1,19.99),(35,1,2,17,17,1,25.99),(36,1,2,17,18,1,25.99);
/*!40000 ALTER TABLE `seats3` ENABLE KEYS */;
UNLOCK TABLES;




DROP TABLE IF EXISTS `seats4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seats4` (
  `id` int NOT NULL AUTO_INCREMENT,
  `row` int NOT NULL,
  `col` int NOT NULL,
  `number` int NOT NULL,
  `theatre_id` int NOT NULL,
  `reserved` tinyint DEFAULT '1',
  `price` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seats`
--

LOCK TABLES `seats4` WRITE;
/*!40000 ALTER TABLE `seats4` DISABLE KEYS */;
INSERT INTO `seats4` VALUES (1,0,0,1,1,1,14.99),(2,0,1,2,2,1,14.99),(3,1,0,15,3,1,24.99),(4,1,1,16,4,1,24.99),(5,1,2,17,5,1,19.99),(6,1,2,17,6,1,19.99),(7,1,2,17,7,1,25.99),(8,1,2,17,8,1,25.99),(9,1,2,17,9,1,29.99),(10,1,2,17,10,1,29.99),(11,0,0,1,11,1,14.99),(12,0,1,2,12,1,14.99),(13,1,0,15,13,1,24.99),(14,1,1,16,14,1,24.99),(15,1,2,17,15,1,19.99),(16,1,2,17,16,1,19.99),(17,1,2,17,17,1,25.99),(18,1,2,17,18,1,25.99),(19,0,0,1,1,1,14.99),(20,0,1,2,2,1,14.99),(21,1,0,15,3,1,24.99),(22,1,1,16,4,1,24.99),(23,1,2,17,5,1,19.99),(24,1,2,17,6,1,19.99),(25,1,2,17,7,1,25.99),(26,1,2,17,8,1,25.99),(27,1,2,17,9,1,29.99),(28,1,2,17,10,1,29.99),(29,0,0,1,11,1,14.99),(30,0,1,2,12,1,14.99),(31,1,0,15,13,1,24.99),(32,1,1,16,14,1,24.99),(33,1,2,17,15,1,19.99),(34,1,2,17,16,1,19.99),(35,1,2,17,17,1,25.99),(36,1,2,17,18,1,25.99);
/*!40000 ALTER TABLE `seats4` ENABLE KEYS */;
UNLOCK TABLES;

--
--
-- END OF ALL SEATS TABLES
--

--
-- Table structure for table `theatres`
--

DROP TABLE IF EXISTS `theatres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `theatres` (
  `id` int NOT NULL AUTO_INCREMENT,
  `number` int NOT NULL,
  `capacity` int NOT NULL DEFAULT '100',
  `seats_occupied` int DEFAULT '0',
  `movie_shows_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `theatres`
--

LOCK TABLES `theatres` WRITE;
/*!40000 ALTER TABLE `theatres` DISABLE KEYS */;
INSERT INTO `theatres` VALUES (1,1,100,1,1),(2,2,100,1,2),(3,1,100,1,3),(4,2,100,1,4),(5,1,100,1,5),(6,2,100,1,6),(7,1,100,1,7),(8,2,100,1,8),(9,1,100,1,9),(10,2,100,1,10),(11,3,100,1,11),(12,4,100,1,12),(13,3,100,1,13),(14,4,100,1,14),(15,5,100,1,15),(16,6,100,1,16),(17,5,100,1,17),(18,6,100,1,18),(19,1,100,1,19),(20,2,100,1,20),(21,1,100,1,1),(22,2,100,1,2),(23,1,100,1,3),(24,2,100,1,4),(25,1,100,1,5),(26,2,100,1,6),(27,1,100,1,7),(28,2,100,1,8),(29,1,100,1,9),(30,2,100,1,10),(31,3,100,1,11),(32,4,100,1,12),(33,3,100,1,13),(34,4,100,1,14),(35,5,100,1,15),(36,6,100,1,16),(37,5,100,1,17),(38,6,100,1,18),(39,1,100,1,19),(40,2,100,1,20),(41,1,100,1,1),(42,2,100,1,2),(43,1,100,1,3),(44,2,100,1,4),(45,1,100,1,5),(46,2,100,1,6),(47,1,100,1,7),(48,2,100,1,8),(49,1,100,1,9),(50,2,100,1,10),(51,3,100,1,11),(52,4,100,1,12),(53,3,100,1,13),(54,4,100,1,14),(55,5,100,1,15),(56,6,100,1,16),(57,5,100,1,17),(58,6,100,1,18),(59,1,100,1,19),(60,2,100,1,20);
/*!40000 ALTER TABLE `theatres` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tickets`
--

DROP TABLE IF EXISTS `tickets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tickets` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_email` varchar(128) NOT NULL,
  `seat_id` int NOT NULL,
  `purchased_date` date NOT NULL,
  `theatre_id` int NOT NULL,
  `ticket_price` varchar(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tickets`
--

LOCK TABLES `tickets` WRITE;
/*!40000 ALTER TABLE `tickets` DISABLE KEYS */;
/*!40000 ALTER TABLE `tickets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(128) NOT NULL,
  `registered` tinyint(1) DEFAULT '0',
  `password` varchar(16) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'user1@example.com',1,'user1','User One'),(2,'user2@example.com',0,'user2','User Two'),(3,'user3@example.com',1,'user3','User Three'),(4,'user4@example.com',0,'user4','User Four'),(5,'user5@example.com',1,'user5','User Five'),(6,'admin@example.com',3,'admin123','Admin User');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-01 17:01:47
