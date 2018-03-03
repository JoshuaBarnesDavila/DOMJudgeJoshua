package DOMJudge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SummerTime_JoshuaBarnesJUnit
{

	@Test
	void testCalculo()
	{
		assertEquals("SIN LLENAR",SummerTime_JoshuaBarnes.calculo(4000,40,1,140));
		assertEquals("LLENADO",SummerTime_JoshuaBarnes.calculo(1000,47,5,30));
		assertEquals("SIN LLENAR",SummerTime_JoshuaBarnes.calculo(1000,10,1,60));
		assertEquals("SIN LLENAR",SummerTime_JoshuaBarnes.calculo(5000,50,2,120));
		assertEquals("LLENADO",SummerTime_JoshuaBarnes.calculo(2500,40,1,80));
		assertEquals("SIN LLENAR",SummerTime_JoshuaBarnes.calculo(1000,22,1,60));
		assertEquals("SIN LLENAR",SummerTime_JoshuaBarnes.calculo(3600,41,1,120));
		assertEquals("SIN LLENAR",SummerTime_JoshuaBarnes.calculo(2101,40,2,100));
		
		//fail("Not yet implemented");
	}

}
