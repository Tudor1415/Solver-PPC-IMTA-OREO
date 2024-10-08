package resolution;

import definition.Csp;
import problemes.CspFournis;

public class Resolution {
	public static void main(String[] args) {

		/*
		 * Déclaration et création d'un csp (variables, contraintes)
		 */
		Csp csp1 = CspFournis.buildCsp1();
		System.out.println(csp1.toString());

		/*
		 * Résolution du csp : exécution de l'algorithme d'exploration (search)
		 */

	}

}
