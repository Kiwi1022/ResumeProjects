package stl;

public class Facet {
	private Vertex normal;
	private Vertex v1;
	private Vertex v2;
	private Vertex v3;
	
	public Facet (Vertex v1,Vertex v2, Vertex v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		 normal= Vertex.calcNormal(v1, v2, v3);

		
		
	}
	
	
   public String toString () {
	  
	   return "\nfacet normal "+ normal+"\nouter loop"+"\nvertex "+v1+ 
			   "\n vertex "+v2+"\n vertex "+v3+"\n endloop"+"\nendfacet\n";
		
		
		
		
	}
	
	
	
	
	
	
	
	

}

