package DOMJudge;

import java.util.Scanner;

/**
 * <h2>Class DOMJUDGE17_MyProject, used for solving my DOMJUDGE problem</h2>
 * 
 * @version 1-2018
 * @author Joshua Barnes Davila
 * @since 1-1-2018
 */


public class SummerTime_JoshuaBarnes
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		int Casos = input.nextInt();
		
		for(int p = 0;p < Casos;p++)
		{
			int dim = 0, r = 0, t = 0, h = 0;
			dim = input.nextInt(); //L
			r = input.nextInt(); //L/min
			t = input.nextInt(); //-xL cada 5 minutos
			h = input.nextInt(); //Min restantes
			
			System.out.println(calculo(dim,r,t,h));
			
		}
		input.close();
	}
	
	// Public Methods
	
		/**
		 * Calculates and returns if the pool is full or not
		 * @see calculo
		 * @param dim Size of pool in litres.
		 * @param r Rate at which pool is filled (l/min).
		 * @param t How many litres are reduced from the rate every 5 min.
		 * @param h Time left, in min, until friends arrive.
		 * 
		 * @return <ul>
		 *           <li>"LLENADO": Pool is full</li>
		 *           <li>"SIN LLENAR": Pool isn't filled in time</li>
		 *         </ul>
		 */

	
	public static String calculo (int dim, int r, int t,int h)
	{
		int tiempo = 0;
		int comptador = 0;
		int llenado = 0;
		do {
			tiempo++;
			llenado = llenado + r;
			comptador++;
			if(comptador == 5)
			{
				comptador = 0;
				r = r - t;
			}
			
		}while(tiempo < h && llenado < dim && r > 0);
		if(llenado >= dim)
			return "LLENADO";
		else
			return "SIN LLENAR";
	}
}
