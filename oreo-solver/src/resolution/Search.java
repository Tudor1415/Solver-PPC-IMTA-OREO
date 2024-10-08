package resolution;

import definition.Csp;
import definition.Domain;
import definition.Variable;

public class Search {

	/*
	 * *****************************************************************************
	 * *********************
	 * TP1
	 ****************************************************************************************************/

	// -----------------------------------------------------------------------------------------
	// bruteForceSearch :
	// on génère toutes les instanciations possibles
	// aucune contrainte : toute instanciation complète est une solution
	// -----------------------------------------------------------------------------------------

	public static void bruteForceSearch(Csp csp) {
		if (csp.allInstanciated()) {
			// traitement du cas où une instanciation est complète
			// (affichage, sauvegarde...)
		} else {
			// à compléter
			Variable y = csp.nextVarToInstantiate();
			Domain yDom = null;
			for (int val : yDom) {
				y.instantiate(val);
				bruteForceSearch(csp);

			}
		}
	}

	// -----------------------------------------------------------------------------------------
	// generateAndTest :
	// on ajoute un test pour vérifier si une instanciation complète est une
	// solution
	// Note : si le csp n'a aucune contrainte, c'est le même comportement que
	// bruteForceSearch
	// -----------------------------------------------------------------------------------------
	// FIXME: Je ne suis pas sûr de cette implem.
	public static void generateAndTest(Csp csp) {
		if (csp.allInstanciated()) {
			if (csp.hasSolution()) {
				for (Variable var : csp.getVars())
					if (csp.isSolution(var))
						System.out.println(var.toString());
			}
		} else {
			Variable y = csp.nextVarToInstantiate();
			Domain yDom = y.getDomain();

			for (int val : yDom) {
				y.instantiate(val);
				generateAndTest(csp);
			}
		}
	}

	/*
	 * *****************************************************************************
	 * *********************
	 * TP2
	 * backtrack :
	 * on n'attend pas que l'instanciation soit complète pour vérifier qu'elle est
	 * viable
	 * (elle PEUT mener à une solution)
	 ****************************************************************************************************/

	// -----------------------------------------------------------------------------------------
	// backtrack1 :
	// on teste si les contraintes sont satisfaites
	// au fur et à mesure qu'elles sont complètement instanciées
	// -----------------------------------------------------------------------------------------

	public static void backtrack1(Csp csp) {
		boolean ok = true;

		// ok = check()
		// (check : test de l'instanciation courante)

		if (ok) {
			if (csp.allInstanciated()) {
				// une solution a été trouvée :
				// à traiter
			} else {
				// à compléter (cf. bruteForceSearch ou generateAndTest)
				Variable y = csp.nextVarToInstantiate();
				Domain yDom = null;
				for (int val : yDom) {
					y.instantiate(val);
					backtrack1(csp);
				}
			}
		}
	}

	// -----------------------------------------------------------------------------------------
	// backtrack2 :
	// on teste si les contraintes PEUVENT ENCORE ëtre satisfaites
	// dès qu'elles sont PARTIELLEMENT instanciées
	// -----------------------------------------------------------------------------------------

	public static void backtrack2(Csp csp) {
		boolean ok = true;

		// ok = check()
		// (check à définir : test de l'instanciation courante)
		// ATTENTION : pas le même test que pour backtrack1

		if (ok) {
			if (csp.allInstanciated()) {
				// une solution a été trouvée :
				// à traiter
			} else {
				// à compléter
				Variable y = csp.nextVarToInstantiate();
				Domain yDom = null;
				for (int val : yDom) {
					y.instantiate(val);
					backtrack2(csp);
				}
			}
		}
	}

	/*
	 * *****************************************************************************
	 * *********************
	 * TP3
	 ****************************************************************************************************/

	// -----------------------------------------------------------------------------------------
	// backtrack 3 : propagation/filtrage
	// -----------------------------------------------------------------------------------------

	public static void backtrack3(Csp csp) {
		boolean ok = true;

		// ok = check()
		// (check : test de l'instanciation courante) : utile ?

		if (ok) {
			if (csp.allInstanciated()) {
				// une solution a été trouvée :
				// à traiter
			} else {
				// à compléter
				Variable y = csp.nextVarToInstantiate();
				Domain yDom = null;
				for (int val : yDom) {
					y.instantiate(val);
					backtrack3(csp);
				}
			}
		}
	}

}
