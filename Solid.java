package stl;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class Solid {
	
private String name;
private List <Facet> Lf = new ArrayList <Facet>() ;





public  Solid() {
	name = "";
}

public  Solid(String name) {
	this.name = name ;
}

public boolean addFacet(Facet facet) {
	

	Lf.add(facet);
	
	return true;

	
} 
public boolean addFacet(Vertex... vertices) {
	// a
	if (vertices.length < 3) {
	return false;}
	//b
	
	else {
		
		int number;
	number = vertices.length;
	for(int i = 3; i < number; i++) {
		int left = vertices.length%3;
		
	if (left == 0) {
	Facet facet1 = new Facet(vertices[0], vertices[1], vertices[2]);
	Lf.add(facet1);}
	
	if (left == 1) {Facet facet1 = new Facet(vertices[0], vertices[2], vertices[3]);
	Lf.add(facet1);}
	
	else if (left == 2) {Facet facet3 = new Facet(vertices[0], vertices[2], vertices[3]);
	Facet facet2 = new Facet(vertices[0], vertices[3], vertices[4]);
	Lf.add(facet3);
	Lf.add(facet2);}
	}
	return true;
	
	}
}




public String toString() {

return  "solid " +name + "\n";
}

public void print(PrintWriter printWriter){
	
	printWriter.print(toString());
	for(int i=0;i<Lf.size();i++) {
		printWriter.print(Lf.get(i).toString());
	}
	
	printWriter.println("endsolid "+name);
	
}
}
