package com.dml.dummy;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {

	@Test
	public void testSayHello() {
		String hello = HelloWorld.sayHello( "Lucy" );
		
		System.out.println( hello );
		assertEquals( "Hello Lucy", hello );
	}

}
