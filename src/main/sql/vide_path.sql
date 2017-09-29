/*
Navicat MySQL Data Transfer

Source Server         : 58
Source Server Version : 50719
Source Host           : 192.168.1.123:3306
Source Database       : learn

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-07-25 14:32:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `vide_path`
-- ----------------------------
DROP TABLE IF EXISTS `vide_path`;
CREATE TABLE `vide_path` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) COLLATE utf8_bin NOT NULL,
  `type` varchar(10) COLLATE utf8_bin NOT NULL,
  `file_path` varchar(500) COLLATE utf8_bin NOT NULL,
  `file_ip` varchar(500) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `theOne` (`name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
