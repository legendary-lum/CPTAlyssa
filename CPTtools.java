import arc.*;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class CPTtools{
	public static boolean checker(int[][] intboard){
		int[][] intMatch = new int[4][2];
		boolean blnMatch = false;
		
		int intRowCheck;
		int intColumnCheck;
		
		for(intRowCheck = 0; intRowCheck <= 5; intRowCheck++){
			for(intColumnCheck = 0; intColumnCheck <= 3; intColumnCheck++){
				if(intboard[intRowCheck][intColumnCheck] == 1 && intboard[intRowCheck][intColumnCheck+1] == 1 && intboard[intRowCheck][intColumnCheck+2] == 1 && intboard[intRowCheck][intColumnCheck+3] == 1){
					intMatch[0][0] = intRowCheck;
					intMatch[0][1] = intColumnCheck;
					intMatch[1][0] = intRowCheck;
					intMatch[1][1] = intColumnCheck+1;
					intMatch[2][0] = intRowCheck;
					intMatch[2][1] = intColumnCheck+2;
					intMatch[3][0] = intRowCheck;
					intMatch[3][1] = intColumnCheck+3;
					blnMatch = true;
				}
			}
		}
	 
		for(intRowCheck = 0; intRowCheck <= 5; intRowCheck++){
			for(intColumnCheck = 0; intColumnCheck <= 3; intColumnCheck++){
				if(intboard[intColumnCheck][intRowCheck] == 1 && intboard[intColumnCheck+1][intRowCheck] == 1 && intboard[intColumnCheck+2][intRowCheck] == 1 && intboard[intColumnCheck+3][intRowCheck] == 1){
					intMatch[0][0] = intColumnCheck;
					intMatch[0][1] = intRowCheck;
					intMatch[1][0] = intColumnCheck;
					intMatch[1][1] = intRowCheck+1;
					intMatch[2][0] = intColumnCheck;
					intMatch[2][1] = intRowCheck+2;
					intMatch[3][0] = intColumnCheck;
					intMatch[3][1] = intRowCheck+3;

					blnMatch = true;
				}
			}
		}
				
		return blnMatch;
	}
}
