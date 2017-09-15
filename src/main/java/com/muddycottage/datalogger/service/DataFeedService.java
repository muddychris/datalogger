package com.muddycottage.datalogger.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.muddycottage.datalogger.dto.DataFeedDto;
import com.muddycottage.datalogger.model.DataItem;

@Service
public class DataFeedService {

	private final Logger logger = LoggerFactory.getLogger(DataFeedService.class) ;
	
	public void processDataFeed(DataFeedDto dataFeedDto) {

		// convert the list of data items into model items to write to the DB

		List<DataItem> dataItemList = dataFeedDto.toModel();
		if (dataItemList != null)
			for (DataItem dataItem : dataItemList) {
				// / now write via the repo
				logger.info("DATA : {}", dataItem);
			}
	}

}
