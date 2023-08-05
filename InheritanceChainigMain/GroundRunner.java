package InheritanceChainigMain;

import InheritanceChaining.Ground;
import InheritanceChaining.Texture;

public class GroundRunner {
public static void main(String[] args) {
	Ground ground=new Ground("Strenth","Red",600,34);
	System.out.println(ground.color);
	System.out.println(ground.strucure);
	System.out.println(ground.porosity);
	System.out.println(ground.density);
	System.out.println("==========================");
	Ground texture=new Texture();
	System.out.println(texture.color);
	System.out.println(texture.strucure);
	System.out.println(texture.porosity);
	System.out.println(texture.density);
}
}
