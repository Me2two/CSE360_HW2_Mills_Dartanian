/**
 * This Class holds an integer total that can be added and subtracted from and records a
 * history of those changes. Contains methods for returning the total and history and has
 * a method for clearing the total and history.
 * <p>
 * Assignment: 2
 * Class: CSE 360
 * 
 * @author Dartanian Mills
 */
package cse360assign2;

public class AddingMachine {
	
	private int total;
	private String history;
	
	public AddingMachine () {
		total = 0;
		history = "0";
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
			
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	public String toString () {
		return history;
	}
	
	public void clear() {
			total = 0;
			history = "0";
	}
	
}