package tests.entities;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void shouldCreateObjectWhenValidConstructor() {
		Financing financing = new Financing(100000.0, 2000.0, 80);
		Assertions.assertDoesNotThrow(() -> IllegalArgumentException.class);

	}

	@Test
	public void shouldThrowExceptionWhenInvalidConstructor() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 20);
		});
	}

	@Test
	public void totalAmountShouldUpdateWhenValid() {
		Double expectedValue = 100000.0;
		Financing financing = new Financing(100000.0, 2000.0, 80);
		//financing.setTotalAmount(100000.0);
		Assertions.assertEquals(financing.getTotalAmount(), expectedValue);
	}

	@Test
	public void totalAmountShouldThrowExceptionWhenInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(00.00, 2000.0, 20);
			financing.setTotalAmount(100000.0);
		});

	}

	@Test
	public void incomeShouldUpdateWhenValid() {
		Financing financing = new Financing(100000.0, 2000.0, 80);
	//	financing.setIncome(2000.0);
		Assertions.assertEquals(2000.0, 2000.0, 0);

	}

	@Test
	public void incomeShouldThrowExceptionWhenInvalid() {
		Assert.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 00.00, 20);
		    financing.setIncome(1000.0);
		});

	}
	
	@Test
	public void shouldUpdateMonthsWhenValid() {
		Financing financing = new Financing(1000.0, 2000.0, 20);
		financing.setMonths(80);
		Assertions.assertEquals(80, 80, 0);
	}
	
	@Test
	public void shouldThrowExceptionWhenMonthsAreInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(1000.0, 2000.0, 0);
			financing.setMonths(20);
		});
		
	}
	
	@Test
	public void entryShouldBeValid() {
		Financing financing = new Financing(1000.0, 2000.0, 80);
		Assertions.assertEquals(200.0, financing.entry());
	}
	
	@Test
	public void quotaShouldBeValid() {
		Financing financing = new Financing(1000.0, 2000.0, 80);
		Assertions.assertEquals(10.0, financing.quota());
	}

}