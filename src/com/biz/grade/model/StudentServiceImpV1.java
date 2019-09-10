package com.biz.grade.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random; 
	  
	 public class StudentServiceImpV1 implements StudentService { 
	 
	 
	 	List <StudentVO> StudentVO; 
	 	 
	 	public StudentServiceImpV1() { 
	 		StudentVO = new ArrayList<StudentVO>(); 
	 	} 
	 	public void input() { 
	 		Random rnd = new Random(); 
	 		StudentVO vo = new StudentVO(); 
	 		//vo.setStrNum(strNum); 
	 		//String strNum = StrNum; 
	 		int intKor = rnd.nextInt(50)+51; 
	 		int intEng = rnd.nextInt(50)+51; 
	 		int intMath = rnd.nextInt(50)+51; 
	 		int intTotal = intKor+intEng+intMath; 
	 		int intAvg = intTotal/3; 
	 		 
	 		//int intRank = intAvg 
	 		 
	 		//vo.setStrNum(strNum); 
	 		vo.setIntKor(intKor); 
	 		vo.setIntEng(intEng); 
	 		vo.setIntMath(intMath); 
	 		vo.setIntTotal(intTotal); 
	 		vo.setIntAvg(intAvg); 
	 		//vo.setIntRank(intRank); 
	 		 
	 		StudentVO.add(vo); 
	 		 
	 		 
	 		 
	 	} 
	 	 
	 
	
	 	@Override 
	 	public void input(int count) { 
	 		for(int i = 0 ; i < count ; i++) { 
	 			String strNum = String.format("%04d", (i+1)); 
	 			this.input(strNum); 
	 		} 
	 
	 
	 	} 
	 	@Override 
	 	public void input(String strNum) { 
	 		 
	 		Random rnd = new Random(); 
	 		ScoreVO vo = new ScoreVO(); 
	 		vo.setStrNum(strNum); 
	 		//String strNum = StrNum; 
	 		int intKor = rnd.nextInt(50)+51; 
	 		int intEng = rnd.nextInt(50)+51; 
	 		int intMath = rnd.nextInt(50)+51; 
	 		int intTotal = intKor+intEng+intMath; 
	 		int intAvg = intTotal/3; 
	 		 
	 		//int intRank = intAvg 
	 		 
	 		//vo.setStrNum(strNum); 
	 		vo.setIntKor(intKor); 
	 		vo.setIntEng(intEng); 
	 		vo.setIntMath(intMath); 
	 		vo.setIntTotal(intTotal); 
	 		vo.setIntAvg(intAvg); 
	 		//vo.setIntRank(intRank); 
	 		 
	 		StudentVO.add(vo); 
	 		 
	 		 
	 
	
	 	} 
	 
	
	 	 
	 	@Override 
	 	public void list() { 
	 		System.out.println("================================="); 
	 		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차"); 
	 		System.out.println("================================="); 
	 		int nSize = scoreVO.size(); 
	 		for(StudentVO vo : StudentVO) { 
	 		//for(int i = 0 ; i < nSize ; i++) { 
	 			System.out.print(vo.getStrNum()); 
	 			System.out.print("\t"+vo.getIntKor()); 
	 			System.out.print("\t"+vo.getIntEng()); 
	 			System.out.print("\t"+vo.getIntMath()); 
	 			System.out.print("\t"+vo.getIntTotal()); 
	 			System.out.print("\t"+vo.getIntAvg()); 
	 			System.out.println("\t"+vo.getIntRank()); 
	 			 
	 			 
	 			 
	 		} 
	 
	 
	 	} 
	 
	 
	 } 

	
