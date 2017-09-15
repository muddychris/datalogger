package com.muddycottage.datalogger.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.muddycottage.datalogger.model.DataItem;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.muddycottage.datalogger.utils.JsonDataDeserialiser;

public class DataFeedDto {
	private final Logger logger = LoggerFactory.getLogger(DataFeedDto.class) ;
	
	@JsonDeserialize(using = JsonDataDeserialiser.class)
	private LocalDateTime captureDate ;
	
	private String location ;

	private List<DataItemDto> dataList ;
	
	public DataFeedDto () {}

	public DataFeedDto(LocalDateTime captureDate, String location, List<DataItemDto> dataList) {
		super();
		this.captureDate = captureDate;
		this.location = location;
		this.dataList = dataList ;
	}

	public LocalDateTime getCaptureDate() {
		return captureDate;
	}

	public void setCaptureDate(LocalDateTime captureDate) {
		this.captureDate = captureDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public List<DataItemDto> getDataList() {
		return dataList;
	}

	public void setDataList(List<DataItemDto> dataList) {
		this.dataList = dataList;
	}

	@JsonIgnore
	public List<DataItem> toModel () {
		if ( (dataList == null) || (dataList.size() == 0) )
			return null ;
		
		List<DataItem> modelList = null ;
		
		for (DataItemDto dataItemDto : dataList) {
			if (modelList == null)
				modelList = new ArrayList<DataItem> () ;
			
			DataItem dataItem = new DataItem(this, dataItemDto) ;
			
			modelList.add(dataItem) ;
		}
		
		return modelList ;
	}
}
