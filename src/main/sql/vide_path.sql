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

-- ----------------------------
-- Records of vide_path
-- ----------------------------
INSERT INTO `vide_path` VALUES ('746', 'StartMenu_Win10.mp4', 'mp4', 'C:\\Program Files (x86)\\Microsoft Office\\root\\fre\\StartMenu_Win10.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('747', 'StartMenu_Win10_RTL.mp4', 'mp4', 'C:\\Program Files (x86)\\Microsoft Office\\root\\fre\\StartMenu_Win10_RTL.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('748', 'StartMenu_Win8.mp4', 'mp4', 'C:\\Program Files (x86)\\Microsoft Office\\root\\fre\\StartMenu_Win8.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('749', 'StartMenu_Win8_RTL.mp4', 'mp4', 'C:\\Program Files (x86)\\Microsoft Office\\root\\fre\\StartMenu_Win8_RTL.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('751', '24F8D6D6BD6E96B074FC130FC70E97F6.mp4', 'mp4', 'C:\\Users\\fengtiepeng\\Documents\\Tencent Files\\598705052\\Video\\24F8D6D6BD6E96B074FC130FC70E97F6.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('752', '2BC4049986F05441D3A075B4B4D2FFD5.mp4', 'mp4', 'C:\\Users\\fengtiepeng\\Documents\\Tencent Files\\598705052\\Video\\2BC4049986F05441D3A075B4B4D2FFD5.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('753', '2D97FB640A42231077D8C5EF2155F1E4.mp4', 'mp4', 'C:\\Users\\fengtiepeng\\Documents\\Tencent Files\\598705052\\Video\\2D97FB640A42231077D8C5EF2155F1E4.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('754', '3F237776BA6312128DEFBE772AC5D7EE.mp4', 'mp4', 'C:\\Users\\fengtiepeng\\Documents\\Tencent Files\\598705052\\Video\\3F237776BA6312128DEFBE772AC5D7EE.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('755', '4398CA065CB4A97D328971BEFA85F744.mp4', 'mp4', 'C:\\Users\\fengtiepeng\\Documents\\Tencent Files\\598705052\\Video\\4398CA065CB4A97D328971BEFA85F744.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('756', '4AE52AC3E927258F9D0E6CEACAE48801.mp4', 'mp4', 'C:\\Users\\fengtiepeng\\Documents\\Tencent Files\\598705052\\Video\\4AE52AC3E927258F9D0E6CEACAE48801.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('757', '6EA516468CB3F00FB0F0C10FD3296C4C.mp4', 'mp4', 'C:\\Users\\fengtiepeng\\Documents\\Tencent Files\\598705052\\Video\\6EA516468CB3F00FB0F0C10FD3296C4C.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('758', 'E706204A9E255784079E9B151C482819.mp4', 'mp4', 'C:\\Users\\fengtiepeng\\Documents\\Tencent Files\\598705052\\Video\\E706204A9E255784079E9B151C482819.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('759', 'EE028DEACBABB0A182197F38071BD8E3.mp4', 'mp4', 'C:\\Users\\fengtiepeng\\Documents\\Tencent Files\\598705052\\Video\\EE028DEACBABB0A182197F38071BD8E3.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('760', 'F928E7095F3CA7F5065529D0881E595A.mp4', 'mp4', 'C:\\Users\\fengtiepeng\\Documents\\Tencent Files\\598705052\\Video\\F928E7095F3CA7F5065529D0881E595A.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('761', 'Clip_1080_5sec_10mbps_h264.mp4', 'mp4', 'C:\\Windows\\Performance\\WinSAT\\Clip_1080_5sec_10mbps_h264.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('762', 'Clip_480_5sec_6mbps_h264.mp4', 'mp4', 'C:\\Windows\\Performance\\WinSAT\\Clip_480_5sec_6mbps_h264.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('763', 'OOBE_Oasis_Env_BG_01_compressed.mp4', 'mp4', 'C:\\Windows\\SystemApps\\Microsoft.Windows.HolographicFirstRun_cw5n1h2txyewy\\Assets\\OOBE_Oasis_Env_BG_01_compressed.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('764', 'OOBE_Oasis_Env_BG_02_compressed.mp4', 'mp4', 'C:\\Windows\\SystemApps\\Microsoft.Windows.HolographicFirstRun_cw5n1h2txyewy\\Assets\\OOBE_Oasis_Env_BG_02_compressed.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('835', '神奇的中医.mp4', 'mp4', 'F:\\ftpfIle\\move\\神奇的中医.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('836', '173110248.mp4', 'mp4', 'F:\\迅雷下载\\173110248.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('968', 'huiheheqin.mp4', 'mp4', 'E:\\游戏\\剑侠情缘三\\JX3\\bin\\zhcn\\ui\\video\\huiheheqin.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('969', 'jx3bd.mp4', 'mp4', 'E:\\游戏\\剑侠情缘三\\JX3\\bin\\zhcn\\ui\\video\\jx3bd.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('970', 'JX3CG.mp4', 'mp4', 'E:\\游戏\\剑侠情缘三\\JX3\\bin\\zhcn\\ui\\video\\JX3CG.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('971', 'JX3CG04.mp4', 'mp4', 'E:\\游戏\\剑侠情缘三\\JX3\\bin\\zhcn\\ui\\video\\JX3CG04.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('972', 'jx3cgm.mp4', 'mp4', 'E:\\游戏\\剑侠情缘三\\JX3\\bin\\zhcn\\ui\\video\\jx3cgm.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('973', 'leizhan.mp4', 'mp4', 'E:\\游戏\\剑侠情缘三\\JX3\\bin\\zhcn\\ui\\video\\leizhan.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('974', 'shoufuliangjing.mp4', 'mp4', 'E:\\游戏\\剑侠情缘三\\JX3\\bin\\zhcn\\ui\\video\\shoufuliangjing.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('975', 'shuimohuajuan.mp4', 'mp4', 'E:\\游戏\\剑侠情缘三\\JX3\\bin\\zhcn\\ui\\video\\shuimohuajuan.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('976', 'ContactsAnim.mp4', 'mp4', 'D:\\AndroidStudio\\docs\\design\\material\\videos\\ContactsAnim.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('977', 'scroll_index.mp4', 'mp4', 'D:\\AndroidStudio\\docs\\design\\media\\scroll_index.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('978', 'scroll_indicator.mp4', 'mp4', 'D:\\AndroidStudio\\docs\\design\\media\\scroll_indicator.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('979', 'swipe_tabs.mp4', 'mp4', 'D:\\AndroidStudio\\docs\\design\\media\\swipe_tabs.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('980', 'tabs_scrolly.mp4', 'mp4', 'D:\\AndroidStudio\\docs\\design\\media\\tabs_scrolly.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('981', 'touch_feedback.mp4', 'mp4', 'D:\\AndroidStudio\\docs\\design\\media\\touch_feedback.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('982', 'snackbar_button_move.mp4', 'mp4', 'D:\\AndroidStudio\\docs\\images\\training\\snackbar\\snackbar_button_move.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('983', 'transition_sample_video.mp4', 'mp4', 'D:\\AndroidStudio\\docs\\images\\transitions\\transition_sample_video.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('984', 'anim_card_flip.mp4', 'mp4', 'D:\\AndroidStudio\\docs\\training\\animation\\anim_card_flip.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('985', 'anim_crossfade.mp4', 'mp4', 'D:\\AndroidStudio\\docs\\training\\animation\\anim_crossfade.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('987', 'anim_page_transformer_depth.mp4', 'mp4', 'D:\\AndroidStudio\\docs\\training\\animation\\anim_page_transformer_depth.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('989', 'anim_screenslide.mp4', 'mp4', 'D:\\AndroidStudio\\docs\\training\\animation\\anim_screenslide.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('992', 'swipe_original.mp4', 'mp4', 'D:\\AndroidStudio\\docs\\training\\swipe\\images\\swipe_original.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('993', '08150638q3zr.mp4', 'mp4', 'D:\\my project\\jeecms\\WebContent\\u\\cms\\www\\201610\\08150638q3zr.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('994', '101338015yhf.mp4', 'mp4', 'D:\\my project\\jeecms\\WebContent\\u\\cms\\www\\201610\\101338015yhf.mp4', 'http://192.168.1.23');
INSERT INTO `vide_path` VALUES ('995', '11111659rnpb.mp4', 'mp4', 'D:\\my project\\jeecms\\WebContent\\u\\cms\\www\\201610\\11111659rnpb.mp4', 'http://192.168.1.23');
