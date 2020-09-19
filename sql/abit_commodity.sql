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

 Date: 19/09/2020 15:19:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for abit_commodity
-- ----------------------------
DROP TABLE IF EXISTS `abit_commodity`;
CREATE TABLE `abit_commodity` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '商品名称',
  `description` longtext COLLATE utf8_bin COMMENT '商品描述',
  `price` double(10,2) DEFAULT NULL COMMENT '商品价格',
  `rest_count` int(255) DEFAULT NULL COMMENT '商品剩余件数',
  `create_time` datetime DEFAULT NULL COMMENT '数据创建时间',
  `picture` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '商品描述图片',
  `cate_id` bigint(11) DEFAULT NULL COMMENT '所属分类',
  `status` int(255) DEFAULT NULL COMMENT '0 未启用\n1 启用\n2 删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='商品表';

-- ----------------------------
-- Records of abit_commodity
-- ----------------------------
BEGIN;
INSERT INTO `abit_commodity` VALUES (1, '华为MateBook D15全面屏轻薄笔记本', '<p>华为MateBook D15全面屏轻薄笔记本本电脑多屏协同便携超级快充(十代酷睿 i5 8G+512G独显)灰色</p>', 4699.00, 99, '2020-09-18 11:53:54', 'https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg', 2, 0);
INSERT INTO `abit_commodity` VALUES (2, '牧高笛 公园休闲大空间防风3-4人三季三秒速开全自动速搭零动帐篷 EX19561002 天空蓝', '<p><strong style=\"color: rgb(102, 102, 102);\">牧高笛 公园休闲大空间防风3-4人三季三秒速开全自动速搭零动帐篷 EX19561002 天空蓝</strong></p><p><span class=\"ql-cursor\">﻿</span>&nbsp;<strong>厂家服务</strong></p><p>本产品全国联保，享受三包服务，质保期为：15天质保</p><p>&nbsp;<strong>京东承诺</strong></p><p>京东平台卖家销售并发货的商品，由平台卖家提供发票和相应的售后服务。请您放心购买！</p><p>注：因厂家会在没有任何提前通知的情况下更改产品包装、产地或者一些附件，本司不能确保客户收到的货物与商城图片、产地、附件说明完全一致。只能确保为原厂正货！并且保证与当时市场上同样主流新品一致。若本商城没有及时更新，请大家谅解！</p><p><strong>正品行货</strong></p><p>京东商城向您保证所售商品均为正品行货，京东自营商品开具机打发票或电子发票。</p><p><strong>全国联保</strong></p><p>凭质保证书及京东商城发票，可享受全国联保服务（奢侈品、钟表除外；奢侈品、钟表由京东联系保修，享受法定三包售后服务），与您亲临商场选购的商品享受相同的质量保证。京东商城还为您提供具有竞争力的商品价格和<a href=\"https://help.jd.com/help/question-892.html\" rel=\"noopener noreferrer\" target=\"_blank\" style=\"color: rgb(0, 90, 160);\">运费政策</a>，请您放心购买！</p><p><br></p><p>注：因厂家会在没有任何提前通知的情况下更改产品包装、产地或者一些附件，本司不能确保客户收到的货物与商城图片、产地、附件说明完全一致。只能确保为原厂正货！并且保证与当时市场上同样主流新品一致。若本商城没有及时更新，请大家谅解！</p><p><strong>无忧退货</strong></p><p>客户购买京东自营商品7日内（含7日，自客户收到商品之日起计算），在保证商品完好的前提下，可无理由退货。（部分商品除外，详情请见各商品细则）</p>', 279.00, 99, '2020-09-19 13:52:00', 'https://img13.360buyimg.com/n1/jfs/t1/125143/20/10041/85757/5f3b724cEbe2b34e2/8111755854cc57d2.jpg', 3, 0);
INSERT INTO `abit_commodity` VALUES (3, '微星(msi)冲锋坦克2 GL65 15.6英寸游戏笔记本电脑(十代i7 16G 512G SSD RTX2070Super 144Hz 高色域)', '<ul><li>品牌：&nbsp;<a href=\"https://list.jd.com/list.html?cat=670,671,1105&amp;ev=exbrand_17443\" rel=\"noopener noreferrer\" target=\"_blank\" style=\"color: rgb(94, 105, 173);\">微星（MSI）</a></li><li>商品名称：微星冲锋坦克2 GL65游戏本</li><li>商品编号：100014056792</li><li>商品毛重：4.46kg</li><li>商品产地：中国大陆</li><li>显卡类别：发烧级游戏光线追踪显卡</li><li>分辨率：全高清屏（1920×1080）</li><li>类型：游戏笔记本</li><li>优选服务：上门服务，两年质保</li><li>厚度：20.0mm以上</li><li>显卡芯片供应商：NVIDIA</li><li>屏幕尺寸：15.0英寸-15.9英寸</li><li>系列：微星-冲锋坦克 GL系列</li><li>裸机重量：2-2.5kg</li><li>屏幕色域：72%NTSC</li><li>机械硬盘：无机械硬盘</li><li>处理器：Intel i7</li><li>屏幕刷新率：144HZ</li><li>待机时长：小于5小时</li><li>内存容量：16G</li><li>显卡型号：2070S</li><li>系统：windows 10 不带Office</li><li>固态硬盘（SSD）：512GB</li><li>颜色：黑色</li></ul><p><br></p>', 10499.00, 99, '2020-09-19 13:55:18', 'https://img12.360buyimg.com/n1/s450x450_jfs/t1/115109/14/11828/189046/5f06b7b4E5022ace4/74dc04a9613ef66f.jpg', 4, 0);
INSERT INTO `abit_commodity` VALUES (4, '达尔优（dareu）DK100 机械键盘 有线键盘 游戏键盘 87键 无光 双色注塑 电脑键盘 黑色黑轴', '<p><strong style=\"color: rgb(102, 102, 102);\">达尔优（dareu）DK100 机械键盘 有线键盘 游戏键盘 87键 无光 双色注塑 电脑键盘 黑色黑轴</strong></p><ul><li><span class=\"ql-cursor\">﻿</span>品牌：&nbsp;<a href=\"https://list.jd.com/list.html?cat=670,686,689&amp;ev=exbrand_42796\" rel=\"noopener noreferrer\" target=\"_blank\" style=\"color: rgb(94, 105, 173);\">达尔优</a></li><li>商品名称：达尔优DK87</li><li>商品编号：2229870</li><li>商品毛重：1.15kg</li><li>商品产地：中国大陆</li><li>游戏性能：入门级</li><li>类型：机械键盘</li><li>背光效果：无光</li><li>数字键盘：有数字键盘</li><li>适用场景：游戏</li><li>轴体类型：黑轴</li><li>连接方式：有线</li><li>颜色：黑色</li></ul><p><br></p>', 99.00, 87, '2020-09-19 13:57:32', 'https://img10.360buyimg.com/n1/s450x450_jfs/t1/143394/15/5614/103367/5f39f25aE163f904a/57c2fa3f30739956.jpg', 4, 0);
INSERT INTO `abit_commodity` VALUES (5, '太阳伞', '<p>太阳伞太阳伞太阳伞太阳伞</p>', 12.00, 22, '2020-09-19 13:59:52', 'https://img11.360buyimg.com/n1/jfs/t1/102603/32/17539/98698/5e8864a0E1a275d05/33d107ab460b2d8d.jpg', 3, 1);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
