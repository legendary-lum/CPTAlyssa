import arc.*;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class CPTalyssa{
	public static void main(String[] args){
		Console con = new Console("Connect 4", 1000,700);
		
		// 2D Array
		String[][] strBoard = new String[6][7];
		strBoard[0][0] = "
		strBoard[0][1] = "
		strBoard[0][2] = "
		strBoard[0][3] = "
		strBoard[0][4] = "
		strBoard[0][5] = "
		strBoard[0][6] = "
		strBoard[0][7] = "
		strBoard[1][0] = "
		strBoard[1][1] = "
		strBoard[1][2] = "
		strBoard[1][3] = "
		strBoard[1][4] = "
		strBoard[1][5] = "
		strBoard[1][6] = "
		strBoard[1][7] = "
		strBoard[2][0] = "
		
		// Player 1 Gameplay
		
			String strP1;
			String strP2;
			intCount;
			intCount1 = 0;
			intCount2 = 0;
			intCount3 = 0;
			intCount4 = 0;
			intCount5 = 0;
			intCount6 = 0;
			
			while(it doesn't fill up all the areas){
			con.println("What column do you want to drop your piece?");
			strP1 = con.readLine();
				if(strP1.equalsIgnoreCase("1")){
					intCount = intCount1;
				}else if(strP1.equalsIgnoreCase("2")){
					intCount = intCount2;
				}
			while(intCount1 <= 6){
				strBoard[intCount][strP1] = strP1;
				intCount++;
			
			
		/*	int intX1 = 0;
			int intY1 = 625;
			
			con.setDrawColor(Color.RED);
			
			if(strP1.equalsIgnoreCase("1")){
				intX1 = intX1 + 50;
				intY1 = intY1 - 50;
			}
			con.fillOval(intX1, intY1, 75, 75);
		// String strData1 = CPTtools.player1(strP1);
			
			String strP2;
			con.println("What column do you want to drop your piece?");
			strP2 = con.readLine();
			
			int intX2 = 0;
			int intY2 = 625;
			
			con.setDrawColor(Color.YELLOW);
			
			if(strP1.equalsIgnoreCase("1")){
				intX1 = intX1 + 50;
				intY1 = intY1 - 50;
			}
			con.fillOval(intX1, intY1, 75, 75);*/
		
	}
}
