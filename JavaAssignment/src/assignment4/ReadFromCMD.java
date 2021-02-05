package assignment4;

import java.io.*;

public class ReadFromCMD {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:\\YAMAHA\\JAVA Training\\Java Assignments\\JavaAssignment\\src\\assignment4\\Q2File.txt");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		BufferedWriter bw =new BufferedWriter(fw);
	
		System.out.println("Enter Text to be added");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		try {
			bw.write(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			br.close();
			bw.close();
		    fw.close();
		} catch (IOException e) {
			System.out.println("Process failed!!");
			e.printStackTrace();
		}
	    
	    System.out.println("Text is added to file");
	}
}
