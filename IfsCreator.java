package ifs;

import ifs.AffineTransform;


public class IfsCreator {
	private int A = 0;
	private int B = 1;

	private int C = 2;
	private int D = 3;
	private int E = 4;
	private int F = 5;
	private int PROB = 6;
	
	  
	
	public AffineTransform[] getTransforms() {

		AffineTransform[] arrayIfs = new AffineTransform [3];
		arrayIfs [0] = new BarnsleyFernIfs();
		arrayIfs [1] = new SierpinskiIfs();
		arrayIfs [2] = new MapleIfs();
		return arrayIfs;


	}
	
	
	
	
public int [][] generatelfs(AffineTransform affinelfs) {
	double x = 0;
	double y = 0;

	int row = 0;	
	//AffineTransform Ifs = new AffineTransform();
	
	int test2 [][] = new int [affinelfs.getWidth()][affinelfs.getHeight()];
	
	int WH = affinelfs.getWidth()*affinelfs.getHeight();

	for(int i=0;i<WH;i++) {
		double Num2 = 0;
		double Num = Math.random();
		
	
		
		
			
		
		for(int t = 0;t < affinelfs.getAffine().length; t++ ) {
			
			double prob = affinelfs.getAffine()[t][PROB];
			
			if(Num < prob ) {
				row = t;
				break;
			}else {
				Num -= prob;
			}
			}
		double u = affinelfs.getAffine()[row][A]*x + affinelfs.getAffine()[row][B]*y+affinelfs.getAffine()[row][E];
		double v = affinelfs.getAffine()[row][C]*x + affinelfs.getAffine()[row][D]*y + affinelfs.getAffine()[row][F];


        x=u;
		y=v;
		int xDisp=(int)(x*affinelfs.getScale()+affinelfs.getXoffset());
		int yDisp=(int)(y*affinelfs.getScale()+ affinelfs.getYoffset());


	
	test2[yDisp][xDisp]++;
	}
	return test2;
	
}}






