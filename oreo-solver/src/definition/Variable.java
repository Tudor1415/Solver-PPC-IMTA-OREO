package definition;

import java.util.List;


public class Variable {
    private final String name;
    private Domain dom; // le domaine associe
    private List<Constraint> cons; // la liste des contraintes portant sur la variable, vide si pas utilisée

    public Variable(String name) {
        this.name = name;
    }

    public Variable(String name, Domain dom) {
        this.name = name;
        this.dom = dom;
    }

    public Variable(String name, int min, int max) {
        this(name, new DomainBitSet(min, max));
    }

    public String getName() {
        return name;
    }

    public Domain getDomain() {
        return this.dom;
    }

    public void setDomain(Domain dom) {
        this.dom = dom;
    }

    // retourne vrai ssi la variable est instanciee
    public boolean isInstantiated() {
        // à compléter
        throw new UnsupportedOperationException("Vous devez implémenter la méthode isInstantiated() de la classe Variable");
    }

    // retourne vrai ssi le domaine de la variable contient la valeur v
    public boolean canBeInstantiatedTo(int v) {
        // à compléter
        throw new UnsupportedOperationException("Vous devez implémenter la méthode canBeInstantiatedTo() de la classe Variable");
    }

    // retourne le nombre de valeurs dans le domaine de la variable
    public int getDomainSize() {
        // à compléter
        throw new UnsupportedOperationException("Vous devez implémenter la méthode getDomainSize() de la classe Variable");
    }

    // supprime la valeur v du domaine de la variable
    public void remValue(int v) {
        // à compléter
        throw new UnsupportedOperationException("Vous devez implémenter la méthode remValue() de la classe Variable");
    }

    // supprime toutes les valeurs entre min (inclus) et max (inclus)
    public void remValues(int min, int max) {
        // à compléter
        throw new UnsupportedOperationException("Vous devez implémenter la méthode remValues() de la classe Variable");
    }

    // vide le domaine : supprime toutes ses valeurs
    public void remAllValues() {
        // à compléter
        throw new UnsupportedOperationException("Vous devez implémenter la méthode remAllValues() de la classe Variable");
    }

    // instancie la variable a la valeur v
    public void instantiate(int v) {
        // à compléter
        throw new UnsupportedOperationException("Vous devez implémenter la méthode instantiate() de la classe Variable");
    }

    // retourne la plus petite valeur du domaine
    public int getInf() {
        // à compléter
        throw new UnsupportedOperationException("Vous devez implémenter la méthode getInf() de la classe Variable");
    }

    // retourne la plus grande valeur du domaine
    public int getSup() {
        // à compléter
        throw new UnsupportedOperationException("Vous devez implémenter la méthode getSup() de la classe Variable");
    }

    // retourne la valeur affectee a la variable ssi la variable est effectivement instanciee, sinon -1
    public int getValue() {
        // à compléter
        throw new UnsupportedOperationException("Vous devez implémenter la méthode getValue() de la classe Variable");
    }

    public boolean isEmpty() {
        // à compléter
        throw new UnsupportedOperationException("Vous devez implémenter la méthode isEmpty() de la classe Variable");
    }

}