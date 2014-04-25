import static org.junit.Assert.*;

import org.junit.*;


public class TestLampe {

	private Lampe lampe;
	
	
	@Test
	public void testConstructor_ParamString(){
		String s = "Candy";
		Lampe l = new Lampe(s);
		assertEquals("La lampe devrait s'appeler Candy", s, l.getNom() );
	}
	
	
	@Test
	public void testConstructor_MauvaisParamString(){
		String s = " ";
		Lampe l = new Lampe(s);
		assertEquals("La lampe devrait s'appeler lampe par défaut", "lampe", l.getNom() );
	}
	
	
	@Before
	public void initialise(){
		lampe = new Lampe ("C");
	}
	
	
	@Test
	public void testAllumer(){
		assertEquals("La lampe est éteinte à l'initialisation", false, lampe.isAllume());
		lampe.allumer();
		assertEquals("La lampe devrait etre allumée", true, lampe.isAllume());
	}

	

	@Test
	public void testEteindre(){
		assertEquals("La lampe est éteinte à l'initialisation", false, lampe.isAllume());
		lampe.allumer();
		assertEquals("La lampe devrait etre allumée", true, lampe.isAllume());
		lampe.eteindre();
		assertEquals("La lampe devrait etre eteinte", false, lampe.isAllume());
	}

}
