
package youtubejava2;

import java.util.Scanner;

/**
 *
 * @author 1) Java program for getting the values from the user and printing the array elements 
 */
public class GetNewArray {
    public void run(){
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number of element you want to store: ");
        int element = scan.nextInt();
        
        //declare the array
        int[] myNumber = new int[element];
        
        for(int i=0; i<element;i++){
            //get the input
            System.out.println("Enter the value: ");
            int num = scan.nextInt();
            //store the input into the array
            myNumber[i]=num;
        }
        
        for(int i =0;i<myNumber.length;i++){
            System.out.print(myNumber[i]+"\n");
        }
    }
}
