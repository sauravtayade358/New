package org.srt;

class priavacess
{ 
   private void show() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

public class Acess2  {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		priavacess  obj1 = new priavacess(); 
        //trying to access private method of another class 
        //obj1.show();

	}
}
