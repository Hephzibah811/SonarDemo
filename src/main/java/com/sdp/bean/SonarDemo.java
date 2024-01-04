package com.sdp.bean;

public class SonarDemo {
	int n1,n2,sum;
	
	SonarDemo(int n1,int n2){
		this.n1=n1;
		this.n2=n2;
	}
	
	public void addition() {
		sum=n1+n2;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SonarDemo obj=new SonarDemo(10,20);
		obj.addition();

	}

}
