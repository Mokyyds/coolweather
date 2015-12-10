package com.coolweathers.app.model;

public class County {
	private int id;
	private String countyName;
	private String coutnyCode;
	private int cityId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountyName() {
		return countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
	public String getCoutnyCode() {
		return coutnyCode;
	}
	public void setCoutnyCode(String coutnyCode) {
		this.coutnyCode = coutnyCode;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
}
