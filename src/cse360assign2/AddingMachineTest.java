/*
 * Assignment: 2
 * Class: CSE360
 * Author: Dartanian Mills
 * Description: File for testing functionality of AddingMachine.java. 
 */
package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddingMachineTest {

	//
	@Test
	public void test() {
		
		AddingMachine mac = new AddingMachine();
		
		mac.add(5);
		mac.add(7);
		mac.subtract(19);
		mac.add(4);
		mac.subtract(1);
		mac.add(23);
		
		assertTrue(mac.getTotal() == 19);
		assertTrue(mac.toString().equals("0 + 5 + 7 - 19 + 4 - 1 + 23"));
		
		mac.clear();
		mac.add(3);
		
		assertTrue(mac.getTotal() == 3);
		assertTrue(mac.toString().equals("0 + 3"));
	}

}
