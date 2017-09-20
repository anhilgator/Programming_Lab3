package lab3.aminoacidquiz;

import java.util.Random;
import java.util.Scanner;

public class Aminoacidquiz2
{
	
	public static void main(String[] args)
	{
		Random random = new Random(); 
		int trackcorrectanswers=0; //tracks total correct answers
		int randomnumber= random.nextInt(20); 
		String question = FULL_NAMES[randomnumber];//initiating the question variable
		Scanner input=new Scanner (System.in); //this will be the user input 
		Boolean Correct; //initiates correct answer
		String shortanswer = SHORT_NAMES[randomnumber];
		Correct= shortanswer.equals(question);
		//String inputString;//initiating the user input variable
		String inputStringUpper; //the variable for making the user input uppercase
		//long startTime = System.currentTimeMillis();
		while (true)
		{	
			//long now = System.currentTimeMillis();
			System.out.println(question);//prints out an item from FULLNAMES randomly
			//inputStringUpper=inputString.toUpperCase();
			inputStringUpper=input.nextLine().toUpperCase();
			System.out.println("Your Answer:" + inputStringUpper);
			//Correct= SHORT_NAMES[randomnumber].equals(question);
			if (inputStringUpper.equals(Correct))
			{
				System.out.println("Correct Answer:" + inputStringUpper);
			}
				else 
				{
					System.out.println("Incorrect :(");
				}
			}
			trackcorrectanswers=trackcorrectanswers++; //keeping track of correct answers
	
			//if ((now-startTime)/1000f >= 30) //time keeper for 30s
			//{
				//break;
			//}
		}
		//System.out.println("Time's Up!"); //prints this at 30s
	}
	
		public static String[] SHORT_NAMES = //creates a string array of the amino acid short letter names

		{ "A","R", "N", "D", "C", "Q", "E",

		"G",  "H", "I", "L", "K", "M", "F",

		"P", "S", "T", "W", "Y", "V" };


			public static String[] FULL_NAMES = //creates a string array of full amino acid names

		{

		"alanine","arginine", "asparagine",

		"aspartic acid", "cysteine",

		"glutamine",  "glutamic acid",

		"glycine" ,"histidine","isoleucine",

		"leucine",  "lysine", "methionine",

		"phenylalanine", "proline",

		"serine","threonine","tryptophan",

		"tyrosine", "valine"};
}


//Credit: Dr. Fodor, Anju Lulla, Mike Sioda, Bias group, Stack Overflow

//the script for time does work, it cuts off at 30s and prints 'Times Up', but I commented it out to focus on the quiz generator...