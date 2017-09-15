package com.muddycottage.datalogger.dto;

public class DataItemDto {
	private String name ;
	private String dataType ;
	private float value ;
	
	public DataItemDto() {}
	
	public DataItemDto(String name, String dataType, float value) {
		super();
		this.name = name;
		this.dataType = dataType;
		this.value = value;
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
}
