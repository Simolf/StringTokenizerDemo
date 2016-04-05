package com.stirngtokenizer.demo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len;
		Scanner reader=new Scanner(System.in);
		String s=reader.nextLine();
		StringTokenizer fenxi=new StringTokenizer(s," ");
		len=fenxi.countTokens();
		String []t=new String[len];
		for(int i=0;fenxi.hasMoreTokens();i++){
			t[i]=fenxi.nextToken();
		}
		for(int j=len-1;j>=0;j--){
			System.out.print(t[j]);
			System.out.print(" ");
		}
		

	}

}
