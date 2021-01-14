DROP TABLE IF EXISTS `metric`;
CREATE TABLE `metric` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` varchar(64) NOT NULL COMMENT '域账号',
  `main_metric` varchar(64) NOT NULL COMMENT '主度量',
  `sub_metric` varchar(64) NOT NULL COMMENT '度量项',
  `metric_item` json DEFAULT NULL COMMENT '度量项内容',
  `creator` varchar(64) NOT NULL COMMENT '创建人',
  `modifier` varchar(64) NOT NULL COMMENT '修改人',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `is_deleted` char(1) NOT NULL DEFAULT 'n' COMMENT '逻辑删除',
  PRIMARY KEY (`id`),
  KEY `idx_username` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8mb4 COMMENT='度量表';