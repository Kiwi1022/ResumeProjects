package ifs;

public class MapleIfs extends AffineTransform {
	
	String name = "Maple Leaf";
	int width=885;
	int height=702;
	int scale = 100;
	int xOffset = 340;
	int	yOffset = 445;
	int xDisp,yDisp;
		
	
			double[][] test = new double [][] {{0.51,0.00,0.01,0.14,1.31,0.08,0.1},
				{0.50,-0.45,0.52,0.43,0.75,-1.49,0.35},
				{0.47,0.47,-0.49,0.45,0.74,1.62,0.35},
				{0.51,0.00,0.00,0.49,-1.62,-0.02,0.2}};
			
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
					
				}public int getXoffset() {
					return this.xOffset;
				}
				
				public int getYoffset() {
					return this.yOffset;
				}	
			}


		
	


