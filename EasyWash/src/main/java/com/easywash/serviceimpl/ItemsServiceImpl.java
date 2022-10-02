package com.easywash.serviceimpl;



import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easywash.entity.Items;
import com.easywash.repository.ItemRepo;
import com.easywash.service.ItemService;
@Service
public class ItemsServiceImpl implements ItemService {
	@Autowired
	private ItemRepo itemRepo;

	@Override
	public Items saveItems(Items item) {
		return itemRepo.save(item);
	}

	

}
