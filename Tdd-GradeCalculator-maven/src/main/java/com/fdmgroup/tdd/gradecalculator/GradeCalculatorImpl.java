package com.fdmgroup.tdd.gradecalculator;

public class GradeCalculatorImpl implements GradeCalculatorService {

	@Override
	public String getClassification(double mark) {
		if(mark < 75.00) {
			return "fail";
		} else if(mark >= 75.00 && mark < 80.00) {
			return "pass";
		} else if(mark >= 80.00 && mark < 90.00) {
			return "merit";
		} else if (mark >= 90.00 && mark < 100.00) {
			return "dictinction";
		}
		return null;
				
	}
	
}
