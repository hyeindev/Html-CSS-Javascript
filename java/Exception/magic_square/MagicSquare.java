package magic_square;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 
 * 마방진은 
 * 
 * 홀수 마방진
 * 4n 마방진
 * 4n+2 마방진 
 * 
 * 오브젝트 설계
 * 1.마방진 생성
 * 2.마방진 숫자 생성
 * 2.마방진 검증
 * 3.마방진 출력 
 * 
 * 
 * @author Lenovo
 *
 */
public abstract class MagicSquare {
	private int n;
	protected int magicArray[][];
	
	public MagicSquare(int n) {
		this.n=n;
	}
	
	abstract public void makeMagicNumbers();
	
	public void init() {
		this.magicArray=new int[n][n];
	}
	public boolean isValidateMagic() {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		int rowSum=0;
		int colSum=0;
		int downCrossSum=0;
		int upCrossSum=0;
		
		//row 
		int tempSum=-1;
		
		for (int i = 0; i < magicArray.length; i++) {
			rowSum = 0;
			for (int j = 0; j < magicArray[i].length; j++) {
				rowSum += magicArray[i][j];
				
				//down cross save
				if (i==j) downCrossSum+=magicArray[i][j];
			}
			
			if (tempSum==-1) {
				tempSum=rowSum;
			}else {
				if (tempSum!=rowSum) {
						System.out.println("Fail Magic Square : " + i + " row");
						return false;
				}
			}
			set.add(rowSum);
		}
		
		//col 
		tempSum=-1;
		
		for (int j = magicArray.length-1; j>=0; j--) {
			colSum = 0;
			for (int i = 0; i < magicArray.length; i++) {
				colSum+=magicArray[i][j];
				
				//up cross save
				if (j==i) upCrossSum+=magicArray[i][j];
			}
				if (tempSum==-1) {
					tempSum=colSum;
				}else {
					if(tempSum!=colSum) {
					System.out.println("Fail Magic Square : " + j + " cols");
					return false;
					}
				}
				set.add(colSum);
		}
		
		//cross all
		if (downCrossSum!=upCrossSum) return false;
		else set.add(downCrossSum);
		
		
		if (set.size()!=1) {
			return false;
		}
		
		return true;
		
		
	}
	public void printMagic() {
		for (int i = 0; i < magicArray.length; i++) {
			for (int j = 0; j < magicArray[i].length; j++) {
				System.out.print(magicArray[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
}
