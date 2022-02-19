
package youtubejava2;

import java.util.Arrays;
import java.util.Collections;


/**
 *
 * @author • 3) Java Program to print the largest & smallest element in an array.

 */
public class LargestAndSmallest {
    public void run(){
    
        //[1,4,5,3,2]
        
        //we create the array
 //       Integer[] array = {11,15,9,3};
//        int smallest = Collections.min(Arrays.asList(array));
//        
//        int largest = Collections.max(Arrays.asList(array));
//        
//        System.out.println("The smallest number is: "+smallest);
//        System.out.println("The largest number is: "+largest);
     int small ,large, i=0;
     int[] array= new int[]{2,6,9,8,4};
     
     int len = array.length;
     large = small= array[i];
     
     for(i=1;i<len;i++){
         if(array[i]>large){
             large= array[i];
         }
         if(array[i]<small){
             small = array[i];
         }
     }
     System.out.println("The smallest: "+small);
     System.out.println("The largest: "+large);


        

       
    }
}
