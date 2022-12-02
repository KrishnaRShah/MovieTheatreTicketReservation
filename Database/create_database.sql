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
  `expiry_date` date NOT NULL,
  `cvv` char(3) DEFAULT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cards`
--

LOCK TABLES `cards` WRITE;
/*!40000 ALTER TABLE `cards` DISABLE KEYS */;
INSERT INTO `cards` VALUES (1,'User One','0123456789012345','2027-03-14','123',1),(2,'User Two','0123456789012345','2026-04-16','234',2),(3,'User Three','0123456789012345','2022-12-14','345',3),(4,'User Four','0123456789012345','2024-02-14','456',4),(5,'User Five','0123456789012345','2028-09-01','567',5),(6,'User One','0123456789012345','2027-03-14','123',1),(7,'User Two','0123456789012345','2026-04-16','234',2),(8,'User Three','0123456789012345','2022-12-14','345',3),(9,'User Four','0123456789012345','2024-02-14','456',4),(10,'User Five','0123456789012345','2028-09-01','567',5),(11,'User One','0123456789012345','2027-03-14','123',1),(12,'User Two','0123456789012345','2026-04-16','234',2),(13,'User Three','0123456789012345','2022-12-14','345',3),(14,'User Four','0123456789012345','2024-02-14','456',4),(15,'User Five','0123456789012345','2028-09-01','567',5),(16,'User One','0123456789012345','2027-03-14','123',1),(17,'User Two','0123456789012345','2026-04-16','234',2),(18,'User Three','0123456789012345','2022-12-14','345',3),(19,'User Four','0123456789012345','2024-02-14','456',4),(20,'User Five','0123456789012345','2028-09-01','567',5),(21,'User One','0123456789012345','2027-03-14','123',1),(22,'User Two','0123456789012345','2026-04-16','234',2),(23,'User Three','0123456789012345','2022-12-14','345',3),(24,'User Four','0123456789012345','2024-02-14','456',4),(25,'User Five','0123456789012345','2028-09-01','567',5),(26,'User One','0123456789012345','2027-03-14','123',1),(27,'User Two','0123456789012345','2026-04-16','234',2),(28,'User Three','0123456789012345','2022-12-14','345',3),(29,'User Four','0123456789012345','2024-02-14','456',4),(30,'User Five','0123456789012345','2028-09-01','567',5),(31,'User One','0123456789012345','2027-03-14','123',1),(32,'User Two','0123456789012345','2026-04-16','234',2),(33,'User Three','0123456789012345','2022-12-14','345',3),(34,'User Four','0123456789012345','2024-02-14','456',4),(35,'User Five','0123456789012345','2028-09-01','567',5),(36,'User One','0123456789012345','2027-03-14','123',1),(37,'User Two','0123456789012345','2026-04-16','234',2),(38,'User Three','0123456789012345','2022-12-14','345',3),(39,'User Four','0123456789012345','2024-02-14','456',4),(40,'User Five','0123456789012345','2028-09-01','567',5),(41,'User One','0123456789012345','2027-03-14','123',1),(42,'User Two','0123456789012345','2026-04-16','234',2),(43,'User Three','0123456789012345','2022-12-14','345',3),(44,'User Four','0123456789012345','2024-02-14','456',4),(45,'User Five','0123456789012345','2028-09-01','567',5),(46,'User One','0123456789012345','2027-03-14','123',1),(47,'User Two','0123456789012345','2026-04-16','234',2),(48,'User Three','0123456789012345','2022-12-14','345',3),(49,'User Four','0123456789012345','2024-02-14','456',4),(50,'User Five','0123456789012345','2028-09-01','567',5),(51,'User One','0123456789012345','2027-03-14','123',1),(52,'User Two','0123456789012345','2026-04-16','234',2),(53,'User Three','0123456789012345','2022-12-14','345',3),(54,'User Four','0123456789012345','2024-02-14','456',4),(55,'User Five','0123456789012345','2028-09-01','567',5),(56,'User One','0123456789012345','2027-03-14','123',1),(57,'User Two','0123456789012345','2026-04-16','234',2),(58,'User Three','0123456789012345','2022-12-14','345',3),(59,'User Four','0123456789012345','2024-02-14','456',4),(60,'User Five','0123456789012345','2028-09-01','567',5),(61,'User One','0123456789012345','2027-03-14','123',1),(62,'User Two','0123456789012345','2026-04-16','234',2),(63,'User Three','0123456789012345','2022-12-14','345',3),(64,'User Four','0123456789012345','2024-02-14','456',4),(65,'User Five','0123456789012345','2028-09-01','567',5),(66,'User One','0123456789012345','2027-03-14','123',1),(67,'User Two','0123456789012345','2026-04-16','234',2),(68,'User Three','0123456789012345','2022-12-14','345',3),(69,'User Four','0123456789012345','2024-02-14','456',4),(70,'User Five','0123456789012345','2028-09-01','567',5),(71,'User One','0123456789012345','2027-03-14','123',1),(72,'User Two','0123456789012345','2026-04-16','234',2),(73,'User Three','0123456789012345','2022-12-14','345',3),(74,'User Four','0123456789012345','2024-02-14','456',4),(75,'User Five','0123456789012345','2028-09-01','567',5);
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
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_archive`
--

LOCK TABLES `movie_archive` WRITE;
/*!40000 ALTER TABLE `movie_archive` DISABLE KEYS */;
INSERT INTO `movie_archive` VALUES (1,'Black Panther','Wakandan Super Hero',115,NULL),(2,'Dragon Ball','He not beating Goku!',182,'2022-05-06'),(3,'The Dark Knight','Bat guy saves Gotham',145,'2022-08-25'),(4,'Interstellar','Goat movie',190,NULL),(5,'Jujutsu Kaisen','Goat anime',170,NULL),(6,'Woman is King','Woman warriors in africa',123,'2022-08-25'),(7,'Ant Man','Little super hero',90,NULL),(8,'Demon Slayer','Shoutout Zenitsu',180,NULL),(9,'Tarzan','Man monkey swings in jungle',123,'2022-08-25'),(10,'Tokyo Drift','Driving cars and allat',120,'2022-12-01'),(11,'Black Panther','Wakandan Super Hero',115,NULL),(12,'Dragon Ball','He not beating Goku!',182,'2022-05-06'),(13,'The Dark Knight','Bat guy saves Gotham',145,'2022-08-25'),(14,'Interstellar','Goat movie',190,NULL),(15,'Jujutsu Kaisen','Goat anime',170,NULL),(16,'Woman is King','Woman warriors in africa',123,'2022-08-25'),(17,'Ant Man','Little super hero',90,NULL),(18,'Demon Slayer','Shoutout Zenitsu',180,NULL),(19,'Tarzan','Man monkey swings in jungle',123,'2022-08-25'),(20,'Tokyo Drift','Driving cars and allat',120,'2022-12-01'),(21,'Black Panther','Wakandan Super Hero',115,NULL),(22,'Dragon Ball','He not beating Goku!',182,'2022-05-06'),(23,'The Dark Knight','Bat guy saves Gotham',145,'2022-08-25'),(24,'Interstellar','Goat movie',190,NULL),(25,'Jujutsu Kaisen','Goat anime',170,NULL),(26,'Woman is King','Woman warriors in africa',123,'2022-08-25'),(27,'Ant Man','Little super hero',90,NULL),(28,'Demon Slayer','Shoutout Zenitsu',180,NULL),(29,'Tarzan','Man monkey swings in jungle',123,'2022-08-25'),(30,'Tokyo Drift','Driving cars and allat',120,'2022-12-01'),(31,'Black Panther','Wakandan Super Hero',115,NULL),(32,'Dragon Ball','He not beating Goku!',182,'2022-05-06'),(33,'The Dark Knight','Bat guy saves Gotham',145,'2022-08-25'),(34,'Interstellar','Goat movie',190,NULL),(35,'Jujutsu Kaisen','Goat anime',170,NULL),(36,'Woman is King','Woman warriors in africa',123,'2022-08-25'),(37,'Ant Man','Little super hero',90,NULL),(38,'Demon Slayer','Shoutout Zenitsu',180,NULL),(39,'Tarzan','Man monkey swings in jungle',123,'2022-08-25'),(40,'Tokyo Drift','Driving cars and allat',120,'2022-12-01'),(41,'Black Panther','Wakandan Super Hero',115,NULL),(42,'Dragon Ball','He not beating Goku!',182,'2022-05-06'),(43,'The Dark Knight','Bat guy saves Gotham',145,'2022-08-25'),(44,'Interstellar','Goat movie',190,NULL),(45,'Jujutsu Kaisen','Goat anime',170,NULL),(46,'Woman is King','Woman warriors in africa',123,'2022-08-25'),(47,'Ant Man','Little super hero',90,NULL),(48,'Demon Slayer','Shoutout Zenitsu',180,NULL),(49,'Tarzan','Man monkey swings in jungle',123,'2022-08-25'),(50,'Tokyo Drift','Driving cars and allat',120,'2022-12-01'),(51,'Black Panther','Wakandan Super Hero',115,NULL),(52,'Dragon Ball','He not beating Goku!',182,'2022-05-06'),(53,'The Dark Knight','Bat guy saves Gotham',145,'2022-08-25'),(54,'Interstellar','Goat movie',190,NULL),(55,'Jujutsu Kaisen','Goat anime',170,NULL),(56,'Woman is King','Woman warriors in africa',123,'2022-08-25'),(57,'Ant Man','Little super hero',90,NULL),(58,'Demon Slayer','Shoutout Zenitsu',180,NULL),(59,'Tarzan','Man monkey swings in jungle',123,'2022-08-25'),(60,'Tokyo Drift','Driving cars and allat',120,'2022-12-01'),(61,'Black Panther','Wakandan Super Hero',115,NULL),(62,'Dragon Ball','He not beating Goku!',182,'2022-05-06'),(63,'The Dark Knight','Bat guy saves Gotham',145,'2022-08-25'),(64,'Interstellar','Goat movie',190,NULL),(65,'Jujutsu Kaisen','Goat anime',170,NULL),(66,'Woman is King','Woman warriors in africa',123,'2022-08-25'),(67,'Ant Man','Little super hero',90,NULL),(68,'Demon Slayer','Shoutout Zenitsu',180,NULL),(69,'Tarzan','Man monkey swings in jungle',123,'2022-08-25'),(70,'Tokyo Drift','Driving cars and allat',120,'2022-12-01'),(71,'Black Panther','Wakandan Super Hero',115,NULL),(72,'Dragon Ball','He not beating Goku!',182,'2022-05-06'),(73,'The Dark Knight','Bat guy saves Gotham',145,'2022-08-25'),(74,'Interstellar','Goat movie',190,NULL),(75,'Jujutsu Kaisen','Goat anime',170,NULL),(76,'Woman is King','Woman warriors in africa',123,'2022-08-25'),(77,'Ant Man','Little super hero',90,NULL),(78,'Demon Slayer','Shoutout Zenitsu',180,NULL),(79,'Tarzan','Man monkey swings in jungle',123,'2022-08-25'),(80,'Tokyo Drift','Driving cars and allat',120,'2022-12-01'),(81,'Black Panther','Wakandan Super Hero',115,NULL),(82,'Dragon Ball','He not beating Goku!',182,'2022-05-06'),(83,'The Dark Knight','Bat guy saves Gotham',145,'2022-08-25'),(84,'Interstellar','Goat movie',190,NULL),(85,'Jujutsu Kaisen','Goat anime',170,NULL),(86,'Woman is King','Woman warriors in africa',123,'2022-08-25'),(87,'Ant Man','Little super hero',90,NULL),(88,'Demon Slayer','Shoutout Zenitsu',180,NULL),(89,'Tarzan','Man monkey swings in jungle',123,'2022-08-25'),(90,'Tokyo Drift','Driving cars and allat',120,'2022-12-01'),(91,'Black Panther','Wakandan Super Hero',115,NULL),(92,'Dragon Ball','He not beating Goku!',182,'2022-05-06'),(93,'The Dark Knight','Bat guy saves Gotham',145,'2022-08-25'),(94,'Interstellar','Goat movie',190,NULL),(95,'Jujutsu Kaisen','Goat anime',170,NULL),(96,'Woman is King','Woman warriors in africa',123,'2022-08-25'),(97,'Ant Man','Little super hero',90,NULL),(98,'Demon Slayer','Shoutout Zenitsu',180,NULL),(99,'Tarzan','Man monkey swings in jungle',123,'2022-08-25'),(100,'Tokyo Drift','Driving cars and allat',120,'2022-12-01'),(101,'Black Panther','Wakandan Super Hero',115,NULL),(102,'Dragon Ball','He not beating Goku!',182,'2022-05-06'),(103,'The Dark Knight','Bat guy saves Gotham',145,'2022-08-25'),(104,'Interstellar','Goat movie',190,NULL),(105,'Jujutsu Kaisen','Goat anime',170,NULL),(106,'Woman is King','Woman warriors in africa',123,'2022-08-25'),(107,'Ant Man','Little super hero',90,NULL),(108,'Demon Slayer','Shoutout Zenitsu',180,NULL),(109,'Tarzan','Man monkey swings in jungle',123,'2022-08-25'),(110,'Tokyo Drift','Driving cars and allat',120,'2022-12-01'),(111,'Black Panther','Wakandan Super Hero',115,NULL),(112,'Dragon Ball','He not beating Goku!',182,'2022-05-06'),(113,'The Dark Knight','Bat guy saves Gotham',145,'2022-08-25'),(114,'Interstellar','Goat movie',190,NULL),(115,'Jujutsu Kaisen','Goat anime',170,NULL),(116,'Woman is King','Woman warriors in africa',123,'2022-08-25'),(117,'Ant Man','Little super hero',90,NULL),(118,'Demon Slayer','Shoutout Zenitsu',180,NULL),(119,'Tarzan','Man monkey swings in jungle',123,'2022-08-25'),(120,'Tokyo Drift','Driving cars and allat',120,'2022-12-01');
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
INSERT INTO `movie_shows` VALUES (1,1,'2022-12-07 08:00:00',14.99),(2,1,'2022-12-08 09:00:00',14.99),(3,2,'2022-12-02 17:00:00',24.99),(4,2,'2022-12-03 18:00:00',24.99),(5,3,'2022-12-09 21:30:00',19.99),(6,3,'2022-12-10 22:30:00',19.99),(7,4,'2022-12-12 22:00:00',25.99),(8,4,'2022-12-13 21:00:00',25.99),(9,5,'2022-12-19 17:00:00',29.99),(10,5,'2022-12-20 19:00:00',29.99),(11,6,'2022-12-01 16:30:00',14.99),(12,6,'2022-12-02 17:45:00',14.99),(13,7,'2022-12-02 13:30:00',24.99),(14,7,'2022-12-03 20:00:00',24.99),(15,8,'2022-12-09 12:00:00',19.99),(16,8,'2022-12-10 14:30:00',19.99),(17,9,'2022-12-12 10:00:00',25.99),(18,9,'2022-12-13 12:30:00',25.99),(19,10,'2022-12-19 15:00:00',29.99),(20,10,'2022-12-20 19:30:00',29.99),(21,1,'2022-12-07 08:00:00',14.99),(22,1,'2022-12-08 09:00:00',14.99),(23,2,'2022-12-02 17:00:00',24.99),(24,2,'2022-12-03 18:00:00',24.99),(25,3,'2022-12-09 21:30:00',19.99),(26,3,'2022-12-10 22:30:00',19.99),(27,4,'2022-12-12 22:00:00',25.99),(28,4,'2022-12-13 21:00:00',25.99),(29,5,'2022-12-19 17:00:00',29.99),(30,5,'2022-12-20 19:00:00',29.99),(31,6,'2022-12-01 16:30:00',14.99),(32,6,'2022-12-02 17:45:00',14.99),(33,7,'2022-12-02 13:30:00',24.99),(34,7,'2022-12-03 20:00:00',24.99),(35,8,'2022-12-09 12:00:00',19.99),(36,8,'2022-12-10 14:30:00',19.99),(37,9,'2022-12-12 10:00:00',25.99),(38,9,'2022-12-13 12:30:00',25.99),(39,10,'2022-12-19 15:00:00',29.99),(40,10,'2022-12-20 19:30:00',29.99),(41,1,'2022-12-07 08:00:00',14.99),(42,1,'2022-12-08 09:00:00',14.99),(43,2,'2022-12-02 17:00:00',24.99),(44,2,'2022-12-03 18:00:00',24.99),(45,3,'2022-12-09 21:30:00',19.99),(46,3,'2022-12-10 22:30:00',19.99),(47,4,'2022-12-12 22:00:00',25.99),(48,4,'2022-12-13 21:00:00',25.99),(49,5,'2022-12-19 17:00:00',29.99),(50,5,'2022-12-20 19:00:00',29.99),(51,6,'2022-12-01 16:30:00',14.99),(52,6,'2022-12-02 17:45:00',14.99),(53,7,'2022-12-02 13:30:00',24.99),(54,7,'2022-12-03 20:00:00',24.99),(55,8,'2022-12-09 12:00:00',19.99),(56,8,'2022-12-10 14:30:00',19.99),(57,9,'2022-12-12 10:00:00',25.99),(58,9,'2022-12-13 12:30:00',25.99),(59,10,'2022-12-19 15:00:00',29.99),(60,10,'2022-12-20 19:30:00',29.99),(61,1,'2022-12-07 08:00:00',14.99),(62,1,'2022-12-08 09:00:00',14.99),(63,2,'2022-12-02 17:00:00',24.99),(64,2,'2022-12-03 18:00:00',24.99),(65,3,'2022-12-09 21:30:00',19.99),(66,3,'2022-12-10 22:30:00',19.99),(67,4,'2022-12-12 22:00:00',25.99),(68,4,'2022-12-13 21:00:00',25.99),(69,5,'2022-12-19 17:00:00',29.99),(70,5,'2022-12-20 19:00:00',29.99),(71,6,'2022-12-01 16:30:00',14.99),(72,6,'2022-12-02 17:45:00',14.99),(73,7,'2022-12-02 13:30:00',24.99),(74,7,'2022-12-03 20:00:00',24.99),(75,8,'2022-12-09 12:00:00',19.99),(76,8,'2022-12-10 14:30:00',19.99),(77,9,'2022-12-12 10:00:00',25.99),(78,9,'2022-12-13 12:30:00',25.99),(79,10,'2022-12-19 15:00:00',29.99),(80,10,'2022-12-20 19:30:00',29.99),(81,1,'2022-12-07 08:00:00',14.99),(82,1,'2022-12-08 09:00:00',14.99),(83,2,'2022-12-02 17:00:00',24.99),(84,2,'2022-12-03 18:00:00',24.99),(85,3,'2022-12-09 21:30:00',19.99),(86,3,'2022-12-10 22:30:00',19.99),(87,4,'2022-12-12 22:00:00',25.99),(88,4,'2022-12-13 21:00:00',25.99),(89,5,'2022-12-19 17:00:00',29.99),(90,5,'2022-12-20 19:00:00',29.99),(91,6,'2022-12-01 16:30:00',14.99),(92,6,'2022-12-02 17:45:00',14.99),(93,7,'2022-12-02 13:30:00',24.99),(94,7,'2022-12-03 20:00:00',24.99),(95,8,'2022-12-09 12:00:00',19.99),(96,8,'2022-12-10 14:30:00',19.99),(97,9,'2022-12-12 10:00:00',25.99),(98,9,'2022-12-13 12:30:00',25.99),(99,10,'2022-12-19 15:00:00',29.99),(100,10,'2022-12-20 19:30:00',29.99),(101,1,'2022-12-07 08:00:00',14.99),(102,1,'2022-12-08 09:00:00',14.99),(103,2,'2022-12-02 17:00:00',24.99),(104,2,'2022-12-03 18:00:00',24.99),(105,3,'2022-12-09 21:30:00',19.99),(106,3,'2022-12-10 22:30:00',19.99),(107,4,'2022-12-12 22:00:00',25.99),(108,4,'2022-12-13 21:00:00',25.99),(109,5,'2022-12-19 17:00:00',29.99),(110,5,'2022-12-20 19:00:00',29.99),(111,6,'2022-12-01 16:30:00',14.99),(112,6,'2022-12-02 17:45:00',14.99),(113,7,'2022-12-02 13:30:00',24.99),(114,7,'2022-12-03 20:00:00',24.99),(115,8,'2022-12-09 12:00:00',19.99),(116,8,'2022-12-10 14:30:00',19.99),(117,9,'2022-12-12 10:00:00',25.99),(118,9,'2022-12-13 12:30:00',25.99),(119,10,'2022-12-19 15:00:00',29.99),(120,10,'2022-12-20 19:30:00',29.99);
/*!40000 ALTER TABLE `movie_shows` ENABLE KEYS */;
UNLOCK TABLES;

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
  `user_id` int NOT NULL,
  `seat_id` int NOT NULL,
  `purchased_date` date NOT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'user1@example.com',1,'user1','User One'),(2,'user2@example.com',0,'user2','User Two'),(3,'user3@example.com',1,'user3','User Three'),(4,'user4@example.com',0,'user4','User Four'),(5,'user5@example.com',1,'user5','User Five'),(6,'user1@example.com',1,'user1','User One'),(7,'user2@example.com',0,'user2','User Two'),(8,'user3@example.com',1,'user3','User Three'),(9,'user4@example.com',0,'user4','User Four'),(10,'user5@example.com',1,'user5','User Five'),(11,'user1@example.com',1,'user1','User One'),(12,'user2@example.com',0,'user2','User Two'),(13,'user3@example.com',1,'user3','User Three'),(14,'user4@example.com',0,'user4','User Four'),(15,'user5@example.com',1,'user5','User Five'),(16,'user1@example.com',1,'user1','User One'),(17,'user2@example.com',0,'user2','User Two'),(18,'user3@example.com',1,'user3','User Three'),(19,'user4@example.com',0,'user4','User Four'),(20,'user5@example.com',1,'user5','User Five'),(21,'user1@example.com',1,'user1','User One'),(22,'user2@example.com',0,'user2','User Two'),(23,'user3@example.com',1,'user3','User Three'),(24,'user4@example.com',0,'user4','User Four'),(25,'user5@example.com',1,'user5','User Five'),(26,'user1@example.com',1,'user1','User One'),(27,'user2@example.com',0,'user2','User Two'),(28,'user3@example.com',1,'user3','User Three'),(29,'user4@example.com',0,'user4','User Four'),(30,'user5@example.com',1,'user5','User Five'),(31,'user1@example.com',1,'user1','User One'),(32,'user2@example.com',0,'user2','User Two'),(33,'user3@example.com',1,'user3','User Three'),(34,'user4@example.com',0,'user4','User Four'),(35,'user5@example.com',1,'user5','User Five'),(36,'user1@example.com',1,'user1','User One'),(37,'user2@example.com',0,'user2','User Two'),(38,'user3@example.com',1,'user3','User Three'),(39,'user4@example.com',0,'user4','User Four'),(40,'user5@example.com',1,'user5','User Five'),(41,'user1@example.com',1,'user1','User One'),(42,'user2@example.com',0,'user2','User Two'),(43,'user3@example.com',1,'user3','User Three'),(44,'user4@example.com',0,'user4','User Four'),(45,'user5@example.com',1,'user5','User Five'),(46,'user1@example.com',1,'user1','User One'),(47,'user2@example.com',0,'user2','User Two'),(48,'user3@example.com',1,'user3','User Three'),(49,'user4@example.com',0,'user4','User Four'),(50,'user5@example.com',1,'user5','User Five'),(51,'user1@example.com',1,'user1','User One'),(52,'user2@example.com',0,'user2','User Two'),(53,'user3@example.com',1,'user3','User Three'),(54,'user4@example.com',0,'user4','User Four'),(55,'user5@example.com',1,'user5','User Five'),(56,'user1@example.com',1,'user1','User One'),(57,'user2@example.com',0,'user2','User Two'),(58,'user3@example.com',1,'user3','User Three'),(59,'user4@example.com',0,'user4','User Four'),(60,'user5@example.com',1,'user5','User Five'),(61,'user1@example.com',1,'user1','User One'),(62,'user2@example.com',0,'user2','User Two'),(63,'user3@example.com',1,'user3','User Three'),(64,'user4@example.com',0,'user4','User Four'),(65,'user5@example.com',1,'user5','User Five'),(66,'user1@example.com',1,'user1','User One'),(67,'user2@example.com',0,'user2','User Two'),(68,'user3@example.com',1,'user3','User Three'),(69,'user4@example.com',0,'user4','User Four'),(70,'user5@example.com',1,'user5','User Five'),(71,'user1@example.com',1,'user1','User One'),(72,'user2@example.com',0,'user2','User Two'),(73,'user3@example.com',1,'user3','User Three'),(74,'user4@example.com',0,'user4','User Four'),(75,'user5@example.com',1,'user5','User Five'),(76,'user1@example.com',1,'user1','User One'),(77,'user2@example.com',0,'user2','User Two'),(78,'user3@example.com',1,'user3','User Three'),(79,'user4@example.com',0,'user4','User Four'),(80,'user5@example.com',1,'user5','User Five');
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
