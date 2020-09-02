package Colorcoder;

import Colorcoder.Enum_beans.MajorColor;
import Colorcoder.Enum_beans.MinorColor;


public class TestingServiceNumberToPair {
	
	static void testNumberToPair(int pairNumber,MajorColor expectedMajor,MinorColor expectedMinor){
		        
		  ColorPair colorPair = GettingServiceColorFromPairNumber.GetColorFromPairNumber(pairNumber);
		  System.out.println("Got pair " + colorPair.ToString());
		  assert(colorPair.getMajor() == expectedMajor);
		  assert(colorPair.getMinor() == expectedMinor);
		
	}


}
