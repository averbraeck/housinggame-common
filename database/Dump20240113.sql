CREATE DATABASE  IF NOT EXISTS `housinggame` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `housinggame`;
-- MariaDB dump 10.18  Distrib 10.5.8-MariaDB, for Win64 (AMD64)
--
-- Host: 127.0.0.1    Database: housinggame
-- ------------------------------------------------------
-- Server version	10.11.5-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `community`
--

DROP TABLE IF EXISTS `community`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `community` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `capacity` int(11) NOT NULL,
  `fluvial_protection` int(10) unsigned NOT NULL,
  `pluvial_protection` int(10) unsigned NOT NULL,
  `gameversion_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_community_gameversion1_idx` (`gameversion_id`),
  CONSTRAINT `fk_community_gameversion1` FOREIGN KEY (`gameversion_id`) REFERENCES `gameversion` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `community`
--

LOCK TABLES `community` WRITE;
/*!40000 ALTER TABLE `community` DISABLE KEYS */;
INSERT INTO `community` VALUES (7,'Natucity',7,10,8,3),(8,'Dyktown',10,10,6,3),(9,'Unbesvillage',10,7,8,3),(13,'Natucity',7,10,8,5),(14,'Dyktown',10,10,6,5),(15,'Unbesvillage',10,7,8,5);
/*!40000 ALTER TABLE `community` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gamesession`
--

DROP TABLE IF EXISTS `gamesession`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gamesession` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `location` varchar(255) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT current_timestamp(),
  `date` date DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `gameversion_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Id_UNIQUE` (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`),
  KEY `fk_gamesession_gameversion1_idx` (`gameversion_id`),
  CONSTRAINT `fk_gamesession_gameversion1` FOREIGN KEY (`gameversion_id`) REFERENCES `gameversion` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gamesession`
--

LOCK TABLES `gamesession` WRITE;
/*!40000 ALTER TABLE `gamesession` DISABLE KEYS */;
INSERT INTO `gamesession` VALUES (5,'Ommen23 Morning','ommen','Ommen EPA','2023-10-07 09:45:47','2023-09-26','2023-09-26 09:00:00','2023-11-26 12:00:00',3),(6,'Ommen23 Afternoon','ommen','Ommen EPA','2023-10-07 21:39:23','2023-09-26','2023-11-10 09:00:00',NULL,3),(7,'Test','utrecht','Virtual','2023-11-23 18:04:27','2023-11-24',NULL,NULL,3),(8,'Utrecht 24-11-2023','utrecht','Utrecht','2023-11-23 18:05:23','2023-11-24',NULL,NULL,3);
/*!40000 ALTER TABLE `gamesession` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gameversion`
--

DROP TABLE IF EXISTS `gameversion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gameversion` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `languagegroup_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`),
  KEY `fk_gameversion_languagegroup1_idx` (`languagegroup_id`),
  CONSTRAINT `fk_gameversion_languagegroup1` FOREIGN KEY (`languagegroup_id`) REFERENCES `languagegroup` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gameversion`
--

LOCK TABLES `gameversion` WRITE;
/*!40000 ALTER TABLE `gameversion` DISABLE KEYS */;
INSERT INTO `gameversion` VALUES (3,'Game Version 2023-09 English',1),(5,'Game Versie 2023-11 Nederlands',1);
/*!40000 ALTER TABLE `gameversion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `group`
--

DROP TABLE IF EXISTS `group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `group` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `gamesession_id` int(10) unsigned NOT NULL,
  `scenario_id` int(10) unsigned NOT NULL,
  `facilitator_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Id_UNIQUE` (`id`),
  UNIQUE KEY `name_UNIQUE` (`gamesession_id`,`name`),
  UNIQUE KEY `facilitator_UNIQUE` (`gamesession_id`,`facilitator_id`),
  KEY `fk_group_gamesession1_idx` (`gamesession_id`),
  KEY `fk_group_scenario1_idx` (`scenario_id`),
  KEY `fk_group_user1_idx` (`facilitator_id`),
  CONSTRAINT `fk_group_gamesession1` FOREIGN KEY (`gamesession_id`) REFERENCES `gamesession` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_group_scenario1` FOREIGN KEY (`scenario_id`) REFERENCES `scenario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_group_user1` FOREIGN KEY (`facilitator_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group`
--

LOCK TABLES `group` WRITE;
/*!40000 ALTER TABLE `group` DISABLE KEYS */;
INSERT INTO `group` VALUES (27,'Table1','ommen',5,3,7),(28,'Table2','ommen',5,3,8),(29,'Table3','ommen',5,3,9),(30,'Table4','ommen',5,4,10),(31,'Table5','ommen',5,4,11),(32,'Table6','ommen',5,4,13),(33,'Table1','ommen',6,3,7),(34,'Table2','ommen',6,3,8),(35,'Table3','ommen',6,3,9),(36,'Table4','ommen',6,4,10),(37,'Table5','ommen',6,4,11),(38,'Table6','ommen',6,4,13),(39,'Table1','utrecht',7,4,7),(40,'Table2','utrecht',7,4,8),(41,'Table3','utrecht',7,4,9),(42,'Table4','utrecht',7,4,10),(43,'Table5','utrecht',7,4,11),(44,'Table6','utrecht',7,4,13),(45,'Table1','382',8,4,NULL),(46,'Table2','893',8,4,NULL),(47,'Table3','810',8,4,NULL);
/*!40000 ALTER TABLE `group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groupround`
--

DROP TABLE IF EXISTS `groupround`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `groupround` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `timestamp` timestamp NOT NULL DEFAULT current_timestamp(),
  `pluvial_flood_intensity` int(11) DEFAULT NULL,
  `fluvial_flood_intensity` int(11) DEFAULT NULL,
  `group_state` varchar(24) NOT NULL DEFAULT 'LOGIN',
  `round_number` int(10) unsigned NOT NULL,
  `group_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `round_UNIQUE` (`group_id`,`round_number`),
  KEY `fk_groupround_group1_idx` (`group_id`),
  CONSTRAINT `fk_groupround_group1` FOREIGN KEY (`group_id`) REFERENCES `group` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groupround`
--

LOCK TABLES `groupround` WRITE;
/*!40000 ALTER TABLE `groupround` DISABLE KEYS */;
INSERT INTO `groupround` VALUES (13,'2023-12-14 10:50:26',0,0,'LOGIN',0,34),(14,'2023-12-14 10:55:14',NULL,NULL,'SHOW_SUMMARY',1,34),(15,'2023-12-17 11:56:06',0,0,'LOGIN',0,35),(16,'2023-12-17 11:56:20',0,0,'LOGIN',0,33),(17,'2023-12-17 11:56:35',NULL,NULL,'NEW_ROUND',1,33),(18,'2023-12-19 17:31:06',0,0,'LOGIN',0,37),(19,'2023-12-20 20:15:16',NULL,NULL,'ALLOW_IMPROVEMENTS',1,35),(21,'2023-12-21 10:31:52',NULL,NULL,'SHOW_SURVEY',1,37),(22,'2023-12-23 23:41:20',0,0,'LOGIN',0,38),(23,'2023-12-23 23:41:44',8,10,'SHOW_SUMMARY',1,38),(25,'2024-01-06 16:24:09',8,10,'SHOW_SUMMARY',2,38),(26,'2024-01-08 00:39:15',0,0,'LOGIN',0,36),(27,'2024-01-08 00:41:39',NULL,NULL,'SHOW_SURVEY',1,36),(28,'2024-01-13 10:55:07',NULL,NULL,'NEW_ROUND',3,38);
/*!40000 ALTER TABLE `groupround` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `house`
--

DROP TABLE IF EXISTS `house`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `house` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `price` int(10) unsigned NOT NULL,
  `code` varchar(45) NOT NULL,
  `available_round` int(10) unsigned NOT NULL DEFAULT 1,
  `address` varchar(255) NOT NULL,
  `rating` int(10) unsigned NOT NULL,
  `initial_pluvial_protection` int(10) unsigned NOT NULL,
  `initial_fluvial_protection` int(10) unsigned NOT NULL,
  `community_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_house_community1_idx` (`community_id`),
  CONSTRAINT `fk_house_community1` FOREIGN KEY (`community_id`) REFERENCES `community` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=110 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `house`
--

LOCK TABLES `house` WRITE;
/*!40000 ALTER TABLE `house` DISABLE KEYS */;
INSERT INTO `house` VALUES (29,425000,'N01',1,'Stickroad 17',9,0,0,7),(30,200000,'N02',5,'Twiglane 7\r\n',6,1,1,7),(31,425000,'N03',4,'Stickroad 21\r\n\r\n',9,1,1,7),(32,200000,'N04',1,'Twiglane 8\r\n',6,0,0,7),(33,200000,'N05',2,'Twiglane 5\r\n\r\n\r\n',6,0,0,7),(34,100000,'N06',3,'Leafstreet 28\r\n\r\n',3,1,1,7),(35,100000,'N07',1,'Leafstreet 26\r\n',3,0,0,7),(36,300000,'D01',1,'Stonelane 13\r\n',8,0,0,8),(37,300000,'D02',2,'Stonelane 11\r\n\r\n',8,0,0,8),(38,300000,'D03',3,'Stonelane 15\r\n\r\n',8,0,0,8),(39,160000,'D04',1,'Steelstreet 22\r\n',5,0,0,8),(40,160000,'D05',1,'Steelstreet 20\r\n',5,0,0,8),(41,160000,'D06',3,'Steelstreet 25\r\n\r\n',5,1,0,8),(42,160000,'D07',4,'Steelstreet 23\r\n\r\n',5,1,2,8),(43,80000,'D08',4,'Brickroad 8\r\n\r\n',2,1,2,8),(44,80000,'D09',2,'Brickroad 4\r\n\r\n',2,0,0,8),(45,80000,'D10',1,'Brickroad 6\r\n',2,0,0,8),(46,200000,'U01',1,'Woolstreet 33\r\n',6,0,0,9),(47,200000,'U02',3,'Woolstreet 37\r\n\r\n',6,0,1,9),(48,200000,'U03',4,'Woolstreet 35\r\n\r\n',6,1,1,9),(49,125000,'U04',1,'Grassroad 54\r\n',4,0,0,9),(50,125000,'U05',2,'Grassroad 52\r\n\r\n',4,0,0,9),(51,125000,'U06',3,'Grassroad 51\r\n\r\n',4,1,1,9),(52,125000,'U07',5,'Grassroad 53\r\n\r\n',4,1,2,9),(53,70000,'U08',4,'Twiglane 46\r\n\r\n',2,1,2,9),(54,70000,'U09',2,'Twiglane 44\r\n\r\n',2,0,0,9),(55,70000,'U10',1,'Twiglane 48\r\n',2,0,0,9),(83,425000,'N01',1,'Stickroad 17',9,0,0,13),(84,200000,'N02',5,'Twiglane 7\r\n',6,1,1,13),(85,425000,'N03',4,'Stickroad 21\r\n\r\n',9,1,1,13),(86,200000,'N04',1,'Twiglane 8\r\n',6,0,0,13),(87,200000,'N05',2,'Twiglane 5\r\n\r\n\r\n',6,0,0,13),(88,100000,'N06',3,'Leafstreet 28\r\n\r\n',3,1,1,13),(89,100000,'N07',1,'Leafstreet 26\r\n',3,0,0,13),(90,300000,'D01',1,'Stonelane 13\r\n',8,0,0,14),(91,300000,'D02',2,'Stonelane 11\r\n\r\n',8,0,0,14),(92,300000,'D03',3,'Stonelane 15\r\n\r\n',8,0,0,14),(93,160000,'D04',1,'Steelstreet 22\r\n',5,0,0,14),(94,160000,'D05',1,'Steelstreet 20\r\n',5,0,0,14),(95,160000,'D06',3,'Steelstreet 25\r\n\r\n',5,1,0,14),(96,160000,'D07',4,'Steelstreet 23\r\n\r\n',5,1,2,14),(97,80000,'D08',4,'Brickroad 8\r\n\r\n',2,1,2,14),(98,80000,'D09',2,'Brickroad 4\r\n\r\n',2,0,0,14),(99,80000,'D10',1,'Brickroad 6\r\n',2,0,0,14),(100,200000,'U01',1,'Woolstreet 33\r\n',6,0,0,15),(101,200000,'U02',3,'Woolstreet 37\r\n\r\n',6,0,1,15),(102,200000,'U03',4,'Woolstreet 35\r\n\r\n',6,1,1,15),(103,125000,'U04',1,'Grassroad 54\r\n',4,0,0,15),(104,125000,'U05',2,'Grassroad 52\r\n\r\n',4,0,0,15),(105,125000,'U06',3,'Grassroad 51\r\n\r\n',4,1,1,15),(106,125000,'U07',5,'Grassroad 53\r\n\r\n',4,1,2,15),(107,70000,'U08',4,'Twiglane 46\r\n\r\n',2,1,2,15),(108,70000,'U09',2,'Twiglane 44\r\n\r\n',2,0,0,15),(109,70000,'U10',1,'Twiglane 48\r\n',2,0,0,15);
/*!40000 ALTER TABLE `house` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `housegroup`
--

DROP TABLE IF EXISTS `housegroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `housegroup` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(45) NOT NULL,
  `address` varchar(255) NOT NULL,
  `rating` int(10) unsigned NOT NULL,
  `original_price` int(10) unsigned NOT NULL,
  `damage_reduction` int(10) unsigned NOT NULL,
  `market_value` int(10) unsigned NOT NULL,
  `last_sold_price` int(10) unsigned DEFAULT NULL,
  `house_satisfaction` int(11) NOT NULL,
  `status` varchar(24) NOT NULL,
  `fluvial_base_protection` int(10) unsigned NOT NULL,
  `pluvial_base_protection` int(10) unsigned NOT NULL,
  `fluvial_house_protection` int(10) unsigned NOT NULL,
  `pluvial_house_protection` int(10) unsigned NOT NULL,
  `last_round_comm_fluvial` int(10) unsigned DEFAULT NULL,
  `last_round_comm_pluvial` int(10) unsigned DEFAULT NULL,
  `last_round_house_fluvial` int(10) unsigned DEFAULT NULL,
  `last_round_house_pluvial` int(10) unsigned DEFAULT NULL,
  `house_id` int(10) unsigned NOT NULL,
  `group_id` int(10) unsigned NOT NULL,
  `owner_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_houseround_house1_idx` (`house_id`),
  KEY `fk_housegroup_group1_idx` (`group_id`),
  KEY `fk_houseround_player1_idx` (`owner_id`),
  CONSTRAINT `fk_housegroup_group1` FOREIGN KEY (`group_id`) REFERENCES `group` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_houseround_house1` FOREIGN KEY (`house_id`) REFERENCES `house` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_houseround_player1` FOREIGN KEY (`owner_id`) REFERENCES `player` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `housegroup`
--

LOCK TABLES `housegroup` WRITE;
/*!40000 ALTER TABLE `housegroup` DISABLE KEYS */;
INSERT INTO `housegroup` VALUES (11,'N01','Stickroad 17',9,425000,0,425000,425000,0,'OCCUPIED',8,10,0,0,NULL,NULL,NULL,NULL,29,34,216),(12,'N04','Twiglane 8\r\n',6,200000,0,200000,200000,0,'OCCUPIED',8,10,0,0,NULL,NULL,NULL,NULL,32,34,217),(13,'N07','Leafstreet 26\r\n',3,100000,0,100000,100000,0,'OCCUPIED',8,10,0,0,NULL,NULL,NULL,NULL,35,34,212),(14,'D01','Stonelane 13\r\n',8,300000,0,300000,300000,0,'OCCUPIED',6,10,0,0,NULL,NULL,NULL,NULL,36,34,215),(15,'D04','Steelstreet 22\r\n',5,160000,0,160000,NULL,0,'AVAILABLE',6,10,0,0,NULL,NULL,NULL,NULL,39,34,NULL),(16,'D05','Steelstreet 20\r\n',5,160000,0,160000,160000,0,'OCCUPIED',6,10,0,0,NULL,NULL,NULL,NULL,40,34,214),(17,'D10','Brickroad 6\r\n',2,80000,0,80000,80000,0,'OCCUPIED',6,10,0,0,NULL,NULL,NULL,NULL,45,34,218),(18,'U01','Woolstreet 33\r\n',6,200000,0,200000,NULL,0,'AVAILABLE',8,7,0,0,NULL,NULL,NULL,NULL,46,34,NULL),(19,'U04','Grassroad 54\r\n',4,125000,0,125000,125000,0,'OCCUPIED',8,7,0,0,NULL,NULL,NULL,NULL,49,34,213),(20,'U10','Twiglane 48\r\n',2,70000,0,70000,70000,0,'OCCUPIED',8,7,0,0,NULL,NULL,NULL,NULL,55,34,219),(21,'N01','Stickroad 17',9,425000,0,425000,NULL,0,'AVAILABLE',8,10,0,0,NULL,NULL,NULL,NULL,29,33,NULL),(22,'N04','Twiglane 8\r\n',6,200000,0,200000,NULL,0,'AVAILABLE',8,10,0,0,NULL,NULL,NULL,NULL,32,33,NULL),(23,'N07','Leafstreet 26\r\n',3,100000,0,100000,NULL,0,'AVAILABLE',8,10,0,0,NULL,NULL,NULL,NULL,35,33,NULL),(24,'D01','Stonelane 13\r\n',8,300000,0,300000,NULL,0,'AVAILABLE',6,10,0,0,NULL,NULL,NULL,NULL,36,33,NULL),(25,'D04','Steelstreet 22\r\n',5,160000,0,160000,NULL,0,'AVAILABLE',6,10,0,0,NULL,NULL,NULL,NULL,39,33,NULL),(26,'D05','Steelstreet 20\r\n',5,160000,0,160000,NULL,0,'AVAILABLE',6,10,0,0,NULL,NULL,NULL,NULL,40,33,NULL),(27,'D10','Brickroad 6\r\n',2,80000,0,80000,NULL,0,'AVAILABLE',6,10,0,0,NULL,NULL,NULL,NULL,45,33,NULL),(28,'U01','Woolstreet 33\r\n',6,200000,0,200000,NULL,0,'AVAILABLE',8,7,0,0,NULL,NULL,NULL,NULL,46,33,NULL),(29,'U04','Grassroad 54\r\n',4,125000,0,125000,NULL,0,'AVAILABLE',8,7,0,0,NULL,NULL,NULL,NULL,49,33,NULL),(30,'U10','Twiglane 48\r\n',2,70000,0,70000,NULL,0,'AVAILABLE',8,7,0,0,NULL,NULL,NULL,NULL,55,33,NULL),(31,'N01','Stickroad 17',9,425000,0,425000,425000,0,'OCCUPIED',8,10,0,0,NULL,NULL,NULL,NULL,29,35,224),(32,'N04','Twiglane 8\r\n',6,200000,0,200000,200000,0,'OCCUPIED',8,10,0,0,NULL,NULL,NULL,NULL,32,35,225),(33,'N07','Leafstreet 26\r\n',3,100000,0,100000,100000,0,'OCCUPIED',8,10,0,0,NULL,NULL,NULL,NULL,35,35,220),(34,'D01','Stonelane 13\r\n',8,300000,0,300000,NULL,0,'AVAILABLE',6,10,0,0,NULL,NULL,NULL,NULL,36,35,NULL),(35,'D04','Steelstreet 22\r\n',5,160000,0,160000,NULL,0,'AVAILABLE',6,10,0,0,NULL,NULL,NULL,NULL,39,35,NULL),(36,'D05','Steelstreet 20\r\n',5,160000,0,160000,160000,0,'OCCUPIED',6,10,0,0,NULL,NULL,NULL,NULL,40,35,222),(37,'D10','Brickroad 6\r\n',2,80000,0,80000,80000,0,'OCCUPIED',6,10,0,0,NULL,NULL,NULL,NULL,45,35,226),(38,'U01','Woolstreet 33\r\n',6,200000,0,200000,200000,0,'OCCUPIED',8,7,0,0,NULL,NULL,NULL,NULL,46,35,223),(39,'U04','Grassroad 54\r\n',4,125000,0,125000,125000,0,'OCCUPIED',8,7,0,0,NULL,NULL,NULL,NULL,49,35,221),(40,'U10','Twiglane 48\r\n',2,70000,0,70000,NULL,0,'AVAILABLE',8,7,0,0,NULL,NULL,NULL,NULL,55,35,NULL),(41,'N01','Stickroad 17',9,425000,0,425000,425000,0,'OCCUPIED',8,10,0,0,NULL,NULL,NULL,NULL,29,37,241),(42,'N04','Twiglane 8\r\n',6,200000,0,200000,NULL,0,'AVAILABLE',8,10,0,0,NULL,NULL,NULL,NULL,32,37,NULL),(43,'N07','Leafstreet 26\r\n',3,100000,0,100000,NULL,0,'AVAILABLE',8,10,0,0,NULL,NULL,NULL,NULL,35,37,NULL),(44,'D01','Stonelane 13\r\n',8,300000,0,300000,300000,0,'OCCUPIED',6,10,0,0,NULL,NULL,NULL,NULL,36,37,236),(45,'D04','Steelstreet 22\r\n',5,160000,0,160000,160000,0,'OCCUPIED',6,10,0,0,NULL,NULL,NULL,NULL,39,37,238),(46,'D05','Steelstreet 20\r\n',5,160000,0,160000,NULL,0,'AVAILABLE',6,10,0,0,NULL,NULL,NULL,NULL,40,37,NULL),(47,'D10','Brickroad 6\r\n',2,80000,0,80000,80000,0,'OCCUPIED',6,10,0,0,NULL,NULL,NULL,NULL,45,37,237),(48,'U01','Woolstreet 33\r\n',6,200000,0,200000,200000,0,'OCCUPIED',8,7,0,0,NULL,NULL,NULL,NULL,46,37,239),(49,'U04','Grassroad 54\r\n',4,125000,0,125000,125000,0,'OCCUPIED',8,7,0,0,NULL,NULL,NULL,NULL,49,37,240),(50,'U10','Twiglane 48\r\n',2,70000,0,70000,NULL,0,'AVAILABLE',8,7,0,0,NULL,NULL,NULL,NULL,55,37,NULL),(51,'N01','Stickroad 17',9,425000,0,425000,425000,0,'OCCUPIED',10,8,0,0,0,0,0,0,29,38,249),(52,'N04','Twiglane 8',6,200000,0,200000,0,0,'NOT_AVAILABLE',10,8,0,0,0,0,0,0,32,38,NULL),(53,'N07','Leafstreet 26',3,100000,0,100000,100000,0,'OCCUPIED',10,8,0,0,0,0,0,0,35,38,245),(54,'D01','Stonelane 13',8,300000,0,300000,300000,0,'NOT_AVAILABLE',10,6,0,0,0,2,0,2,36,38,NULL),(55,'D04','Steelstreet 22',5,160000,0,160000,160000,0,'OCCUPIED',10,6,0,0,0,2,0,2,39,38,246),(56,'D05','Steelstreet 20',5,160000,0,160000,0,0,'NOT_AVAILABLE',10,6,0,0,0,2,0,2,40,38,NULL),(57,'D10','Brickroad 6',2,80000,0,80000,0,0,'NOT_AVAILABLE',10,6,0,0,0,2,0,2,45,38,NULL),(58,'U01','Woolstreet 33',6,200000,0,190000,200000,0,'OCCUPIED',7,8,0,0,2,0,2,0,46,38,247),(59,'U04','Grassroad 54',4,125000,0,115000,125000,0,'OCCUPIED',7,8,0,0,2,0,2,0,49,38,248),(60,'U10','Twiglane 48',2,70000,0,60000,NULL,0,'NOT_AVAILABLE',7,8,0,0,2,NULL,2,NULL,55,38,NULL),(61,'N05','Twiglane 5\r\n\r\n\r\n',6,200000,0,200000,200000,7,'OCCUPIED',10,8,11,9,NULL,NULL,NULL,NULL,33,38,244),(62,'D02','Stonelane 11\r\n\r\n',8,300000,0,300000,NULL,0,'NOT_AVAILABLE',10,6,0,0,NULL,2,NULL,2,37,38,NULL),(63,'D09','Brickroad 4\r\n\r\n',2,80000,0,80000,NULL,0,'NOT_AVAILABLE',10,6,0,0,NULL,2,NULL,2,44,38,NULL),(64,'U05','Grassroad 52\r\n\r\n',4,125000,0,115000,NULL,0,'NOT_AVAILABLE',7,8,0,0,2,NULL,2,NULL,50,38,NULL),(65,'U09','Twiglane 44\r\n\r\n',2,70000,0,60000,NULL,0,'NOT_AVAILABLE',7,8,0,0,2,NULL,2,NULL,54,38,NULL),(66,'N01','Stickroad 17',9,425000,0,425000,425000,0,'OCCUPIED',10,8,0,0,NULL,NULL,NULL,NULL,29,36,233),(67,'N04','Twiglane 8\r\n',6,200000,0,200000,200000,0,'OCCUPIED',10,8,0,0,NULL,NULL,NULL,NULL,32,36,231),(68,'N07','Leafstreet 26\r\n',3,100000,0,100000,100000,0,'OCCUPIED',10,8,0,0,NULL,NULL,NULL,NULL,35,36,232),(69,'D01','Stonelane 13\r\n',8,300000,0,300000,300000,0,'OCCUPIED',10,6,0,0,NULL,NULL,NULL,NULL,36,36,228),(70,'D04','Steelstreet 22\r\n',5,160000,0,160000,160000,0,'OCCUPIED',10,6,0,0,NULL,NULL,NULL,NULL,39,36,230),(71,'D05','Steelstreet 20\r\n',5,160000,0,160000,NULL,0,'AVAILABLE',10,6,0,0,NULL,NULL,NULL,NULL,40,36,NULL),(72,'D10','Brickroad 6\r\n',2,80000,0,80000,80000,0,'OCCUPIED',10,6,0,0,NULL,NULL,NULL,NULL,45,36,229),(73,'U01','Woolstreet 33\r\n',6,200000,0,200000,200000,4,'OCCUPIED',7,8,8,8,NULL,NULL,NULL,NULL,46,36,234),(74,'U04','Grassroad 54\r\n',4,125000,0,125000,NULL,0,'AVAILABLE',7,8,0,0,NULL,NULL,NULL,NULL,49,36,NULL),(75,'U10','Twiglane 48\r\n',2,70000,0,70000,70000,0,'OCCUPIED',7,8,0,0,NULL,NULL,NULL,NULL,55,36,235),(76,'N06','Leafstreet 28\r\n\r\n',3,100000,0,100000,NULL,0,'AVAILABLE',10,8,1,1,NULL,NULL,NULL,NULL,34,38,NULL),(77,'D03','Stonelane 15\r\n\r\n',8,300000,0,300000,NULL,0,'AVAILABLE',10,6,0,0,NULL,NULL,NULL,NULL,38,38,NULL),(78,'D06','Steelstreet 25\r\n\r\n',5,160000,0,160000,NULL,0,'AVAILABLE',10,6,0,1,NULL,NULL,NULL,NULL,41,38,NULL),(79,'U02','Woolstreet 37\r\n\r\n',6,200000,0,200000,NULL,0,'AVAILABLE',7,8,1,0,NULL,NULL,NULL,NULL,47,38,NULL),(80,'U06','Grassroad 51\r\n\r\n',4,125000,0,125000,NULL,0,'AVAILABLE',7,8,1,1,NULL,NULL,NULL,NULL,51,38,NULL);
/*!40000 ALTER TABLE `housegroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `housetransaction`
--

DROP TABLE IF EXISTS `housetransaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `housetransaction` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `timestamp` timestamp NULL DEFAULT current_timestamp(),
  `price` int(10) unsigned NOT NULL,
  `comment` varchar(45) NOT NULL,
  `transaction_status` varchar(24) NOT NULL,
  `housegroup_id` int(10) unsigned NOT NULL,
  `playerround_id` int(10) unsigned NOT NULL,
  `groupround_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_housetransaction_housegroup1_idx` (`housegroup_id`),
  KEY `fk_housetransaction_playerround1_idx` (`playerround_id`),
  KEY `fk_housetransaction_groupround1_idx` (`groupround_id`),
  CONSTRAINT `fk_housetransaction_groupround1` FOREIGN KEY (`groupround_id`) REFERENCES `groupround` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_housetransaction_housegroup1` FOREIGN KEY (`housegroup_id`) REFERENCES `housegroup` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_housetransaction_playerround1` FOREIGN KEY (`playerround_id`) REFERENCES `playerround` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `housetransaction`
--

LOCK TABLES `housetransaction` WRITE;
/*!40000 ALTER TABLE `housetransaction` DISABLE KEYS */;
INSERT INTO `housetransaction` VALUES (2,'2023-12-14 10:55:40',100000,'','APPROVED_BUY',13,77,14),(3,'2023-12-14 11:01:50',125000,'','REJECTED_BUY',19,79,14),(4,'2023-12-14 11:02:18',125000,'','APPROVED_BUY',19,79,14),(5,'2023-12-14 12:14:37',160000,'','APPROVED_BUY',16,81,14),(6,'2023-12-14 13:53:44',300000,'','APPROVED_BUY',14,83,14),(7,'2023-12-17 19:19:35',125000,'Wrong house chosen','REJECTED_BUY',19,90,14),(8,'2023-12-17 19:57:22',160000,'Wrong house chosen; cannot afford house!','REJECTED_BUY',16,92,14),(9,'2023-12-20 11:26:28',425000,'Ok!','APPROVED_BUY',11,88,14),(10,'2023-12-20 11:27:45',125000,'House not available','REJECTED_BUY',19,90,14),(11,'2023-12-20 16:12:11',70000,'','REJECTED_BUY',20,90,14),(12,'2023-12-20 17:46:07',80000,'','APPROVED_BUY',17,92,14),(13,'2023-12-20 17:47:40',200000,'','APPROVED_BUY',12,94,14),(14,'2023-12-20 18:54:43',70000,'','APPROVED_BUY',20,90,14),(15,'2023-12-20 20:15:46',100000,'','APPROVED_BUY',33,95,19),(16,'2023-12-20 20:16:14',125000,'','APPROVED_BUY',39,97,19),(17,'2023-12-20 20:16:35',160000,'','APPROVED_BUY',36,99,19),(18,'2023-12-20 20:17:21',200000,'','APPROVED_BUY',38,101,19),(19,'2023-12-20 20:17:51',425000,'','APPROVED_BUY',31,103,19),(20,'2023-12-20 20:34:20',200000,'','APPROVED_BUY',32,105,19),(21,'2023-12-20 20:38:38',80000,'','APPROVED_BUY',37,107,19),(22,'2023-12-21 10:32:25',300000,'','APPROVED_BUY',44,109,21),(23,'2023-12-21 10:33:35',125000,'Cannot afford','REJECTED_BUY',49,111,21),(24,'2023-12-21 10:36:42',80000,'','APPROVED_BUY',47,111,21),(25,'2023-12-21 10:45:44',160000,'','APPROVED_BUY',45,113,21),(26,'2023-12-21 10:50:14',425000,'Too expensive','REJECTED_BUY',41,115,21),(27,'2023-12-21 10:51:13',200000,'','APPROVED_BUY',48,115,21),(28,'2023-12-21 10:54:44',125000,'','APPROVED_BUY',49,117,21),(29,'2023-12-21 11:04:39',425000,'','APPROVED_BUY',41,119,21),(30,'2023-12-26 02:40:41',160000,'','REJECTED_BUY',55,124,23),(31,'2023-12-26 02:41:39',160000,'','REJECTED_BUY',55,124,23),(32,'2023-12-26 02:43:49',100000,'','REJECTED_BUY',53,125,23),(33,'2023-12-26 03:09:58',81000,'','REJECTED_BUY',57,125,23),(34,'2023-12-26 03:10:30',100000,'','APPROVED_BUY',53,125,23),(35,'2023-12-28 01:00:16',160000,'','APPROVED_BUY',55,124,23),(36,'2023-12-29 17:05:09',300000,'','APPROVED_BUY',54,121,23),(37,'2023-12-29 17:34:35',200000,'ok','APPROVED_BUY',58,127,23),(38,'2023-12-30 02:35:31',125000,'','APPROVED_BUY',59,129,23),(39,'2023-12-30 11:49:18',425000,'','APPROVED_BUY',51,131,23),(40,'2024-01-07 22:02:37',300000,'','APPROVED_SELL',54,134,25),(41,'2024-01-07 22:03:33',0,'','APPROVED_STAY',53,135,25),(42,'2024-01-08 00:57:21',300000,'t4p1 and t4p6 competed','APPROVED_BUY',69,141,27),(43,'2024-01-08 00:57:59',80000,'','APPROVED_BUY',72,142,27),(44,'2024-01-08 00:58:22',160000,'','APPROVED_BUY',70,144,27),(45,'2024-01-08 00:59:08',200000,'','APPROVED_BUY',67,146,27),(46,'2024-01-08 00:59:41',100000,'','APPROVED_BUY',68,148,27),(47,'2024-01-08 01:00:19',300000,'t4p1 and t4p6 competed','REJECTED_BUY',69,150,27),(48,'2024-01-08 01:01:18',200000,'','APPROVED_BUY',73,152,27),(49,'2024-01-08 01:02:35',70000,'','APPROVED_BUY',75,154,27),(50,'2024-01-08 01:03:14',425000,'','APPROVED_BUY',66,150,27),(51,'2024-01-08 02:23:49',0,'','REJECTED_STAY',55,137,25),(52,'2024-01-09 02:36:53',200000,'','APPROVED_BUY',61,134,25),(53,'2024-01-09 02:40:52',0,'','APPROVED_STAY',55,137,25),(54,'2024-01-09 02:42:05',200000,'','APPROVED_SELL',58,133,25),(55,'2024-01-09 02:44:03',200000,'','APPROVED_BUY',58,133,25),(56,'2024-01-09 02:45:54',0,'','APPROVED_STAY',59,136,25),(57,'2024-01-09 02:47:31',0,'','APPROVED_STAY',51,138,25);
/*!40000 ALTER TABLE `housetransaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `initialhousemeasure`
--

DROP TABLE IF EXISTS `initialhousemeasure`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `initialhousemeasure` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `round_number` int(10) unsigned NOT NULL,
  `measuretype_id` int(10) unsigned NOT NULL,
  `house_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_initialhousemeasure_measuretype1_idx` (`measuretype_id`),
  KEY `fk_initialhousemeasure_house1_idx` (`house_id`),
  CONSTRAINT `fk_initialhousemeasure_house1` FOREIGN KEY (`house_id`) REFERENCES `house` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_initialhousemeasure_measuretype1` FOREIGN KEY (`measuretype_id`) REFERENCES `measuretype` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `initialhousemeasure`
--

LOCK TABLES `initialhousemeasure` WRITE;
/*!40000 ALTER TABLE `initialhousemeasure` DISABLE KEYS */;
INSERT INTO `initialhousemeasure` VALUES (1,'U06 sandbags',2,26,51),(2,'U02 bulkhead',2,22,47),(3,'D06 water pump',1,16,41),(4,'N06 sandbags',2,26,34),(5,'U02 ground level',2,20,53),(6,'U03 green garden',1,12,48),(7,'U03 bulkhead',3,22,48),(8,'D08 Green Garden',2,12,43),(9,'D08 Ground Level',2,20,43),(10,'N03 Rail Barrel',3,18,31),(11,'N03 Bulkhead',3,22,31),(12,'D07 steel walls',3,14,42),(13,'D07 water resist',1,24,42),(14,'N02 steel walls',4,14,30),(15,'N02 water pump',4,16,30),(16,'U07 water pump',3,16,52),(17,'U07 bulkhead',4,22,52),(18,'U07 walls floors',3,24,52),(37,'N02 steel walls',4,36,84),(38,'N02 water pump',4,37,84),(39,'N03 Rail Barrel',3,38,85),(40,'N03 Bulkhead',3,40,85),(41,'N06 sandbags',2,42,88),(42,'D06 water pump',1,37,95),(43,'D07 steel walls',3,36,96),(44,'D07 water resist',1,41,96),(45,'D08 Green Garden',2,35,97),(46,'D08 Ground Level',2,39,97),(47,'U02 bulkhead',2,40,101),(48,'U03 green garden',1,35,102),(49,'U03 bulkhead',3,40,102),(50,'U06 sandbags',2,42,105),(51,'U07 water pump',3,37,106),(52,'U07 bulkhead',4,40,106),(53,'U07 walls floors',3,41,106),(54,'U02 ground level',2,39,107);
/*!40000 ALTER TABLE `initialhousemeasure` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `label`
--

DROP TABLE IF EXISTS `label`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `label` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(45) NOT NULL,
  `value1` text NOT NULL,
  `value2` text DEFAULT NULL,
  `value3` text DEFAULT NULL,
  `value4` text DEFAULT NULL,
  `languagegroup_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `key_UNIQUE` (`languagegroup_id`,`key`),
  KEY `fk_label_languagegroup1_idx` (`languagegroup_id`),
  CONSTRAINT `fk_label_languagegroup1` FOREIGN KEY (`languagegroup_id`) REFERENCES `languagegroup` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `label`
--

LOCK TABLES `label` WRITE;
/*!40000 ALTER TABLE `label` DISABLE KEYS */;
INSERT INTO `label` VALUES (8,'login/signin','Sign in','Inloggen','','',1),(9,'login/groupname','Group Name *','Groepsnaam *','','',1),(10,'login/password','Password *','Password *','','',1),(11,'login/playercode','Player Code *','Code Speler *','','',1),(13,'login/button/signin','SIGN IN','INLOGGEN','','',1),(14,'welcome/header','Welcome to Where We Move!','Welkom bij Where We Move!','','',1),(15,'welcome/button/back','BACK','TERUG','','',1),(16,'welcome/button/continue','CONTINUE','VERDER','','',1),(17,'welcome/1/header','At the top of the screen you can see your player information','Bovenaan het scherm staat de spelersinformatie','','',1),(18,'welcome/1/text','From the left to the right you can first see your group number $group$, then your player name $player$. After that you can find the round number $round$, and the preferred house rating which is $rating$. In the second line your yearly income $income$, the satisfaction score you have $satisfaction$, your savings amount $savings$ and the maximum mortgage you have $maxmortgage$. Your spendable wealth is the sum of your savings and your yearly income Hence it is $savings$ + $income$.','Van links naar rechts zie je eerst je groepsnummer $group$, daarna je spelersnaam $player$. Daarna vind je de ronde van het spel $round$, en de gewenste woningwaardering die $rating$ is. In de tweede regel vind je het jaarinkomen $income$, je tevredenheidsscore $satisfaction$, je spaarbedrag $savings$ en de maximale hypotheek die u heeft $maxmortgage$. Uw besteedbaar vermogen is de som van je spaargeld en je jaarinkomen. Het is dus $savings$ + $income$.','','',1),(19,'welcome/2/header','Please select a house to buy','Selecteer een huis om te kopen','','',1),(20,'welcome/2/text','Every round starts with choosing a house, you don\'t need to change your house every round though. Every round the houses which you can choose from can be found on your group table. If you have any questions, please ask your facilitator. Please don\'t choose a house which is already chosen by another player. Your input will always be validated!','Elke ronde begint met het kiezen van een huis, maar je hoeft niet elke ronde van huis te veranderen. Iedere ronde vind je op je groepstafel de huizen waaruit je kunt kiezen. Als je vragen hebt, kan je deze aan de facilitator stellen. Kies geen huis dat al door een andere speler is gekozen. Je keuzes worden altijd gevalideerd!','','',1),(21,'welcome/3/header','Optional: buy a measure to improve your house or buy satisfaction points','Optioneel: koop een maatregel om je huis te verbeteren, of koop tevredenheidspunten','','',1),(22,'welcome/3/text','Next, you can buy a measure to improve your house and reduce the damage you might get if a flood happen. You can also buy satisfaction points or you can save your money for later.','Vervolgens kan je een maatregel kopen om je huis te verbeteren en potenti&euml;schade te verminderen die je zou kunnen oplopen als er een overstroming plaatsvindt. Je kan ook tevredenheidspunten kopen of je geld bewaren voor later.','','',1),(23,'welcome/4/header','Please select two questions to answer','Selecteer de twee vragen om te beantwoorden','','',1),(24,'welcome/4/text','In every round you can select an answers for two different questions. Please, select two questions and answer them.','In elke ronde kun je een antwoord kiezen voor twee verschillende vragen. Selecteer de twee vragen en beantwoord ze.','','',1),(25,'welcome/5/header','What\'s next?','Wat volgt er dan?','','',1),(26,'welcome/5/text','After you have answered the questions, and entered your selections for all other steps, you can click on the \'Next Round\' button when the facilitator says so. When you click on this button, a new round starts. Note that you can not go back to the previous round and that a new round starts when the facilitator says so.','Nadat je de vragen hebt beantwoord en je de selecties voor alle overige stappen hebt ingevoerd, kan je op de knop \'Volgende ronde\' klikken als de facilitator dit aangeeft. Wanneer je op deze knop klikt, begint een nieuwe ronde. Houd er rekening mee dat je niet terug kunt naar de vorige ronde en dat een nieuwe ronde pas begint als de facilitator toestemming geeft.','','',1),(27,'welcome/6/header','Enjoy the game!','Veel plezier met het spel!','','',1),(28,'welcome/6/text','We hope you enjoy the game!','We hopen dat je het spel leuk vindt!','','',1),(29,'welcome/button/finish','FINISH','AFSLUITEN','','',1),(30,'welcome/footer/ready','Are you ready reading? - if yes, you can start the game','Klaar met lezen? Zo ja, dan kan je het spel starten','','',1),(31,'welcome/button/start','START THE GAME!','START HET SPEL!','','',1),(32,'general/header','The Housing Game','The Housing Game','','',1),(33,'house/instructions/header','Please select a house','Selecteer een huis','','',1),(34,'house/instructions/text','This is the house selection page. Please select a house from the list below. You will see the price and the rate of the selected house after making the selection. Please keep in mind that you will pay 10% of the house price as a yearly mortgage payment. And that you cannot select a house which price is higher than the maximum mortgage <import <AccountBalanceIcon /> + your savings <WalletIcon />.','Dit is de huizenselectiepagina. Selecteer een huis uit de onderstaande lijst. Na het maken van de selectie zie je de prijs en de klasse van de geselecteerde woning. Houd er rekening mee dat je jaarlijks 10% van de woningprijs als hypotheekbetaling betaalt. En dat je geen huis kunt kiezen waarvan de prijs hoger is dan de maximale hypotheek <AccountBalanceIcon /> + je spaargeld <WalletIcon />.','','',1),(35,'house/choice/house','House *','Huis *','','',1),(36,'house/choice/submit','SUBMIT CHOICES','BEVESTIG KEUZES','','',1),(37,'house/choice/skip','SKIP','OVERSLAAN','','',1),(38,'house/price/header','Price','Prijs','','',1),(39,'house/price/text','Yearly Mortgage (payment per round):','Jaarlijkse hypotheek (betaling per ronde):','','',1),(40,'house/rate/header','House Rate:','Waardering huis:','','',1),(41,'house/rate/text','Your satisfaction will be affected by this','Je tevredenheidsscore wordt hierdoor be&iuml;nvloed','','',1),(42,'house/pluvial/header','Pluvial protection:','Bescherming regen:','','',1),(43,'house/pluvial/text','This is the amount of protection you have from pluvial (rain) flooding','Dit is de bescherming die het huis heeft tegen overvloedige regenval','','',1),(44,'house/fluvial/header','Fluvial protection:','Bescherming overstroming:','','',1),(45,'house/fluvial/text','This is the amount of protection you have from fluvial (river) flooding','Dit is de bescherming die het huis heeft tegen overstroming van de rivier','','',1),(46,'error/roundnotstarted','Round did not start yet!','Ronde is nog niet begonnen!','','',1),(47,'welcome/text','The aim is to achieve the highest score possible by increasing satisfaction and earning points for the available income.<br/>\r\nWhile playing, you will learn which choices you may make for protecting your house and yourself, given the assigned budget and expectations','Het doel is om een zo hoog mogelijke score te behalen door de tevredenheid te vergroten en punten te verdienen voor het beschikbare inkomen.<br/>\r\nAl spelend leer je welke keuzes je kunt maken om je huis en jezelf te beschermen, gegeven het toegewezen budget en de verwachtingen','','',1),(48,'welcome/wait/header','Thank you for logging in!','Dank voor het inloggen!','','',1),(49,'welcome/wait/text','The facilitator created the group table but did not start the game yet. Wait for the facilitator to be able to play. The START GAME button will turn blue when you can continue.','De facilitator heeft de groeps aangemaakt, maar heeft het spel nog niet gestart.\r\nWacht op de facilitator om te beginnen met spelen. De blauwe START SPEL knop wordt blauw als je verder kan.','','',1),(50,'welcome/wait/nowait','The facilitator has already started the game. Press the START GAME button to participate.','De facilitator heeft de game al gestart. Klik de START GAME knop om mee te doen.','','',1);
/*!40000 ALTER TABLE `label` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `language`
--

DROP TABLE IF EXISTS `language`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `language` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(2) NOT NULL,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `code_UNIQUE` (`code`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `language`
--

LOCK TABLES `language` WRITE;
/*!40000 ALTER TABLE `language` DISABLE KEYS */;
INSERT INTO `language` VALUES (1,'EN','English'),(2,'NL','Nederlands');
/*!40000 ALTER TABLE `language` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `languagegroup`
--

DROP TABLE IF EXISTS `languagegroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `languagegroup` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `language_id1` int(10) unsigned NOT NULL,
  `language_id2` int(10) unsigned DEFAULT NULL,
  `language_id3` int(10) unsigned DEFAULT NULL,
  `language_id4` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`),
  KEY `fk_languages_language1_idx` (`language_id1`),
  KEY `fk_languages_language2_idx` (`language_id2`),
  KEY `fk_languages_language3_idx` (`language_id3`),
  KEY `fk_languages_language4_idx` (`language_id4`),
  CONSTRAINT `fk_languages_language1` FOREIGN KEY (`language_id1`) REFERENCES `language` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_languages_language2` FOREIGN KEY (`language_id2`) REFERENCES `language` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_languages_language3` FOREIGN KEY (`language_id3`) REFERENCES `language` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_languages_language4` FOREIGN KEY (`language_id4`) REFERENCES `language` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `languagegroup`
--

LOCK TABLES `languagegroup` WRITE;
/*!40000 ALTER TABLE `languagegroup` DISABLE KEYS */;
INSERT INTO `languagegroup` VALUES (1,'default EN-NL',1,2,NULL,NULL);
/*!40000 ALTER TABLE `languagegroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `measure`
--

DROP TABLE IF EXISTS `measure`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `measure` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `round_number` int(10) unsigned NOT NULL,
  `consumed_in_round` int(10) unsigned DEFAULT NULL,
  `measuretype_id` int(10) unsigned NOT NULL,
  `housegroup_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_measure_measuretype1_idx` (`measuretype_id`),
  KEY `fk_measure_houseround1_idx` (`housegroup_id`),
  CONSTRAINT `fk_measure_houseround1` FOREIGN KEY (`housegroup_id`) REFERENCES `housegroup` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_measure_measuretype1` FOREIGN KEY (`measuretype_id`) REFERENCES `measuretype` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `measure`
--

LOCK TABLES `measure` WRITE;
/*!40000 ALTER TABLE `measure` DISABLE KEYS */;
INSERT INTO `measure` VALUES (1,1,NULL,26,58),(2,1,NULL,12,73),(3,1,NULL,14,73),(4,1,NULL,18,73),(5,1,NULL,22,73),(6,2,NULL,12,61),(7,2,NULL,14,61),(8,2,NULL,16,61),(9,2,NULL,18,61),(10,2,NULL,20,61),(11,2,NULL,22,61),(12,2,NULL,26,61),(13,1,NULL,16,60),(14,3,NULL,26,76),(15,3,NULL,16,78),(16,3,NULL,22,79),(17,3,NULL,26,80);
/*!40000 ALTER TABLE `measure` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `measuretype`
--

DROP TABLE IF EXISTS `measuretype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `measuretype` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `short_alias` varchar(24) NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` text NOT NULL,
  `price` int(10) unsigned NOT NULL,
  `satisfaction_delta` int(11) NOT NULL,
  `pluvial_protection_delta` int(11) NOT NULL,
  `fluvial_protection_delta` int(11) NOT NULL,
  `valid_till_usage` tinyint(3) NOT NULL DEFAULT 0,
  `gameversion_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_measuretype_gameversion1_idx` (`gameversion_id`),
  CONSTRAINT `fk_measuretype_gameversion1` FOREIGN KEY (`gameversion_id`) REFERENCES `gameversion` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `measuretype`
--

LOCK TABLES `measuretype` WRITE;
/*!40000 ALTER TABLE `measuretype` DISABLE KEYS */;
INSERT INTO `measuretype` VALUES (12,'Green garden','Green Garden','Creating a green garden space can help your garden soak up more water during long periods of rain. This can help in, e.g., urban areas.',20000,2,1,0,0,3),(14,'Steel walls','Automatic steel walls','Install steel walls which will automatically rise when a flood is detected. This will shut the water out of your house.',12000,1,1,0,0,3),(16,'Water pump','Install a water pump','A water pump can help you to remove excess water from your basement or garden. It is not fast enough to remove water from an actual flood.',6000,0,1,0,0,3),(18,'Rain barrel','Underground rain barrel','Rain barrels are typically connected to gutter downspouts and collect the runoff from roofs. You can use this stored water for uses such as watering the garden, washing your car or flushing your toilet.',11000,1,0,1,0,3),(20,'Rise level','Rise ground level','Rising the ground level of your house is an expensive, but incredibly effective way to protect your house from flood water.',35000,3,1,2,0,3),(22,'Bulkhead','Self rising bulkhead','A self-rising bulkhead seals passages such as doors and prevents water from entering during a flood. It forms a permanent part of your house and rises automatically when it comes into contact with inflowing water.',8000,0,0,1,0,3),(24,'Waterproofing','Water resistent walls and floors','Choose walling and floors that are not easily damaged by water and will protect the structure underneath. If a flood does happen, this will lessen the damage the water does.',20000,1,1,1,0,3),(26,'Sandbags','Sandbags','When a flood is happening, you can use these sandbags to protect your doors and house. It is a cheaper alternative, but they cannot be used again once they are used.',3000,0,1,1,0,3),(35,'Green garden','Green Garden','Creating a green garden space can help your garden soak up more water during long periods of rain. This can help in, e.g., urban areas.',20000,2,1,0,0,5),(36,'Steel walls','Automatic steel walls','Install steel walls which will automatically rise when a flood is detected. This will shut the water out of your house.',12000,1,1,0,0,5),(37,'Water pump','Install a water pump','A water pump can help you to remove excess water from your basement or garden. It is not fast enough to remove water from an actual flood.',6000,0,1,0,0,5),(38,'Rain barrel','Underground rain barrel','Rain barrels are typically connected to gutter downspouts and collect the runoff from roofs. You can use this stored water for uses such as watering the garden, washing your car or flushing your toilet.',11000,1,1,0,0,5),(39,'Rise level','Rise ground level','Rising the ground level of your house is an expensive, but incredibly effective way to protect your house from flood water.',35000,3,1,2,0,5),(40,'Bulkhead','Self rising bulkhead','A self-rising bulkhead seals passages such as doors and prevents water from entering during a flood. It forms a permanent part of your house and rises automatically when it comes into contact with inflowing water.',8000,0,0,1,0,5),(41,'Waterproofing','Water resistent walls and floors','Choose walling and floors that are not easily damaged by water and will protect the structure underneath. If a flood does happen, this will lessen the damage the water does.',20000,1,1,1,0,5),(42,'Sandbags','Sandbags','When a flood is happening, you can use these sandbags to protect your doors and house. It is a cheaper alternative, but they cannot be used again once they are used.',3000,0,1,1,0,5);
/*!40000 ALTER TABLE `measuretype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movingreason`
--

DROP TABLE IF EXISTS `movingreason`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movingreason` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `sequence_number` int(10) unsigned NOT NULL,
  `key` varchar(24) NOT NULL,
  `reason_text` varchar(64) NOT NULL,
  `is_other` tinyint(4) NOT NULL DEFAULT 0,
  `gameversion_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `sequence_UNIQUE` (`gameversion_id`,`sequence_number`),
  UNIQUE KEY `key_UNIQUE` (`gameversion_id`,`key`),
  KEY `fk_movingreason_gameversion1_idx` (`gameversion_id`),
  CONSTRAINT `fk_movingreason_gameversion1` FOREIGN KEY (`gameversion_id`) REFERENCES `gameversion` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movingreason`
--

LOCK TABLES `movingreason` WRITE;
/*!40000 ALTER TABLE `movingreason` DISABLE KEYS */;
INSERT INTO `movingreason` VALUES (1,1,'1. House lookout','Like the house lookout',0,3),(2,2,'2. Satisfaction','Increase house satisfaction rating',0,3),(3,6,'6. Other','Other',1,3),(4,3,'3. Area protection','Relocate to a better protected area',0,3),(5,4,'4. House protection','Get a house with better flood protection measures',0,3),(6,5,'5. Decrease expenses','Decrease house-related expenses',0,3);
/*!40000 ALTER TABLE `movingreason` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `newseffects`
--

DROP TABLE IF EXISTS `newseffects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `newseffects` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `house_discount_round1` int(10) unsigned NOT NULL DEFAULT 0 COMMENT 'House discount year 1 after flooding, in Euros or as a percentage',
  `house_discount_round2` int(10) unsigned NOT NULL DEFAULT 0 COMMENT 'House discount year 2 after flooding, in Euros or as a percentage',
  `house_discount_round3` int(10) unsigned NOT NULL DEFAULT 0 COMMENT 'House discount year 3 after flooding, in Euros or as a percentage',
  `pluvial_protection_change` int(11) NOT NULL DEFAULT 0,
  `fluvial_protection_change` int(11) NOT NULL DEFAULT 0,
  `tax_change` float NOT NULL DEFAULT 0,
  `satisfaction_living_bonus` int(11) NOT NULL DEFAULT 0,
  `satisfaction_move_change` int(11) NOT NULL DEFAULT 0,
  `newsitem_id` int(10) unsigned NOT NULL,
  `community_id` int(10) unsigned DEFAULT NULL COMMENT 'When community_id is NOT filled, all communities are affected equally.',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_newseffects_newsitem1_idx` (`newsitem_id`),
  KEY `fk_newseffects_community1_idx` (`community_id`),
  CONSTRAINT `fk_newseffects_community1` FOREIGN KEY (`community_id`) REFERENCES `community` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_newseffects_newsitem1` FOREIGN KEY (`newsitem_id`) REFERENCES `newsitem` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `newseffects`
--

LOCK TABLES `newseffects` WRITE;
/*!40000 ALTER TABLE `newseffects` DISABLE KEYS */;
INSERT INTO `newseffects` VALUES (1,'House discounts 10-5-2',10000,5000,2000,0,0,0,0,0,15,7),(2,'House discounts 10-5-2',10000,5000,2000,0,0,0,0,0,22,7),(3,'Rain effects',0,0,0,-2,-1,0,0,0,23,7),(4,'Rain effects',0,0,0,-2,-1,0,0,0,16,7),(5,'Taxes Natucity +5',0,0,0,0,0,5,0,0,17,7),(6,'Taxes Natucity +5',0,0,0,0,0,5,0,0,24,7),(7,'NbS satisfaction',0,0,0,0,0,0,2,2,25,7),(8,'NbS satisfaction',0,0,0,0,0,0,2,2,18,7),(33,'House discounts 10-5-2',10000,5000,2000,0,0,0,0,0,69,NULL),(34,'Rain effects',0,0,0,-2,-1,0,0,0,70,NULL),(35,'Taxes Natucity +5',0,0,0,0,0,5,0,0,71,13),(36,'NbS satisfaction',0,0,0,0,0,0,2,2,72,13),(37,'House discounts 10-5-2',10000,5000,2000,0,0,0,0,0,78,NULL),(38,'Rain effects',0,0,0,-2,-1,0,0,0,79,NULL),(39,'Taxes Natucity +5',0,0,0,0,0,5,0,0,80,13),(40,'NbS satisfaction',0,0,0,0,0,0,2,2,81,13);
/*!40000 ALTER TABLE `newseffects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `newsitem`
--

DROP TABLE IF EXISTS `newsitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `newsitem` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `summary` text NOT NULL,
  `content` text NOT NULL,
  `round_number` int(10) unsigned NOT NULL,
  `scenario_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_newsitem_scenario1_idx` (`scenario_id`),
  CONSTRAINT `fk_newsitem_scenario1` FOREIGN KEY (`scenario_id`) REFERENCES `scenario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `newsitem`
--

LOCK TABLES `newsitem` WRITE;
/*!40000 ALTER TABLE `newsitem` DISABLE KEYS */;
INSERT INTO `newsitem` VALUES (12,'0: General Introduction','Welcome to Where we Move, a serious game that analyses the choices made by participants. All results will be anonymised.','Welcome to Where we Move, this is a serious game involving houses, floodings and various measures you can take. Today we will play this game which will allow you to explore options on how you could protect your house and yourself. During the game, we will ask you to fill in some data sheets that will allow us to conduct some research on the game. It helps us analyse which choices were made during the game and your feelings regarding floodings. These forms will be anonymized and analysed later. But please know that there are no wrong answers or choices, we just want to know what you would do in the game, not test you. Still, take some care while filling in the forms during the game so that we can gather the data and use it in our research.',0,3),(14,'1: Introduction','<b>About the map area:</b> Each area has certain protection against river and rain flooding. Every areas has some taxes to pay according to the people living there. Check your budget and expectations overview to know what you must pay every round. Look at the map to start thinking about where you would prefer to live.','Before we start, let me introduce you to the area we will be playing in. As you can see on the table, we have three communities on the map. We have a dark green, nature-filled area that is protected from the river with a nature-based solution. This means that there is less space for houses. We have an urban area, a cityscape, which is protected from the river by an artificial dike. Lastly, we have a farmland area directly connected to the river. Each of these areas provides a certain amount of protection against river and rain flooding. You will represent a household living in one of these three areas. Which one that is, is up to you. In a little moment, you will be able to purchase your house. The goal of the game is to increase your satisfaction as much as possible. The house you choose influences your satisfaction. If you don\'t manage to buy your dream house right away, you will be allowed to move in the following rounds. We hope you can find and buy your dream house, keep your feet dry and have some money left to increase your satisfaction and pay off your house. I will now explain the rules of the game.',1,3),(15,'2: House discounts','Floods result in house discounts: When an area was flooded, houses decrease in value: 10k in year 1, 5k in year 2, and 2k in year 3.\r\n','Unfortunately, we see floods happen more often. The world is preparing itself for the water to come. We see the sea level rising every year which means that in the future it could overtop the dikes and riverbanks that keep our feet dry.\r\n\r\nWhen an area is flooded it not only can cause problems when the water is there, but also afterwards. Repairs are needed if houses are damaged, but also potential buyers are discouraged from buying any homes in the area. This means that the house value of a house decreases, resulting in less profit if the house is sold.\r\n\r\nWe do see, however, that in a couple of years, the financial impact of a flood on house value decreases and disappears eventually. \r\n\r\n(Explain house discount rules)\r\n\r\n\r\n',2,3),(16,'3: More rain','More rain on the way: More heavy rainfall over the next years will result in flooding of nature-based solutions. Protection for rain floods in Natucity decrease by 2, and for river floods by 1.','In 2021, in the Netherlands and neighbouring countries, a devastating flood happened in Limburg. In that year, we had a record amount of rain, and the amount of short heavy rains increased. In urban areas, the ground has more difficulty soaking up all this rain, resulting in flooded basements and parks turning into swamps. Nature-based solutions and more green areas such as farmlands in the neighbourhoods can help. But can it help enough? More and more people are looking into ways to keep the water outside their homes or to create better-protected homes against water that does enter.\r\n\r\n<b>Now, the protection level for Rain floods by nature-based solutions, dikes and farmlands decreases by 2 and the protection level for River floods by nature-based solutions, dikes and farmlands decrease by 1.</b>\r\n\r\n',3,3),(17,'4: Taxes increase','Taxes increase in nature-based solution areas: Over the last years demand in nature-based solution areas has skyrocketed, therefore all taxes in Natucity increase with 5k/year.','Areas that are protected by nature-based solutions are known to enhance water quality, reduce air pollution, and conserve natural habitats. This, in turn, results in human well-being and biodiversity benefits. However, due to the increasing demand in such areas, citizenship increases. As a result, such areas are forced to increase taxes in order to maintain the area.\r\n\r\nFrom this round, the taxes of the nature-based solution area for each household number increases with 5k per year.\r\n\r\n\r\n',4,3),(18,'5: NbS','The beauty of nature-based solutions: Nature-based solutions can offer more than protection against floodings. Therefore you receive a one-time bonus satisfaction of 2 points if you live in Natucity, and you gain 1 satisfaction point in you move there (instead of losing 1 point for moving).','As you might have seen, one of the public measures is presented as a nature-based solution. These solutions make use of, well, nature. It often gives the river space to expand when needed. This means that whenever the river doesn\'t need it, these spaces can be used by farmers to let their cattle grace, or by people to walk, sport and relax around in. Just make sure you get out of the nature-based solution area when the river level rises. But at that point, it\'s good to stay inside anyway.\r\n\r\nBecause of the multifunctional aspect of nature-based solutions, an increasing amount of people enjoy living around these solutions. If you live around the nature-based solution area, you can increase your satisfaction score by 2. If a new household relocates to the nature-based solution area it will also gain 2 satisfaction points. (Thus, relocating to this area means they gain 1 satisfaction, normally relocating costs 1 satisfaction).\r\n\r\n',5,3),(19,'0: General Introduction','Welcome to Where we Move, a serious game that analyses the choices made by participants. All results will be anonymised.','Welcome to Where we Move, this is a serious game involving houses, floodings and various measures you can take. Today we will play this game which will allow you to explore options on how you could protect your house and yourself. During the game, we will ask you to fill in some data sheets that will allow us to conduct some research on the game. It helps us analyse which choices were made during the game and your feelings regarding floodings. These forms will be anonymized and analysed later. But please know that there are no wrong answers or choices, we just want to know what you would do in the game, not test you. Still, take some care while filling in the forms during the game so that we can gather the data and use it in our research.',0,4),(21,'1: Introduction','<b>About the map area:</b> Each area has certain protection against river and rain flooding. Every areas has some taxes to pay according to the people living there. Check your budget and expectations overview to know what you must pay every round. Look at the map to start thinking about where you would prefer to live.','Before we start, let me introduce you to the area we will be playing in. As you can see on the table, we have three communities on the map. We have a dark green, nature-filled area that is protected from the river with a nature-based solution. This means that there is less space for houses. We have an urban area, a cityscape, which is protected from the river by an artificial dike. Lastly, we have a farmland area directly connected to the river. Each of these areas provides a certain amount of protection against river and rain flooding. You will represent a household living in one of these three areas. Which one that is, is up to you. In a little moment, you will be able to purchase your house. The goal of the game is to increase your satisfaction as much as possible. The house you choose influences your satisfaction. If you don\'t manage to buy your dream house right away, you will be allowed to move in the following rounds. We hope you can find and buy your dream house, keep your feet dry and have some money left to increase your satisfaction and pay off your house. I will now explain the rules of the game.',1,4),(22,'2: House discounts','Floods result in house discounts: When an area was flooded, houses decrease in value: 10k in year 1, 5k in year 2, and 2k in year 3.','Unfortunately, we see floods happen more often. The world is preparing itself for the water to come. We see the sea level rising every year which means that in the future it could overtop the dikes and riverbanks that keep our feet dry.\r\n\r\nWhen an area is flooded it not only can cause problems when the water is there, but also afterwards. Repairs are needed if houses are damaged, but also potential buyers are discouraged from buying any homes in the area. This means that the house value of a house decreases, resulting in less profit if the house is sold.\r\n\r\nWe do see, however, that in a couple of years, the financial impact of a flood on house value decreases and disappears eventually. \r\n\r\n(Explain house discount rules)\r\n\r\n\r\n',2,4),(23,'3: More rain','More rain on the way: More heavy rainfall over the next years will result in flooding of nature-based solutions. Protection for rain floods in Natucity decrease by 2, and for river floods by 1.\r\n','In 2021, in the Netherlands and neighbouring countries, a devastating flood happened in Limburg. In that year, we had a record amount of rain, and the amount of short heavy rains increased. In urban areas, the ground has more difficulty soaking up all this rain, resulting in flooded basements and parks turning into swamps. Nature-based solutions and more green areas such as farmlands in the neighbourhoods can help. But can it help enough? More and more people are looking into ways to keep the water outside their homes or to create better-protected homes against water that does enter.\r\n\r\n<b>Now, the protection level for Rain floods by nature-based solutions, dikes and farmlands decreases by 2 and the protection level for River floods by nature-based solutions, dikes and farmlands decrease by 1.</b>\r\n\r\n\r\n\r\n',3,4),(24,'4: Taxes increase','Taxes increase in nature-based solution areas: Over the last years demand in nature-based solution areas has skyrocketed, therefore all taxes in Natucity increase with 5k/year.\r\n','Areas that are protected by nature-based solutions are known to enhance water quality, reduce air pollution, and conserve natural habitats. This, in turn, results in human well-being and biodiversity benefits. However, due to the increasing demand in such areas, citizenship increases. As a result, such areas are forced to increase taxes in order to maintain the area.\r\n\r\nFrom this round, the taxes of the nature-based solution area for each household number increases with 5k per year.\r\n\r\n\r\n\r\n',4,4),(25,'5: NbS','The beauty of nature-based solutions: Nature-based solutions can offer more than protection against floodings. Therefore you receive a one-time bonus satisfaction of 2 points if you live in Natucity, and you gain 1 satisfaction point in you move there (instead of losing 1 point for moving).','As you might have seen, one of the public measures is presented as a nature-based solution. These solutions make use of, well, nature. It often gives the river space to expand when needed. This means that whenever the river doesn\'t need it, these spaces can be used by farmers to let their cattle grace, or by people to walk, sport and relax around in. Just make sure you get out of the nature-based solution area when the river level rises. But at that point, it\'s good to stay inside anyway.\r\n\r\nBecause of the multifunctional aspect of nature-based solutions, an increasing amount of people enjoy living around these solutions. If you live around the nature-based solution area, you can increase your satisfaction score by 2. If a new household relocates to the nature-based solution area it will also gain 2 satisfaction points. (Thus, relocating to this area means they gain 1 satisfaction, normally relocating costs 1 satisfaction).\r\n\r\n',5,4),(68,'1: Private measures','How a household can protect itself: More floods appear in the Netherlands, be prepared on how it might hit you.','As you might have seen, households have the possibility to purchase private flooding measures to increase their protection against floods. If the house of a household is not protected and the area is flooded, the house will take damage and the household will lose satisfaction. Households can protect against two types of flooding: River and Rain flooding. Rain flooding happens when rain falls down in large quantities for a long period of time. This causes strain on the sewage system and results in damage. River flooding happens when a lot of excess water from neighbouring countries is brought back to our country and causes the riverbanks to be overtopped. A river overtopping has a large impact, larger than rain flooding. Streets can become rivers and gardens can become temporary pools. To see how much each private measure protects against the two types of flooding, households can look at the overview made by the government. (explain that prices are about 3x/5x more expensive for game balance, real prices on the facilitator sheet).\r\n\r\n',1,11),(69,'2: House discounts','Floods result in house discounts: When an area was flooded, houses decrease in value: 10k in year 1, 5k in year 2, and 2k in year 3.\r\n','Unfortunately, we see floods happen more often. The world is preparing itself for the water to come. We see the sea level rising every year which means that in the future it could overtop the dikes and riverbanks that keep our feet dry.\r\n\r\nWhen an area is flooded it not only can cause problems when the water is there, but also afterwards. Repairs are needed if houses are damaged, but also potential buyers are discouraged from buying any homes in the area. This means that the house value of a house decreases, resulting in less profit if the house is sold.\r\n\r\nWe do see, however, that in a couple of years, the financial impact of a flood on house value decreases and disappears eventually. \r\n\r\n(Explain house discount rules)\r\n\r\n\r\n',2,11),(70,'3: More rain','More rain on the way: More heavy rainfall over the next years will result in flooding of nature-based solutions. Protection for rain floods in Natucity decrease by 2, and for river floods by 1.','In 2021, in the Netherlands and neighbouring countries, a devastating flood happened in Limburg. In that year, we had a record amount of rain, and the amount of short heavy rains increased. In urban areas, the ground has more difficulty soaking up all this rain, resulting in flooded basements and parks turning into swamps. Nature-based solutions and more green areas such as farmlands in the neighbourhoods can help. But can it help enough? More and more people are looking into ways to keep the water outside their homes or to create better-protected homes against water that does enter.\r\n\r\n<b>Now, the protection level for Rain floods by nature-based solutions, dikes and farmlands decreases by 2 and the protection level for River floods by nature-based solutions, dikes and farmlands decrease by 1.</b>\r\n\r\n',3,11),(71,'4: Taxes increase','Taxes increase in nature-based solution areas: Over the last years demand in nature-based solution areas has skyrocketed, therefore all taxes in Natucity increase with 5k/year.','Areas that are protected by nature-based solutions are known to enhance water quality, reduce air pollution, and conserve natural habitats. This, in turn, results in human well-being and biodiversity benefits. However, due to the increasing demand in such areas, citizenship increases. As a result, such areas are forced to increase taxes in order to maintain the area.\r\n\r\nFrom this round, the taxes of the nature-based solution area for each household number increases with 5k per year.\r\n\r\n\r\n',4,11),(72,'5: NbS','The beauty of nature-based solutions: Nature-based solutions can offer more than protection against floodings. Therefore you receive a one-time bonus satisfaction of 2 points if you live in Natucity, and you gain 1 satisfaction point in you move there (instead of losing 1 point for moving).','As you might have seen, one of the public measures is presented as a nature-based solution. These solutions make use of, well, nature. It often gives the river space to expand when needed. This means that whenever the river doesn\'t need it, these spaces can be used by farmers to let their cattle grace, or by people to walk, sport and relax around in. Just make sure you get out of the nature-based solution area when the river level rises. But at that point, it\'s good to stay inside anyway.\r\n\r\nBecause of the multifunctional aspect of nature-based solutions, an increasing amount of people enjoy living around these solutions. If you live around the nature-based solution area, you can increase your satisfaction score by 2. If a new household relocates to the nature-based solution area it will also gain 2 satisfaction points. (Thus, relocating to this area means they gain 1 satisfaction, normally relocating costs 1 satisfaction).\r\n\r\n',5,11),(73,'0a: Introduction','Welcome to Where we Move, a serious game that analyses the choices made by participants. All results will be anonymised.','Welcome to Where we Move, this is a serious game involving houses, floodings and various measures you can take. Today we will play this game which will allow you to explore options on how you could protect your house and yourself. During the game, we will ask you to fill in some data sheets that will allow us to conduct some research on the game. It helps us analyse which choices were made during the game and your feelings regarding floodings. These forms will be anonymized and analysed later. But please know that there are no wrong answers or choices, we just want to know what you would do in the game, not test you. Still, take some care while filling in the forms during the game so that we can gather the data and use it in our research.',0,11),(74,'0b: Introduction','Find your House: increase your satisfaction by finding your ideal house in one of the three communities.','Before we start, let me introduce you to the area we will be playing in. As you can see on the table, we have three communities on the map. We have a dark green, nature-filled area that is protected from the river with a nature-based solution. This means that there is less space for houses. We have an urban area, a cityscape, which is protected from the river by an artificial dike. Lastly, we have a farmland area directly connected to the river. Each of these areas provides a certain amount of protection against river and rain flooding. You will represent a household living in one of these three areas. Which one that is, is up to you. In a little moment, you will be able to purchase your house. The goal of the game is to increase your satisfaction as much as possible. The house you choose influences your satisfaction. If you don\'t manage to buy your dream house right away, you will be allowed to move in the following rounds. We hope you can find and buy your dream house, keep your feet dry and have some money left to increase your satisfaction and pay off your house. I will now explain the rules of the game.\r\n\r\n',0,11),(75,'0a: Introduction','Welcome to Where we Move, a serious game that analyses the choices made by participants. All results will be anonymised.','Welcome to Where we Move, this is a serious game involving houses, floodings and various measures you can take. Today we will play this game which will allow you to explore options on how you could protect your house and yourself. During the game, we will ask you to fill in some data sheets that will allow us to conduct some research on the game. It helps us analyse which choices were made during the game and your feelings regarding floodings. These forms will be anonymized and analysed later. But please know that there are no wrong answers or choices, we just want to know what you would do in the game, not test you. Still, take some care while filling in the forms during the game so that we can gather the data and use it in our research.\r\n',0,12),(76,'0b: Introduction','Find your House: increase your satisfaction by finding your ideal house in one of the three communities.','Before we start, let me introduce you to the area we will be playing in. As you can see on the table, we have three communities on the map. We have a dark green, nature-filled area that is protected from the river with a nature-based solution. This means that there is less space for houses. We have an urban area, a cityscape, which is protected from the river by an artificial dike. Lastly, we have a farmland area directly connected to the river. Each of these areas provides a certain amount of protection against river and rain flooding. You will represent a household living in one of these three areas. Which one that is, is up to you. In a little moment, you will be able to purchase your house. The goal of the game is to increase your satisfaction as much as possible. The house you choose influences your satisfaction. If you don\'t manage to buy your dream house right away, you will be allowed to move in the following rounds. We hope you can find and buy your dream house, keep your feet dry and have some money left to increase your satisfaction and pay off your house. I will now explain the rules of the game.\r\n\r\n\r\n',0,12),(77,'1: Private measures','How a household can protect itself: More floods appear in the Netherlands, be prepared on how it might hit you.','As you might have seen, households have the possibility to purchase private flooding measures to increase their protection against floods. If the house of a household is not protected and the area is flooded, the house will take damage and the household will lose satisfaction. Households can protect against two types of flooding: River and Rain flooding. Rain flooding happens when rain falls down in large quantities for a long period of time. This causes strain on the sewage system and results in damage. River flooding happens when a lot of excess water from neighbouring countries is brought back to our country and causes the riverbanks to be overtopped. A river overtopping has a large impact, larger than rain flooding. Streets can become rivers and gardens can become temporary pools. To see how much each private measure protects against the two types of flooding, households can look at the overview made by the government. (explain that prices are about 3x/5x more expensive for game balance, real prices on the facilitator sheet).\r\n\r\n',1,12),(78,'2: House discounts','Floods result in house discounts: When an area was flooded, houses decrease in value: 10k in year 1, 5k in year 2, and 2k in year 3.','Unfortunately, we see floods happen more often. The world is preparing itself for the water to come. We see the sea level rising every year which means that in the future it could overtop the dikes and riverbanks that keep our feet dry.\r\n\r\nWhen an area is flooded it not only can cause problems when the water is there, but also afterwards. Repairs are needed if houses are damaged, but also potential buyers are discouraged from buying any homes in the area. This means that the house value of a house decreases, resulting in less profit if the house is sold.\r\n\r\nWe do see, however, that in a couple of years, the financial impact of a flood on house value decreases and disappears eventually. \r\n\r\n(Explain house discount rules)\r\n\r\n\r\n',2,12),(79,'3: More rain','More rain on the way: More heavy rainfall over the next years will result in flooding of nature-based solutions. Protection for rain floods in Natucity decrease by 2, and for river floods by 1.\r\n','In 2021, in the Netherlands and neighbouring countries, a devastating flood happened in Limburg. In that year, we had a record amount of rain, and the amount of short heavy rains increased. In urban areas, the ground has more difficulty soaking up all this rain, resulting in flooded basements and parks turning into swamps. Nature-based solutions and more green areas such as farmlands in the neighbourhoods can help. But can it help enough? More and more people are looking into ways to keep the water outside their homes or to create better-protected homes against water that does enter.\r\n\r\n<b>Now, the protection level for Rain floods by nature-based solutions, dikes and farmlands decreases by 2 and the protection level for River floods by nature-based solutions, dikes and farmlands decrease by 1.</b>\r\n\r\n\r\n\r\n',3,12),(80,'4: Taxes increase','Taxes increase in nature-based solution areas: Over the last years demand in nature-based solution areas has skyrocketed, therefore all taxes in Natucity increase with 5k/year.\r\n','Areas that are protected by nature-based solutions are known to enhance water quality, reduce air pollution, and conserve natural habitats. This, in turn, results in human well-being and biodiversity benefits. However, due to the increasing demand in such areas, citizenship increases. As a result, such areas are forced to increase taxes in order to maintain the area.\r\n\r\nFrom this round, the taxes of the nature-based solution area for each household number increases with 5k per year.\r\n\r\n\r\n\r\n',4,12),(81,'5: NbS','The beauty of nature-based solutions: Nature-based solutions can offer more than protection against floodings. Therefore you receive a one-time bonus satisfaction of 2 points if you live in Natucity, and you gain 1 satisfaction point in you move there (instead of losing 1 point for moving).','As you might have seen, one of the public measures is presented as a nature-based solution. These solutions make use of, well, nature. It often gives the river space to expand when needed. This means that whenever the river doesn\'t need it, these spaces can be used by farmers to let their cattle grace, or by people to walk, sport and relax around in. Just make sure you get out of the nature-based solution area when the river level rises. But at that point, it\'s good to stay inside anyway.\r\n\r\nBecause of the multifunctional aspect of nature-based solutions, an increasing amount of people enjoy living around these solutions. If you live around the nature-based solution area, you can increase your satisfaction score by 2. If a new household relocates to the nature-based solution area it will also gain 2 satisfaction points. (Thus, relocating to this area means they gain 1 satisfaction, normally relocating costs 1 satisfaction).\r\n\r\n',5,12);
/*!40000 ALTER TABLE `newsitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `player`
--

DROP TABLE IF EXISTS `player`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(16) NOT NULL,
  `user_id` int(10) unsigned DEFAULT NULL,
  `group_id` int(10) unsigned NOT NULL,
  `welfaretype_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_player_user1_idx` (`user_id`),
  KEY `fk_player_group1_idx` (`group_id`),
  KEY `fk_player_welfaretype1_idx` (`welfaretype_id`),
  CONSTRAINT `fk_player_group1` FOREIGN KEY (`group_id`) REFERENCES `group` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_player_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_player_welfaretype1` FOREIGN KEY (`welfaretype_id`) REFERENCES `welfaretype` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=324 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player`
--

LOCK TABLES `player` WRITE;
/*!40000 ALTER TABLE `player` DISABLE KEYS */;
INSERT INTO `player` VALUES (156,'t1p1',NULL,27,9),(157,'t1p2',NULL,27,13),(158,'t1p3',NULL,27,11),(159,'t1p4',NULL,27,12),(160,'t1p5',NULL,27,10),(161,'t1p6',NULL,27,8),(162,'t1p7',NULL,27,9),(163,'t1p8',NULL,27,13),(164,'t2p1',NULL,28,9),(165,'t2p2',NULL,28,13),(166,'t2p3',NULL,28,11),(167,'t2p4',NULL,28,12),(168,'t2p5',NULL,28,10),(169,'t2p6',NULL,28,8),(170,'t2p7',NULL,28,9),(171,'t2p8',NULL,28,13),(172,'t3p1',NULL,29,9),(173,'t3p2',NULL,29,13),(174,'t3p3',NULL,29,11),(175,'t3p4',NULL,29,12),(176,'t3p5',NULL,29,10),(177,'t3p6',NULL,29,8),(178,'t3p7',NULL,29,9),(179,'t3p8',NULL,29,13),(180,'t4p1',NULL,30,18),(181,'t4p2',NULL,30,16),(182,'t4p3',NULL,30,17),(183,'t4p4',NULL,30,15),(184,'t4p5',NULL,30,14),(185,'t4p6',NULL,30,19),(186,'t4p7',NULL,30,18),(187,'t4p8',NULL,30,16),(188,'t5p1',NULL,31,18),(189,'t5p2',NULL,31,16),(190,'t5p3',NULL,31,17),(191,'t5p4',NULL,31,15),(192,'t5p5',NULL,31,14),(193,'t5p6',NULL,31,19),(194,'t5p7',NULL,31,18),(195,'t5p8',NULL,31,16),(196,'t6p1',NULL,32,18),(197,'t6p2',NULL,32,16),(198,'t6p3',NULL,32,17),(199,'t6p4',NULL,32,15),(200,'t6p5',NULL,32,14),(201,'t6p6',NULL,32,19),(202,'t6p7',NULL,32,18),(203,'t6p8',NULL,32,16),(204,'t1p1',NULL,33,8),(205,'t1p2',8,33,9),(206,'t1p3',9,33,10),(207,'t1p4',10,33,12),(208,'t1p5',11,33,13),(209,'t1p6',13,33,11),(210,'t1p7',7,33,8),(211,'t1p8',NULL,33,9),(212,'t2p1',NULL,34,8),(213,'t2p2',NULL,34,9),(214,'t2p3',NULL,34,10),(215,'t2p4',NULL,34,12),(216,'t2p5',NULL,34,13),(217,'t2p6',NULL,34,11),(218,'t2p7',NULL,34,8),(219,'t2p8',NULL,34,9),(220,'t3p1',NULL,35,8),(221,'t3p2',NULL,35,9),(222,'t3p3',NULL,35,10),(223,'t3p4',NULL,35,12),(224,'t3p5',NULL,35,13),(225,'t3p6',NULL,35,11),(226,'t3p7',NULL,35,8),(227,'t3p8',NULL,35,9),(228,'t4p1',NULL,36,18),(229,'t4p2',NULL,36,14),(230,'t4p3',NULL,36,16),(231,'t4p4',NULL,36,17),(232,'t4p5',NULL,36,15),(233,'t4p6',NULL,36,19),(234,'t4p7',NULL,36,18),(235,'t4p8',NULL,36,14),(236,'t5p1',NULL,37,18),(237,'t5p2',NULL,37,14),(238,'t5p3',NULL,37,16),(239,'t5p4',NULL,37,17),(240,'t5p5',NULL,37,15),(241,'t5p6',NULL,37,19),(242,'t5p7',NULL,37,18),(243,'t5p8',NULL,37,14),(244,'t6p1',NULL,38,18),(245,'t6p2',NULL,38,14),(246,'t6p3',NULL,38,16),(247,'t6p4',NULL,38,17),(248,'t6p5',NULL,38,15),(249,'t6p6',NULL,38,19),(250,'t6p7',NULL,38,18),(251,'t6p8',NULL,38,14),(252,'t1p1',NULL,39,15),(253,'t1p2',NULL,39,16),(254,'t1p3',NULL,39,17),(255,'t1p4',NULL,39,14),(256,'t1p5',NULL,39,19),(257,'t1p6',NULL,39,18),(258,'t1p7',NULL,39,15),(259,'t1p8',NULL,39,16),(260,'t2p1',NULL,40,15),(261,'t2p2',NULL,40,16),(262,'t2p3',NULL,40,17),(263,'t2p4',NULL,40,14),(264,'t2p5',NULL,40,19),(265,'t2p6',NULL,40,18),(266,'t2p7',NULL,40,15),(267,'t2p8',NULL,40,16),(268,'t3p1',NULL,41,15),(269,'t3p2',NULL,41,16),(270,'t3p3',NULL,41,17),(271,'t3p4',NULL,41,14),(272,'t3p5',NULL,41,19),(273,'t3p6',NULL,41,18),(274,'t3p7',NULL,41,15),(275,'t3p8',NULL,41,16),(276,'t4p1',NULL,42,15),(277,'t4p2',NULL,42,16),(278,'t4p3',NULL,42,17),(279,'t4p4',NULL,42,14),(280,'t4p5',NULL,42,19),(281,'t4p6',NULL,42,18),(282,'t4p7',NULL,42,15),(283,'t4p8',NULL,42,16),(284,'t5p1',NULL,43,15),(285,'t5p2',NULL,43,16),(286,'t5p3',NULL,43,17),(287,'t5p4',NULL,43,14),(288,'t5p5',NULL,43,19),(289,'t5p6',NULL,43,18),(290,'t5p7',NULL,43,15),(291,'t5p8',NULL,43,16),(292,'t6p1',NULL,44,15),(293,'t6p2',NULL,44,16),(294,'t6p3',NULL,44,17),(295,'t6p4',NULL,44,14),(296,'t6p5',NULL,44,19),(297,'t6p6',NULL,44,18),(298,'t6p7',NULL,44,15),(299,'t6p8',NULL,44,16),(300,'t1p1',NULL,45,15),(301,'t1p2',NULL,45,18),(302,'t1p3',NULL,45,19),(303,'t1p4',NULL,45,16),(304,'t1p5',NULL,45,17),(305,'t1p6',NULL,45,14),(306,'t1p7',NULL,45,15),(307,'t1p8',NULL,45,18),(308,'t2p1',NULL,46,15),(309,'t2p2',NULL,46,18),(310,'t2p3',NULL,46,19),(311,'t2p4',NULL,46,16),(312,'t2p5',NULL,46,17),(313,'t2p6',NULL,46,14),(314,'t2p7',NULL,46,15),(315,'t2p8',NULL,46,18),(316,'t3p1',NULL,47,15),(317,'t3p2',NULL,47,18),(318,'t3p3',NULL,47,19),(319,'t3p4',NULL,47,16),(320,'t3p5',NULL,47,17),(321,'t3p6',NULL,47,14),(322,'t3p7',NULL,47,15),(323,'t3p8',NULL,47,18);
/*!40000 ALTER TABLE `player` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `playerround`
--

DROP TABLE IF EXISTS `playerround`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `playerround` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT current_timestamp(),
  `round_income` int(10) unsigned NOT NULL DEFAULT 0,
  `living_costs` int(10) unsigned NOT NULL DEFAULT 0,
  `paid_debt` int(10) unsigned NOT NULL DEFAULT 0,
  `mortgage_payment` int(10) unsigned NOT NULL DEFAULT 0,
  `profit_sold_house` int(11) NOT NULL DEFAULT 0,
  `spent_savings_for_buying_house` int(10) unsigned NOT NULL DEFAULT 0,
  `cost_taxes` int(10) unsigned NOT NULL DEFAULT 0,
  `cost_measures_bought` int(10) unsigned NOT NULL DEFAULT 0,
  `cost_satisfaction_bought` int(10) unsigned NOT NULL DEFAULT 0,
  `cost_fluvial_damage` int(10) unsigned NOT NULL DEFAULT 0,
  `cost_pluvial_damage` int(10) unsigned NOT NULL DEFAULT 0,
  `spendable_income` int(11) NOT NULL DEFAULT 0,
  `satisfaction_move_penalty` int(10) unsigned NOT NULL DEFAULT 0,
  `satisfaction_house_rating_delta` int(11) NOT NULL DEFAULT 0,
  `satisfaction_house_measures` int(10) unsigned NOT NULL DEFAULT 0,
  `satisfaction_bought` int(10) unsigned NOT NULL DEFAULT 0,
  `satisfaction_fluvial_penalty` int(10) unsigned NOT NULL DEFAULT 0,
  `satisfaction_pluvial_penalty` int(10) unsigned NOT NULL DEFAULT 0,
  `satisfaction_debt_penalty` int(10) unsigned NOT NULL DEFAULT 0,
  `personal_satisfaction` int(11) NOT NULL DEFAULT 0,
  `preferred_house_rating` int(10) unsigned NOT NULL DEFAULT 0,
  `maximum_mortgage` int(10) unsigned NOT NULL DEFAULT 0,
  `mortgage_house_start` int(10) unsigned NOT NULL DEFAULT 0,
  `mortgage_left_start` int(10) unsigned NOT NULL DEFAULT 0,
  `house_price_sold` int(10) unsigned DEFAULT NULL,
  `house_price_bought` int(10) unsigned DEFAULT NULL,
  `mortgage_house_end` int(10) unsigned NOT NULL DEFAULT 0,
  `mortgage_left_end` int(10) unsigned NOT NULL DEFAULT 0,
  `movingreason_id` int(10) unsigned DEFAULT NULL,
  `moving_reason_other` varchar(45) NOT NULL,
  `pluvial_base_protection` int(10) unsigned NOT NULL DEFAULT 0,
  `fluvial_base_protection` int(10) unsigned NOT NULL DEFAULT 0,
  `pluvial_community_delta` int(11) NOT NULL DEFAULT 0,
  `fluvial_community_delta` int(11) NOT NULL DEFAULT 0,
  `pluvial_house_delta` int(11) NOT NULL DEFAULT 0,
  `fluvial_house_delta` int(11) NOT NULL DEFAULT 0,
  `player_state` varchar(24) NOT NULL DEFAULT 'LOGIN',
  `player_id` int(10) unsigned NOT NULL,
  `groupround_id` int(10) unsigned NOT NULL,
  `start_housegroup_id` int(10) unsigned DEFAULT NULL,
  `final_housegroup_id` int(10) unsigned DEFAULT NULL,
  `active_transaction_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_playerround_groupround1_idx` (`groupround_id`),
  KEY `fk_playerround_player1_idx` (`player_id`),
  KEY `fk_playerround_movingreason1_idx` (`movingreason_id`),
  KEY `fk_playerround_housegroup1_idx` (`start_housegroup_id`),
  KEY `fk_playerround_housegroup2_idx` (`final_housegroup_id`),
  KEY `fk_playerround_housetransaction1_idx` (`active_transaction_id`),
  CONSTRAINT `fk_playerround_groupround1` FOREIGN KEY (`groupround_id`) REFERENCES `groupround` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_playerround_housegroup1` FOREIGN KEY (`start_housegroup_id`) REFERENCES `housegroup` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_playerround_housegroup2` FOREIGN KEY (`final_housegroup_id`) REFERENCES `housegroup` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_playerround_housetransaction1` FOREIGN KEY (`active_transaction_id`) REFERENCES `housetransaction` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_playerround_movingreason1` FOREIGN KEY (`movingreason_id`) REFERENCES `movingreason` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_playerround_player1` FOREIGN KEY (`player_id`) REFERENCES `player` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `playerround`
--

LOCK TABLES `playerround` WRITE;
/*!40000 ALTER TABLE `playerround` DISABLE KEYS */;
INSERT INTO `playerround` VALUES (76,'2023-12-14 10:55:10',50000,20000,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,3,80000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',212,13,NULL,NULL,NULL),(77,'2023-12-14 10:55:10',50000,20000,0,8000,0,20000,20000,0,0,0,0,-18000,0,0,0,0,0,0,0,5,3,80000,0,0,0,0,0,80000,NULL,'',0,0,0,0,0,0,'BOUGHT_HOUSE',212,14,NULL,13,NULL),(78,'2023-12-14 11:01:27',65000,30000,0,0,0,0,0,0,0,0,0,5000,0,0,0,0,0,0,0,5,4,110000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',213,13,NULL,NULL,NULL),(79,'2023-12-14 11:01:27',65000,30000,0,11000,0,15000,20000,0,0,0,0,-6000,0,0,0,0,0,0,0,5,4,110000,0,0,0,125000,110000,99000,NULL,'',0,0,0,0,0,0,'VIEW_SUMMARY',213,14,NULL,19,NULL),(80,'2023-12-14 12:14:03',80000,40000,0,0,0,0,0,0,0,0,0,15000,0,0,0,0,0,0,0,5,5,130000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',214,13,NULL,NULL,NULL),(81,'2023-12-14 12:14:03',80000,40000,0,13000,0,30000,0,0,0,0,0,12000,0,0,0,0,0,0,0,5,5,130000,0,0,0,160000,130000,117000,NULL,'',0,0,0,0,0,0,'VIEW_SUMMARY',214,14,NULL,16,NULL),(82,'2023-12-14 13:52:09',120000,65000,0,0,0,0,0,0,0,0,0,50000,0,0,0,0,0,0,0,5,7,200000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',215,13,NULL,NULL,NULL),(83,'2023-12-14 13:52:09',120000,65000,0,20000,0,100000,0,0,0,0,0,-15000,0,1,0,0,0,0,0,6,7,200000,0,0,0,300000,200000,180000,NULL,'',0,0,0,0,0,0,'ANSWER_SURVEY',215,14,NULL,14,NULL),(84,'2023-12-17 11:56:06',50000,20000,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,3,80000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',220,15,NULL,NULL,NULL),(85,'2023-12-17 11:56:20',50000,20000,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,3,80000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',204,16,NULL,NULL,NULL),(86,'2023-12-17 11:56:20',50000,20000,0,0,0,0,0,0,0,0,0,30000,0,0,0,0,0,0,0,5,3,80000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'READ_BUDGET',204,17,NULL,NULL,NULL),(87,'2023-12-17 13:31:26',180000,105000,0,0,0,0,0,0,0,0,0,80000,0,0,0,0,0,0,0,5,8,300000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',216,13,NULL,NULL,NULL),(88,'2023-12-17 13:31:26',180000,105000,0,30000,0,125000,0,0,0,0,0,0,0,1,0,0,0,0,0,6,8,300000,0,0,0,425000,300000,270000,NULL,'',0,0,0,0,0,0,'BOUGHT_HOUSE',216,14,NULL,11,NULL),(89,'2023-12-17 19:02:25',65000,30000,0,0,0,0,0,0,0,0,0,5000,0,0,0,0,0,0,0,5,4,110000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',219,13,NULL,NULL,NULL),(90,'2023-12-17 19:02:25',65000,30000,0,0,0,0,0,0,0,0,0,40000,0,0,0,0,0,0,0,5,4,110000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'VIEW_IMPROVEMENTS',219,14,NULL,20,NULL),(91,'2023-12-17 19:56:44',50000,20000,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,3,80000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',218,13,NULL,NULL,NULL),(92,'2023-12-17 19:56:44',50000,20000,0,0,0,0,0,0,0,0,0,30000,0,0,0,0,0,0,0,5,3,80000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'BOUGHT_HOUSE',218,14,NULL,17,NULL),(93,'2023-12-20 17:47:12',100000,50000,0,0,0,0,0,0,0,0,0,30000,0,0,0,0,0,0,0,5,6,170000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',217,13,NULL,NULL,NULL),(94,'2023-12-20 17:47:12',100000,50000,0,17000,0,30000,15000,0,0,0,0,18000,0,0,0,0,0,0,0,5,6,170000,0,0,0,200000,170000,153000,NULL,'',0,0,0,0,0,0,'VIEW_IMPROVEMENTS',217,14,NULL,12,NULL),(95,'2023-12-17 11:56:06',50000,20000,0,8000,0,20000,20000,0,0,0,0,-18000,0,0,0,0,0,0,0,5,3,80000,0,0,0,100000,80000,72000,NULL,'',0,0,0,0,0,0,'BUY_HOUSE_WAIT',220,19,NULL,33,15),(96,'2023-12-20 20:16:04',65000,30000,0,0,0,0,0,0,0,0,0,5000,0,0,0,0,0,0,0,5,4,110000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',221,15,NULL,NULL,NULL),(97,'2023-12-20 20:16:04',65000,30000,0,11000,0,15000,20000,0,0,0,0,-6000,0,0,0,0,0,0,0,5,4,110000,0,0,0,125000,110000,99000,NULL,'',0,0,0,0,0,0,'VIEW_IMPROVEMENTS',221,19,NULL,39,NULL),(98,'2023-12-20 20:16:26',80000,40000,0,0,0,0,0,0,0,0,0,15000,0,0,0,0,0,0,0,5,5,130000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',222,15,NULL,NULL,NULL),(99,'2023-12-20 20:16:26',80000,40000,0,13000,0,30000,20000,0,0,0,0,-8000,0,0,0,0,0,0,0,5,5,130000,0,0,0,160000,130000,117000,NULL,'',0,0,0,0,0,0,'BOUGHT_HOUSE',222,19,NULL,36,NULL),(100,'2023-12-20 20:16:55',120000,65000,0,0,0,0,0,0,0,0,0,50000,0,0,0,0,0,0,0,5,7,200000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',223,15,NULL,NULL,NULL),(101,'2023-12-20 20:16:55',120000,65000,0,20000,0,0,20000,0,0,0,0,65000,0,-1,0,0,0,0,0,4,7,200000,0,0,0,200000,200000,180000,NULL,'',0,0,0,0,0,0,'BOUGHT_HOUSE',223,19,NULL,38,NULL),(102,'2023-12-20 20:17:42',180000,105000,0,0,0,0,0,0,0,0,0,80000,0,0,0,0,0,0,0,5,8,300000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',224,15,NULL,NULL,NULL),(103,'2023-12-20 20:17:42',180000,105000,0,30000,0,125000,20000,0,0,0,0,-20000,0,1,0,0,0,0,0,6,8,300000,0,0,0,425000,300000,270000,NULL,'',0,0,0,0,0,0,'VIEW_IMPROVEMENTS',224,19,NULL,31,NULL),(104,'2023-12-20 20:33:35',100000,50000,0,0,0,0,0,0,0,0,0,30000,0,0,0,0,0,0,0,5,6,170000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',225,15,NULL,NULL,NULL),(105,'2023-12-20 20:33:35',100000,50000,0,17000,0,30000,15000,0,0,0,0,18000,0,0,0,0,0,0,0,5,6,170000,0,0,0,200000,170000,153000,NULL,'',0,0,0,0,0,0,'BOUGHT_HOUSE',225,19,NULL,32,NULL),(106,'2023-12-20 20:38:28',50000,20000,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,3,80000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',226,15,NULL,NULL,NULL),(107,'2023-12-20 20:38:28',50000,20000,0,8000,0,0,20000,0,0,0,0,2000,0,-1,0,0,0,0,0,4,3,80000,0,0,0,80000,80000,72000,NULL,'',0,0,0,0,0,0,'BOUGHT_HOUSE',226,19,NULL,37,NULL),(108,'2023-12-21 10:31:44',120000,65000,0,0,0,0,0,0,0,0,0,50000,0,0,0,0,0,0,0,5,7,200000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',236,18,NULL,NULL,NULL),(109,'2023-12-21 10:31:44',120000,65000,0,20000,0,100000,15000,0,0,0,0,-30000,0,1,0,0,0,0,0,6,7,200000,0,0,0,300000,200000,180000,NULL,'',0,0,0,0,0,0,'VIEW_IMPROVEMENTS',236,21,NULL,44,NULL),(110,'2023-12-21 10:33:17',50000,20000,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,3,80000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',237,18,NULL,NULL,NULL),(111,'2023-12-21 10:33:17',50000,20000,0,8000,0,0,15000,0,0,0,0,7000,0,-1,0,0,0,0,0,4,3,80000,0,0,0,80000,80000,72000,NULL,'',0,0,0,0,0,0,'VIEW_IMPROVEMENTS',237,21,NULL,47,NULL),(112,'2023-12-21 10:41:31',80000,40000,0,0,0,0,0,0,0,0,0,15000,0,0,0,0,0,0,0,5,5,130000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',238,18,NULL,NULL,NULL),(113,'2023-12-21 10:41:31',80000,40000,0,13000,0,30000,15000,0,0,0,0,-3000,0,0,0,0,0,0,0,5,5,130000,0,0,0,160000,130000,117000,NULL,'',0,0,0,0,0,0,'VIEW_IMPROVEMENTS',238,21,NULL,45,NULL),(114,'2023-12-21 10:49:17',100000,50000,0,0,0,0,0,0,0,0,0,30000,0,0,0,0,0,0,0,5,6,170000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',239,18,NULL,NULL,NULL),(115,'2023-12-21 10:49:17',100000,50000,0,17000,0,30000,20000,0,0,0,0,13000,0,0,0,0,0,0,0,5,6,170000,0,0,0,200000,170000,153000,NULL,'',0,0,0,0,0,0,'BUY_HOUSE_WAIT',239,21,NULL,48,NULL),(116,'2023-12-21 10:54:14',65000,30000,0,0,0,0,0,0,0,0,0,5000,0,0,0,0,0,0,0,5,4,110000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',240,18,NULL,NULL,NULL),(117,'2023-12-21 10:54:14',65000,30000,0,11000,0,15000,20000,0,0,0,0,-6000,0,0,0,0,0,0,0,5,4,110000,0,0,0,125000,110000,99000,NULL,'',0,0,0,0,0,0,'VIEW_IMPROVEMENTS',240,21,NULL,49,NULL),(118,'2023-12-21 11:04:07',180000,105000,0,0,0,0,0,0,0,0,0,80000,0,0,0,0,0,0,0,5,8,300000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',241,18,NULL,NULL,NULL),(119,'2023-12-21 11:04:07',180000,105000,0,30000,0,125000,20000,0,0,0,0,-20000,0,1,0,0,0,0,0,6,8,300000,0,0,0,425000,300000,270000,NULL,'',0,0,0,0,0,0,'VIEW_IMPROVEMENTS',241,21,NULL,41,NULL),(120,'2023-12-23 23:41:38',120000,65000,0,0,0,0,0,0,0,0,0,50000,0,0,0,0,0,0,0,5,7,200000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',244,22,NULL,NULL,NULL),(121,'2023-12-23 23:41:38',120000,65000,0,20000,0,100000,20000,0,0,0,4000,-39000,0,1,0,0,0,1,0,5,7,200000,0,0,0,300000,200000,180000,NULL,'',6,10,0,0,0,0,'VIEW_SUMMARY',244,23,NULL,54,NULL),(122,'2023-12-25 14:09:43',50000,20000,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,3,80000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',245,22,NULL,NULL,NULL),(123,'2023-12-25 16:34:35',80000,40000,0,0,0,0,0,0,0,0,0,15000,0,0,0,0,0,0,0,5,5,130000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',246,22,NULL,NULL,NULL),(124,'2023-12-25 16:34:35',80000,40000,0,13000,0,30000,20000,0,0,0,4000,-12000,0,0,0,0,0,1,0,4,5,130000,0,0,0,160000,130000,117000,NULL,' ',6,10,0,0,0,0,'VIEW_SUMMARY',246,23,NULL,55,NULL),(125,'2023-12-25 14:09:43',50000,20000,0,8000,0,20000,20000,0,0,0,0,-18000,0,0,0,0,0,0,0,5,3,80000,0,0,0,100000,80000,72000,NULL,'',8,10,0,0,0,0,'VIEW_SUMMARY',245,23,NULL,53,NULL),(126,'2023-12-29 17:06:00',100000,50000,0,0,0,0,0,0,0,0,0,30000,0,0,0,0,0,0,0,5,6,170000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',247,22,NULL,NULL,NULL),(127,'2023-12-29 17:06:00',100000,50000,0,17000,0,30000,20000,3000,10000,4000,0,-4000,0,0,0,1,2,0,0,4,6,170000,0,0,0,200000,170000,153000,NULL,'',8,7,0,0,0,0,'VIEW_SUMMARY',247,23,NULL,58,NULL),(128,'2023-12-30 02:35:15',65000,30000,0,0,0,0,0,0,0,0,0,5000,0,0,0,0,0,0,0,5,4,110000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',248,22,NULL,NULL,NULL),(129,'2023-12-30 02:35:15',65000,30000,0,11000,0,15000,20000,0,0,4000,0,-10000,0,0,0,0,2,0,0,3,4,110000,0,0,0,125000,110000,99000,NULL,'',8,7,0,0,0,0,'VIEW_SUMMARY',248,23,NULL,59,NULL),(130,'2023-12-30 11:49:05',180000,105000,0,0,0,0,0,0,0,0,0,80000,0,0,0,0,0,0,0,5,8,300000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',249,22,NULL,NULL,NULL),(131,'2023-12-30 11:49:05',180000,105000,0,30000,0,125000,20000,0,0,0,0,-20000,0,1,0,0,0,0,0,6,8,300000,0,0,0,425000,300000,270000,NULL,'',8,10,0,0,0,0,'VIEW_SUMMARY',249,23,NULL,51,NULL),(132,'2023-12-30 23:08:47',120000,65000,0,0,0,0,0,0,0,0,0,50000,0,0,0,0,0,0,0,5,7,200000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',250,22,NULL,NULL,NULL),(133,'2023-12-29 17:06:00',100000,50000,4000,17000,47000,30000,20000,0,10000,12000,0,14000,1,0,0,0,4,0,1,-2,6,170000,170000,153000,200000,200000,170000,153000,4,'',8,7,0,0,0,0,'VIEW_TAXES',247,25,58,58,NULL),(134,'2023-12-23 23:41:38',120000,65000,39000,20000,120000,0,15000,95000,0,0,0,6000,1,-1,7,0,0,0,1,3,7,200000,200000,180000,300000,200000,200000,180000,5,'',8,10,0,0,9,11,'VIEW_DAMAGE',244,25,54,61,NULL),(135,'2023-12-25 14:09:43',50000,20000,18000,8000,0,0,15000,0,0,0,0,-11000,0,0,0,0,0,0,1,4,3,80000,80000,72000,0,0,80000,64000,NULL,'',8,10,0,0,0,0,'VIEW_TAXES',245,25,53,53,NULL),(136,'2023-12-30 02:35:15',65000,30000,10000,11000,0,0,20000,0,0,12000,0,-18000,0,0,0,0,4,0,1,-2,4,110000,110000,99000,0,0,110000,88000,NULL,'',8,7,0,0,0,0,'VIEW_TAXES',248,25,59,59,NULL),(137,'2023-12-25 16:34:35',80000,40000,12000,13000,0,0,20000,0,0,0,4000,-9000,0,0,0,0,0,1,1,2,5,130000,130000,117000,0,0,130000,104000,NULL,'',6,10,0,0,0,0,'VIEW_TAXES',246,25,55,55,NULL),(138,'2023-12-30 11:49:05',180000,105000,20000,30000,0,0,15000,0,0,0,0,10000,0,0,0,0,0,0,1,5,8,300000,300000,270000,0,0,300000,240000,NULL,'',8,10,0,0,0,0,'VIEW_TAXES',249,25,51,51,NULL),(139,'2024-01-08 00:39:29',120000,65000,0,0,0,0,0,0,0,0,0,50000,0,0,0,0,0,0,0,5,7,200000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',228,26,NULL,NULL,NULL),(140,'2024-01-08 00:44:11',50000,20000,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,3,80000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',229,26,NULL,NULL,NULL),(141,'2024-01-08 00:39:29',120000,65000,0,20000,0,100000,15000,0,0,0,0,-30000,0,1,0,0,0,0,0,6,7,200000,0,0,0,300000,200000,180000,NULL,'',0,0,0,0,0,0,'VIEW_TAXES',228,27,NULL,69,NULL),(142,'2024-01-08 00:44:11',50000,20000,0,8000,0,0,15000,0,0,0,0,7000,0,-1,0,0,0,0,0,4,3,80000,0,0,0,80000,80000,72000,NULL,'',0,0,0,0,0,0,'VIEW_TAXES',229,27,NULL,72,NULL),(143,'2024-01-08 00:55:19',80000,40000,0,0,0,0,0,0,0,0,0,15000,0,0,0,0,0,0,0,5,5,130000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',230,26,NULL,NULL,NULL),(144,'2024-01-08 00:55:19',80000,40000,0,13000,0,30000,15000,0,0,0,0,-3000,0,0,0,0,0,0,0,5,5,130000,0,0,0,160000,130000,117000,NULL,'',0,0,0,0,0,0,'VIEW_TAXES',230,27,NULL,70,NULL),(145,'2024-01-08 00:55:30',100000,50000,0,0,0,0,0,0,0,0,0,30000,0,0,0,0,0,0,0,5,6,170000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',231,26,NULL,NULL,NULL),(146,'2024-01-08 00:55:30',100000,50000,0,17000,0,30000,15000,0,0,0,0,18000,0,0,0,0,0,0,0,5,6,170000,0,0,0,200000,170000,153000,NULL,'',0,0,0,0,0,0,'VIEW_TAXES',231,27,NULL,67,NULL),(147,'2024-01-08 00:55:40',65000,30000,0,0,0,0,0,0,0,0,0,5000,0,0,0,0,0,0,0,5,4,110000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',232,26,NULL,NULL,NULL),(148,'2024-01-08 00:55:40',65000,30000,0,10000,0,0,15000,0,0,0,0,15000,0,-1,0,0,0,0,0,4,4,110000,0,0,0,100000,100000,90000,NULL,'',0,0,0,0,0,0,'VIEW_TAXES',232,27,NULL,68,NULL),(149,'2024-01-08 00:56:03',180000,105000,0,0,0,0,0,0,0,0,0,80000,0,0,0,0,0,0,0,5,8,300000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',233,26,NULL,NULL,NULL),(150,'2024-01-08 00:56:03',180000,105000,0,30000,0,125000,15000,0,0,0,0,-15000,0,1,0,0,0,0,0,6,8,300000,0,0,0,425000,300000,270000,NULL,'',0,0,0,0,0,0,'VIEW_TAXES',233,27,NULL,66,NULL),(151,'2024-01-08 00:56:12',120000,65000,0,0,0,0,0,0,0,0,0,50000,0,0,0,0,0,0,0,5,7,200000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',234,26,NULL,NULL,NULL),(152,'2024-01-08 00:56:12',120000,65000,0,20000,0,0,20000,51000,13000,0,0,1000,0,-1,4,1,0,0,0,5,7,200000,0,0,0,200000,200000,180000,NULL,'',0,0,0,0,0,0,'SURVEY_COMPLETED',234,27,NULL,73,NULL),(153,'2024-01-08 00:56:21',50000,20000,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,3,80000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',235,26,NULL,NULL,NULL),(154,'2024-01-08 00:56:21',50000,20000,0,7000,0,0,20000,0,0,0,0,3000,0,-1,0,0,0,0,0,4,3,80000,0,0,0,70000,70000,63000,NULL,'',0,0,0,0,0,0,'VIEW_TAXES',235,27,NULL,75,NULL),(155,'2024-01-11 23:50:06',65000,30000,0,0,0,0,0,0,0,0,0,5000,0,0,0,0,0,0,0,5,4,110000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',211,16,NULL,NULL,NULL),(156,'2024-01-11 23:57:29',50000,20000,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,3,80000,0,0,0,0,0,0,NULL,'',0,0,0,0,0,0,'LOGIN',251,22,NULL,NULL,NULL);
/*!40000 ALTER TABLE `playerround` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `question` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` varchar(12) NOT NULL,
  `question_number` int(10) unsigned NOT NULL,
  `name` varchar(80) NOT NULL,
  `description` text NOT NULL,
  `min_value` int(10) unsigned NOT NULL DEFAULT 1,
  `max_value` int(10) unsigned NOT NULL,
  `max_length` int(10) unsigned NOT NULL DEFAULT 0,
  `scenario_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_question_scenario1_idx` (`scenario_id`),
  CONSTRAINT `fk_question_scenario1` FOREIGN KEY (`scenario_id`) REFERENCES `scenario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,'SELECT',1,'Question 1.','How do you judge the flooding risk of your house?',1,5,1,3),(2,'SELECT',2,'Question 2.','Do you trust that the public measures in your community will protect your house against flooding?',1,5,0,3),(3,'SELECT',1,'Question 1.','How do you judge the flooding risk of your house?',1,5,0,4),(4,'SELECT',2,'Question 2.','Do you trust that the public measures in your community will protect your house against flooding?',1,5,0,4),(17,'SELECT',1,'Vraag 1','Hoe denk je over het overstromingsrisico van je huis?',1,5,0,11),(18,'SELECT',2,'Vraag 2.','Vertrouw je dat de de publieke maatregelen in je wijk je huis zullen beschermen?',1,5,0,11),(19,'SELECT',1,'Vraag 1.','Hoe denk je over het overstromingsrisico van je huis?',1,5,0,12),(20,'SELECT',2,'Vraag 2.','Vertrouw je dat de de publieke maatregelen in je wijk je huis zullen beschermen?',1,5,0,12);
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questionitem`
--

DROP TABLE IF EXISTS `questionitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `questionitem` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(8) NOT NULL,
  `name` varchar(255) NOT NULL,
  `question_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `code_UNIQUE` (`question_id`,`code`),
  KEY `fk_questionitem_question1_idx` (`question_id`),
  CONSTRAINT `fk_questionitem_question1` FOREIGN KEY (`question_id`) REFERENCES `question` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questionitem`
--

LOCK TABLES `questionitem` WRITE;
/*!40000 ALTER TABLE `questionitem` DISABLE KEYS */;
INSERT INTO `questionitem` VALUES (1,'1','I won\'t get flooded',1),(2,'2','I won\'t get damaged',1),(3,'3','I might suffer minor damage',1),(4,'4','I will suffer minor damage',1),(5,'5','I will get seriously damaged',1),(6,'1','I won\'t get flooded',3),(7,'2','I won\'t get damaged',3),(8,'3','I might suffer minor damage',3),(9,'4','I will suffer minor damage',3),(10,'5','I will get seriously damaged',3),(11,'1','Absolutely not',2),(12,'2','No',2),(13,'3','Inconclusive',2),(14,'4','Yes',2),(15,'5','Absolutely sure',2),(16,'1','Absolotely not',4),(17,'2','No',4),(18,'3','Inconclusive',4),(19,'4','Yes',4),(20,'5','Absolutely sure',4),(21,'1','Mijn huis zal niet overstromen',17),(22,'2','Mijn huis zal geen schade oplopen',17),(23,'3','Mijn huis krijgt wellicht geringe schade',17),(24,'4','Mijn huis krijgt kleine schade',17),(25,'5','Mijn huis krijgt serieuze schade',17),(26,'1','Mijn huis zal niet overstromen',19),(27,'2','Mijn huis zal geen schade oplopen',19),(28,'3','Mijn huis krijgt wellicht geringe schade',19),(29,'4','Mijn huis krijgt kleine schade',19),(30,'5','Mijn huis krijgt serieuze schade',19),(31,'1','Absoluut niet',18),(32,'3','Misschien / weet niet',18),(33,'2','Nee',18),(34,'4','Ja',18),(35,'5','Zeker',18),(36,'1','Absoluut niet',20),(37,'2','Nee',20),(38,'3','Misschien / weet niet',20),(39,'4','Ja',20),(40,'5','Zeker',20);
/*!40000 ALTER TABLE `questionitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questionscore`
--

DROP TABLE IF EXISTS `questionscore`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `questionscore` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `answer` text NOT NULL,
  `late_answer` tinyint(4) NOT NULL DEFAULT 0,
  `playerround_id` int(10) unsigned NOT NULL,
  `question_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `id_playerround_question` (`playerround_id`,`question_id`),
  KEY `fk_questionscore_playerround1_idx` (`playerround_id`),
  KEY `fk_questionscore_question1_idx` (`question_id`),
  CONSTRAINT `fk_questionscore_playerround1` FOREIGN KEY (`playerround_id`) REFERENCES `playerround` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_questionscore_question1` FOREIGN KEY (`question_id`) REFERENCES `question` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questionscore`
--

LOCK TABLES `questionscore` WRITE;
/*!40000 ALTER TABLE `questionscore` DISABLE KEYS */;
INSERT INTO `questionscore` VALUES (12,'1',0,124,3),(13,'3',0,124,4),(14,'5',0,121,3),(15,'2',0,121,4),(16,'2',0,125,3),(17,'4',0,125,4),(18,'2',0,127,3),(19,'3',0,127,4),(20,'1',0,129,3),(21,'3',0,129,4),(22,'3',0,131,3),(23,'3',0,131,4),(24,'1',0,152,3),(25,'3',0,152,4),(26,'3',1,134,3),(27,'3',1,134,4);
/*!40000 ALTER TABLE `questionscore` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scenario`
--

DROP TABLE IF EXISTS `scenario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `scenario` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `information_amount` int(11) NOT NULL,
  `minimum_players` int(10) unsigned NOT NULL DEFAULT 6,
  `maximum_players` int(10) unsigned NOT NULL DEFAULT 8,
  `highest_round_number` int(10) unsigned NOT NULL DEFAULT 5,
  `scenarioparameters_id` int(10) unsigned NOT NULL,
  `gameversion_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_scenario_scenarioparameters1_idx` (`scenarioparameters_id`),
  KEY `fk_scenario_gameversion1_idx` (`gameversion_id`),
  CONSTRAINT `fk_scenario_gameversion1` FOREIGN KEY (`gameversion_id`) REFERENCES `gameversion` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_scenario_scenarioparameters1` FOREIGN KEY (`scenarioparameters_id`) REFERENCES `scenarioparameters` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scenario`
--

LOCK TABLES `scenario` WRITE;
/*!40000 ALTER TABLE `scenario` DISABLE KEYS */;
INSERT INTO `scenario` VALUES (3,'With Info',1,6,8,5,1,3),(4,'Without Info',0,6,8,5,1,3),(11,'Met informatie',1,6,8,5,7,5),(12,'Zonder informatie',0,6,8,5,7,5);
/*!40000 ALTER TABLE `scenario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scenarioparameters`
--

DROP TABLE IF EXISTS `scenarioparameters`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `scenarioparameters` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `pluvial_repair_costs_per_damage_point` int(10) unsigned NOT NULL DEFAULT 0,
  `fluvial_repair_costs_per_damage_point` int(10) unsigned NOT NULL DEFAULT 0,
  `pluvial_satisfaction_penalty_if_area_flooded` int(10) unsigned NOT NULL DEFAULT 0,
  `pluvial_repair_costs_fixed` int(10) unsigned NOT NULL DEFAULT 0,
  `fluvial_repair_costs_fixed` int(10) unsigned NOT NULL DEFAULT 0,
  `fluvial_satisfaction_penalty_if_area_flooded` int(10) unsigned NOT NULL DEFAULT 0,
  `pluvial_satisfaction_penalty_house_flooded_fixed` int(10) unsigned NOT NULL DEFAULT 0,
  `fluvial_satisfaction_penalty_house_flooded_fixed` int(10) unsigned NOT NULL DEFAULT 0,
  `pluvial_satisfaction_penalty_per_damage_point` int(10) unsigned NOT NULL DEFAULT 0,
  `fluvial_satisfaction_penalty_per_damage_point` int(10) unsigned NOT NULL DEFAULT 0,
  `satisfaction_debt_penalty` int(10) unsigned NOT NULL DEFAULT 0,
  `satisfaction_house_rating_too_low_fixed` int(10) unsigned NOT NULL DEFAULT 0,
  `satisfaction_house_rating_too_low_per_delta` int(10) unsigned NOT NULL DEFAULT 0,
  `satisfaction_move_penalty` int(10) unsigned NOT NULL DEFAULT 0,
  `mortgage_percentage` float unsigned NOT NULL DEFAULT 10,
  `allow_personal_satisfaction_neg` tinyint(4) NOT NULL DEFAULT 0,
  `allow_house_satisfaction_neg` tinyint(4) NOT NULL DEFAULT 0,
  `allow_total_satisfaction_neg` tinyint(4) NOT NULL DEFAULT 0,
  `highest_pluvial_score` int(10) unsigned NOT NULL DEFAULT 10,
  `highest_fluvial_score` int(10) unsigned NOT NULL DEFAULT 12,
  `news_discount_in_euros` tinyint(4) NOT NULL DEFAULT 1,
  `default_language_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Id_UNIQUE` (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`),
  KEY `fk_scenarioparameters_language1_idx` (`default_language_id`),
  CONSTRAINT `fk_scenarioparameters_language1` FOREIGN KEY (`default_language_id`) REFERENCES `language` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scenarioparameters`
--

LOCK TABLES `scenarioparameters` WRITE;
/*!40000 ALTER TABLE `scenarioparameters` DISABLE KEYS */;
INSERT INTO `scenarioparameters` VALUES (1,'Standard params EN',0,4000,0,4000,0,1,1,0,0,1,1,1,0,1,10,1,1,1,10,12,1,1),(7,'Standard params NL',0,4000,0,4000,0,1,1,0,0,1,1,1,0,1,10,0,0,0,10,12,1,2);
/*!40000 ALTER TABLE `scenarioparameters` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tax`
--

DROP TABLE IF EXISTS `tax`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tax` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `minimum_inhabitants` int(10) unsigned NOT NULL,
  `maximum_inhabitants` int(10) unsigned NOT NULL,
  `tax_cost` float unsigned NOT NULL,
  `community_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_tax_community1_idx` (`community_id`),
  CONSTRAINT `fk_tax_community1` FOREIGN KEY (`community_id`) REFERENCES `community` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tax`
--

LOCK TABLES `tax` WRITE;
/*!40000 ALTER TABLE `tax` DISABLE KEYS */;
INSERT INTO `tax` VALUES (11,'Tax1-2',1,2,20000,8),(12,'Tax3-4',3,4,15000,8),(13,'Tax5-10',5,10,25000,8),(14,'Tax1-2',1,2,20000,7),(15,'Tax3',3,3,15000,7),(16,'Tax4-7',4,7,25000,7),(17,'Tax1-2',1,2,20000,9),(18,'Tax3-4',3,4,15000,9),(19,'Tax5-10',5,10,25000,9),(29,'Tax1-2',1,2,20000,13),(30,'Tax3',3,3,15000,13),(31,'Tax4-7',4,7,25000,13),(32,'Tax1-2',1,2,20000,14),(33,'Tax3-4',3,4,15000,14),(34,'Tax5-10',5,10,25000,14),(35,'Tax1-2',1,2,20000,15),(36,'Tax3-4',3,4,15000,15),(37,'Tax5-10',5,10,25000,15);
/*!40000 ALTER TABLE `tax` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(16) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(32) NOT NULL,
  `create_time` timestamp NULL DEFAULT current_timestamp(),
  `administrator` tinyint(4) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (3,'ali','a.kahawati@student.tudelft.nl','ali','2023-10-01 18:47:49',1),(4,'juliette','V.J.CortesArevalo@tudelft.nl','juliette','2023-10-06 21:09:02',1),(5,'alexander','a.verbraeck@tudelft.nl','alexander','2023-10-06 21:09:20',1),(6,'lieke','','lieke','2023-11-11 16:03:23',1),(7,'fac1','','fac1','2023-11-19 14:12:10',0),(8,'fac2','','fac2','2023-11-19 14:12:18',0),(9,'fac3','','fac3','2023-11-19 14:12:26',0),(10,'fac4','','fac4','2023-11-19 14:12:32',0),(11,'fac5','','fac5','2023-11-19 14:12:40',0),(13,'fac6','','fac6','2023-11-19 14:12:58',0),(14,'fac7','','fac7','2023-11-19 14:13:05',0),(15,'fac8','','fac8','2023-11-19 14:13:13',0);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `welfaretype`
--

DROP TABLE IF EXISTS `welfaretype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `welfaretype` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `initial_satisfaction` int(10) unsigned NOT NULL,
  `initial_money` int(10) unsigned NOT NULL,
  `maximum_mortgage` int(10) unsigned NOT NULL,
  `living_costs` int(10) unsigned NOT NULL,
  `round_income` int(10) unsigned NOT NULL,
  `satisfaction_cost_per_point` int(10) unsigned NOT NULL,
  `preferred_house_rating` int(10) unsigned NOT NULL,
  `scenario_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_welfaretype_scenario1_idx` (`scenario_id`),
  CONSTRAINT `fk_welfaretype_scenario1` FOREIGN KEY (`scenario_id`) REFERENCES `scenario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `welfaretype`
--

LOCK TABLES `welfaretype` WRITE;
/*!40000 ALTER TABLE `welfaretype` DISABLE KEYS */;
INSERT INTO `welfaretype` VALUES (8,'Welfare 050',5,0,80000,20000,50000,4000,3,3),(9,'Welfare 065',5,5000,110000,30000,65000,6000,4,3),(10,'Welfare 080',5,15000,130000,40000,80000,8000,5,3),(11,'Welfare 100',5,30000,170000,50000,100000,10000,6,3),(12,'Welfare 120',5,50000,200000,65000,120000,13000,7,3),(13,'Welfare 180',5,80000,300000,105000,180000,21000,8,3),(14,'Welfare 050',5,0,80000,20000,50000,4000,3,4),(15,'Welfare 065',5,5000,110000,30000,65000,6000,4,4),(16,'Welfare 080',5,15000,130000,40000,80000,8000,5,4),(17,'Welfare 100',5,30000,170000,50000,100000,10000,6,4),(18,'Welfare 120',5,50000,200000,65000,120000,13000,7,4),(19,'Welfare 180',5,80000,300000,105000,180000,21000,8,4),(56,'Welfare 050',5,0,80000,20000,50000,4000,3,11),(57,'Welfare 065',5,5000,110000,30000,65000,6000,4,11),(58,'Welfare 080',5,15000,130000,40000,80000,8000,5,11),(59,'Welfare 100',5,30000,170000,50000,100000,10000,6,11),(60,'Welfare 120',5,50000,200000,65000,120000,13000,7,11),(61,'Welfare 180',5,80000,300000,105000,180000,21000,8,11),(62,'Welfare 050',5,0,80000,20000,50000,4000,3,12),(63,'Welfare 065',5,5000,110000,30000,65000,6000,4,12),(64,'Welfare 080',5,15000,130000,40000,80000,8000,5,12),(65,'Welfare 100',5,30000,170000,50000,100000,10000,6,12),(66,'Welfare 120',5,50000,200000,65000,120000,13000,7,12),(67,'Welfare 180',5,80000,300000,105000,180000,21000,8,12);
/*!40000 ALTER TABLE `welfaretype` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-13 22:45:27
