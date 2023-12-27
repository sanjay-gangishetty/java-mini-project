package com;

public class Driver {

	private int DriverID;
	private String Category;
	private String DriverName;
	private double TotalDistTravelled;

	public Driver() {
	};

	public Driver(int DriverID, String Category, String DriverName, double TotalDistTravelled) {
	this.Category = Category;
	this.DriverID = DriverID;
	this.DriverName = DriverName;
	this.TotalDistTravelled = TotalDistTravelled;
	};

	public int getDriverID() {
		return DriverID;
	}

	public void setDriverID(int driverID) {
		this.DriverID = driverID;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		this.Category = category;
	}

	public String getDriverName() {
		return DriverName;
	}

	public void setDriverName(String driverName) {
		this.DriverName = driverName;
	}

	public double getTotalDistTravelled() {
		return TotalDistTravelled;
	}

	public void setTotalDistTravelled(double totalDistTravelled) {
		this.TotalDistTravelled = totalDistTravelled;
	}

}
