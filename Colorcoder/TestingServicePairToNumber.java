package Colorcoder;

import Colorcoder.Enum_beans.MajorColor;
import Colorcoder.Enum_beans.MinorColor;


public class TestingServicePairToNumber {

	static void testPairToNumber(MajorColor major, MinorColor minor,int expectedPairNumber){
		
	        int pairNumber = GettingServicePairNumberFromColor.GetPairNumberFromColor(major, minor);
	        System.out.println("Got pair number " + pairNumber);
	        assert(pairNumber == expectedPairNumber);
	    }
}
