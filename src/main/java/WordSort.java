//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Avery

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
	   setList(line);
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
		System.out.print(Arrays.toString(wordRay));
	}

	public void sort()
	{
		wordRay = Arrays.sort(wordRay);
		System.out.print(Arrays.toString(wordRay));
	}

	public String toString( )
	{
		Arrays.sort(wordRay);
		String list = "";
		System.out.println();
		for(int i = 0; i < wordRay.length; i++){
			list += "word " + i + " :: " + wordRay[i] + "\n";
		}
		return list;
	}
}