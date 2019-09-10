package com.biz.grade.model;

/*
 * 점수 정보 
 * 학번 
 * 국어점수
 * 영어점수
 * 수학점수
 * 총점
 * 평균
 * 석차
 * 
 */
public class ScoreVO {

	
     private String num;
	 private int intKor;
	 private int intEng;
	 private int intMath;
	 private int total;
	 private int intAge;
	 private int intRank;
	 
	public String getNum() {
		return num;  
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getIntAge() {
		return intAge;
	}
	public void setIntAge(int intAge) {
		this.intAge = intAge;
	}
	public int getIntRank() {
		return intRank;
	}
	public void setIntRank(int intRank) {
		this.intRank = intRank;
	}
	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath + ", total="
				+ total + ", intAge=" + intAge + ", intRank=" + intRank + "]";
	}
	  
	
	
	
	
	 
}
	 