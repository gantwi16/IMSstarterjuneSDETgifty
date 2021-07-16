INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('Bukayo', 'Saka');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('Marcus', 'Rashford');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('Jadon', 'Sancho');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('Raheem', 'Sterling');

INSERT INTO `testingims`.`customers` (`first_name`, `surname`) VALUES ('Raheem', 'Sterling');
INSERT INTO `testingims`.`customers` (`first_name`, `surname`) VALUES ('Bukayo', 'Saka');
INSERT INTO `testingims`.`items`(`item_name`, `price`) VALUES ('Gym Socks', '15.99');
INSERT INTO `testingims`.`items`(`item_name`, `price`) VALUES ('Apple', '0.15');
INSERT INTO `testingims`.`items`(`item_name`, `price`) VALUES ('Water', '1.50');
INSERT INTO `testingims`.`items`(`item_name`, `price`) VALUES ('Protein Shake', '2.29');
INSERT INTO `testingims`.`orders` (`order_name`, `order_status`, `date_placed`, `price`) VALUES ('BS7', 'Processing', '20210712', '3.79');
INSERT INTO `testingims`.`orders_items` (`item_id`, `order_id`) VALUES (1,1);

