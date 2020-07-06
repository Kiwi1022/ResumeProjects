package ifs;

public class SierpinskiIfs extends AffineTransform {
	String name  = "Sierpinski Gasket";
	int width=519;
	int height=449;
	int scale = 500;
	int xOffset = 439;
	int	yOffset = 509;
	int xDisp,yDisp;
			
			double[][] test = {{0.50 ,0.00 ,0.00 ,0.50 ,0.00 ,0.00,0.33},
					{0.50 ,0.00, 0.00, 0.50 ,0.00 ,-0.50,0.33},
					{0.50, 0.00, 0.00, 0.50, -0.43 ,-0.25,0.34}};
				
public String getName() {
	return name;
}			

public double[][] getAffine(){

return test;
}





public double getScale() {
	return scale;
	
}

public int getHeight() {
	return height;
	
}

public int getWidth() {
	return width;
	
}



public int getXoffset() {
	return xOffset;}


public int getYoffset() {
	return yOffset;}



			}
			
				
				
