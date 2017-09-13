package lab3.aminoacidquiz;
import java.util.Random;
import java.util.HashMap;


public class AminoAcidQuiz 
{
	
	public static String[] SHORT_NAMES =//creates a string array of the amino acid short letter names

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
	
	public static void main (String[] args)
	{Random random = new Random(); 
	int trackcorrectanswers=0; //creating a variable to track all correct answers
	String question = FULL_NAMES[random.nextInt(20)];//question would randomly pull items from the FULL_NAMES str array
	//String correctanswerString = hashmap.get.SHORT_NAMES[item];  //initializing the variable for the correct answer
	HashMap  hashmap =  new HashMap(); //making a hashmap 
	for (int item=0; item<FULL_NAMES.length; item++)
	{
		hashmap.put(FULL_NAMES[item], SHORT_NAMES[item]);//making a key,pair value relationship for the FULLNAME, SHORTNAME arrays
	} 
	String correctanswerString = hashmap.get.FULL_NAMES[item];  //initializing the variable for the correct answer
	for (int x=0; x<20; x++)
	{	
	
		long startTime = System.currentTimeMillis();
		long now = System.currentTimeMillis();
		if ((now-startTime)/1000f >= 30) //time keeper for 30s
		{
			System.out.println("Time Up!"); //prints this at 30s
		}
		String inputString = System.console().readLine().toUpperCase(); //to input a string from the user...also converting all input to uppercase
		for (int a=0; a<SHORT_NAMES.length; a++)
		{
			if (inputString.compareTo(correctanswerString]));//if the input is the correct answer, add it to the tally of correct answers, ie 'trackcorrectanswers' variable
			{
				trackcorrectanswers++;
			}
		}
}
	}
}
//I would like to credit help from Dr. Fodor (and his lecture/lab materials), classmate Anju Lulla, and fellows from the BIAS study group, especially Michael Sioda, who spent a lot of time tutoring me through this assignment
