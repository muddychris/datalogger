package com.muddycottage.datalogger.model;

import java.time.LocalDateTime;

import com.muddycottage.datalogger.dto.DataFeedDto;
import com.muddycottage.datalogger.dto.DataItemDto;

public class DataItem {
	private LocalDateTime captureDate ;
	private String location ;
	private String name ;
	private String dataType ;
	private float value ;
	
	public DataItem(LocalDateTime captureDate, String location, String name,
			String dataType, float value) {
		super();
		this.captureDate = captureDate;
		this.location = location;
		this.name = name;
		this.dataType = dataType;
		this.value = value;
	}
	
	public DataItem (DataFeedDto dataFeedDto, DataItemDto  dataItemDto) {
		this.captureDate = dataFeedDto.getCaptureDate() ;
		this.location = dataFeedDto.getLocation() ;
		
		this.name = dataItemDto.getName() ;
		this.dataType = dataItemDto.getDataType() ;
		this.value = dataItemDto.getValue() ;
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
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDataType() {
		return dataType;
	}
	
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	
	public float getValue() {
		return value;
	}
	
	public void setValue(float value) {
		this.value = value;
	}
	
	public String toString () {
		return String.format("%s %s : %s %s %s", captureDate, location, name, value, dataType) ;
	}
}
