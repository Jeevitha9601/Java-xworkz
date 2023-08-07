package MethodChainingMain;

import MethodChaining.IronBox;

public class IronBoxRunner {
public static void main(String[] args) {
	IronBox ironBox=new IronBox();
	ironBox.heat();
	ironBox.heat(567f,"FGV");
}
}
