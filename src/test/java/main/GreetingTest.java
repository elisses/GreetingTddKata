package main;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GreetingTest {
	
	Greeting greeting = new GreetingImplement();
	
	@Test
	public void RecivedString() {
		
		assertEquals("Azul", greeting.greetingName("Azul"));
	}

}
