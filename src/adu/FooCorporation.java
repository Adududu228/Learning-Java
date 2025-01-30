package adu;

public class FooCorporation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int basePay = 5;
		int hoursWorked = 7;
        System.out.printf("Total Pay: %d\n", salary(basePay, hoursWorked));

	}
	public static int salary(int pay, int hours) {
		return pay * hours;
	}
	
}
