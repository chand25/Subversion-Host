package com.SVN.handson;


public class TaxCalculator {
	public static double taxAmount;
	 
	public double calculateTax(String empName, Boolean isIndian, double empSal) throws CountryNotValidException, 
	  EmployeeNameInvalidException, TaxNotEligibleException{	
		//63.94=64 INR equals 1 dollar
		//1 Lakh INR = 100,000 INR
		//100,000 INR /64 = 1,562.5 USD
		//Hence, 1 Lakh INR = 1,562.5 USD
				
		
		  if(!isIndian) {
			throw new CountryNotValidException("Country not valid");
		    }
		  
		  else if(empName == null || "".equals(empName)){
			  throw new EmployeeNameInvalidException("Employee name not valid");
		  }
		
		   else if(empSal > 100000 && isIndian) {
			  taxAmount = empSal*8/100;
		  }
		  
		  else if(empSal > 50000 && empSal < 100000 && isIndian) {
				  taxAmount = empSal*6/100;
			  }
		   
		  else if(empSal > 30000 && empSal < 50000 && isIndian) {
			  taxAmount = empSal*5/100;
		  }	
		  
		  else if(empSal > 10000 && empSal < 30000 && isIndian) {
			  taxAmount = empSal*4/100;
		  } else {
			 throw new TaxNotEligibleException(""); 
		  }		   
		   
		   
		return taxAmount;
			
   }
}