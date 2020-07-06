/* Authored by Shuai Liu
 040966980*/
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import ifs.AffineTransform;
import ifs.IfsCreator;
import stl.Solid;
import stl.StlImage;

public class IfsStlFile {

	public static void main(String[] args) throws Exception  {
		
		//get array of affine transform
		IfsCreator newIfs = new IfsCreator();		
		//getTransforms(): array of the 3 images
		AffineTransform [] ifsArrays = newIfs.getTransforms();  
		
        Scanner input = new Scanner(System.in);

		//menu
		System.out.println("Available fractal images are: ");
	
		for (int i =0; i<ifsArrays.length; i++) {
			System.out.println("     " + (i+1) + " " + ifsArrays[i].getName());
		}
		
		//prompt user for selection
		System.out.print("What image number do you want?");
		int number = input.nextInt();
		
		while (number!=1 && number !=2 && number !=3) {
			System.out.print("Please select a value from " + 1 + " to " + ifsArrays.length + ": ");
			number = input.nextInt();
		}
		
		switch(number) {
		case 1: newIfs.generatelfs(ifsArrays[0]);
		break;
		case 2: newIfs.generatelfs(ifsArrays[1]);
		break;
		case 3: newIfs.generatelfs(ifsArrays[2]);
		break;
		
		
		}
		
		
		//generate ifs 2D array
		int selectImage[][] = newIfs.generatelfs(ifsArrays[number-1]);  //generateIfs():create a 2D array with random number -> ifs image array; 
		//the ifs image 2D array is stored in points[][]
		
		
		//create STL file for ifs image
		StlImage i1 = new StlImage (0.8, 4.0);		
		Solid solid = i1.createSolid(selectImage); //create solid
		
		String ImageName = "C:/image/" + ifsArrays[number-1].getName() +".stl"; 
		
		//i1.createSolid(selectImage).print(writer);
		try(PrintWriter writer = new PrintWriter(ImageName)){
		solid.print(writer);
	}
	catch (IOException e) {
		
		System.out.println("Write failed -"+e.getMessage());
		//System.out.print(solid.toString());

	}	
		System.out.print("\nDone");

	}}