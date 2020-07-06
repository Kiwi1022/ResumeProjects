package stl;
import java.lang.Math; 
public class StlImage {

	private double minThick;
	private double thickScale;
	private double scale = 0.1;
	private double maxValue;
	
	public StlImage(double min, double max) {
		 this.minThick = min;
		this.thickScale = max - min;
	}
	
	public Solid createSolid(int [][] matrix) {
		Solid solid = new Solid();
		//a.find a maximum value in the array	               
		for(int row = 0; row < matrix.length; row++) {
		     for (int col = 0; col < matrix[row].length; col++ ) {
		    	 int value =matrix[row][col];
		    	 if( maxValue < value)
		         maxValue = value;}}
		      
		 //b every value except the last
		 int width = matrix.length;
	      int length = matrix[0].length;
	      for(int x = 0; x < width-1; x++) {
	    	  for(int y =0; y < length-1; y++) {
			      Vertex v1 = createlfsVertex(x,y,matrix[x][y] );
				  Vertex v2 = createlfsVertex(x+1,y,matrix[x+1][y] );
				  Vertex v3 = createlfsVertex(x+1,y+1,matrix[x+1][y+1] );	
				  Vertex v4 = createlfsVertex(x,y+1,matrix[x][y+1] );
			      solid.addFacet(v1,v2,v3,v4);

		}
	
	      }
		 //c Create side 1
		      Vertex A1 = new Vertex (0, 0, 0);
		      Vertex A2 = new Vertex (width * scale, 0, 0);
		      Vertex A3 = new Vertex (width * scale, 0, minThick);
		      Vertex A4 = new Vertex (0, 0, minThick);
		      solid.addFacet(A1,A2,A3,A4);
		 //d Create side 2
		      Vertex B1 = new Vertex (0, length * scale, 0);
		      Vertex B2 = new Vertex (0, 0, 0);
		      Vertex B3 = new Vertex (0, 0, minThick);
		      Vertex B4 = new Vertex (0, length * scale, minThick);
		      //add the four Vertex to Solid
		      solid.addFacet(B1,B2,B3,B4);
		 //e Create side 3
		      
		       Vertex C1 = new Vertex (width * scale, 0, 0);
		       Vertex C2 = new Vertex (width * scale, length * scale, 0);
		       Vertex C3 = new Vertex (width * scale, length * scale, minThick);
		       Vertex C4 = new Vertex (width * scale, 0, minThick);
		     // ▪ add the four Vertex to Solid
		       solid.addFacet(C1,C2,C3,C4);
		 //f Create side 4
		       Vertex D1 = new Vertex (width * scale, length * scale, 0);	
		       Vertex D2 = new Vertex (0, length * scale, 0);
		       Vertex D3 = new Vertex (0, length * scale, minThick);
		       Vertex D4 = new Vertex (width * scale, length * scale, minThick);
		       solid.addFacet(D1,D2,D3,D4);
		 //g Create bottom
		       Vertex E1 = new Vertex (0, 0, 0);
		       Vertex E2 = new Vertex (0, length * scale, 0);
		       Vertex E3 = new Vertex (width * scale, length * scale, 0);
		       Vertex E4 = new Vertex (width * scale, 0, 0);
		       solid.addFacet(E1,E2,E3,E4);
		      	       
		      
	 
		      
		return solid ;
	      }
	      private Vertex createlfsVertex(double x, double y, double z) {
		
		//i calculate the thickness
		double thickness = minThick + (thickScale *Math.sqrt(z/maxValue));
		
		//j create a new Vertex 
		 Vertex x1 = new Vertex (x*scale, y*scale, thickness);
		 
		//k
		return x1;
	      }
		
		
		
	} 
	
	
	

