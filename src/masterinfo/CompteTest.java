package masterinfo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompteTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		
		/// test sur le retrait
		Compte ccp = new Compte("dama", 1, 15000);
	 boolean  a= 	ccp.debiter(ccp,10000);
	  	assertEquals(true,a);
	   	
		
		////test sur le transfert
	   	float b;
	   	Compte ccp2 = new Compte("traore", 2, 10000);
	   	
	 	boolean trans =   ccp.transferer(ccp, ccp2, 500);
	   
	 
	   	assertEquals(true,trans);
	   	
			//// test sur le credit
	 	Compte ccp3 = new Compte("traore", 3, 10000);
	   	float credit = 1000;
	  boolean c= 	ccp3.credit(ccp3, credit);
	  
	   	assertEquals(true, c);
	   	
	   	
	}

}
