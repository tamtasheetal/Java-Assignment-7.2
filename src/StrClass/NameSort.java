package StrClass;

//This java file is inside package named StrClass inside src folder.
import java.util.*;       
//importing all classes from java's util library.

public class NameSort
  //Class declaration containing main function. 
{
	public static void main(String[] args)     
//main function declaration. 
	{
		String mainString="MY NAME IS SHEETAL";    
//Generating the String to sort the data.
		
		System.out.println("MY NAME IS SHEETAL");
		String[] wordArray= mainString.split(" ");
		{
		int arrayLength=wordArray.length;      
		{
			 String name[]={"MY","NAME","IS","SHEETAL"};
			{
			int size= name.length;
			{
			for(int i1=0;i1<size;i1++)
			{
			System.out.println(name[i1]);
//Printing the sorted words
			}
		for(int i1 = 0 ; i1 < arrayLength ; i1++)
		{
			char[] charsWord = wordArray[i1].toCharArray();
			
			Arrays.sort(charsWord);    
//sort() function of Arrays class to sort the array of characters.
			
			String newWord=new String(charsWord);    			
			wordArray[i1]=newWord;             
		}
		
		
		StringBuilder sortedString=new StringBuilder(mainString.length());    
//Creating object of StringBuilder class to create sorted words of original String.
		
		for(int i1 = 0 ; i1 < arrayLength ; i1++)
		{
			sortedString.append(wordArray[i1]);
			
			sortedString.append(" ");
//Appending space after each word of String.
		}
		
		System.out.println(sortedString.toString());     
			
}     
			}
			}
		}
	}
}


