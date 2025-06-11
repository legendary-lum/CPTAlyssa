// Name: Alyssa Lum
// Program: Connect 4
// Version: 1.67

import arc.*;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class CPTalyssa{
	public static Console con = new Console("Connect 4", 1280,720);
	public static String strP1 = " ";
	public static int intP1 = 0;
	public static String strP2 = " ";
	public static int intP2 = 0;
	public static int intCount1 = 0;
	public static int intCount2 = 0;
	public static int intCount3 = 0;
	public static int intCount4 = 0;
	public static int intCount5 = 0;
	public static int intCount6 = 0;
	public static int intCount7 = 0;
	public static int intX1 = 0;
	public static int intY1 = 700;
	public static int intX2 = 0;
	public static int intY2 = 700;
	public static int intX3 = 0;
	public static int intY3 = 700;
	public static int intX4 = 0;
	public static int intY4 = 700;			
	public static int intX5 = 0;
	public static int intY5 = 700;
	public static int intX6 = 0;
	public static int intY6 = 700;
	public static int intX7 = 0;
	public static int intY7 = 700;;
	public static int intPlayer1Wins = 0;
	public static int intPlayer2Wins = 0;
	public static void main(String[] args){
			
		// Main menu
		String strOption = "";
		while(!strOption.equalsIgnoreCase("q")){
		con.println("Welcome to Connect 4! Select where you would like to go with one of the letter in the brackets!");
		con.println("(p)lay");
		con.println("(v)iew leaderboard");
		con.println("(t)hemes");
		con.println("(c)reate theme");
		con.println("(q)uit");
		strOption = con.readLine();
		con.clear();
		
		String strPlayAgain = "";
		String strNames;
		String strWins;
		
		if(strOption.equalsIgnoreCase("p") || strPlayAgain.equalsIgnoreCase("y")){		
			// 2D Array Board
			int[][] intBoard = new int[6][7];

			// Drawing the grid/frame
			con.setDrawColor(Color.BLUE);
			con.fillRect(37,80,700,610);		

			int intRect1;
			int intRectX = 0;
			for(intRect1 = 0; intRect1 < 6; intRect1++){
				con.setDrawColor(Color.BLACK);
				con.fillRect(135+intRectX,75,8,620);
				intRectX = intRectX + 100;
			}
			
			int intRect2;
			int intRectY = 0;
			for(intRect2 = 0; intRect2 < 5; intRect2++){
				con.setDrawColor(Color.BLACK);
				con.fillRect(37,580-intRectY,700,8);
				intRectY = intRectY + 100;
			}
			
			// Player Gameplay
			// Defining and initiallizing variables
				String strName1;
				String strName2;
				strP1 = " ";
				intP1 = 0;
				strP2 = " ";
				intP2 = 0;
				intCount1 = 0;
				intCount2 = 0;
				intCount3 = 0;
				intCount4 = 0;
				intCount5 = 0;
				intCount6 = 0;
				intCount7 = 0;
				intX1 = 0;
				intY1 = 700;
				intX2 = 0;
				intY2 = 700;
				intX3 = 0;
				intY3 = 700;
				intX4 = 0;
				intY4 = 700;			
				intX5 = 0;
				intY5 = 700;
				intX6 = 0;
				intY6 = 700;
				intX7 = 0;
				intY7 = 700;
				
				con.println("Player 1 Enter Your Name");
				strName1 = con.readLine();
				con.clear();
				con.println("Player 2 Enter Your Name");
				strName2 = con.readLine();
				con.clear();
			
			// Gathering input and drawing for player 1/Red piece
				while(intCount1 <= 6 && intCount2 <= 6 
				&& intCount3 <= 6 && intCount4 <= 6 
				&& intCount5 <= 6 && intCount6 <= 6 
				&& intCount7 <= 6){
				con.setDrawColor(Color.RED);
				
				con.println(strName1+": What column do you want to drop your piece?");
				strP1 = con.readLine();
				intP1 = Integer.parseInt(strP1);
				
					if(strP1.equalsIgnoreCase("1")){
						intBoard[intCount1][intP1-1] = 1;
						intCount1++;
						intX1 = 50;
						intY1 = intY1 - 100;					
						con.fillOval(intX1, intY1, 75, 75);
					}else if(strP1.equalsIgnoreCase("2")){
						intBoard[intCount2][intP1-1] = 1;
						intCount2++;
						intX2 = 150;
						intY2 = intY2 - 100;
						con.fillOval(intX2, intY2, 75, 75);
					}else if(strP1.equalsIgnoreCase("3")){
						intBoard[intCount3][intP1-1] = 1;
						intCount3++;
						intX3 = 250;
						intY3 = intY3 - 100;
						con.fillOval(intX3, intY3, 75, 75);
					}else if(strP1.equalsIgnoreCase("4")){
						intBoard[intCount4][intP1-1] = 1;
						intCount4++;
						intX4 = 350;
						intY4 = intY4 - 100;
						con.fillOval(intX4, intY4, 75, 75);
					}else if(strP1.equalsIgnoreCase("5")){
						intBoard[intCount5][intP1-1] = 1;
						intCount5++;
						intX5 = 450;
						intY5 = intY5 - 100;
						con.fillOval(intX5, intY5, 75, 75);
					}else if(strP1.equalsIgnoreCase("6")){
						intBoard[intCount6][intP1-1] = 1;
						intCount6++;
						intX6 = 550;
						intY6 = intY6 - 100;
						con.fillOval(intX6, intY6, 75, 75);
					}else if(strP1.equalsIgnoreCase("7")){
						intBoard[intCount7][intP1-1] = 1;
						intCount7++;
						intX7 = 650;
						intY7 = intY7 - 100;
						con.fillOval(intX7, intY7, 75, 75);
					}
					
					int[][] intChecker = CPTtools.checker(intBoard);
					intChecker = CPTtools.checker(intBoard);
					if(intChecker[0][0] > -1){
						con.println(strName1+" is the WINNER");
						intPlayer1Wins = intPlayer1Wins + 1;						
						con.println(intChecker[0][0]+","+intChecker[0][1]+" and "+intChecker[3][0]+","+intChecker[3][1]);
						con.println("Play again? (y)es or (n)o");
						strPlayAgain = con.readLine();
						if(strPlayAgain.equalsIgnoreCase("y")){
							initializeBoard(intBoard);
							continue;
						}else{
							TextOutputFile leaderboard = new TextOutputFile("leaderboard.txt");
								leaderboard.println(strName1);
								leaderboard.println(intPlayer1Wins);
								leaderboard.println(strName2);
								leaderboard.println(intPlayer2Wins);
								intPlayer1Wins = 0;
								intPlayer2Wins = 0;
							leaderboard.close();
							
							TextInputFile wins = new TextInputFile("leaderboard.txt");
							while(wins.eof() == false){
								strNames = wins.readLine();
								strWins = wins.readLine();
								con.println(strNames);
								con.println(strWins);
							}
							wins.close();
							
							con.println("Hit enter to return to main menu");
							con.readLine();
							con.clear();
							
							break;
						}
					}
						con.clear();
					
			// Gathering input and drawing for player 2/Yellow piece
				con.setDrawColor(Color.YELLOW);

				con.println(strName2+": What column do you want to drop your piece?");
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
					intChecker = CPTtools.checker(intBoard);
					if(intChecker[0][0] > -1){
						con.println(strName2+" is the WINNER");	
						intPlayer2Wins = intPlayer2Wins + 1;						
						con.println(intChecker[0][0]+","+intChecker[0][1]+" and "+intChecker[3][0]+","+intChecker[3][1]);
						con.println("Play again? (y)es or (n)o");
						strPlayAgain = con.readLine();
						if(strPlayAgain.equalsIgnoreCase("y")){
							initializeBoard(intBoard);
							continue;
						}else{
							TextOutputFile leaderboard = new TextOutputFile("leaderboard.txt");
								leaderboard.println(strName1);
								leaderboard.println(intPlayer1Wins);
								leaderboard.println(strName2);
								leaderboard.println(intPlayer2Wins);
								intPlayer1Wins = 0;
								intPlayer2Wins = 0;
							leaderboard.close();
							
							TextInputFile wins = new TextInputFile("leaderboard.txt");
							while(wins.eof() == false){
								strNames = wins.readLine();
								strWins = wins.readLine();
								con.println(strNames);
								con.println(strWins);
							}
							wins.close();
							
							con.println("Hit enter to return to main menu");
							con.readLine();
							con.clear();
							
							break;
						}
					}		
					// drawLine(int intX1, int intY1, int intX2, int intY2) 
					
		}
		}else if(strOption.equalsIgnoreCase("v")){	
			TextInputFile leaderboard = new TextInputFile("leaderboard.txt");
			while(leaderboard.eof() == false){
				strNames = leaderboard.readLine();
				strWins = leaderboard.readLine();
				con.println(strNames);
				con.println(strWins);
			}
			leaderboard.close();
			
			con.println("Hit enter to return to main menu");
			con.readLine();
			con.clear();

		}else if(strOption.equalsIgnoreCase("q")){
			con.println("Thank You For Playing");
			con.sleep(2000);
			con.closeConsole();
			con.closeWindow();
		}
	}
	}
	// Redrawing and reinitializing array and drawing board
	public static void initializeBoard(int[][] intBoard){
		strP1 = " ";
		intP1 = 0;
		strP2 = " ";
		intP2 = 0;
		intCount1 = 0;
		intCount2 = 0;
		intCount3 = 0;
		intCount4 = 0;
		intCount5 = 0;
		intCount6 = 0;
		intCount7 = 0;
		intX1 = 0;
		intY1 = 700;
		intX2 = 0;
		intY2 = 700;
		intX3 = 0;
		intY3 = 700;
		intX4 = 0;
		intY4 = 700;			
		intX5 = 0;
		intY5 = 700;
		intX6 = 0;
		intY6 = 700;
		intX7 = 0;
		intY7 = 700;
		for(int intCol = 0; intCol <= 6; intCol++){
			for(int intRow = 0; intRow <= 5; intRow++){
				intBoard[intRow][intCol] = 0;
			}
		}
		con.setDrawColor(Color.BLUE);
		con.fillRect(37,80,700,610);		

		int intRect1;
		int intRectX = 0;
		for(intRect1 = 0; intRect1 < 6; intRect1++){
			con.setDrawColor(Color.BLACK);
			con.fillRect(135+intRectX,75,8,620);
			intRectX = intRectX + 100;
		}
			
		int intRect2;
		int intRectY = 0;
		for(intRect2 = 0; intRect2 < 5; intRect2++){
			con.setDrawColor(Color.BLACK);
			con.fillRect(37,580-intRectY,700,8);
			intRectY = intRectY + 100;
		}	
	}
}
