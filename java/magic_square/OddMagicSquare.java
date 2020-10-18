package magic_square;

public class OddMagicSquare extends MagicSquare {

	   public OddMagicSquare(int n) {
	      super(n);
	   }

	   @Override
	   public void makeMagicNumbers() {
	      int i = magicArray.length-1;
	      int j = (int)Math.ceil( magicArray.length/2F)-1;
	      magicArray[i][j] =1;
	      
	      //임시저장
	      int tempI = 0;
	      int tempJ = 0;
	      
	      int num = 2;
	      while(num <= magicArray.length*magicArray.length) {
	         tempI = i;
	         tempJ = j;

	         if (i+1>magicArray.length-1) {
	               i=0;
	               if (j+1>magicArray.length-1) {
	                  i=0;
	                  j=0;   
	               }else j++;
	         }else {
	            i++;
	            if (j+1>magicArray.length-1) {
	               j=0;
	            }else j++;
	         }
	         
	         if (magicArray[i][j]==0) {
	            magicArray[i][j]=num;
	         }else {
	            i= tempI;
	            j= tempJ;
	         
	            if (i-1<0) {
	               i = magicArray.length-1;
	               magicArray[i][j] = num;
	            }else {
	               magicArray[i-1][j] = num;
	               i = i-1;
	            }
	         }
	         
	         num++;
	         }
	      
	   }
	   
}
