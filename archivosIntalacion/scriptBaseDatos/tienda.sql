-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 11, 2023 at 12:37 PM
-- Server version: 5.7.28
-- PHP Version: 8.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tienda`
--

-- --------------------------------------------------------

--
-- Table structure for table `categoria`
--

CREATE TABLE `categoria` (
  `id` int(11) NOT NULL,
  `cat_nombre` varchar(50) NOT NULL,
  `cat_imagen` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `categoria`
--

INSERT INTO `categoria` (`id`, `cat_nombre`, `cat_imagen`) VALUES
(1, 'Agrarios', 'agrarios.jpg'),
(2, 'Aseo', 'Aseo.jpg'),
(3, 'Carnico', 'Carnico.jpg'),
(4, 'Salud', 'Salud.jpg'),
(5, 'Empaquetados', 'Empaquetados.jpg'),
(6, 'Lacteos', 'Lacteos.jpg'),
(7, 'Licores', 'Licores.jpg'),
(8, 'Gaseosas', 'Gaseosas.jpg'),
(9, 'Pan', 'Pan.jpg'),
(10, 'Cigarreria', 'Cigarreria.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `ciudad`
--

CREATE TABLE `ciudad` (
  `ciuId` int(11) NOT NULL,
  `ciuIdNombre` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
--

CREATE TABLE `cliente` (
  `id` bigint(20) NOT NULL,
  `tipo_id` int(11) NOT NULL,
  `cli_identificacion` varchar(20) NOT NULL,
  `cli_nombre` varchar(50) NOT NULL,
  `cli_email` varchar(100) NOT NULL,
  `cli_password` varchar(256) NOT NULL,
  `cli_direccion` varchar(100) DEFAULT NULL,
  `cli_telefono` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cliente`
--

INSERT INTO `cliente` (`id`, `tipo_id`, `cli_identificacion`, `cli_nombre`, `cli_email`, `cli_password`, `cli_direccion`, `cli_telefono`) VALUES
(1, 1, '1075220291', 'Wilson Carvajal', 'wilnacio@hotmail.com', '1234', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `domiciliario`
--

CREATE TABLE `domiciliario` (
  `domId` int(11) NOT NULL,
  `domNombre` int(50) NOT NULL,
  `domTelefono` varchar(20) NOT NULL,
  `domEmail` varchar(100) NOT NULL,
  `domContraseña` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marca`
--

CREATE TABLE `marca` (
  `id` int(11) NOT NULL,
  `mar_nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marca`
--

INSERT INTO `marca` (`id`, `mar_nombre`) VALUES
(1, 'Cocacola'),
(2, 'Fritolay'),
(3, 'Postobón'),
(4, 'Quala'),
(5, 'Ramo'),
(6, 'Bimbo'),
(7, 'Bavaria'),
(8, 'Colombina'),
(9, 'P&G'),
(10, 'Surcolac'),
(11, 'Colanta'),
(12, 'Alqueria'),
(13, 'Yupi'),
(14, 'Coltabaco'),
(15, 'zenú'),
(16, 'Las brisas'),
(17, 'MacPollo'),
(18, 'Alpina');

-- --------------------------------------------------------

--
-- Table structure for table `producto`
--

CREATE TABLE `producto` (
  `id` bigint(20) NOT NULL,
  `mar_id` int(11) NOT NULL,
  `cat_id` int(11) NOT NULL,
  `prov_id` int(11) DEFAULT NULL,
  `prod_imagen` varchar(30) NOT NULL,
  `prod_nombre` varchar(50) NOT NULL,
  `prod_codigo_barras` varchar(50) NOT NULL,
  `prod_precio_venta` int(11) NOT NULL,
  `prod_precio_compra` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `producto`
--

INSERT INTO `producto` (`id`, `mar_id`, `cat_id`, `prov_id`, `prod_imagen`, `prod_nombre`, `prod_codigo_barras`, `prod_precio_venta`, `prod_precio_compra`) VALUES
(1, 18, 6, NULL, 'BonyurtZucaritas.jpg', 'BonyurtZucaritas', '1112', 3500, 2600),
(2, 18, 6, NULL, 'BonyurtChocokrispis.jpg', 'BonyurtChocokrispis', '1113', 3500, 2600),
(3, 12, 6, NULL, 'CremadelecheAlqueria.jpg', 'CremadelecheAlqueria', '1114', 3000, 2300),
(5, 12, 6, NULL, 'MegaLitroAlqueriaDeslactosad', 'MegaLitroAlqueriaDeslactosada', '1116', 6200, 5000),
(6, 12, 6, NULL, 'MegaLitroAlqueriaEntera.jpg', 'MegaLitroAlqueriaEntera', '1117', 6000, 4900),
(7, 7, 7, NULL, 'AguilaLight.jpg', 'AguilaLight', '1118', 2700, 1800),
(8, 7, 7, NULL, 'AguilaOrigina.jpg', 'AguilaOrigina', '1119', 2600, 1600),
(10, 7, 7, NULL, 'PokerBavaria.jpg', 'PokerBavaria', '11221', 2600, 1800),
(11, 7, 7, NULL, 'ClubColombiaD.jpg', 'ClubColombiaD', '1134', 4000, 2500),
(12, 7, 7, NULL, 'ClubColombiaN.jpg', 'ClubColombiaN', '212312', 4000, 2600),
(13, 7, 8, NULL, 'PonyMaltaB.jpg', 'PonyMalta', '43231', 2000, 1200),
(14, 7, 8, NULL, 'PonyMaltaPpersonal.jpg', 'PonyMaltaPpersonal', '44532', 2200, 1300),
(15, 7, 8, NULL, 'PonyMaltaLitro.jpg', 'PonyMaltaLitro', '54212', 4500, 3000),
(16, 6, 9, NULL, 'PanBimboB.jpg', 'PanBimboB', '312312', 5000, 3400),
(17, 6, 9, NULL, 'PanBimboI.jpg', 'Pan BimboI', '43122122', 6000, 4800),
(18, 6, 9, NULL, 'PonqueBimboCasero.jpg', 'PonqueBimboCasero', '443556', 4500, 3000),
(19, 6, 9, NULL, 'PanqueBimboVainilla.jpg', 'PanqueBimboVainilla', '66545', 2200, 1500),
(20, 6, 9, NULL, 'SubmarinosArequipe.jpg', 'SubmarinosArequipe', '334423', 1500, 800),
(21, 6, 9, NULL, 'SubmarinosFresa.jpg', 'SubmarinosFresa', '66567', 1500, 800),
(22, 1, 8, NULL, 'CocacolaPersonalV.jpg', 'CocacolaPersonalV', '324578', 2000, 1200),
(23, 1, 8, NULL, 'CuatroPersonalV.jpg', 'CuatroPersonalV', '554433', 2000, 1200),
(24, 1, 8, NULL, 'CocacolaPersonalP.jpg', 'CocacolaPersonalP', '4431122', 2500, 1400),
(25, 1, 8, NULL, 'Cocacola2LP.jpg', 'Cocacola2LP', '99887', 4800, 3000),
(26, 7, 7, NULL, 'Costeñita.jpg', 'Costeñita', '5588', 2500, 1450),
(28, 11, 6, NULL, 'LecheEnteraC1000ml.jpg', 'LecheEnteraC1000ml', '99776445', 4800, 4000),
(29, 11, 6, NULL, 'LecheDeslactosadaC1L.jpg', 'LecheDeslactaosadaC1L', '113322', 4200, 5100),
(30, 8, 5, NULL, 'Nucita.jpg', 'Nucita', '7700', 1000, 500),
(31, 8, 5, NULL, 'Chocomelos.jpg', 'Chocomelos', '11212', 4500, 3700),
(32, 8, 5, NULL, 'BonbonbunPqt.jpg', 'BonbonbunPqt', '88797', 11500, 8000),
(33, 14, 10, NULL, 'MarlboroFusion.jpg', 'MarlboroFusion', '554433', 500, 4000),
(34, 14, 10, NULL, 'RothmansAzul.jpg', 'RothmansAzul', '2288', 5000, 4100),
(35, 14, 10, NULL, 'ChesterfieldAzul.jpg', 'ChesterfieldAzul', '00576', 4800, 3900),
(36, 2, 5, NULL, 'PapasPollo.jpg', 'PapasPollo', '', 2300, 1700),
(37, 2, 5, NULL, 'DetoditoBBQ.jpg', 'DetoditoBBQ', '112341', 2500, 1900),
(38, 2, 5, NULL, 'Cheesetris.jpg', 'Cheesetris', '5500', 1700, 1200),
(39, 16, 3, NULL, 'ChorizoLasBrisas.jpg', 'ChorizoLasBrisas', '213141', 13000, 11000),
(40, 16, 3, NULL, 'HamburguesaLasBrisas.jpg', 'HamburguesaLasBrisas', '66612', 4800, 3600),
(41, 17, 3, NULL, 'PolloEntero.jpg', 'PolloEntero', '76789', 15000, 11000),
(42, 9, 2, NULL, 'Headshoulders.jpg', 'Headshoulders', '233442', 6000, 4000),
(43, 3, 8, NULL, 'Colombiana3Lt.jpg', 'Colombiana3Lt', '445511', 7000, 5000),
(44, 3, 8, NULL, 'Manzana3Lt.jpg', 'Manzana3Lt', '778855', 7000, 5000),
(45, 4, 8, NULL, 'Vive100.jpg', 'Vive100', '11654', 2500, 1900),
(46, 5, 9, NULL, 'Chocorramo.jpg', 'Chocorramo', '45352', 2500, 2000),
(47, 10, 6, NULL, 'Tampico1000ml.jpg', 'Tampico1000ml', '54321', 5000, 3900);

-- --------------------------------------------------------

--
-- Table structure for table `productoventa`
--

CREATE TABLE `productoventa` (
  `prodVentId` bigint(20) NOT NULL,
  `ventId` bigint(20) NOT NULL,
  `prodId` bigint(20) NOT NULL,
  `prodVentCantidad` int(11) NOT NULL,
  `prodVentPrecio` int(11) NOT NULL,
  `prodVentPrecioCompra` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `proveedor`
--

CREATE TABLE `proveedor` (
  `id` int(11) NOT NULL,
  `prov_nombre` varchar(100) NOT NULL,
  `prov_direccion` varchar(100) DEFAULT NULL,
  `prod_telefono` varchar(20) DEFAULT NULL,
  `prov_telefono` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tipoidentificacion`
--

CREATE TABLE `tipoidentificacion` (
  `id` int(11) NOT NULL,
  `tipo_nombre` varchar(30) NOT NULL,
  `tipo_abreviatura` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tipoidentificacion`
--

INSERT INTO `tipoidentificacion` (`id`, `tipo_nombre`, `tipo_abreviatura`) VALUES
(1, 'Cedula', 'CC'),
(2, 'Nit', 'Nit');

-- --------------------------------------------------------

--
-- Table structure for table `venta`
--

CREATE TABLE `venta` (
  `ventId` bigint(20) NOT NULL,
  `ventFecha` datetime NOT NULL,
  `cliId` bigint(20) DEFAULT NULL,
  `ciuId` int(11) NOT NULL,
  `ventTotal` int(11) DEFAULT NULL,
  `VentTotalCompra` int(11) DEFAULT NULL,
  `domId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`ciuId`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cliEmail` (`cli_email`),
  ADD KEY `fk_cliente_tipoidentificacion` (`tipo_id`);

--
-- Indexes for table `domiciliario`
--
ALTER TABLE `domiciliario`
  ADD PRIMARY KEY (`domId`),
  ADD UNIQUE KEY `domEmail` (`domEmail`);

--
-- Indexes for table `marca`
--
ALTER TABLE `marca`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_producto_marca` (`mar_id`),
  ADD KEY `fk_producto_categoria` (`cat_id`),
  ADD KEY `fk_producto_provedor` (`prov_id`);

--
-- Indexes for table `productoventa`
--
ALTER TABLE `productoventa`
  ADD PRIMARY KEY (`prodVentId`),
  ADD KEY `fk_productoventa_venta` (`ventId`),
  ADD KEY `fk_productoventa_producto` (`prodId`);

--
-- Indexes for table `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tipoidentificacion`
--
ALTER TABLE `tipoidentificacion`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`ventId`),
  ADD KEY `fk_venta_ciudad` (`ciuId`),
  ADD KEY `fk_venta_cliente` (`cliId`),
  ADD KEY `fk_venta_domiciliario` (`domId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `ciuId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `domiciliario`
--
ALTER TABLE `domiciliario`
  MODIFY `domId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `marca`
--
ALTER TABLE `marca`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `producto`
--
ALTER TABLE `producto`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT for table `productoventa`
--
ALTER TABLE `productoventa`
  MODIFY `prodVentId` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tipoidentificacion`
--
ALTER TABLE `tipoidentificacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `venta`
--
ALTER TABLE `venta`
  MODIFY `ventId` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `fk_cliente_tipoidentificacion` FOREIGN KEY (`tipo_id`) REFERENCES `tipoidentificacion` (`id`);

--
-- Constraints for table `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `fk_producto_categoria` FOREIGN KEY (`cat_id`) REFERENCES `categoria` (`id`),
  ADD CONSTRAINT `fk_producto_marca` FOREIGN KEY (`mar_id`) REFERENCES `marca` (`id`),
  ADD CONSTRAINT `fk_producto_provedor` FOREIGN KEY (`prov_id`) REFERENCES `proveedor` (`id`);

--
-- Constraints for table `productoventa`
--
ALTER TABLE `productoventa`
  ADD CONSTRAINT `fk_productoventa_producto` FOREIGN KEY (`prodId`) REFERENCES `producto` (`id`),
  ADD CONSTRAINT `fk_productoventa_venta` FOREIGN KEY (`ventId`) REFERENCES `venta` (`ventId`);

--
-- Constraints for table `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `fk_venta_ciudad` FOREIGN KEY (`ciuId`) REFERENCES `ciudad` (`ciuId`),
  ADD CONSTRAINT `fk_venta_cliente` FOREIGN KEY (`cliId`) REFERENCES `cliente` (`id`),
  ADD CONSTRAINT `fk_venta_domiciliario` FOREIGN KEY (`domId`) REFERENCES `domiciliario` (`domId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
