package Assignment1;

import java.util.Scanner;

public class CopyOfArray {
	public static int[] copyOf(int[] array)
	{
		int arrayCopy[] = new int[array.length];
		for(int i=0;i<array.length;i++)
			arrayCopy[i]=array[i];
		return arrayCopy;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int arraySize = sc.nextInt();
		
		int arrayElements[] = new int[arraySize];
		
		System.out.print("Enter elements: ");
		int i=0;
		while(i<arraySize)
		{
			arrayElements[i]=sc.nextInt();
			i++;
		}
		
		int arrayCopy[] = new int[arraySize];
		arrayCopy=copyOf(arrayElements);
		
		System.out.print("Copied elements: ");
		i=0;
		while(i<arraySize)
		{
			System.out.println(arrayCopy[i]+" ");
			i++;
		}
		sc.close();
	}
}
