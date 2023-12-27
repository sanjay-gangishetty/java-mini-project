package com;

import java.util.ArrayList;

public class TestDriver {

	public static void main(String[] args) {

		Driver d1 = new Driver(); // instantiating driver object for driver 1
		Driver d2 = new Driver(2,"Car","Joe",6200); // instantiating driver object for driver 2
		Driver d3 = new Driver(3,"Car","Surya",8200); // instantiating driver object for driver 3
		Driver d4=new Driver(102, "Truck", "Mukesh", 8987);
		Travel t = new Travel(); // instantiating travel object

		d1.setCategory("Car");
		d1.setDriverID(1);
		d1.setDriverName("Sanjay");
		d1.setTotalDistTravelled(4200);

//		Is car driver or not Check - Returns true is input is Car Driver else false
		boolean isCarDriverCheck = t.isCarDriver(d1);
		System.out.println(isCarDriverCheck);

// 		Adding drivers to Drivers ArrayList
		ArrayList<Driver> DriverList = new ArrayList<Driver>();
		DriverList.add(d1);
		DriverList.add(d2);
		DriverList.add(d3);
		DriverList.add(d4);

//		retrieve Driver by DriverId and DriverList as input and outputs Driver data
		String DriverData = t.retreiveByDriverId(DriverList, 4);
		System.out.println(DriverData);

//		input: driverList and Category, Output: Count of drivers of input category
		int countOfDrivers = t.RetriveCountOfDriver(DriverList, "Car");
		System.out.println("Count of Drivers : " + countOfDrivers);

//	    input: DriverList and category, output: names of Drivers of same Category
		ArrayList<Driver> n = t.retriveDriver(DriverList, "Truck");
		System.out.println("Names of drivers of Same Category");
		for (Driver temp : n) {
			System.out.println("Driver name : " + temp.getDriverName());
		}

//		input: Drivers ArrayList, output: returns driver who travelled more distance 
		Driver maxDist = t.RetriveMaximumDistanceTravelledDriver(n);
		System.out
				.println("Maximum distance travelled Driver is : " + maxDist.getDriverName() + " belonging to category "
						+ maxDist.getCategory() + " travelled " + maxDist.getTotalDistTravelled() + " so far.");
	}

}
