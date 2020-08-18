//defining java import
import java.util.Random;
import java.util.Scanner;

//Lab 4 GuessWord class
public class LAB4_GuessWord {
	
	//Assigning variables for GuessWord game
	//Assigning word dictionary
	private final String[] Word_Dictionary = { "deep" , "patel" , "nathan" , 
												"ahrendt" , "gideon" ,"woo" , 
												"tsang" , "java" , "computer" ,
												"CMPT"};
	
	//Assigning Secret Word and Secret Word Matches
	private String Secret_Word = "";
	private boolean[] Secret_Word_Matches;
	
	//secret word and run game
	public static void main(String[] args) {
		LAB4_GuessWord WordGuess = new LAB4_GuessWord();
		WordGuess.Set_Secret_Word();
		WordGuess.Run_Game();
		}
	
	//Secret Word
	private void Set_Secret_Word(String Word) {
		Secret_Word = Word;
		}
	
	//random word from word dictionary
	private void Set_Secret_Word() {
		Random random = new Random();
		Secret_Word = Word_Dictionary[random.nextInt(Word_Dictionary.length-1)];
		}
	
	//return get Secret Word
	private String Get_Secret_Word() {
		return Secret_Word;
		}
	
	//StringBuilder
	private String Get_Trial_Word_With_Matches() {
		StringBuilder String = new StringBuilder();
		for (int i = 0; i < Secret_Word.length(); i++) {
			String.append( (Secret_Word_Matches[i] ? Secret_Word.charAt(i) : '_') );
			}
		return String.toString();
		}
	
	//trial word
	private void Check_Trial_Word(char Char)
	{
		for (int i = 0; i < Secret_Word.length(); i++)
		{
			if (Secret_Word_Matches[i]) {
				continue;
            }
			Secret_Word_Matches[i] = Secret_Word.charAt(i) == Char;
			}
		}
	
	//run game
	private void Run_Game() {
		Scanner input = new Scanner(System.in);
		Secret_Word_Matches = new boolean[Secret_Word.length()];
		int Trials = 0;
		while (true) {
			System.out.print("Key in one character or your guess word: ");
			String Trial_Word = (input.hasNext()) ? input.next() : "";
			
			//trials++
			Trials++;
			
			//if trial word length is less than 1
			if (Trial_Word.length() < 1) {
				continue;
				}
			
			//if trial word length is equal to 1
			if (Trial_Word.length() == 1) {
				Check_Trial_Word(Trial_Word.charAt(0));
				Trial_Word = Get_Trial_Word_With_Matches();
				System.out.printf("Trail %1$d: %2$s\n", Trials, Trial_Word);
				}
			
			//output of Congratulation
			if (Trial_Word.equals(Secret_Word)) {
				System.out.printf("Trail %d: Congratulation!\n", Trials);
				break;
				}
			}
		
		//last line output of you got in number of trials
		System.out.printf("You got in %d trials\n", Trials);
		}
	}

//THANK YOU
//DEEP PATEL