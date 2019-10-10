package cse360assign2;

public class AddingMachine {
	
	private int total;
	private String history;
	
	public AddingMachine () {
		total = 0;
		history = "0";
		// not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
		history += " + " + value;
		System.out.println(total);
		System.out.println(history);
	}
			
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
		System.out.println(total);
		System.out.println(history);
	}
	
	public String toString () {
		return history;
	}
	
	public void clear() {
			total = 0;
			history = "0";
			System.out.println(total);
			System.out.println(history);
	}
	
}