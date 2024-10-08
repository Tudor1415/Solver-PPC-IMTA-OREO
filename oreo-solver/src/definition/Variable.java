package definition;

import java.util.Iterator;
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
        return getDomain().size() == 1;
    }

    // retourne vrai ssi le domaine de la variable contient la valeur v
    public boolean canBeInstantiatedTo(int v) {
        return getDomain().contains(v);
    }

    // retourne le nombre de valeurs dans le domaine de la variable
    public int getDomainSize() {
        return getDomain().size();
    }

    // supprime la valeur v du domaine de la variable
    public void remValue(int v) {
        getDomain().remove(v);
    }

    // supprime toutes les valeurs entre min (inclus) et max (inclus)
    public void remValues(int min, int max) {
        getDomain().remove(min, max);
    }

    // vide le domaine : supprime toutes ses valeurs
    public void remAllValues() {
        getDomain().removeAll();
    }

    // instancie la variable a la valeur v
    public void instantiate(int v) {
        getDomain().instantiate(v);

    }

    // retourne la plus petite valeur du domaine
    public int getInf() {
        Iterator<Integer> it = getDomain().iterator();
        int min = Integer.MAX_VALUE;

        while (it.hasNext())
            if (it.next() < min)
                min = it.next();

        return min;
    }

    // retourne la plus grande valeur du domaine
    public int getSup() {
        Iterator<Integer> it = getDomain().iterator();
        int sup = Integer.MIN_VALUE;

        while (it.hasNext())
            if (it.next() > sup)
                sup = it.next();

        return sup;
    }

    // retourne la valeur affectee a la variable ssi la variable est effectivement
    // instanciee, sinon -1
    public int getValue() {
        if (isInstantiated()) {
            return getDomain().iterator().next();
        } else {
            return -1;
        }
    }

    public boolean isEmpty() {
        return (getDomainSize()==0);            
        }

}