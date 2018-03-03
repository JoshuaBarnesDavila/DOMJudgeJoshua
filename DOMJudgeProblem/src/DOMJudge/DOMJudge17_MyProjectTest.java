package DOMJudge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DOMJudge17_MyProjectTest
{

	@Test
	void testCalculo()
	{
		assertEquals("SIN LLENAR",DOMJudge17_MyProject.calculo(4000,40,1,140));
		assertEquals("LLENADO",DOMJudge17_MyProject.calculo(1000,47,5,30));
		assertEquals("SIN LLENAR",DOMJudge17_MyProject.calculo(1000,10,1,60));
		assertEquals("SIN LLENAR",DOMJudge17_MyProject.calculo(5000,50,2,120));
		assertEquals("LLENADO",DOMJudge17_MyProject.calculo(2500,40,1,80));
		assertEquals("SIN LLENAR",DOMJudge17_MyProject.calculo(1000,22,1,60));
		assertEquals("SIN LLENAR",DOMJudge17_MyProject.calculo(3600,41,1,120));
		assertEquals("SIN LLENAR",DOMJudge17_MyProject.calculo(2101,40,2,100));
		
		//fail("Not yet implemented");
	}

}
