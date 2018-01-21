package binayArray;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class intArrayBinaryConversion {

	public static void main(String[] args) {

		System.out.println("Enter Array Size - ");
		 Scanner sc = new Scanner(System.in);
	     int arraySize = sc.nextInt();
		
	     intArrayBinaryConversion obj=new intArrayBinaryConversion();
	     obj.binArray(arraySize);
	}
	
	  public void binArray(int arraySize) {
		int binaryAarray[]=new int[arraySize];
		
		for(int i=0;i<binaryAarray.length;i++) {
   			System.out.println("Enter " + i +" Array Value - ");			
			 Scanner sc = new Scanner(System.in);
		     int arrayVal = sc.nextInt();
		     binaryAarray[i]=arrayVal; 
		}
	
		for(int i=0;i<binaryAarray.length;i++)
		{
			String temp = String.format("%8s", Integer.toBinaryString(binaryAarray[i])).replace(" ", "0");
			binaryAarray[i]=Integer.parseInt(temp);
			System.out.println(binaryAarray[i]);
		}
	 	 
		for(int i=0;i<binaryAarray.length/2;i++)
		{
			int temp = binaryAarray[i]; 
			binaryAarray[i] = binaryAarray[binaryAarray.length -i -1];
			binaryAarray[binaryAarray.length -i -1] = temp;
		}
				 
		String temp = "";
		for(int i=0;i<binaryAarray.length;i++)
		{
			temp = temp + Integer.toString(binaryAarray[i]);
		}
		System.out.println(temp);
		System.out.println("Output: "+Integer.parseInt(temp,2));
		
	}

}
