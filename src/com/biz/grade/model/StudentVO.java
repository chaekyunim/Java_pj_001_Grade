package com.biz.grade.model;

/*
 * 학생정보 
 * 학번 num, String,  strNum;                   
 * 이름 name, String, strName;
 * 주소 addr, Stirng, strAddr;
 * 전화번호 tel, Stirng, strTel;
 * 학과 dept, Stirng, dept;                       
 * 학년 grade, int, intGrade;
 * 
 */



public class StudentVO {

	
   private String strNum;
   private String strName;
   private String strAddr;
   private String strTel;
   private String dept;
   private int intGrade;
     
   public String getStrNum() {
	return strNum;
}
public void setStrNum(String strNum) {
	this.strNum = strNum;
}
public String getStrName() {
	return strName;
}
public void setStrName(String strName) {
	this.strName = strName;
}
public String getStrAddr() {
	return strAddr;
}
public void setStrAddr(String strAddr) {
	this.strAddr = strAddr;
}
public String getStrTel() {
	return strTel;
}
public void setStrTel(String strTel) {
	this.strTel = strTel;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getIntGrade() {
	return intGrade;
}
public void setIntGrade(int intGrade) {
	this.intGrade = intGrade;
}
public pubulic getString() {
	return String;
}
public void setString(pbulic string) {
	String = string;
}

// 데이터 확인용
@Override
public String toString() {
	return "StudentVO [strNum=" + strNum + ", strName=" + strName + ", strAddr=" + strAddr + ", strTel=" + strTel
			+ ", dept=" + dept + ", intGrade=" + intGrade + "]";
}

   
	   		      		

	}

}
