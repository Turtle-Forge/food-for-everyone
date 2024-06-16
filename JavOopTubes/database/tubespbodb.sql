-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2024 at 05:20 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubespbodb`
--

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `catID` int(5) NOT NULL,
  `catName` varchar(20) NOT NULL,
  `catDesc` varchar(75) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`catID`, `catName`, `catDesc`) VALUES
(1, 'Makanan Ringan', 'Segala jenis makanan ringan');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customerID` int(11) NOT NULL,
  `namaLengkap` varchar(70) NOT NULL,
  `tglLahir` varchar(20) NOT NULL,
  `email` varchar(70) NOT NULL,
  `kataSandi` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customerID`, `namaLengkap`, `tglLahir`, `email`, `kataSandi`) VALUES
(1, 'Benony Gabriel', '17/05/2004', 'benonygabriel17@gmail.com', 'beno123');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `prodID` int(11) NOT NULL,
  `prodName` varchar(35) NOT NULL,
  `prodQtty` int(11) NOT NULL,
  `prodPrice` decimal(10,0) NOT NULL,
  `prodCategory` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`prodID`, `prodName`, `prodQtty`, `prodPrice`, `prodCategory`) VALUES
(1, 'Bubur Cangijo', 331, 10000, 'Vegetable'),
(2, 'Sate Ayam', 454, 25000, 'Vegetable'),
(3, 'Nasi Kuning ', 188, 15000, 'Meat'),
(4, 'Ayam Suwir', 365, 15000, 'Meat'),
(5, 'Nasi Bakar', 600, 10000, 'Meat'),
(6, 'Cilok', 469, 8000, 'Meat'),
(7, 'Nasi Uduk', 790, 12000, 'Meat'),
(8, 'Soto Ayam', 545, 15000, 'Beverage'),
(9, 'Pempek', 547, 15000, 'Beverage'),
(10, 'Nasi Goreng', 500, 1200, 'Beverage');

-- --------------------------------------------------------

--
-- Table structure for table `seller`
--

CREATE TABLE `seller` (
  `sellerID` int(11) NOT NULL,
  `namaLengkap` varchar(70) NOT NULL,
  `tglLahir` varchar(20) NOT NULL,
  `email` varchar(70) NOT NULL,
  `kataSandi` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `seller`
--

INSERT INTO `seller` (`sellerID`, `namaLengkap`, `tglLahir`, `email`, `kataSandi`) VALUES
(1, 'Bintang Akbar Alim', '23/08/1999', 'masbin5@gmail.com', 'masbin123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`catID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customerID`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`prodID`);

--
-- Indexes for table `seller`
--
ALTER TABLE `seller`
  ADD PRIMARY KEY (`sellerID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `catID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `customerID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `prodID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `seller`
--
ALTER TABLE `seller`
  MODIFY `sellerID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
