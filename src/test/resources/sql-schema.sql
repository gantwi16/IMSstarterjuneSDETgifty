drop schema ims;
CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`items`(
	`item_id` INT(11) NOT NULL AUTO_INCREMENT,
	`item_name` VARCHAR(30) NOT NULL,
	`price` DECIMAL(4,2) NOT NULL,
	PRIMARY KEY(`item_id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`orders`(
	`order_id` INT(11) NOT NULL AUTO_INCREMENT,
	`order_name` VARCHAR(40) NOT NULL,
	`order_status` VARCHAR(40) NOT NULL,
    `date_placed` DATETIME(8) NOT NULL,
	`price` DECIMAL(4,2) NOT NULL,
	PRIMARY KEY(`order_id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`orders_items`(
	`orders_item_id` INT(11) NOT NULL,
    `orders_order_id` INT(11) NOT NULL,
    FOREIGN KEY(`orders_order_id`) REFERENCES `orders`(`order_id`),
    FOREIGN KEY(`orders_items_id`) REFERENCES `items`(`item_id`)
    );