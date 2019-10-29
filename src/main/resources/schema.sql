CREATE TABLE `destination_candidates` (
  `registration_order` int(11) NOT NULL,
  `user_code` varchar(16) NOT NULL,
  `destination_id` varchar(16) NOT NULL,
  `destination_name` varchar(64) DEFAULT NULL,
  `destination_category_id` varchar(16) DEFAULT NULL,
  `destination_region_id` varchar(16) DEFAULT NULL,
  `destination_order` int(11) DEFAULT NULL,
  `visit_count` int(11) DEFAULT NULL,
  `evaluation_value` int(11) DEFAULT NULL,
  `delete_flag` varchar(1) DEFAULT NULL,
  `create_at` DATETIME DEFAULT NULL,
  `update_at` DATETIME DEFAULT NULL
) ;
ALTER TABLE `destination_candidates`
  ADD PRIMARY KEY (`registration_order`,`user_code`,`destination_id`);


