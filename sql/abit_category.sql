/*
 Navicat Premium Data Transfer

 Source Server         : 云服务器
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : 47.93.254.162:3306
 Source Schema         : ry-vue

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 19/09/2020 15:19:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for abit_category
-- ----------------------------
DROP TABLE IF EXISTS `abit_category`;
CREATE TABLE `abit_category` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '分类ID',
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '分类名称',
  `pid` bigint(11) DEFAULT NULL COMMENT '父级分类',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `description` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '分类描述',
  `status` int(255) NOT NULL COMMENT '0 未启用\r\n1 启用\r\n2 删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='商品分类表';

-- ----------------------------
-- Records of abit_category
-- ----------------------------
BEGIN;
INSERT INTO `abit_category` VALUES (2, '电子产品', NULL, '2020-09-17 22:20:32', '电子产品分类', 1);
INSERT INTO `abit_category` VALUES (3, '户外旅行', NULL, '2020-09-17 22:20:50', '户外旅行分类', 1);
INSERT INTO `abit_category` VALUES (4, '游戏发烧', NULL, '2020-09-18 10:58:46', '游戏发烧电子设备', 1);
INSERT INTO `abit_category` VALUES (5, '游戏外设', NULL, '2020-09-18 21:51:04', '游戏设备', 2);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
