package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

public class ItemController implements CrudController<Item>  {

		public static final Logger LOGGER = LogManager.getLogger();

		private ItemDAO itemDAO;
		private Utils utils;

		public ItemController(ItemDAO itemDAO, Utils utils) {
			super();
			this.itemDAO = itemDAO;
			this.utils = utils;
		}

		/**
		 * Reads all items to the logger
		 */
		@Override
		public List<Item> readAll() {
			List<Item> items = itemDAO.readAll();
			for (Item item : items) {
				LOGGER.info(item);
			}
			return items;
		}

		/**
		 * Creates an item by taking in user input
		 */
		@Override
		public Item create() {
			LOGGER.info("Please enter the name of the item");
			String itemName = utils.getString();
			LOGGER.info("Please enter the price of the item");
			Float price = utils.getDouble().floatValue();
			Item item = itemDAO.create(new Item(itemName, price));
			LOGGER.info("Item created");
			return item;
		}

		/**
		 * Updates an existing customer by taking in user input
		 */
		@Override
		public Item update() {
			LOGGER.info("Please enter the id of the item that you would like to update");
			Long itemID = utils.getLong();
			LOGGER.info("Please enter the name of the item that you would like to update");
			String itemName = utils.getString();
			LOGGER.info("Please enter the price of the item that you would like to update");
			Float price = utils.getDouble().floatValue();
			Item item = itemDAO.update(new Item(itemID, itemName, price));
			LOGGER.info("Item Updated");
			return item;
		}

		/**
		 * Deletes an existing customer by the id of the customer
		 * 
		 * @return
		 */
		@Override
		public int delete() {
			LOGGER.info("Please enter the id of the item that you would like to delete");
			Long itemID = utils.getLong();
			return itemDAO.delete(itemID);
		}

}
