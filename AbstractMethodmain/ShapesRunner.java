package AbstractMethodmain;

import AbstractClassAndMethod.Rectangular;
import AbstractClassAndMethod.Shape;

public class ShapesRunner {

	public static void main(String[] args) {
		Shape shape = new Rectangular();
		shape.circle();
		shape.definitions();
		shape.names();
		shape.proerties();
		shape.size();
		shape.square();
		shape.ThreeDShape();
		shape.triangle();
		shape.twoDShape();

	}

}
