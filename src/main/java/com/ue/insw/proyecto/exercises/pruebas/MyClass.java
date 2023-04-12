package com.ue.insw.proyecto.exercises.pruebas;

public class MyClass {
	
	 public String concatenate(String one, String two){
		 
		 	if(one==null) {
		 		if(two==null) {
		 			return "";
		 		}
		 		return two;
		 	}
		 	if(two==null) {
		 		return one;
		 	}
		 	
	        return one + two;
	 }
	 
	 public String concat(String one, String two) {
		 return one.concat(two);
	 }
	 
	 public String concatenateWithDash(String first, String second) {
		 return first + "-" + second;
	 }
}
