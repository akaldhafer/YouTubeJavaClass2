
package youtubejava2;

import java.util.ArrayList;

/**
 *
 * array  vs arrayList
 */
public class YouTubeJava2 {

    /**
     * @param args the command line arguments
     * [0,1,2,3,]
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ArrayListExample();
        ReverseOrder r = new ReverseOrder();
        r.run();
        
       // LargestAndSmallest s = new LargestAndSmallest();
        
        //s.run();
        
//        GetNewArray get = new GetNewArray();
//        get.run();
//        
//        SumofArray sum =new SumofArray();
//        sum.run();
//        
    }
    
    static void ArrayListExample(){
         //delcare the array list
        ArrayList<String> myName = new ArrayList<String>();
        //add element into the arraylist
        myName.add("Malik");
        myName.add("Taher");
        myName.add("Aldhafer");
        
        //we print the arraylist values
        for(int i= 0; i<myName.size();i++){
         System.out.println(myName.get(i));}
       
    }
    
}
