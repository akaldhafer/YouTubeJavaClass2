
package youtubejava2;

/**
 *
 * @author • 4) Java Program to print the elements of an array in reverse order.

 */
public class ReverseOrder {
    public void run(){
        //create the array
      int[] array = {1,2,3,4,5};
      System.out.println("before");
      //display the array
      for(int i=0; i<array.length;i++){
          System.out.print(array[i]+" ");

      }
      
      System.out.println("\nafter reverse\n");

      for(int i= array.length-1; i>=0;i--){
        System.out.print(array[i]+" ");
      }
    }
}
