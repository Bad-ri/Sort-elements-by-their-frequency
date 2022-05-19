package javaapplication7;
import java.util.*;

/*
This Assignment was done by:
Name                     |ID
Noor al-fattha Tarek     20192107
Mohamed Mahmoudel-badri  20194841
Eyad abdellatif          20192959
Mahmoud Aladin           20195445
Omar Mostafa             2019374
UNDER SUPERVISION OF TA/ Amany Hussien
*/
public class Task3Q3 {

    public static void main(String[] args) {
        
        int[]input={3,3,1,1,1,8,8,8,3,7,6,8,8,7,7,7};
        int b = input[0];
        ArrayList<Integer> arr = new ArrayList<Integer>(); 
        arr.add(b);
        
        
        for(int i = 0 ; i <= input.length-1 ; i++){
            
           boolean x = false;
           
           for(int j = 0 ; j < arr.size() ; j++){
               
               if( arr.get(j) == input[i]){
                x = true;
                break;
                
               }   
           }
           
           if( x == false ){
               
           arr.add(input[i]);
           
           }
       }

        ArrayList<Integer> Frequency = new ArrayList<Integer>(); 
        int count = 0;
        
        for(int i = 0 ; i < arr.size() ; i++){
            
            for(int j = 0 ; j < input.length ; j++){
        
                if( arr.get(i) == input[j] ){
                    
                    count++;
                }
            }
         
         Frequency.add(count);
         count = 0;
         
        }

        ArrayList<Integer> output = new ArrayList<Integer>();
        int counter = 0;
        int ind = -1;
        int g = arr.size();
        
        
        for(int m = 0 ; m < g ; m++){
         
            for(int i = 0 ; i < Frequency.size() ; i++){
        
                if( counter < Frequency.get(i)){
                    
                    counter = Frequency.get(i);
                    ind = i;
                }
     
            }
     
                for(int l = 0 ; l < counter ; l++){
                
                    output.add(arr.get(ind));
                }
                
            arr.remove(ind);
            Frequency.remove(ind);
            counter=0;
            ind=-1;
        }
     
        for(int i = 0 ; i < output.size() ; i++){
            
            System.out.print(output.get(i)+"    ");
        } 
    }
}
