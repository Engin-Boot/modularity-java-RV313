package Colorcoder;

import Colorcoder.Enum_beans.MajorColor;
import Colorcoder.Enum_beans.MinorColor;

public class GettingServiceColorFromPairNumber {

	 static ColorPair GetColorFromPairNumber(int pairNumber) {
	        int zeroBasedPairNumber = pairNumber - 1;
	        MajorColor majorColor =   MajorColor.fromIndex(zeroBasedPairNumber / MajorMinorLength.numberOfMinorColors);
	        MinorColor minorColor =   MinorColor.fromIndex(zeroBasedPairNumber %MajorMinorLength.numberOfMinorColors);
	        return new ColorPair(majorColor, minorColor);
	    }
}
