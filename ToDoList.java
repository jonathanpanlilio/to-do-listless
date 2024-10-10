package pilotProgram;

import java.util.Scanner;
import java.util.ArrayList;

public class ToDoList {

	public static void main(String[] args) {

		Scanner userInput = new Scanner (System.in);
		ArrayList <String> List = new ArrayList<>(); 
		
		List.add("Boulder Bag");
		List.add("Crash Pad");
		
		System.out.println("Items on your list: " + List);
	
		
	
		

	}

}

/**
 Create a list application using the modularity of methods.
 Importing: Scanner and ArrayList
 Process:
 >Provide menu/welcome user (Process)
 >Give user to do list options (Process)
 >Take user input(Action)
 >Use a switch with three cases
   >Add
   >Remove
   >Modify
 >Display the list after the user input
 >Incorporate a Do While Loop to repeat the application
 >!!Incorporate a way for the user to leave the application
 
 
 
 
 **/