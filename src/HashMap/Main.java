package HashMap;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		/*@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows = scan.nextInt();*/
/*
		for (int row = 1; row <= rows; row++) {

			for (int col = 1; col <= row; col++) {

				System.out.print(row + " ");
			}
			System.out.println();
		}

		for (int row = rows - 1; row >= 1; row--) {

			for (int col = 1; col <= row; col++) {

				System.out.print(row + " ");
			}
			System.out.println();
		}*/
		
		
/*		for (int i = rows; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }*/
		
		/*for (int i = rows; i >=1 ; i--) 
        { 
			for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
		*/
	/*	for (int i = rows; i >= 1; i--) 
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
		*/
		
		/*for (int i = 1; i <= rows; i++) 
        {
            //Printing first half of the row
             
            for (int j = 1; j <= i; j++) 
            { 
                System.out.print(j+" "); 
            }
             
            //Printing second half of the row 
             
            for (int j = i-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }*/
		
		/*scan.close();
*/
		ArrayList<String> list = new ArrayList<String>();
        
        list.add("Gold");
         
        list.add("Iron");
         
        list.add("Copper");
         
        list.add("Silver");
         
        list.add("Nickel");
         
        list.add("Cobalt");
         
        list.add("Zinc");
         
        //Printing list before reverse
         
        System.out.println("ArrayList Before Reverse :");
         
        System.out.println(list);
         
        //Reversing the list using Collections.reverse() method
         
        Collections.reverse(list);
         
        //Printing list after reverse
         
        for ( String x : list){
        	
        	System.out.println(x);
        }
        
        System.out.println("ArrayList After Reverse :");
         
        System.out.println(list);
		
		
	}
}
