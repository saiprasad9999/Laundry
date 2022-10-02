package com.easywash.service;

import java.util.Set;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.easywash.entity.Items;


public interface ItemService {
	
	public Items saveItems(Items item);
}
