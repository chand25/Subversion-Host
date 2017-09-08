package com.SVN.taxes;



public class CalculatorSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TaxCalculator taxCalculator = new TaxCalculator();
       
       try {
    	   //Test Case 1
    	  taxCalculator.calculateTax("Ron", false, 34000);
    	  
    	  //Test Case 2
    	  //taxCalculator.calculateTax("Sam", true, 1000);
    	
    	  //Test Case 3
    	  //taxCalculator.calculateTax("Jack", true, 55000);
    	  
    	//Test Case 4
    	 // taxCalculator.calculateTax("", true, 30000);
    	  
    	  System.out.println("The tax amount is:" + TaxCalculator.taxAmount);     
		
	    } catch (CountryNotValidException e) {
		 System.out.println("The employee should be an Indian citizen for calculating tax");  
		 e.printStackTrace();
	    }catch (EmployeeNameInvalidException e) {
		  System.out.println("The employee name cannot be empty");  
		  e.printStackTrace();
	   }catch (TaxNotEligibleException e) {
		   System.out.println("the employee does not need to pay tax");  
		e.printStackTrace();
	   
	   }
	  }

}
