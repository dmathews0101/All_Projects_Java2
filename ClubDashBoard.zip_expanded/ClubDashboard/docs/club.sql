  
    create schema club;
    
    CREATE TABLE club.user (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) DEFAULT NULL,
  `last_name` varchar(30) DEFAULT NULL,
  `user_name` varchar(30) NOT NULL,
  `bg_color` varchar(30) NOT NULL,  
  `pwd` varchar(70) DEFAULT NULL,
  `img` varchar(70) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `user_name_UNIQUE` (`user_name`)
) ;