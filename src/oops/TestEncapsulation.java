package oops;

public class TestEncapsulation {
	 public static void main (String[] args)  
	    { 
	        Encapsulate obj = new Encapsulate(); 
	        obj.setName("Rohit"); 
	        obj.setAge(22); 
	        obj.setRoll(78); 
	        System.out.println("My name: " + obj.getName()); 
	        System.out.println("My age: " + obj.getAge()); 
	        System.out.println("My roll: " + obj.getRoll());      
	    } 
	}
