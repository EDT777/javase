create database shop1905;

use shop1905;

/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : shop1905

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2019-11-23 17:09:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `goods`
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL COMMENT '名称',
  `price` decimal(20,2) NOT NULL COMMENT '价格',
  `count` int(11) NOT NULL COMMENT '数量',
  `type` varchar(30) NOT NULL COMMENT '商品类型',
  `up_time` datetime DEFAULT NULL COMMENT '上架时间',
  `state` tinyint(4) DEFAULT '0' COMMENT '商品状态，0表示正常，1表示库存预警，-1表示无货，-2表示已下架',
  `source_channel` varchar(255) DEFAULT NULL COMMENT '进货渠道',
  `in_price` decimal(20,2) DEFAULT NULL COMMENT '进货价格',
  `promtion_price` decimal(20,2) DEFAULT NULL COMMENT '促销价格',
  `type_id` bigint(20) DEFAULT NULL COMMENT '商品类型的引用上类型表的id',
  PRIMARY KEY (`id`),
  KEY `FK_TYPE` (`type`),
  KEY `FK_TYPE_ID` (`type_id`),
  KEY `IDX_NAME` (`name`) USING BTREE,
  CONSTRAINT `FK_TYPE` FOREIGN KEY (`type`) REFERENCES `goods_type` (`type_name`),
  CONSTRAINT `FK_TYPE_ID` FOREIGN KEY (`type_id`) REFERENCES `goods_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1008 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '鞋子', '191.00', '20', '女装', '2019-02-02 00:00:00', '0', '福建A', '45.00', '78.00', '2');
INSERT INTO `goods` VALUES ('1000', '帽子', '210.00', '8', '服装', '2019-07-06 00:00:00', '0', '广东A', '34.00', '124.00', '7');
INSERT INTO `goods` VALUES ('1002', '裤子', '279.00', '100', '服装', '2019-09-19 00:00:00', '0', '湖南株洲', '199.00', '159.00', '8');
INSERT INTO `goods` VALUES ('1003', '群子', '298.00', '100', '女装', '2019-05-06 00:00:00', '0', null, null, null, '2');
INSERT INTO `goods` VALUES ('1004', '测试', '100.00', '10', '服装', '2019-10-09 21:19:17', '0', '福建', '56.00', '88.00', '1');
INSERT INTO `goods` VALUES ('1006', 'DAO测试', '1000.00', '10', '服装', '2019-10-09 22:12:53', '0', '福建', '100.00', '88.00', '1');
INSERT INTO `goods` VALUES ('1007', 'DAO测试', '1000.00', '10', '服装', '2019-10-15 22:02:49', '0', '福建', '100.00', '88.00', '1');

-- ----------------------------
-- Table structure for `goods_type`
-- ----------------------------
DROP TABLE IF EXISTS `goods_type`;
CREATE TABLE `goods_type` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(30) NOT NULL COMMENT '类型名称',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父ID，类型的层级关系',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UQ_GOODS_TYPE` (`type_name`),
  KEY `type_name` (`type_name`),
  KEY `parent_id` (`parent_id`),
  CONSTRAINT `goods_type_ibfk_1` FOREIGN KEY (`parent_id`) REFERENCES `goods_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods_type
-- ----------------------------
INSERT INTO `goods_type` VALUES ('1', '电器', null);
INSERT INTO `goods_type` VALUES ('2', '服装', null);
INSERT INTO `goods_type` VALUES ('3', '食品', null);
INSERT INTO `goods_type` VALUES ('4', '大家电', '1');
INSERT INTO `goods_type` VALUES ('5', '电视机', '4');
INSERT INTO `goods_type` VALUES ('6', '女装', '2');
INSERT INTO `goods_type` VALUES ('7', '女裙', '6');
INSERT INTO `goods_type` VALUES ('8', '蔬菜', '3');
INSERT INTO `goods_type` VALUES ('9', '水果', '3');
INSERT INTO `goods_type` VALUES ('10', '化妆品', null);
INSERT INTO `goods_type` VALUES ('11', '虚拟产品', null);
INSERT INTO `goods_type` VALUES ('12', '测试类型', '2');
INSERT INTO `goods_type` VALUES ('15', '测试类型3', '2');

-- ----------------------------
-- Table structure for `order_detail`
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `orderid` bigint(20) DEFAULT NULL COMMENT '对应订单',
  `productid` bigint(20) DEFAULT NULL COMMENT '产品',
  `count` int(11) DEFAULT NULL COMMENT '数量',
  `price` decimal(20,2) DEFAULT NULL COMMENT '每件单价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='订单详情';

-- ----------------------------
-- Records of order_detail
-- ----------------------------
INSERT INTO `order_detail` VALUES ('1', '1', '1002', '2', '145.00');
INSERT INTO `order_detail` VALUES ('2', '1', '1003', '1', '210.00');
INSERT INTO `order_detail` VALUES ('3', '2', '1', '1', '134.00');
INSERT INTO `order_detail` VALUES ('4', '2', '1002', '1', '145.00');
INSERT INTO `order_detail` VALUES ('5', '2', '1003', '1', '178.00');

-- ----------------------------
-- Table structure for `order_info`
-- ----------------------------
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `mobile` varchar(20) DEFAULT NULL COMMENT '收件电话',
  `address` varchar(100) DEFAULT NULL COMMENT '收件地址',
  `contact_name` varchar(20) DEFAULT NULL COMMENT '收件人',
  `make_date` datetime DEFAULT NULL COMMENT '订单下单日期',
  `pay_date` datetime DEFAULT NULL COMMENT '订单付款日期',
  `total_price` decimal(20,2) DEFAULT NULL COMMENT '订单总价',
  `user_id` bigint(20) DEFAULT NULL COMMENT '订单用户',
  `state` smallint(6) DEFAULT NULL COMMENT '订单状态，0表示下单，1表示已付款，2表示申请退款中，3表示已经退款',
  `remark` varchar(300) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='订单';

-- ----------------------------
-- Records of order_info
-- ----------------------------
INSERT INTO `order_info` VALUES ('1', '15888888888', '湖南省长沙市岳麓区麓谷', 'Jason', '2019-09-22 12:22:00', '2019-09-22 13:20:00', '543.00', '1', '1', '测试');
INSERT INTO `order_info` VALUES ('2', '15004124156', '福建泉州', '航', '2019-09-23 21:23:00', '2019-09-23 22:30:00', '566.00', '1', '1', '测试');

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) NOT NULL,
  `password` varchar(64) NOT NULL,
  `state` smallint(6) DEFAULT '0',
  `id_card_no` char(18) DEFAULT NULL COMMENT '身份证号码',
  `real_name` varchar(45) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '111111', '0', '430114125142414145', '张三丰', null, null);
INSERT INTO `sys_user` VALUES ('2', 'user1', '111111', '0', '43011412514241414X', '李四麻子', null, null);
INSERT INTO `sys_user` VALUES ('3', 'user2', '000000', '0', 'X3011412514241414x', '小明张', null, null);
INSERT INTO `sys_user` VALUES ('4', 'user3', '000000', '0', '43011412514241414', '张光明', null, null);

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(30) NOT NULL COMMENT '用户名',
  `user_pwd` varchar(30) NOT NULL COMMENT '主键',
  `user_status` int(11) DEFAULT '0' COMMENT '用户状态，0表示正常，1表示禁用',
  `user_delete` int(11) DEFAULT NULL COMMENT '1表示已经删除，0表示正常',
  `user_point` int(11) DEFAULT NULL COMMENT '用户积分',
  `user_birthday` datetime DEFAULT NULL COMMENT '用户积分',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8 COMMENT='用户信息';

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', 'user1', '111111', '1', '0', '0', '2019-11-05 21:45:44');
INSERT INTO `user_info` VALUES ('2', 'user2', '111111', '0', '0', '0', '2000-08-04 00:00:00');
INSERT INTO `user_info` VALUES ('3', 'zhangqin', '000000', '0', '0', '0', '1999-09-09 00:00:00');
INSERT INTO `user_info` VALUES ('14', 'mybatis测试数据', '123456', '0', '0', '0', '2019-11-05 21:13:02');
INSERT INTO `user_info` VALUES ('15', 'mybatis测试数据', '123456', '0', '0', '0', '2019-11-05 21:13:20');
INSERT INTO `user_info` VALUES ('17', 'mybatis测试数据', '123456', '0', '0', '0', '2019-11-05 21:17:54');
INSERT INTO `user_info` VALUES ('18', 'test2', '000', '0', '0', '0', '2019-11-12 16:28:22');
INSERT INTO `user_info` VALUES ('19', 'test2', '000', '0', '0', '0', '2019-11-12 16:28:42');
INSERT INTO `user_info` VALUES ('20', 'spring-jdbc添加数据', '000000', '0', '0', '0', '2019-11-12 21:57:28');
INSERT INTO `user_info` VALUES ('21', 'spring-jdbc添加数据', '000000', '0', '0', '0', '2019-11-12 21:59:56');
INSERT INTO `user_info` VALUES ('22', 'spring-jdbc添加数据', '000000', '0', '0', '0', '2019-11-12 22:02:17');
INSERT INTO `user_info` VALUES ('23', 'spring-jdbc添加数据', '000000', '0', '0', '0', '2019-11-12 22:09:30');
INSERT INTO `user_info` VALUES ('24', 'spring-jdbc添加数据', '000000', '0', '0', '0', '2019-11-12 22:10:09');
INSERT INTO `user_info` VALUES ('31', '批量添加测试2', '00000', '0', '0', '0', null);
INSERT INTO `user_info` VALUES ('32', '批量添加测试1', '00000', '0', '0', '0', null);
