-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2024 at 02:36 PM
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
(1, 'Bubur Cangijo', 350, 10000, 'Vegetable'),
(2, 'Sate Ayam', 470, 25000, 'Vegetable'),
(3, 'Nasi Kuning ', 190, 15000, 'Meat'),
(4, 'Ayam Suwir', 370, 15000, 'Meat'),
(5, 'Nasi Bakar', 600, 10000, 'Meat'),
(6, 'Cilok', 475, 8000, 'Meat'),
(7, 'Nasi Uduk', 790, 12000, 'Meat'),
(8, 'Soto Ayam', 550, 15000, 'Beverage'),
(9, 'Pempek', 550, 15000, 'Beverage'),
(10, 'test', 500, 1200, 'Vegetable');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nama_lengkap` varchar(70) NOT NULL,
  `tanggal_Lahir` varchar(10) NOT NULL,
  `email` varchar(30) NOT NULL,
  `kata_sandi` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nama_lengkap`, `tanggal_Lahir`, `email`, `kata_sandi`) VALUES
(1, 'Benony Gabriel', '17/05/2004', 'beno17@gmail.com', 'test123'),
(3, 'seller', '12', 'test', 'test'),
(4, 'Jhon', '17/08/1999', 'jhon@mail.com', 'test1234'),
(5, 'test', 'test', 'test', 'test'),
(7, 'aril noah', '12/12/1999', 'ariel@mail.com', 'aril123'),
(8, 'Ben', '17/10/2004', 'ben@mail.com', 'ben123'),
(9, 'ony', '17/03/1999', 'ony@mail.com', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`catID`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`prodID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `catID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `prodID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
