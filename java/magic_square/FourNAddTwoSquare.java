package magic_square;


public class FourNAddTwoSquare extends MagicSquare {

	public FourNAddTwoSquare(int n) {
		super(n);
	}
	
	private int leng;
	// 4n+2 의 n을 구함
	private int n;
	private int x;
	private int y;
	private int area;
	private int halfPoint;
	private int plusNum;
	private int allCount;
	
	@Override
	public void makeMagicNumbers() {
		
		x=0;
		y=0;
		area=1;
		leng=magicArray.length;
		n = (leng -2)/4;
		halfPoint=magicArray.length/2;
		plusNum=1;
		allCount=magicArray.length*magicArray.length/4;
	
		oddMagicSquare();
		changeLeftNrows();
		changeLeftMiddleRowAndTwoCols();
		if (n-1>0) changeRightNMinusOneCols();
	}
	
	//formFirstAreaToFourthArea 메서드를 이용해서 각 영역에 홀수마방진 채우기 
	public void oddMagicSquare() {
		
		while(area<=4) {
			switch(area) {
			case 1 :formFirstAreaToFourthArea(0,halfPoint-1,0,halfPoint-1,area,allCount); break;
			case 2 :formFirstAreaToFourthArea(halfPoint,leng-1,halfPoint,leng-1,area,allCount); break;
			case 3 :formFirstAreaToFourthArea(0,halfPoint-1,halfPoint,leng-1,area,allCount); break;
			case 4 :formFirstAreaToFourthArea(halfPoint,leng-1,0,halfPoint-1,area,allCount); break;
			}
			System.out.println("case" + area + "번째 순회");
			area++;
		}
	}
	
	//reverseRowsACols 메서드 이용해서 왼쪽 n열 바꾸기 
	public void changeLeftNrows() {
		reverseRowsACols(0,0,halfPoint,n);
	}
	
	//reverseRowsACols 메서드 이용해서 왼쪽 가운데 2열 바꾸기 
	public void changeLeftMiddleRowAndTwoCols() {
		int i = (int)Math.ceil(leng/4F)-1;
		reverseRowsACols(i,n-1,i+1,n+1);
	}
	
	//reverseRowsACols 메서드 이용해서 오른쪽 n-1 열 바꾸기
	public void changeRightNMinusOneCols() {
		int startCol = leng-(n-1);
		reverseRowsACols(0,startCol,halfPoint,magicArray.length);
	}
	
	//홀수마방진 기록 메서드
	public void formFirstAreaToFourthArea(int startRowPoint, int endRowPoint,int startColPoint,int endColPoint,int area,int allCount) {
	
		if(area>1) allCount = leng*leng/4*area;
	
		  int y = startRowPoint;
		  int x = (int)Math.ceil(startColPoint + (halfPoint/2F))-1;

		
		  magicArray[y][x]=plusNum;
		  //임시저장
	      int tempI = 0;
	      int tempJ = 0;
	      plusNum=plusNum+1;

	      while(plusNum <= allCount) {
	         tempI = y;
	         tempJ = x;

	         
	         if (y-1<startRowPoint) {
	               y=endRowPoint;
	               if (x+1>endColPoint) {
	                  x=startColPoint;   
	               }else x++;
	         }else {
	            y--;
	            if (x+1>endColPoint) {
	               x=startColPoint;
	            }else x++;
	         }
	         
	         if (magicArray[y][x]==0) {
	        	 	magicArray[y][x]=plusNum;
	         }else {
	            y= tempI;
	            x= tempJ;
	         
	            if (y+1>endRowPoint) {
	               y = startRowPoint;
	               magicArray[y][x] = plusNum;
	            }else {
	               magicArray[y+1][x] = plusNum;
	               y = y+1;
	            }
	         }
	         plusNum++;
	         }		
	}
	
	
	
	//리버싱 메서드
	public void reverseRowsACols(int startY,int startX,int RangeY, int RangeX) {
		for (int y = startY; y < RangeY; y++) {
			for (int x = startX; x < RangeX; x++) {
				magicArray[y+halfPoint][x] = magicArray[y][x] - magicArray[y+halfPoint][x];
				magicArray[y][x] = magicArray[y][x] - magicArray[y+halfPoint][x];
				magicArray[y+halfPoint][x] = magicArray[y][x] + magicArray[y+halfPoint][x];
			}
		}
	}
}
