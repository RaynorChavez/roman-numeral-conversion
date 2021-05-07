package com.orangeandbronze.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {
	static String intToRomanNumeral(int num) {
		StringBuilder sb = new StringBuilder();
		while(num > 0) {
			if(3 < num && num < 5) {
				sb.append("IV");
				num = num - 4;
			}
			else if (8 < num && num < 10) {
				sb.append("IX");
				num = num - 9;
			}
			else if (39 < num && num < 50) {
				sb.append("XL");
				num = num - 40;
			}
			else if (89 < num && num < 100) {
				sb.append("XC");
				num = num - 90;
			}
			else if (399 < num && num < 500) {
				sb.append("CD");
				num = num - 400;
			}
			else if (899 < num && num < 1000) {
				sb.append("CM");
				num = num - 900;
			}
			else if (num >= 1000) {
				sb.append("M");
				num = num - 1000;
			}
			else if (num >= 500) {
				sb.append("D");
				num = num - 500;
			}
			else if (num >= 100) {
				sb.append("C");
				num = num - 100;
			}
			else if (num >= 50) {
				sb.append("L");
				num = num - 50;
			}
			else if (num >= 10) {
				sb.append("X");
				num = num - 10;
			}
			else if (num >= 5) {
				sb.append("V");
				num = num - 5;
			}
			else if (num >= 1) {
				sb.append("I");
				num = num - 1;
			} else {
				sb.append("error");
			}
		}
	
		return sb.toString();
	}
	
	static String romanNumeralToInt(String num) {
		
		Map<String, Integer> rnValueMap = new HashMap<String, Integer>();
		int[] charValues;
		charValues = new int[num.length()];
		rnValueMap.put("I", 1);
		rnValueMap.put("V", 5);
		rnValueMap.put("X", 10);
		rnValueMap.put("L", 50);
		rnValueMap.put("C", 100);
		rnValueMap.put("D", 500);
		rnValueMap.put("M", 1000);
		
		char[] chars = num.toCharArray();
		int i = 0;
		for(char c: chars) {
			charValues[i] = rnValueMap.get(String.valueOf(c));
			i++;
		}
		
		Integer answer = 0;
		int pred = 0;
		for(int x: charValues) {
			//System.out.println(x);
			if (x > pred) {
				answer += x - 2*pred;
			} else {
				answer += x;
			}
			pred = x;
		}
		
		return answer.toString();
	}
	
	static String testOut(String n) {
		return n;
	}
}
