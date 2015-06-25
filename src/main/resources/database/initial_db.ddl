-- ###############
--    create MySQL database , if need create, cancel the comment
-- ###############
-- create database if not exists spring_oauth default character set utf8;
-- use spring_oauth set default character = utf8;

-- ###############
--    grant privileges  to spring_oauth/spring_oauth
-- ###############
-- GRANT ALL PRIVILEGES ON spring_oauth.* TO spring_oauth@localhost IDENTIFIED BY "spring_oauth";

-- ###############


-- ###############
-- Domain:  Privilege
-- ###############
Drop table  if exists user_privilege;
CREATE TABLE `user_privilege` (
  `user_id` int(11),
  `privilege` varchar(255)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

