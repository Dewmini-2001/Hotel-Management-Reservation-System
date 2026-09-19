-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.32-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.11.0.7065
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for hotel_system
CREATE DATABASE IF NOT EXISTS `hotel_system` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `hotel_system`;

-- Dumping structure for table hotel_system.guest
CREATE TABLE IF NOT EXISTS `guest` (
  `guest_id` varchar(4) NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `email` varchar(150) DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `id_type` varchar(50) DEFAULT NULL,
  `id_no` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`guest_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table hotel_system.guest: ~2 rows (approximately)
DELETE FROM `guest`;
INSERT INTO `guest` (`guest_id`, `first_name`, `last_name`, `email`, `phone`, `id_type`, `id_no`) VALUES
	('G001', 'ukiR', 'Hunter', 'ukihunter@gmail.com', '0703569871', 'NIC', '20095687412'),
	('G002', 'Tera ', 'Anone', 'Terananone@gmail.com', '0117458963', 'NIC', '20046589741');

-- Dumping structure for table hotel_system.reservation
CREATE TABLE IF NOT EXISTS `reservation` (
  `reservation_no` varchar(5) NOT NULL,
  `guest_id` varchar(4) NOT NULL,
  `room_no` varchar(4) NOT NULL,
  `check_in_date` date DEFAULT NULL,
  `check_out_date` date DEFAULT NULL,
  `nights` int(11) DEFAULT NULL,
  `total_amount` decimal(10,2) DEFAULT NULL,
  `payment_method` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`reservation_no`),
  KEY `guest_id` (`guest_id`),
  KEY `room_no` (`room_no`),
  CONSTRAINT `reservation_ibfk_1` FOREIGN KEY (`guest_id`) REFERENCES `guest` (`guest_id`),
  CONSTRAINT `reservation_ibfk_2` FOREIGN KEY (`room_no`) REFERENCES `room` (`room_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table hotel_system.reservation: ~0 rows (approximately)
DELETE FROM `reservation`;
INSERT INTO `reservation` (`reservation_no`, `guest_id`, `room_no`, `check_in_date`, `check_out_date`, `nights`, `total_amount`, `payment_method`) VALUES
	('RS001', 'G001', 'M001', '2026-09-09', '2026-09-30', 2, 400.00, 'Cash');

-- Dumping structure for table hotel_system.room
CREATE TABLE IF NOT EXISTS `room` (
  `room_no` varchar(4) NOT NULL,
  `floor` varchar(20) DEFAULT NULL,
  `room_type` varchar(50) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `bed_type` varchar(50) DEFAULT NULL,
  `room_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`room_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table hotel_system.room: ~0 rows (approximately)
DELETE FROM `room`;
INSERT INTO `room` (`room_no`, `floor`, `room_type`, `price`, `bed_type`, `room_description`) VALUES
	('M001', 'Floor 1', 'Standard', 200.00, 'Queen Bed', 'good');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
