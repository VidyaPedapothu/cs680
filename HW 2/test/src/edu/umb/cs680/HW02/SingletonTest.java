package edu.umb.cs680.HW02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw02.Singleton;



	public class SingletonTest {

		@Test
		public void getInstanceReturnNotNullValue() {
			assertNotNull(Singleton.getInstance());
		}
		
		@Test
		public void getInstanceReturnSimilarInstance() {
			Singleton sgt1 = Singleton.getInstance();
			Singleton sgt2 = Singleton.getInstance();
			assertSame(sgt1, sgt2);
		}

	}
	
}
