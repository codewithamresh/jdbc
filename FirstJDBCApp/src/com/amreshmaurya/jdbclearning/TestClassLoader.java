package com.amreshmaurya.jdbclearning;


class MyHello{
	static int num = 10;
	static{
		System.out.println("Hello Java from static block MyHello class");
        System.out.println(num);	
	}
	
	{
		System.out.print("Hello Java from instance static block from MyHello class");
			
	}
	public MyHello(){
		System.out.print("Hello Java from MyHello class");
	}
}


public class TestClassLoader {

	public static void main(String ...ar) throws ClassNotFoundException {
		Class.forName("com.amreshmaurya.jdbclearning.MyHello");
	}
}
