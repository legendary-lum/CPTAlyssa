// Name: Alyssa Lum
// Program: Connect 4
// Date Created: May 27, 2025
// Version: 1.67
// Description: Connect 4 Game created on java

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
	public static String strTheme = "Classic";
	public static int intBoardr = 0;
	public static int intBoardg = 0;
	public static int intBoardb = 255;
	public static int intPlayer1r = 255;
	public static int intPlayer1g = 0;
	public static int intPlayer1b = 0;
	public static int intPlayer2r = 255;
	public static int intPlayer2g = 255;
	public static int intPlayer2b = 0;
	public static String strTitle = "";
	public static String[][] strtheme = new String [][] { {"","",""},
														{"","",""},
														{"","",""},
														{"","",""},
														{"","",""}};
	public static int[][] inttheme = new int [][] { {0,0,0,0,0,0,0,0,0},
													{0,0,0,0,0,0,0,0,0},
													{0,0,0,0,0,0,0,0,0},
													{0,0,0,0,0,0,0,0,0},
													{0,0,0,0,0,0,0,0,0}};
	public static int intThemeCount = 0;
	public static String[] strNames = new String [] {"", "", "", "", "", "", "", "", "", ""};
	public static int[] intWins = new int [] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static int intIndexLead = 0;
	public static int intCountLead;
	public static int intCountLead2;
	public static String strNamesTemp;
	public static int intWinsTemp;
	public static void main(String[] args){
	
	TextInputFile lastthemeopen = new TextInputFile("lasttheme.txt");
	String strThemeName = lastthemeopen.readLine();
	System.out.println(strThemeName);
	
	TextInputFile checkthemes = new TextInputFile("themes.txt");
		while(checkthemes.eof() == false){
			String strCheckName = checkthemes.readLine();
		
			if(strCheckName.equalsIgnoreCase(strThemeName)){
				strTheme = strThemeName;
				intPlayer1r = checkthemes.readInt();
				intPlayer1g = checkthemes.readInt();
				intPlayer1b = checkthemes.readInt();
				intPlayer2r = checkthemes.readInt();
				intPlayer2g = checkthemes.readInt();
				intPlayer2b = checkthemes.readInt();
				intBoardr = checkthemes.readInt();
				intBoardg = checkthemes.readInt();
				intBoardb = checkthemes.readInt();
				strTitle = checkthemes.readLine();
			}
		}
	
		// Main menu
		String strOption = "";
		while(!strOption.equalsIgnoreCase("q")){
		con.println("Welcome to Connect 4! Select where you would like to go with one of the letter in the brackets!");
		con.println("(P)lay");
		con.println("(V)iew leaderboard");
		con.println("(T)hemes");
		con.println("(C)reate theme");
		con.println("(H)elp");		
		con.println("(Q)uit");
		strOption = con.readLine();
		con.clear();
		
		String strPlayAgain = "";
		String strNames;
		String strWins;
		
		if(strOption.equalsIgnoreCase("p") || strPlayAgain.equalsIgnoreCase("y")){	
			
			// 2D Array Board
			int[][] intBoard = new int[6][7];

			// Drawing the grid/frame/column numbers/title
			con.drawString(strTitle, 500, 5);	
			con.drawString("____________________", 440, 17);
			con.drawString("1", 580, 45);
			con.drawString("2", 680, 45);
			con.drawString("3", 780, 45);
			con.drawString("4", 880, 45);
			con.drawString("5", 980, 45);
			con.drawString("6", 1080, 45);
			con.drawString("7", 1180, 45);
			
			con.setDrawColor(new Color(intBoardr, intBoardg, intBoardb));
			con.fillRect(537,80,700,610);		

			int intRect1;
			int intRectX = 0;
			for(intRect1 = 0; intRect1 < 6; intRect1++){
				con.setDrawColor(Color.BLACK);
				con.fillRect(635+intRectX,75,8,620);
				intRectX = intRectX + 100;
			}
			
			int intRect2;
			int intRectY = 0;
			for(intRect2 = 0; intRect2 < 5; intRect2++){
				con.setDrawColor(Color.BLACK);
				con.fillRect(537,580-intRectY,700,8);
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
			
			// Gathering input and drawing for player 1
				while(intCount1 <= 6 && intCount2 <= 6 
					&& intCount3 <= 6 && intCount4 <= 6 
					&& intCount5 <= 6 && intCount6 <= 6 
					&& intCount7 <= 6){
				
				if(intCount1 == 6 && intCount2 == 6 
					&& intCount3 == 6 && intCount4 == 6 
					&& intCount5 == 6 && intCount6 == 6 
					&& intCount7 == 6){
						con.println("TIE: no winner");
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
							
							con.clear();
							
							printleaderboard();
							
							con.println("Hit enter to return to main menu");
							con.readLine();
							con.clear();
							
							break;
						}
						
				}else{
					con.setDrawColor(new Color(intPlayer1r, intPlayer1g, intPlayer1b));
					
					con.println(strName1+": What column do you want to drop your piece?");
					strP1 = con.readLine();
					intP1 = Integer.parseInt(strP1);
					
						if(strP1.equalsIgnoreCase("1")){
							intBoard[intCount1][intP1-1] = 1;
							intCount1++;
							intX1 = 550;
							intY1 = intY1 - 100;					
							con.fillOval(intX1, intY1, 75, 75);
						}else if(strP1.equalsIgnoreCase("2")){
							intBoard[intCount2][intP1-1] = 1;
							intCount2++;
							intX2 = 650;
							intY2 = intY2 - 100;
							con.fillOval(intX2, intY2, 75, 75);
						}else if(strP1.equalsIgnoreCase("3")){
							intBoard[intCount3][intP1-1] = 1;
							intCount3++;
							intX3 = 750;
							intY3 = intY3 - 100;
							con.fillOval(intX3, intY3, 75, 75);
						}else if(strP1.equalsIgnoreCase("4")){
							intBoard[intCount4][intP1-1] = 1;
							intCount4++;
							intX4 = 850;
							intY4 = intY4 - 100;
							con.fillOval(intX4, intY4, 75, 75);
						}else if(strP1.equalsIgnoreCase("5")){
							intBoard[intCount5][intP1-1] = 1;
							intCount5++;
							intX5 = 950;
							intY5 = intY5 - 100;
							con.fillOval(intX5, intY5, 75, 75);
						}else if(strP1.equalsIgnoreCase("6")){
							intBoard[intCount6][intP1-1] = 1;
							intCount6++;
							intX6 = 1050;
							intY6 = intY6 - 100;
							con.fillOval(intX6, intY6, 75, 75);
						}else if(strP1.equalsIgnoreCase("7")){
							intBoard[intCount7][intP1-1] = 1;
							intCount7++;
							intX7 = 1150;
							intY7 = intY7 - 100;
							con.fillOval(intX7, intY7, 75, 75);
						}
						
						int[][] intChecker = CPTtools.checker(intBoard);
						intChecker = CPTtools.checker(intBoard);
						if(intChecker[0][0] > -1){
							con.println(strName1+" is the WINNER");
							intPlayer1Wins = intPlayer1Wins + 1;						
							
							// Idea of printing a line with the coordinates from the array
							// con.setDrawColor(Color.WHITE)
							// con.drawLine(intChecker[0][0], intChecker[0][0], intChecker[3][0], intChecker[3][1]); 						
							// con.println(intChecker[0][0]+","+intChecker[0][1]+" and "+intChecker[3][0]+","+intChecker[3][1]);
							
							con.println("Play again? (y)es or (n)o");
							strPlayAgain = con.readLine();
							if(strPlayAgain.equalsIgnoreCase("y")){
								initializeBoard(intBoard);
								continue;
							// Adding wins to leaderboard
							}else{
								TextOutputFile leaderboard = new TextOutputFile("leaderboard.txt", true);
									leaderboard.println(strName1);
									leaderboard.println(intPlayer1Wins);
									leaderboard.println(strName2);
									leaderboard.println(intPlayer2Wins);
									intPlayer1Wins = 0;
									intPlayer2Wins = 0;
								leaderboard.close();
						
								
								con.clear();
								
								printleaderboard();
																
								con.println("Hit enter to return to main menu");
								con.readLine();
								con.clear();
								
								break;
							}
						}
							con.clear();
						
				// Gathering input and drawing for player 2
					con.setDrawColor(new Color(intPlayer2r, intPlayer2g, intPlayer2b));

					con.println(strName2+": What column do you want to drop your piece?");
					strP2 = con.readLine();
					intP2 = Integer.parseInt(strP2);
						if(strP2.equalsIgnoreCase("1")){
							intBoard[intCount1][intP2-1] = 2;
							intCount1++;
							intX1 = 550;
							intY1 = intY1 - 100;					
							con.fillOval(intX1, intY1, 75, 75);
						}else if(strP2.equalsIgnoreCase("2")){
							intBoard[intCount2][intP2-1] = 2;
							intCount2++;
							intX2 = 650;
							intY2 = intY2 - 100;
							con.fillOval(intX2, intY2, 75, 75);
						}else if(strP2.equalsIgnoreCase("3")){
							intBoard[intCount3][intP2-1] = 2;
							intCount3++;
							intX3 = 750;
							intY3 = intY3 - 100;
							con.fillOval(intX3, intY3, 75, 75);
						}else if(strP2.equalsIgnoreCase("4")){
							intBoard[intCount4][intP2-1] = 2;
							intCount4++;
							intX4 = 850;
							intY4 = intY4 - 100;
							con.fillOval(intX4, intY4, 75, 75);
						}else if(strP2.equalsIgnoreCase("5")){
							intBoard[intCount5][intP2-1] = 2;
							intCount5++;
							intX5 = 950;
							intY5 = intY5 - 100;
							con.fillOval(intX5, intY5, 75, 75);
						}else if(strP2.equalsIgnoreCase("6")){
							intBoard[intCount6][intP2-1] = 2;
							intCount6++;
							intX6 = 1050;
							intY6 = intY6 - 100;
							con.fillOval(intX6, intY6, 75, 75);
						}else if(strP2.equalsIgnoreCase("7")){
							intBoard[intCount7][intP2-1] = 2;
							intCount7++;
							intX7 = 1150;
							intY7 = intY7 - 100;
							con.fillOval(intX7, intY7, 75, 75);
						}
						con.clear();
						intChecker = CPTtools.checker(intBoard);
						if(intChecker[0][0] > -1){
							con.println(strName2+" is the WINNER");	
							intPlayer2Wins = intPlayer2Wins + 1;
							
							// Idea of printing a line with the coordinates from the array
							// con.setDrawColor(Color.WHITE)
							// con.drawLine(intChecker[0][0], intChecker[0][0], intChecker[3][0], intChecker[3][1]); 						
							// con.println(intChecker[0][0]+","+intChecker[0][1]+" and "+intChecker[3][0]+","+intChecker[3][1]);
							
							con.println("Play again? (y)es or (n)o");
							strPlayAgain = con.readLine();
							if(strPlayAgain.equalsIgnoreCase("y")){
								initializeBoard(intBoard);
								continue;
							// Adding wins to leaderboard
							}else{
								TextOutputFile leaderboard = new TextOutputFile("leaderboard.txt", true);
									leaderboard.println(strName1);
									leaderboard.println(intPlayer1Wins);
									leaderboard.println(strName2);
									leaderboard.println(intPlayer2Wins);
									intPlayer1Wins = 0;
									intPlayer2Wins = 0;
								leaderboard.close();
								
								con.clear();
								
								printleaderboard();
																
								con.println("Hit enter to return to main menu");
								con.readLine();
								con.clear();
								
								break;
							}
						}		
					}
		}
		// View leaderboard
		}else if(strOption.equalsIgnoreCase("v")){	
			printleaderboard();
			
			con.println("Hit enter to return to main menu");
			con.readLine();
			con.clear();
			
		// View themes (can load in your own themes file)
		}else if(strOption.equalsIgnoreCase("t")){
			TextInputFile themes = new TextInputFile("themes.txt");
			intThemeCount = 0;
			while(themes.eof() == false){	
				strtheme[intThemeCount][0] = themes.readLine();
				inttheme[intThemeCount][0] = themes.readInt();
				inttheme[intThemeCount][1] = themes.readInt();
				inttheme[intThemeCount][2] = themes.readInt();
				inttheme[intThemeCount][3] = themes.readInt();
				inttheme[intThemeCount][4] = themes.readInt();
				inttheme[intThemeCount][5] = themes.readInt();
				inttheme[intThemeCount][6] = themes.readInt();
				inttheme[intThemeCount][7] = themes.readInt();
				inttheme[intThemeCount][8] = themes.readInt();
				strtheme[intThemeCount][1] = themes.readLine();
				intThemeCount++;
			}
			con.println("Select a theme by entering the number");
			con.println("1: "+strtheme[0][0]);
			con.println("2: "+strtheme[1][0]);
			con.println("3: "+strtheme[2][0]);
			con.println("4: "+strtheme[3][0]);
			con.println("5: "+strtheme[4][0]);
			String strThemeChosen = con.readLine();
			
			int intIndex = 0;
			if(strThemeChosen.equalsIgnoreCase("1")){				
				intIndex = 0;
			}else if(strThemeChosen.equalsIgnoreCase("2")){				
				intIndex = 1;
			}else if(strThemeChosen.equalsIgnoreCase("3")){				
				intIndex = 2;
			}else if(strThemeChosen.equalsIgnoreCase("4")){				
				intIndex = 3;
			}else if(strThemeChosen.equalsIgnoreCase("5")){				
				intIndex = 4;
			}
			
				strTheme = strtheme[intIndex][0];
				intPlayer1r = inttheme[intIndex][0];
				intPlayer1g = inttheme[intIndex][1];
				intPlayer1b = inttheme[intIndex][2];
				intPlayer2r = inttheme[intIndex][3];
				intPlayer2g = inttheme[intIndex][4];
				intPlayer2b = inttheme[intIndex][5];
				intBoardr = inttheme[intIndex][6];
				intBoardg = inttheme[intIndex][7];
				intBoardb = inttheme[intIndex][8];
				strTitle = strtheme[intIndex][1];
		
				TextOutputFile lasttheme = new TextOutputFile("lasttheme.txt");
				lasttheme.println(strTheme);
				lasttheme.close();
			
				con.clear();
		// Create your own theme (customize colours)
		}else if(strOption.equalsIgnoreCase("c")){
			TextInputFile themes = new TextInputFile("themes.txt");
			intThemeCount = 0;
			while(themes.eof() == false){	
				strtheme[intThemeCount][0] = themes.readLine();
				inttheme[intThemeCount][0] = themes.readInt();
				inttheme[intThemeCount][1] = themes.readInt();
				inttheme[intThemeCount][2] = themes.readInt();
				inttheme[intThemeCount][3] = themes.readInt();
				inttheme[intThemeCount][4] = themes.readInt();
				inttheme[intThemeCount][5] = themes.readInt();
				inttheme[intThemeCount][6] = themes.readInt();
				inttheme[intThemeCount][7] = themes.readInt();
				inttheme[intThemeCount][8] = themes.readInt();
				strtheme[intThemeCount][1] = themes.readLine();
				intThemeCount++;
			}
			themes.close();
			
			TextOutputFile createtheme = new TextOutputFile ("themes.txt", true);
			con.println("Come up with a name for your theme");
			String strCreateName = con.readLine();
			createtheme.println(strCreateName);
			
			con.println("Type a number from 0-255 for the r of player 1's piece");
			int intCreateP1r = con.readInt();
			createtheme.println(intCreateP1r);
			
			con.println("Type a number from 0-255 for the g of player 1's piece");
			int intCreateP1g = con.readInt();
			createtheme.println(intCreateP1g);
			
			con.println("Type a number from 0-255 for the b of player 1's piece");
			int intCreateP1b = con.readInt();
			createtheme.println(intCreateP1b);
			
			con.println("Type a number from 0-255 for the r of player 2's piece");
			int intCreateP2r = con.readInt();
			createtheme.println(intCreateP2r);
			
			con.println("Type a number from 0-255 for the g of player 2's piece");
			int intCreateP2g = con.readInt();
			createtheme.println(intCreateP2g);
			
			con.println("Type a number from 0-255 for the b of player 2's piece");
			int intCreateP2b = con.readInt();
			createtheme.println(intCreateP2b);
			
			con.println("Type a number from 0-255 for the r of the board");
			int intCreateBoardr = con.readInt();
			createtheme.println(intCreateBoardr);
			
			con.println("Type a number from 0-255 for the g of the board");
			int intCreateBoardg = con.readInt();
			createtheme.println(intCreateBoardg);
			
			con.println("Type a number from 0-255 for the b of the board");
			int intCreateBoardb = con.readInt();
			createtheme.println(intCreateBoardb);
			
			con.println("Come up with a title for your theme");
			String strCreateTitle = con.readLine();
			createtheme.println(strCreateTitle);
			
			createtheme.close();
			
			con.clear();
		
		// Help desk
		}else if(strOption.equalsIgnoreCase("h")){
			con.println("How to play:");
			con.println("Players identify themselves as player 1 or player 2.");
			con.println("They drop/choose desired column that the discs will 'fall' into on the grid.");
			con.println("The goal is to stack their colored discs upwards, horizontally, or diagonally");
			con.println("Note: use strategy to block opponents while aiming to be the first player to get 4 in a row to win.");
			
			con.println("Hit enter to return to main menu");
			con.readLine();
			con.clear();
			
		}else if(strOption.equalsIgnoreCase("s")){
			con.println("Why don’t Connect Four players ever get into arguments? say wh(y)/type y.");
			char chrresponse = con.readChar();
			if(chrresponse == 'y'){
				con.println("Because they always know when to DROP it!");
				con.sleep(1000);
				con.println("If you don't get it it's because you drop the pieces into the board and drop arguments");
			}else{
				con.println("Okay no joke for you.");
			}
			
			con.sleep(1000);
			con.println("Hit enter to return to main menu");
			con.readLine();
			con.clear();
			
		// Quit the game (close console)
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
		con.setDrawColor(new Color(intBoardr, intBoardg, intBoardb));
		con.fillRect(537,80,700,610);		

		int intRect1;
		int intRectX = 0;
		for(intRect1 = 0; intRect1 < 6; intRect1++){
			con.setDrawColor(Color.BLACK);
			con.fillRect(635+intRectX,75,8,620);
			intRectX = intRectX + 100;
		}
			
		int intRect2;
		int intRectY = 0;
		for(intRect2 = 0; intRect2 < 5; intRect2++){
			con.setDrawColor(Color.BLACK);
			con.fillRect(537,580-intRectY,700,8);
			intRectY = intRectY + 100;
			
		}	
	}
	public static void printleaderboard(){
		TextInputFile wins = new TextInputFile("leaderboard.txt");
		
		String[] strNames = new String[] {"", "", "", "", "", "", "", "", "", ""};
		int[] intWins = new int [] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};;
		int intIndexLead = 0;
		int intCountLead = 0;
		int intCountLead2 = 0;
		String strNamesTemp = "";
		int intWinsTemp = 0;
		
		while(wins.eof() == false){
			strNames[intIndexLead] = wins.readLine();
			intWins[intIndexLead] = wins.readInt();
	
			intIndexLead++;
		}
		System.out.println("Unsorted leaderboard");
		for(intCountLead = 0; intCountLead < intIndexLead; intCountLead++){
			System.out.println(strNames[intCountLead] + ": " + intWins[intCountLead]);
		}
		
		// bubble sort in descending order	
		for(intCountLead2 = 0; intCountLead2 < intIndexLead-1; intCountLead2++){
			for(intCountLead = 0; intCountLead < intIndexLead-1; intCountLead++){
				if(intWins[intCountLead] < intWins[intCountLead+1]){
					// Swap Wins
					intWinsTemp = intWins[intCountLead];
					intWins[intCountLead] = intWins[intCountLead+1];
					intWins[intCountLead+1] = intWinsTemp;
										
					// Swap Names
					strNamesTemp = strNames[intCountLead];
					strNames[intCountLead] = strNames[intCountLead+1];
					strNames[intCountLead+1] = strNamesTemp;
								
				}
			}
		}
		
		for(intCountLead = 0; intCountLead < intIndexLead; intCountLead++){
			con.println(strNames[intCountLead] + ": " + intWins[intCountLead]);
		}

		return;
	}
		
}
