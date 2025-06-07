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
					intMatch[0][0] = 0;
					intMatch[0][1] = intColumnCheck;
					intMatch[1][0] = 0;
					intMatch[1][1] = intColumnCheck+1;
					intMatch[2][0] = 0;
					intMatch[2][1] = intColumnCheck+2;
					intMatch[3][0] = 0;
					intMatch[3][1] = intColumnCheck+3;
					blnMatch = true;
				}
			}
		}
				
		return blnMatch;
	}
}
