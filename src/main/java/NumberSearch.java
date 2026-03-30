//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Avery

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearch
{
	public static int getNextLargest(int[] numArray, int searchNum)
	{
		int[] larger = new int[numArray.length];
		int count = 0;
		for(int i = 0; i < numArray.length; i++){
			if(numArray[i] > searchNum){
				larger[count] = numArray[i];
				count++;
			}
		}
		int smallest = Integer.MAX_VALUE;
		for(int i = 0; i < larger.length; i++){
			if(larger[i] < smallest && larger[i] > 0){
				smallest = larger[i];
			}
		}
		return smallest;
	}
}