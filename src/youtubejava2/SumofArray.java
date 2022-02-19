
package youtubejava2;

/**
 *
 * @author • 2) Java Program to print the sum of all the items of the array.

 */
public class SumofArray {
    public void run(){
        //we create the array
       int myArray[]={2,7,3};
       //create the sum variable 
       int sum=0;
       
       //we calculate the sum
       for(int i=0;i<myArray.length;i++){
           sum = sum + myArray[i];
       }
       
       System.out.println("The total of the array is: "+sum);
       
       
        
        
    }
}
