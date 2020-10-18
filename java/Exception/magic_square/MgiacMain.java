package magic_square;

import java.util.Scanner;

public class MgiacMain {

	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		while(true) {
			System.out.println("마방진만들 사이즈를 입력 하세요222222 ");
			int n=keyboard.nextInt();
			
			try {
			
				MagicSquare magicSquare=MagicFactory.getMagicSqueInstence(n);
				magicSquare.init();
				magicSquare.makeMagicNumbers();
				magicSquare.printMagic();
				System.out.println(magicSquare.isValidateMagic());
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
