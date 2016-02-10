-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 10, 2016 at 09:48 AM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `vehicle`
--

-- --------------------------------------------------------

--
-- Table structure for table `vehicles`
--

CREATE TABLE IF NOT EXISTS `vehicles` (
  `Regno` varchar(8) NOT NULL,
  `DOP` date NOT NULL,
  `Make` varchar(20) NOT NULL,
  PRIMARY KEY (`Regno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehicles`
--

INSERT INTO `vehicles` (`Regno`, `DOP`, `Make`) VALUES
('KAT 256U', '2015-01-04', 'ISUZU'),
('KAT 338U', '2016-01-03', 'ISUZU'),
('KBG 028H', '2013-01-10', 'TATA'),
('KBM 028M', '2013-01-11', 'TATA'),
('KBT 338U', '2016-01-01', 'ISUZU'),
('KBW 028L', '2015-01-08', 'TATA');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
