package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.ItemController;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)
public class ItemControllerTest {

	@Mock
	private Utils utils;

	@Mock
	private ItemDAO dao;

	@InjectMocks
	private ItemController controller;

	@Test
	public void testCreate() {
		final String item_name = "Banana Smoothie";
		final Float price = (float) 2.50;
		final Item created = new Item(item_name, price);

		Mockito.when(utils.getString()).thenReturn(item_name);
		Mockito.when(utils.getDouble().floatValue()).thenReturn(price);
		Mockito.when(dao.create(created)).thenReturn(created);

		assertEquals(created, controller.create());

		Mockito.verify(utils, Mockito.times(2)).getString();
		Mockito.verify(utils, Mockito.times(2)).getDouble().floatValue();
		Mockito.verify(dao, Mockito.times(1)).create(created);
	}
	
	@Test
	public void testReadAll() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(1L, "Protein Shake", (float) 2.29));

		Mockito.when(dao.readAll()).thenReturn(items);

		assertEquals(items, controller.readAll());

		Mockito.verify(dao, Mockito.times(1)).readAll();
	}
	
	@Test
	public void testUpdate() {
		Item updated = new Item(1L, "Pear", (float) 0.28);

		Mockito.when(this.utils.getLong()).thenReturn(1L);
		Mockito.when(this.utils.getString()).thenReturn(updated.getItem_name());
		Mockito.when(this.dao.update(updated)).thenReturn(updated);

		assertEquals(updated, this.controller.update());

		Mockito.verify(this.utils, Mockito.times(1)).getLong();
		Mockito.verify(this.utils, Mockito.times(2)).getString();
		Mockito.verify(this.utils, Mockito.times(2)).getDouble().floatValue();
		Mockito.verify(this.dao, Mockito.times(1)).update(updated);
	}
	
	@Test
	public void testDelete() {
		final long item_id = 1L;

		Mockito.when(utils.getLong()).thenReturn(item_id);
		Mockito.when(dao.delete(item_id)).thenReturn(1);

		assertEquals(1L, this.controller.delete());

		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).delete(item_id);
	}
}
