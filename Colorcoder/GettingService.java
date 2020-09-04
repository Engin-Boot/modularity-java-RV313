package Colorcoder;

import Colorcoder.Enum_beans.MajorColor;
import Colorcoder.Enum_beans.MinorColor;

public class GettingService{

	 static ColorPair GetColorFromPairNumber(int pairNumber) {
	        int zeroBasedPairNumber = pairNumber - 1;
	        MajorColor majorColor =   MajorColor.fromIndex(zeroBasedPairNumber / MajorMinorLength.numberOfMinorColors);
	        MinorColor minorColor =   MinorColor.fromIndex(zeroBasedPairNumber %MajorMinorLength.numberOfMinorColors);
	        return new ColorPair(majorColor, minorColor);
	    }
	static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * MajorMinorLength.numberOfMinorColors + minor.getIndex() + 1;
    }
	 public static IndexColor fromIndex(Object[] colors, int index) {
	        for(Object obj: colors) {
	        	IndexColor color = (IndexColor)obj;
	            if(color.getIndex() == index) {
	                return color;
	            }
	        }
	        return null;
	    }
	
}
