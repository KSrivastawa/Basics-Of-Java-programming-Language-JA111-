package com.example2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AllInOne a1 = new AllInOne();
		
		
		String[] st = a1.bandNames();
		int l1=st.length;
		int[] in = a1.amountPerMonth();
		int l2 = in.length;
		
		for(int i=0, j=0; i<l1; i++, j++) {
		
			System.out.println(st[i] +" -> Rs."+in[j]+" perMonth.");
		}
		/*
		String[] st = a1.bandNames();
		
		for(String i:st) {
			System.out.println(i);
		}
		int[] in = a1.amountPerMonth();
		for(int i:in) {
			System.out.println(i);
		}
		*/
		
		a1.broadBand();
		a1.backCamera();
		a1.frontCamera();
		a1.lowQualityHD();
		a1.callConnecting();
		a1.linerCam();
		
		
		
	}

}
