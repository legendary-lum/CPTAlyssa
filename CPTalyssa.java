import arc.*;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class CPTalyssa{
	public static void main(String[] args){
		Console con = new Console("Connect 4", 800,800);
		
		// 2D Array Board
		int[][] intBoard = new int[6][7];
		//error in the array for 7
		
		con.setDrawColor(Color.BLUE);
		con.fillRect(37,130,700,610);		

		int intRect1;
		int intRectX = 0;
		for(intRect1 = 0; intRect1 < 6; intRect1++){
			con.setDrawColor(Color.BLACK);
			con.fillRect(135+intRectX,125,8,620);
			intRectX = intRectX + 100;
		}
		
		int intRect2;
		int intRectY = 0;
		for(intRect2 = 0; intRect2 < 5; intRect2++){
			con.setDrawColor(Color.BLACK);
			con.fillRect(37,630-intRectY,700,8);
			intRectY = intRectY + 100;
		}
		
		// Player 1 Gameplay
		
			String strP1 = " ";
			int intP1 = 0;
			String strP2 = " ";
			int intP2 = 0;
			int intCount1 = 0;
			int intCount2 = 0;
			int intCount3 = 0;
			int intCount4 = 0;
			int intCount5 = 0;
			int intCount6 = 0;
			int intCount7 = 0;
			int intX1 = 0;
			int intY1 = 750;
			int intX2 = 0;
			int intY2 = 750;
			int intX3 = 0;
			int intY3 = 750;
			int intX4 = 0;
			int intY4 = 750;			
			int intX5 = 0;
			int intY5 = 750;
			int intX6 = 0;
			int intY6 = 750;
			int intX7 = 0;
			int intY7 = 750;

			while(intCount1 <= 6 && intCount2 <= 6 && intCount3 <= 6 && intCount4 <= 6 && intCount5 <= 6 && intCount6 <= 6 && intCount7 <= 6){
			con.setDrawColor(Color.RED);
			
			con.println("Player 1: What column do you want to drop your piece?");
			strP1 = con.readLine();
			intP1 = Integer.parseInt(strP1);
			
				if(strP1.equalsIgnoreCase("1")){
					intBoard[intCount1][intP1-1] = 1;
					intCount1++;
					intX1 = 50;
					intY1 = intY1 - 100;					
					con.fillOval(intX1, intY1, 75, 75);
					boolean blnChecker = CPTtools.checker(intBoard);
					con.println(blnChecker);
				}else if(strP1.equalsIgnoreCase("2")){
					intBoard[intCount2][intP1-1] = 1;
					intCount2++;
					intX2 = 150;
					intY2 = intY2 - 100;
					con.fillOval(intX2, intY2, 75, 75);
					boolean blnChecker = CPTtools.checker(intBoard);
					con.println(blnChecker);
				}else if(strP1.equalsIgnoreCase("3")){
					intBoard[intCount3][intP1-1] = 1;
					intCount3++;
					intX3 = 250;
					intY3 = intY3 - 100;
					con.fillOval(intX3, intY3, 75, 75);
					boolean blnChecker = CPTtools.checker(intBoard);
					con.println(blnChecker);
				}else if(strP1.equalsIgnoreCase("4")){
					intBoard[intCount4][intP1-1] = 1;
					intCount4++;
					intX4 = 350;
					intY4 = intY4 - 100;
					con.fillOval(intX4, intY4, 75, 75);
					boolean blnChecker = CPTtools.checker(intBoard);
					con.println(blnChecker);
				}else if(strP1.equalsIgnoreCase("5")){
					intBoard[intCount5][intP1-1] = 1;
					intCount5++;
					intX5 = 450;
					intY5 = intY5 - 100;
					con.fillOval(intX5, intY5, 75, 75);
					boolean blnChecker = CPTtools.checker(intBoard);
					con.println(blnChecker);
				}else if(strP1.equalsIgnoreCase("6")){
					intBoard[intCount6][intP1-1] = 1;
					intCount6++;
					intX6 = 550;
					intY6 = intY6 - 100;
					con.fillOval(intX6, intY6, 75, 75);
					boolean blnChecker = CPTtools.checker(intBoard);
					con.println(blnChecker);
				}else if(strP1.equalsIgnoreCase("7")){
					intBoard[intCount7][intP1-1] = 1;
					intCount7++;
					intX7 = 650;
					intY7 = intY7 - 100;
					con.fillOval(intX7, intY7, 75, 75);
					boolean blnChecker = CPTtools.checker(intBoard);
					con.println(blnChecker);
				}
				// con.clear();
				
			con.setDrawColor(Color.YELLOW);

			con.println("Player 2: What column do you want to drop your piece?");
			strP2 = con.readLine();
			intP2 = Integer.parseInt(strP2);
				if(strP2.equalsIgnoreCase("1")){
					intBoard[intCount1][intP2-1] = 2;
					intCount1++;
					intX1 = 50;
					intY1 = intY1 - 100;					
					con.fillOval(intX1, intY1, 75, 75);
				}else if(strP2.equalsIgnoreCase("2")){
					intBoard[intCount2][intP2-1] = 2;
					intCount2++;
					intX2 = 150;
					intY2 = intY2 - 100;
					con.fillOval(intX2, intY2, 75, 75);
				}else if(strP2.equalsIgnoreCase("3")){
					intBoard[intCount3][intP2-1] = 2;
					intCount3++;
					intX3 = 250;
					intY3 = intY3 - 100;
					con.fillOval(intX3, intY3, 75, 75);
				}else if(strP2.equalsIgnoreCase("4")){
					intBoard[intCount4][intP2-1] = 2;
					intCount4++;
					intX4 = 350;
					intY4 = intY4 - 100;
					con.fillOval(intX4, intY4, 75, 75);
				}else if(strP2.equalsIgnoreCase("5")){
					intBoard[intCount5][intP2-1] = 2;
					intCount5++;
					intX5 = 450;
					intY5 = intY5 - 100;
					con.fillOval(intX5, intY5, 75, 75);
				}else if(strP2.equalsIgnoreCase("6")){
					intBoard[intCount6][intP2-1] = 2;
					intCount6++;
					intX6 = 550;
					intY6 = intY6 - 100;
					con.fillOval(intX6, intY6, 75, 75);
				}else if(strP2.equalsIgnoreCase("7")){
					intBoard[intCount7][intP2-1] = 2;
					intCount7++;
					intX7 = 650;
					intY7 = intY7 - 100;
					con.fillOval(intX7, intY7, 75, 75);
				}
				con.clear();

			}

	}
}
