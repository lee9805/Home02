package com.callor.app.model;

public class ScoreVO {
	
	private  int Num;
	private  int kor;
	private  int eng;
	private  int math;
	private  int sum;
	private  float avg;
	private int sumKor;
	private int sumeng;
	private int summath;
	private int sumsum;
	
	
	public int getNum() {
		return Num;
	}
	public void setNum(int i) {
		Num = i;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		int sum = this.kor;
		sum += this.eng;
		sum += this.math;
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
		
	}
	public float getAvg() {
		int sum = this.kor;
		sum += this.eng;
		sum += this.math;
		
		float avg =(float)sum/3;
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	
	public int getSumKor() {
		int sumKor = kor;
		sumKor += sumKor++;
		return sumKor;
	}
	public void setSumKor(int sumKor) {
		this.sumKor = sumKor;
	}
	public int getSumeng() {
		int sumeng = eng;
		sumeng += sumeng++;
		return sumeng;
	}
	public void setSumeng(int sumeng) {
		this.sumeng = sumeng;
	}
	public int getSummath() {
		int summath =math;
		summath += summath++;
		return summath;
	}
	public void setSummath(int summath) {
		this.summath = summath;
	}
	public int getSumsum() {
		int sumsum = sum;
		sumsum += sumsum++;
		return sumsum;
	}
	public void setSumsum(int sumsum) {
		this.sumsum = sumsum;
	}
	@Override
	public String toString() {
		return "ScoreVO ["
				+ "Num=" + Num 
				+ ", kor=" + kor 
				+ ", eng=" + eng
				+ ", math=" + math 
				+ ", sum=" + sum 
				+ ", avg="+ avg 
				+ ", sumKor=" + sumKor 
				+ ", sumeng=" + sumeng 
				+ ", summath=" + summath 
				+ ", sumsum=" + sumsum
				+ "]";
	}
	
	
	

}
