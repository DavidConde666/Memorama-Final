
package Memo;

import java.util.Random;

public class SC {

    public int  [] getCardNumbers(){
    int[] numbers = new int[16];
    int count = 0;
    
    while(count<16)
    {
        Random r = new Random();
      int na = r.nextInt(8) + 1;
      int nyr = 0;
      
      for (int i=0; i<16; i++)
      {
      if(numbers[i] == na)
      {
          nyr++;
          
      }
     }
     if(nyr<2){
     numbers[count] = na; 
     count++;
    }
    
    }
    //return numbers;
    return numbers;
    }
}
