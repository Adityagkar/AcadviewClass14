
package lastassignment;

public class GenericArrayPrint{
     static <T> void printArray(T array[]){
        
        for(T var:array){
            System.out.print(" "+var);
         }
    }
        
    public static void main(String args[]){
        //case 1
        Character array1[]={'A','D','I','T','Y','A'};
        Integer array2[]={1,2,3,4,5,6,7,8,9,20};
          
        
       printArray(array1);
         System.out.println();
       printArray(array2);
        
    }
}
