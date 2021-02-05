package assignment4;

import java.io.*;

public class ReadByteFromFile {
	public static void main(String[] args) {
		try{    
		    FileInputStream fin=new FileInputStream("D:\\YAMAHA\\JAVA Training\\Java Assignments\\JavaAssignment\\src\\assignment4\\question1File.txt");    
		    BufferedInputStream bin=new BufferedInputStream(fin);    
		    int i;    
		    while((i=bin.read())!=-1)
		    {    System.out.print(i);
		     System.out.print((char)i);    
		    }		    
	    bin.close();    
	    fin.close();    
	  }
	  catch(FileNotFoundException e)
	  {
		  System.out.println(e.getMessage());
	  }    
	  catch(IOException e)
	  {
		  System.out.println(e.getMessage());
	  } 
	}
}