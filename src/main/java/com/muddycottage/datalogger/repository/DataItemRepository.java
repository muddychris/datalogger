package com.muddycottage.datalogger.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.muddycottage.datalogger.model.DataItem;

@Repository
public interface DataItemRepository extends CrudRepository<DataItem, Long>{

	List<DataItem> findAll () ;
	void flush() ;
}
