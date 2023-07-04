
package VIEW;

import junit.framework.Assert;

public class Moneyplex {
    public static void main(String[] args) {
      demo(4,5);
      Assert.assertEquals(9,demo(4,5));
      Assert.assertEquals(demo(4,5)==10, true);
      Assert.assertEquals('e', grade(50));
    }
    public static int demo(int x,int y){
        return x+y;
    }
    public static char grade(int number)
    {
     if(number>40){
         return 'd';
     }
     else if (number>60){
         return 'c';
     }
     else if(number>80){
         return 'b';
     }
     else if (number >=100){
         return 'a';
     }
     else{
         return'e';
     }
     
    }
}
