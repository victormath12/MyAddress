-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 21-Jan-2017 às 02:11
-- Versão do servidor: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `my_address`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `enderecos`
--

CREATE TABLE IF NOT EXISTS `enderecos` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `RUA` varchar(80) NOT NULL,
  `NUMERO` int(11) NOT NULL,
  `COMPLEMENTO` varchar(20) DEFAULT NULL,
  `CEP` int(11) NOT NULL,
  `BAIRRO` varchar(80) DEFAULT NULL,
  `CIDADE` varchar(80) NOT NULL,
  `ESTADO` varchar(2) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=21 ;

--
-- Extraindo dados da tabela `enderecos`
--

INSERT INTO `enderecos` (`ID`, `RUA`, `NUMERO`, `COMPLEMENTO`, `CEP`, `BAIRRO`, `CIDADE`, `ESTADO`) VALUES
(1, 'Rua Tanganica', 631, 'Casa 2', 9260070, 'Pq. OratÃ³rio', 'Santo AndrÃ©', 'SP'),
(2, 'Av. Ubatuba', 899, 'ap 3', 5669885, 'Parque dos Lagos', 'Santos', 'SP'),
(5, 'Tatui', 8995, 'casa2', 565888855, 'Jardim', 'Santo André', 'SP'),
(10, 'Alvorada', 85, 'ap 3', 98556633, 'Boa Lagoa', 'Santo André', 'SP'),
(11, 'Marajoara Editada', 69, 'ap 9', 98556633, 'MÃ¡ Lagoa', 'Santo AndrÃ©', 'SP'),
(12, 'Rua IrmÃ£os Campana', 631, 'Casa 2', 9260070, 'Paulistania', 'Bauru', 'SP'),
(13, 'Rua Irmãos Campana', 631, 'Casa 2', 99855663, 'Paulistania', 'Bauru', 'SP'),
(14, 'Rua Irmãos Campana', 631, 'Casa 2', 99855663, 'Paulistania', 'Bauru', 'SP'),
(15, 'Rua Irmãos Campana', 631, 'Casa 2', 99855663, 'Paulistania', 'Bauru', 'SP'),
(16, 'Rua Irmãos Campana', 631, 'Casa 2', 58566985, 'Paulistania', 'Bauru', 'SP'),
(17, 'Rua Irmãos Campana', 631, 'Casa 2', 58566985, 'Paulistania', 'Bauru', 'SP'),
(18, 'Rua IrmÃ£os Campana', 631, 'Casa 2', 58566985, 'Paulistania', 'Bauru', 'SP'),
(19, 'Rua IrmÃ£os Campana', 631, 'Casa 2', 558, 'Paulistania', 'Bauru', 'SP'),
(20, 'Rua IrmÃ£os Campana', 631, 'Casa 2', 558, 'Paulistania', 'Bauru', 'SP');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
