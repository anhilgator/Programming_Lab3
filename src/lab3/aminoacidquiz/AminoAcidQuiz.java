package lab3.aminoacidquiz;
import java.util.*; 
//import java.util.HashMap;

public class AminoAcidQuiz 
{
	Random random = new Random(); 
	int correctanswers=0; //creating a variable to track all correct answers
	String question = FULL_NAMES[random.nextInt(20)];//question would randomly pull items from the FULL_NAMES str array
	//String answer = get.
	HashMap  hashmap =  new HashMap(); //making a hashmap 
	hashmap.put(FULL_NAMES.next(), SHORT_NAMES.next());
	for (int x=0; x<20; x++)
	{	
		String inputString = System.console().readLine().toUpperCase(); //to input a string from the user...also converting all input to uppercase
		long startTime = System.currentTimeMillis();
		long now = System.currentTimeMillis();
		if ((now-startTime)/1000f >= 30) //time keeper for 30s
		{
			System.out.println("Time Up!"); //prints this at 30s
		}
	
	
}
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
	
}
}
//I would like to credit help from Dr. Fodor (and his lecture/lab materials), classmate Anju Lulla, and fellows from the BIAS study group, particularly Michael Sioda
