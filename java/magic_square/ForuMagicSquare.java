package magic_square;

public class ForuMagicSquare extends MagicSquare{

	public ForuMagicSquare(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeMagicNumbers() {
		
		int plus = 1;
		int fourPoint = magicArray.length/4;
		int minus = magicArray.length - fourPoint;
		
		for (int i = 0; i < magicArray.length; i++) {
			for (int j = 0; j < magicArray.length; j++) {
				
			if (i < fourPoint && j >fourPoint-1 && j < minus) { plus++; continue; }
			if (i >fourPoint-1 && i < minus && j < fourPoint) { plus++; continue; }
			if (i >fourPoint-1 && i < minus && j > minus-1) { plus++; continue; }
			if (i > minus-1 && j > fourPoint-1 && j < minus ) { plus++; continue; }
				
				magicArray[i][j] = plus;
				plus++;
				
			}
		}
		
		plus = 1;
	
		for (int i = magicArray.length-1; i >=0; i--) {
			for (int j = magicArray.length-1; j >=0 ; j--) {
				if (magicArray[i][j]!=0) {
					plus++;
					continue;
				}else {
					magicArray[i][j] = plus;
					plus++;
				}
			}
		}
	}

}
