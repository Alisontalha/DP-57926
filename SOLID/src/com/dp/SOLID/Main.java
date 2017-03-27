package com.dp.SOLID;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICalculate iCal;
		iCal=new Calculator();
		iCal.add(2, 3);
		iCal.sub(2, 3);
		iCal.mul(2, 3);
		iCal.div(2, 3);
		
		IScientific iSci;
		iSci=new Scientific();
		iSci.mod(1, 6);
		iSci.add(1, 4);
		iSci.mul(1, 4);
		iSci.div(1, 4);
		iSci.sub(1, 4);
		
		

	}

}
