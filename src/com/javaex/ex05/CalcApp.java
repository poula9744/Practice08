package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	int num = 0;
    	
    	//값 입력받기
    	Scanner sc = new Scanner(System.in);
    	System.out.print(">>");
    	String numLine = sc.nextLine();
    	
    	//띄어쓰기로 쪼개기
    	String[] numArray = numLine.split(" ");
    	
    	//문자열 --> 정수
    	for(int i=0; i<numArray.length; i++) {
    		num = Integer.parseInt(numArray[i]);
    	}
    	
    	
    	
    	
    	
    	
    }
}
