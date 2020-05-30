package com.dml.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {

	@Test
	public void shouldSayHelloLucy() {
		String hello = HelloWorld.sayHello( "Lucy" );
		
		System.out.println( hello );
		assertEquals( "Hello Lucy", hello );
	}
	
	@Test void shouldSayHelloWorld() {
		String hello = HelloWorld.sayHello( );
		
		System.out.println( hello );
		assertEquals( "Hello Lucy", hello );
	}

}
