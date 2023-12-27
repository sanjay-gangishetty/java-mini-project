package com;

import java.util.ArrayList;

public class Travel {

	public boolean isCarDriver(Driver driver) {
		String res = driver.getCategory();
		if (res == "Car") {
			return true;
		} else {
			return false;
		}
	}

	public String retreiveByDriverId(ArrayList<Driver> Driver, int driverID) {
		for (int i = 0; i < Driver.size(); i++) {
			if (Driver.get(i).getDriverID() == driverID) {
				String driverCategory = Driver.get(i).getCategory();
				String driverName = Driver.get(i).getDriverName();
				double distTravelled = Driver.get(i).getTotalDistTravelled();
				return "Driver name is " + driverName + " belonging to category " + driverCategory + " travelled "
						+ distTravelled + " km so far.";
			}
		}
		return "No driver with DriverId : " + driverID + "had found !!!";
	}

	public int RetriveCountOfDriver(ArrayList<Driver> Driver, String category) {
		int countOfDrivers = 0;
		for(int i=0;i<Driver.size();i++) {
			if(Driver.get(i).getCategory() == category) {
				countOfDrivers++;
			}
		}
		return countOfDrivers;
	}

	public ArrayList<Driver> retriveDriver(ArrayList<Driver> Driver, String category) {
		ArrayList<Driver> driversList = new ArrayList<Driver>();
		for(int i=0;i<Driver.size();i++) {
			if(Driver.get(i).getCategory()==category) {
				driversList.add(Driver.get(i));
			}
		}
		return driversList;
	}

	public Driver RetriveMaximumDistanceTravelledDriver(ArrayList<Driver> Driver) {
		Driver maxDistTravel = Driver.get(0);
		for(int i=0;i<Driver.size();i++) {
			if(Driver.get(i).getTotalDistTravelled()>maxDistTravel.getTotalDistTravelled()) {
				maxDistTravel = Driver.get(i);
			}
		}
		return maxDistTravel;
	}

}
