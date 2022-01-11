-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 11 Oca 2022, 12:52:11
-- Sunucu sürümü: 10.4.22-MariaDB
-- PHP Sürümü: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `demo`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `adminler`
--

CREATE TABLE `adminler` (
  `username` text COLLATE utf32_turkish_ci NOT NULL,
  `password` text COLLATE utf32_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `adminler`
--

INSERT INTO `adminler` (`username`, `password`) VALUES
('admin', 'admin'),
('süphan', '123698745');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uyeler`
--

CREATE TABLE `uyeler` (
  `id` int(11) NOT NULL,
  `ad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `soyad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `brans` text COLLATE utf32_turkish_ci NOT NULL,
  `telefon` text COLLATE utf32_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `uyeler`
--

INSERT INTO `uyeler` (`id`, `ad`, `soyad`, `brans`, `telefon`) VALUES
(2, 'Zeliha', 'YÜCEL', 'Yüzme', '05547412523'),
(3, 'Merve', 'SÖNMEZ', 'Fitness', '05547412555'),
(4, 'Merve', 'VURAL', 'Boks', '05547413443'),
(8, 'Mustafa', 'YÜZEN', 'Yüzme', '05325145611'),
(9, 'Mustafa', 'ERDEM', 'Plates', '05325145612'),
(11, 'Esra', 'AKBULUT', 'Boks', '05325145615'),
(12, 'Hanife', 'YAVUZ', 'Yüzme', '05325145617'),
(13, 'Meryem', 'UYANIK', 'Plates', '05325145617'),
(14, 'Emine', 'ŞEN', 'Fitness', '05468018272'),
(15, 'Hüseyin', 'ŞEN', 'Plates', '05468018372'),
(16, 'Hüseyin', 'YÜCEL', 'Yüzme', '05468018276'),
(17, 'Özlem', 'ÇEVİK', 'Boks', '05468018270'),
(18, 'Yunus Emre', 'ERDEM', 'Plates', '05468018275'),
(19, 'Zeynep', 'ÖZTÜRK', 'Fitness', '05468018272'),
(20, 'Hülya', 'ÖZTÜRK', 'Plates', '05551526585'),
(21, 'İsmail', 'ERDEM', 'Boks', '05551526583'),
(22, 'Esra', 'KANDEMİR', 'Fitness', '05551526585'),
(23, 'Umut', 'ERKURAN', 'Boks', '05551526532'),
(24, 'Şerife', 'ERKURAN', 'Fitness', '05551521651'),
(25, 'Elif', 'VURAL', 'Boks', '05469054215'),
(26, 'Mustafa', 'ŞEN', 'Fitness', '050755117485'),
(27, 'Meryem', 'KANDEMİR', 'Plates', '050755117434'),
(28, 'Enes', 'ÇEVİK', 'Plates', '050755117435'),
(29, 'Abdullah', 'ERTEKİN', 'Yüzme', '050755117423'),
(30, 'Mehmet', 'ORHON', 'Boks', '050755117478'),
(31, 'Ömer', 'SÖNMEZ', 'Fitness', '050755117499'),
(32, 'Abdullah', 'AKBULUT', 'Plates', '050755117422'),
(33, 'Meryem', 'SÖNMEZ', 'Yüzme', '050755117411'),
(34, 'İsmail', 'SÖNMEZ', 'Boks', '050755117499'),
(35, 'Zeynep', 'ŞEN', 'Fitness', '050755117433'),
(36, 'Ayşe', 'YÜZBAŞIOĞLU', 'Boks', '050755117486'),
(37, 'Enes', 'ŞEN', 'Plates', '050755117456'),
(38, 'Şerife', 'ÇEVİK', 'Fitness', '050755117412'),
(39, 'Furkan', 'ERKURAN', 'Yüzme', '050755117445'),
(40, 'Muhammed', 'ÖZTÜRK', 'Boks', '05458966335'),
(41, 'Hatice', 'VURAL', 'Plates', '05459415877'),
(42, 'Emine', 'ERTEKİN', 'Fitness', '05459415823'),
(43, 'Hülya', 'YAVUZ', 'Boks', '05459415811'),
(44, 'Meryem', 'ERTEKİN', 'Plates', '05459415822'),
(45, 'Hasan', 'YÜZBAŞIOĞLU', 'Yüzme', '05459415833'),
(46, 'Fadime', 'Yakut', 'Plates', '05459415844'),
(47, 'Hasan', 'AKBULUT', 'Boks', '05459415855'),
(48, 'Süleyman', 'DEDE', 'Fitness', '05459415866'),
(49, 'Emine', 'ASLAN', 'Yüzme', '05459415888'),
(50, 'Hacer', 'ERKURAN', 'Yüzme', '05459415899'),
(55, 'Ömer Yahya', 'Yakut', 'Fitness', '05528870662'),
(58, 'Ömer ', 'ERDEM', 'Boks', '05448547888'),
(59, 'Umut', 'ARPAY', 'Yüzme', '05458514252'),
(60, 'Ahmet', 'TÜTMEZ', 'Yüzme', '05325145611'),
(61, 'Gökhan', 'YEL', 'Pilates', '05325145613'),
(62, 'Özcan', 'TUNCER', 'Fitness', '05437578598');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `uyeler`
--
ALTER TABLE `uyeler`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `uyeler`
--
ALTER TABLE `uyeler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=67;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
