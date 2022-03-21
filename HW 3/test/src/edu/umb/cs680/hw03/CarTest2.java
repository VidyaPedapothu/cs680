package edu.umb.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {

	private String[] carToStringArray(Car car) {
		String[] carInformation = {car.getMake(),car.getModel(),Integer.toString(car.getYear())};
		return carInformation;
	}
	
	@Test
	void verifyCarEqualityWithMakeModelYear() throws Exception{
		Car actual = new Car("Audi","Q3",15,2022,60000);
		String[] expected = {"Audi","Q3","2022"};
		assertArrayEquals(expected,carToStringArray(actual));
	}

}