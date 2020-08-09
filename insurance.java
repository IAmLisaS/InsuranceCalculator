// Lisa Sinn
// Intro to Java - CSCI 1146 
// CSCI 1146-241
// Unit 3, Exercise #9
// Insurance.java

import java.util.Scanner;

class Insurance {

public static void main(String args[]){

//Scanner class object to read inputs from user

Scanner inputDevice = new Scanner(System.in);

//prompt the user for the current year

System.out.print("Enter current year: ");

int currentYear = inputDevice.nextInt();

//prompt the user for birth year

System.out.print("Enter birth year: ");

int birthYear = inputDevice.nextInt();

//passing both variables to method

int premiumAmount = calculatePremium(currentYear,birthYear);

//displaying the premium amount

System.out.println("Premium amount: $"+premiumAmount);

}

public static int calculatePremium(int curr,int birth) {

//calculate decade using curr and birth

int decade = curr-birth;

//finding out number of decades

decade = decade/10;

//calculating premium amount using decades

int premiumAmount = (decade+15)*20;

//returning premium amount back to main method

return premiumAmount;

}

}
