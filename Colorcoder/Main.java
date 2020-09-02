package Colorcoder;

import Colorcoder.Enum_beans.MajorColor;
import Colorcoder.Enum_beans.MinorColor;

public class Main {
    
	public static void main(String[] args) {
        TestingServiceNumberToPair.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        TestingServiceNumberToPair.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        TestingServicePairToNumber.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        TestingServicePairToNumber.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
