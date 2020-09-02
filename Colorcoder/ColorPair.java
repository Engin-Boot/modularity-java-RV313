package Colorcoder;
import Colorcoder.Enum_beans.MajorColor;
import Colorcoder.Enum_beans.MinorColor;
	
	public class ColorPair {
        private MajorColor majorColor;
        private MinorColor minorColor;
        
        public ColorPair(MajorColor major, MinorColor minor)
        {
            majorColor = major;
            minorColor = minor;
        }
        public MajorColor getMajor() {
            return majorColor;
        }
        public MinorColor getMinor() {
            return minorColor;
        }
        String ToString() {
            String colorPairStr = MajorMinorLength.MajorColorNames[majorColor.getIndex()];
            colorPairStr += " ";
            colorPairStr += MajorMinorLength.MinorColorNames[minorColor.getIndex()];
            return colorPairStr;
        }
    };


