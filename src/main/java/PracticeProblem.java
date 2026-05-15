/**

        * File: 4.7

        * Author: Joe Yang

        * Date Created: April 20, 2026

        * Date Last Modified: April 20, 2026

        */

import java.util.Random;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int randomNumber(int num, int num2){
	Random num3 = new Random();

	int firstNum = Math.min(num, num2);

	int lastNum = Math.max(num, num2);

	return num3.nextInt((lastNum - firstNum ) + 1) + firstNum;
	

	}

	public static char randomChar(String word){
		Random word2 = new Random();

		int index = word2.nextInt(word.length());

		return word.charAt(index);


	}

	public static int randomEvenNumber(int num, int num2){
		Random num3 = new Random();

		int firstNum = Math.min(num, num2);
		int lastNum = Math.max(num, num2);

		int result;

		do{
			result = num3.nextInt((lastNum - firstNum) + 1) + firstNum;
		}while (result % 2 != 0 );

		return result;


	}

}


