package Colorcoder;

import Colorcoder.Enum_beans.MajorColor;
import Colorcoder.Enum_beans.MinorColor;

public class GettingServicePairNumberFromColor {

	static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * MajorMinorLength.numberOfMinorColors + minor.getIndex() + 1;
    }
}
