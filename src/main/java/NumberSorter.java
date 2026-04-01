//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Avery

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		int num = number;
		while(num / 10 > 0){
			num = num/10;
			count++;
		}
		return count + 1;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] reverse = new int[NumberSorter.getNumDigits(number)];

		reverse[0] = number % 10;
		for(int i = 1; i < reverse.length; i++){
			if(i == reverse.length - 1){
				number = (number / 10) % 10;
				reverse[i] = number;
			}else if(i < reverse.length){
				number = number / 10;
				int last = number % 10;
				reverse[i] = last;
			}
		}

		Arrays.sort(reverse);
		return reverse;
	}
}