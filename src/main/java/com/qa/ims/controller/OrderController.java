package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {

	public static final Logger LOGGER = LogManager.getLogger();

	private OrderDAO orderDAO;
	private Utils utils;

	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}

	/**
	 * Reads all orders to the logger
	 */
	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}

	/**
	 * Creates an order by taking in user input
	 */
	@Override
	public Order create() {
		LOGGER.info("Please enter the name of the order");
		String order_name = utils.getString();
		LOGGER.info("Please enter the price of the order");
		Float price = utils.getDouble().floatValue();
		LOGGER.info("Please enter the date that the order was placed");
		String date_placed = utils.getString();
		LOGGER.info("Please enter the status of the order");
		String order_status = utils.getString();
		Order order = orderDAO.create(new Order(order_name, order_status, date_placed, price));
		LOGGER.info("Order created");
		return order;
	}

	/**
	 * Updates an existing order by taking in user input
	 */
	@Override
	public Order update() {
		LOGGER.info("Please enter the id of the order that you would like to update");
		Long order_id = utils.getLong();
		LOGGER.info("Please enter the name of the order that you would like to update");
		String order_name = utils.getString();
		LOGGER.info("Please enter the status of the order that you would like to update");
		String order_status = utils.getString();
		LOGGER.info("Please enter the updated date that the order was placed");
		String date_placed = utils.getString();
		LOGGER.info("Please enter the price of the order that you would like to update");
		Float price = utils.getDouble().floatValue();
		Order order = orderDAO.update(new Order(order_id, order_name, date_placed, order_status, price));
		LOGGER.info("Order Updated");
		return order;
	}

	/**
	 * Deletes an existing order by the id of the order
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order that you would like to delete");
		Long order_id = utils.getLong();
		return orderDAO.delete(order_id);
	}

}
