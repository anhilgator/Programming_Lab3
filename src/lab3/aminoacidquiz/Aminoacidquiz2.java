package lab3.aminoacidquiz;

import java.util.Random;
import java.util.Scanner;

public class Aminoacidquiz2
{
	
	public static void main(String[] args)
	{
		Random random = new Random(); 
		int trackcorrectanswers=0; //tracks total correct answers
		while (true)
		{	
			int randomnumber= random.nextInt(20); 
			String question = FULL_NAMES[randomnumber];
			System.out.println(question);//prints out an item from FULLNAMES randomly
			Scanner input=new Scanner (System.in); //this will be the user input 
			String inputStringUpper=input.nextLine().toUpperCase();
			System.out.println("Your Answer:" + inputStringUpper);
			boolean correctanswer = SHORT_NAMES[randomnumber].equals(inputStringUpper);
			if(correctanswer)
			{
				trackcorrectanswers++;
				System.out.println("Correctanswer:" + correctanswer);
				System.out.println("Number right"+ trackcorrectanswers);
			}
			else
			{
				System.out.println("Wrong!  The answer was " + SHORT_NAMES[randomnumber]);
				System.exit(1);
			}
		}
	}
	
		public static String[] SHORT_NAMES = 

		{ "A","R", "N", "D", "C", "Q", "E",

		"G",  "H", "I", "L", "K", "M", "F",

		"P", "S", "T", "W", "Y", "V" };


		public static String[] FULL_NAMES = 

		{

		"alanine","arginine", "asparagine",

		"aspartic acid", "cysteine",

		"glutamine",  "glutamic acid",

		"glycine" ,"histidine","isoleucine",

		"leucine",  "lysine", "methionine",

		"phenylalanine", "proline",

		"serine","threonine","tryptophan",

		"tyrosine", "valine"
		};
}


//Credit: Dr. Fodor, Anju Lulla, Mike Sioda, Bias group, Stack Overflow

//the script for time does work, it cuts off at 30s and prints 'Times Up', but I commented it out to focus on the quiz generator...