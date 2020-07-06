package ifs;

public class BarnsleyFernIfs extends AffineTransform {
	String name = "Barnsley Fern";
	int width = 1019;
	int height = 503;
	int scale = 100;
	int xOffset = 228;
	int	yOffset = 10;
	double x = 0;
		
			
			double[][] test = {{0.00,0.00,0.00,0.16,0.00,0.00,0.01},
					{0.85,0.04,-0.04,0.85,0.00,1.60,0.85},
					{0.20,-0.26,0.23,0.22,0.00,1.60,0.07},
					{-0.15,0.28,0.26,0.24,0.00,0.44,0.77}};
			
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
				return this.xOffset;
			}
			
			public int getYoffset() {
				return this.yOffset;
			}	
		}
