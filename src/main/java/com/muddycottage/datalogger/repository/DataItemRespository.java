package com.muddycottage.datalogger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.muddycottage.datalogger.model.DataItem;

@Repository
public interface DataItemRespository extends JpaRepository<DataItem, Long>{

}
