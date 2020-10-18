package magic_square;


public class MagicFactory {
	public static MagicSquare getMagicSqueInstence(int n)throws RuntimeException{
		MagicSquare magicSquare=null;
		
		if(n%2==1) {
			magicSquare=new OddMagicSquare(n);
		}
		else if(n%4==0) {
			magicSquare=new ForuMagicSquare(n);
		}
		else  {
			magicSquare=new FourNAddTwoSquare(n);
					}
		return magicSquare;
	}
}
