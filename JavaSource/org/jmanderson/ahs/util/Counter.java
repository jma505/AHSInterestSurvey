package org.jmanderson.ahs.util;

/**
 * Updated for 2004-2005 (added two max fields  and checkmark counter for display purposes)
 */

public class Counter {

	int i;
	private final int max1;
	private final int max2;
	private int checks;

	public Counter() {

		i = 0;
		max1 = 0;
		max2 = 0;
		checks = 0;
	}

	public Counter(int i) {

		this.i = i;
		max1 = 0;
		max2 = 0;
		checks = 0;
	}
	
	public Counter(int i, int max1, int max2) {
		
		this.i = i;
		this.max1 = max1;
		this.max2 = max2;
		checks = 0;
	}

	public String toString() {

		return Integer.toString(i);

	}

	public int get() {
		return i;
	}
	
	public void addCheck() {
		checks++;
	}
	
	public int getChecks() {
		return checks;
	}
	
	public void setChecks(int checks) {
		this.checks = checks;
	}
	
	public void reset() {
		i = 0;
		checks = 0;
	}
	
	public void set(int i) {
		this.i = i;
	}
	
	public void add(int i) {
		this.i += i;
	}
	
	public void calculate(boolean form1) {
		int max = (form1 ? max1 : max2);
		if (i > max) {
			i = 10;
		}
		else {
			i = (i * 10) / max;
		}
	}
	
	public int getMax1() {
		return max1;
	}
	
	public int getMax2() {
		return max2;
	}
	
}
