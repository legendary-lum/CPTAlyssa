import arc.*;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class CPTtools{
	public static int[][] checker(int[][] intboard){
		int[][] intMatch = new int[4][2];
		// boolean blnMatch = false;
		
		int intRowCheck;
		int intColumnCheck;
		
		intMatch[0][0] = -1;
		
		// checking horizontal matches
		for(intRowCheck = 0; intRowCheck <= 5; intRowCheck++){
			for(intColumnCheck = 0; intColumnCheck <= 3; intColumnCheck++){
				if(intboard[intRowCheck][intColumnCheck] == intboard[intRowCheck][intColumnCheck+1] 
				&& intboard[intRowCheck][intColumnCheck+1] == intboard[intRowCheck][intColumnCheck+2] 
				&& intboard[intRowCheck][intColumnCheck+2] == intboard[intRowCheck][intColumnCheck+3] 
				&& intboard[intRowCheck][intColumnCheck] > 0){
					intMatch[0][0] = intRowCheck;
					intMatch[0][1] = intColumnCheck;
					intMatch[1][0] = intRowCheck;
					intMatch[1][1] = intColumnCheck+1;
					intMatch[2][0] = intRowCheck;
					intMatch[2][1] = intColumnCheck+2;
					intMatch[3][0] = intRowCheck;
					intMatch[3][1] = intColumnCheck+3;
					
					return intMatch;
					// blnMatch = true;
				}
			}
		}
		// checking vertical matches
		for(intRowCheck = 0; intRowCheck <= 2; intRowCheck++){
			for(intColumnCheck = 0; intColumnCheck <= 5; intColumnCheck++){
				if(intboard[intRowCheck][intColumnCheck] == intboard[intRowCheck+1][intColumnCheck] 
				&& intboard[intRowCheck+1][intColumnCheck] == intboard[intRowCheck+2][intColumnCheck] 
				&& intboard[intRowCheck+2][intColumnCheck] == intboard[intRowCheck+3][intColumnCheck] 
				&& intboard[intRowCheck][intColumnCheck] > 0){
					intMatch[0][0] = intColumnCheck;
					intMatch[0][1] = intRowCheck;
					intMatch[1][0] = intColumnCheck;
					intMatch[1][1] = intRowCheck+1;
					intMatch[2][0] = intColumnCheck;
					intMatch[2][1] = intRowCheck+2;
					intMatch[3][0] = intColumnCheck;
					intMatch[3][1] = intRowCheck+3;

					return intMatch;
					// blnMatch = true;
				}
			}
		}
		
		// checking diagonal matches
		for(intRowCheck = 2; intRowCheck >= 0; intRowCheck--){
			for(intColumnCheck = 0; intColumnCheck <= 3; intColumnCheck++){
				if(intboard[intRowCheck][intColumnCheck] == intboard[intRowCheck+1][intColumnCheck+1] 
				&& intboard[intRowCheck+1][intColumnCheck+1] == intboard[intRowCheck+2][intColumnCheck+2] 
				&& intboard[intRowCheck+2][intColumnCheck+2] == intboard[intRowCheck+3][intColumnCheck+3]
				&& intboard[intRowCheck][intColumnCheck] > 0){
					intMatch[0][0] = intColumnCheck;
					intMatch[0][1] = intRowCheck;
					intMatch[1][0] = intColumnCheck+1;
					intMatch[1][1] = intRowCheck+1;
					intMatch[2][0] = intColumnCheck+2;
					intMatch[2][1] = intRowCheck+2;
					intMatch[3][0] = intColumnCheck+3;
					intMatch[3][1] = intRowCheck+3;

					return intMatch;
					// blnMatch = true;
				}
			}
		}
		
		for(intRowCheck = 2; intRowCheck >= 0; intRowCheck--){
			for(intColumnCheck = 6; intColumnCheck >= 3; intColumnCheck--){
				if(intboard[intRowCheck][intColumnCheck] == intboard[intRowCheck+1][intColumnCheck-1] 
				&& intboard[intRowCheck+1][intColumnCheck-1] == intboard[intRowCheck+2][intColumnCheck-2] 
				&& intboard[intRowCheck+2][intColumnCheck-2] == intboard[intRowCheck+3][intColumnCheck-3] 
				&& intboard[intRowCheck][intColumnCheck] > 0){
					intMatch[0][0] = intColumnCheck;
					intMatch[0][1] = intRowCheck;
					intMatch[1][0] = intColumnCheck-1;
					intMatch[1][1] = intRowCheck+1;
					intMatch[2][0] = intColumnCheck-2;
					intMatch[2][1] = intRowCheck+2;
					intMatch[3][0] = intColumnCheck-3;
					intMatch[3][1] = intRowCheck+3;

					return intMatch;
					// blnMatch = true;
				}
			}
		}		
		return intMatch;
		//return blnMatch;
		// this will return the array for the coordinates of where to print the line
		// the line will indicate where the connect four is
	}
}
