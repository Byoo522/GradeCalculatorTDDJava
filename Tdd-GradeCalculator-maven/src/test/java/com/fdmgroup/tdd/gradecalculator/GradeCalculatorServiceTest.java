package com.fdmgroup.tdd.gradecalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

public class GradeCalculatorServiceTest {
	@Test // < 75
	public void test_GradeCalculatorReturnsFailWhenLessThan75() {
		GradeCalculatorImpl gradeCalc = new GradeCalculatorImpl();
		String result = gradeCalc.getClassification(74.00);
		assertEquals("fail", result);
	}
	
	@Test // >= 75 && < 80
	public void test_GrageCalculatorReturnsPassWhenGTE75AndLT80() {
		GradeCalculatorImpl gradeCalc = new GradeCalculatorImpl();
		String result = gradeCalc.getClassification(75.00);
		assertEquals("pass", result);
	}
	
	@Test // >= 80 && < 90
	public void test_GrageCalculatorReturnsMeritWhenGTE80AndLT90() {
		GradeCalculatorImpl gradeCalc = new GradeCalculatorImpl();
		String result = gradeCalc.getClassification(80.00);
		assertEquals("merit", result);
	}
	
	@Test // >= 90 && < 100
	public void test_GrageCalculatorReturnsMeritWhenGTE90AndLT100() {
		GradeCalculatorImpl gradeCalc = new GradeCalculatorImpl();
		String result = gradeCalc.getClassification(90.00);
		assertEquals("dictinction", result);
	}
	
	
}
