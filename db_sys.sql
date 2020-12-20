

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for carts
-- ----------------------------
DROP TABLE IF EXISTS `carts`;
CREATE TABLE `carts` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `uid` int(11) DEFAULT NULL COMMENT '用户id',
  `gid` int(11) DEFAULT NULL COMMENT '商品id',
  `quantity` int(11) DEFAULT NULL COMMENT '数量',
  `price` double DEFAULT NULL COMMENT '单价',
  `isdel` int(11) DEFAULT NULL COMMENT '删除标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of carts
-- ----------------------------
INSERT INTO `carts` VALUES ('7', '2', '1', '1', '10', '1');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `price` double(10,0) DEFAULT NULL COMMENT '价格',
  `stock` varchar(255) DEFAULT NULL COMMENT '库存',
  `content` varchar(1000) DEFAULT NULL COMMENT '描述',
  `bak1` varchar(255) DEFAULT NULL COMMENT '备用字段1',
  `bak2` varchar(255) DEFAULT NULL COMMENT '备用字段2',
  `bak3` varchar(255) DEFAULT NULL COMMENT '备用字段3',
  `bak4` varchar(255) DEFAULT NULL COMMENT '备用字段4',
  `bak5` varchar(255) DEFAULT NULL COMMENT '备用字段5',
  `bak6` varchar(255) DEFAULT NULL COMMENT '备用字段6',
  `bak7` varchar(255) DEFAULT NULL COMMENT '备用字段7',
  `bak8` varchar(255) DEFAULT NULL COMMENT '备用字段8',
  `isdel` int(11) DEFAULT NULL COMMENT '删除标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '产品1', '10', '95', '', '1.jpg', null, null, null, null, null, null, null, '0');
INSERT INTO `goods` VALUES ('2', '产品2', '8', '100', '<p>产品2</p>', '2.jpg', null, null, null, null, null, null, null, '0');
INSERT INTO `goods` VALUES ('3', '产品3', '8', '99', '产品3', '3.jpg', null, null, null, null, null, null, null, '0');
INSERT INTO `goods` VALUES ('4', '产品4', '8', '99', '产品4', '4.jpg', null, null, null, null, null, null, null, '0');
INSERT INTO `goods` VALUES ('5', '产品5', '8', '100', '产品5', '5.jpg', null, null, null, null, null, null, null, '0');
INSERT INTO `goods` VALUES ('6', '产品6', '8', '96', '产品6', '6.jpg', null, null, null, null, null, null, null, '0');

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `uid` int(11) DEFAULT NULL COMMENT '用户',
  `gid` int(11) DEFAULT NULL COMMENT '评价对象',
  `type` int(11) DEFAULT NULL COMMENT '评价类型',
  `title` varchar(255) DEFAULT NULL COMMENT ' 主题',
  `content` varchar(1000) DEFAULT NULL COMMENT '内容',
  `optime` varchar(255) DEFAULT NULL COMMENT '留言时间',
  `isdel` int(11) DEFAULT NULL COMMENT '删除标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('48', '1', null, '1', '留言测试', '<p>留言测试</p>', '2020-04-03 11:38:21', '0');
INSERT INTO `message` VALUES ('49', '1', null, '1', '测试', '<p>大</p>', '2020-04-03 12:01:38', '0');
INSERT INTO `message` VALUES ('50', '1', '1', '2', null, '不错的东西', '2020-04-03 17:31:54', '0');
INSERT INTO `message` VALUES ('51', '2', '1', '2', null, '再次评价', '2020-04-03 17:46:30', '0');
INSERT INTO `message` VALUES ('52', '2', null, '1', '我来留言', '<p>我来留言我来留言我来留言</p>', '2020-04-03 17:46:56', '0');
INSERT INTO `message` VALUES ('53', '0', null, '1', '游客留言', '<p>游客留言</p>', '2020-04-04 11:23:55', '0');

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `content` varchar(1000) DEFAULT NULL COMMENT '内容',
  `optime` varchar(255) DEFAULT NULL COMMENT '时间',
  `isdel` int(11) DEFAULT NULL COMMENT '删除标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice
-- ----------------------------
INSERT INTO `notice` VALUES ('1', '测试公告', '<p>公告内容2</p>', '2020-04-02 20:15:44', '0');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `uid` int(11) DEFAULT NULL COMMENT '用户id',
  `orderno` varchar(255) DEFAULT NULL COMMENT '订单号',
  `price` double DEFAULT NULL COMMENT '订单价格',
  `optime` varchar(255) DEFAULT NULL COMMENT '订单时间',
  `status` varchar(255) DEFAULT NULL COMMENT '状态',
  `bak1` varchar(255) DEFAULT NULL COMMENT '备用字段1',
  `bak2` varchar(255) DEFAULT NULL COMMENT '备用字段2',
  `bak3` varchar(255) DEFAULT NULL COMMENT '备用字段3',
  `isdel` int(11) DEFAULT NULL COMMENT '删除标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('1', '2', '02212727498', '320', '2020-04-02 21:27:27', '已确认', null, null, null, '0');
INSERT INTO `orders` VALUES ('2', '2', '04130358551', '16', '2020-04-04 13:03:58', '已确认', null, null, null, '0');
INSERT INTO `orders` VALUES ('3', '2', '04131128844', '56', '2020-04-04 13:11:28', '已确认', null, null, null, '0');
INSERT INTO `orders` VALUES ('4', '2', '04132451247', '24', '2020-04-04 13:24:51', '已确认', null, null, null, '0');
INSERT INTO `orders` VALUES ('5', '2', '04133325109', '16', '2020-04-04 13:33:25', '已确认', null, null, null, '0');
INSERT INTO `orders` VALUES ('6', '2', '10101851287', '80', '2020-05-10 10:18:51', '已确认', null, null, null, '0');

-- ----------------------------
-- Table structure for ordersdetail
-- ----------------------------
DROP TABLE IF EXISTS `ordersdetail`;
CREATE TABLE `ordersdetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `oid` int(11) DEFAULT NULL COMMENT '订单id',
  `gid` int(11) DEFAULT NULL COMMENT '商品id',
  `quantity` int(11) DEFAULT NULL COMMENT '数量',
  `price` double DEFAULT NULL COMMENT '小计',
  `bak1` varchar(255) DEFAULT NULL COMMENT '备用字段1',
  `bak2` varchar(255) DEFAULT NULL COMMENT '备用字段2',
  `bak3` varchar(255) DEFAULT NULL COMMENT '备用字段3',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ordersdetail
-- ----------------------------
INSERT INTO `ordersdetail` VALUES ('1', '1', '1', '4', '10', '已归还', null, null);
INSERT INTO `ordersdetail` VALUES ('2', '2', '6', '2', '8', '已归还', null, null);
INSERT INTO `ordersdetail` VALUES ('3', '3', '4', '4', '8', '已归还', null, null);
INSERT INTO `ordersdetail` VALUES ('4', '3', '3', '3', '8', '已归还', null, null);
INSERT INTO `ordersdetail` VALUES ('5', '4', '6', '3', '8', '已归还', null, null);
INSERT INTO `ordersdetail` VALUES ('6', '5', '6', '2', '8', '已归还', null, null);
INSERT INTO `ordersdetail` VALUES ('7', '6', '1', '8', '10', '未归还', null, null);

-- ----------------------------
-- Table structure for reply
-- ----------------------------
DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `uid` int(11) DEFAULT NULL COMMENT '用户',
  `mid` int(11) DEFAULT NULL COMMENT '消息',
  `content` varchar(1000) DEFAULT NULL COMMENT '内容',
  `optime` varchar(255) DEFAULT NULL COMMENT '回复时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reply
-- ----------------------------
INSERT INTO `reply` VALUES ('9', '1', '47', null, '2020-04-03 12:03:25');
INSERT INTO `reply` VALUES ('10', '1', '47', null, '2020-04-03 12:08:24');
INSERT INTO `reply` VALUES ('12', '1', '50', 'wwww', '2020-04-03 17:37:24');
INSERT INTO `reply` VALUES ('13', '2', '50', '我来回复', '2020-04-03 17:40:25');
INSERT INTO `reply` VALUES ('14', '2', '50', 'sss', '2020-05-10 10:11:40');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `phone` varchar(255) DEFAULT NULL COMMENT '电话',
  `role` int(11) DEFAULT NULL COMMENT '身份',
  `bak1` varchar(255) DEFAULT NULL COMMENT '备用字段1',
  `bak2` varchar(255) DEFAULT NULL COMMENT '备用字段2',
  `bak3` varchar(255) DEFAULT NULL COMMENT '备用字段3',
  `bak4` varchar(255) DEFAULT NULL COMMENT '备用字段4',
  `bak5` varchar(255) DEFAULT NULL COMMENT '备用字段5',
  `bak6` varchar(255) DEFAULT NULL COMMENT '备用字段6',
  `bak7` varchar(255) DEFAULT NULL COMMENT '备用字段7',
  `bak8` varchar(255) DEFAULT NULL COMMENT '备用字段8',
  `bak9` varchar(255) DEFAULT NULL,
  `bak10` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL COMMENT '状态',
  `isdel` int(11) DEFAULT NULL COMMENT '删除标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('0', '游客', '游客', '游客', '男', '18', '13367890900', '2', null, null, null, null, null, null, null, null, null, null, '已审核', '1');
INSERT INTO `users` VALUES ('1', 'admin', 'admin', '管理员', '男', '31', '18767564535', '0', null, null, null, null, null, null, null, null, null, null, '已审核', '0');
INSERT INTO `users` VALUES ('2', 'u1', '123', '张三', '男', '22', '13456789095', '1', '', '', '', '', '', '', '', '', null, '', '已审核', '0');
INSERT INTO `users` VALUES ('3', 'u02', '123', '李四', '男', '22', '13367890900', '1', null, null, null, null, null, null, null, null, null, null, '未审核', '0');
INSERT INTO `users` VALUES ('6', 'u3', 'u3', '张三', '男', '21', '13456789093', '1', null, null, null, null, null, null, null, null, null, null, '已审核', '0');
INSERT INTO `users` VALUES ('7', 'u4', 'u4', 'u4', '男', '21', '13367890900', '1', null, null, null, null, null, null, null, null, null, null, '已审核', '0');
