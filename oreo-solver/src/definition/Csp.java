package definition;

import java.util.List;
import java.util.stream.Collectors;

public class Csp {

    private final List<Variable> vars; // l'ensemble des variables du CSP. Note: les domaines sont connus au travers
                                       // des variables
    private final List<Constraint> cons; // l'ensemble des contraintes du CSP (éventuellement vide)

    public Csp(List<Variable> vars, List<Constraint> cons) {
        this.vars = vars;
        this.cons = cons;
    }

    public List<Variable> getVars() {
        return vars;
    }

    public List<Constraint> getConstraints() {
        return this.cons;
    }

    // QUESTION : est-ce qu'on teste si la contrainte y figure déjà ?
    public void addConstraint(Constraint constraint) {
        this.cons.add(constraint);
    }

    // retourne la premiere variable non instanciée du csp, null s'il n'y en a
    // pas/plus (toutes les variables sont instanciées)
    public Variable nextVarToInstantiate() {
        for (Variable var : getVars())
            if (!var.isInstantiated())
                return var;

        return null;
    }

    // retourne vrai ssi toutes les variables sont instanciées
    public boolean allInstanciated() {
        for (Variable var : getVars())
            if (!var.isInstantiated())
                return false;

        return true;
    }

    // retourne vrai ssi le CSP possède (au moins) une solution :
    public boolean hasSolution() {
        for (Variable var : getVars())
            if (isSolution(var))
                return true;

        return false;
    }

    public boolean isSolution(Variable var) {
        // Var est istanciée
        if (!var.isInstantiated())
            return false;

        // Satisfaction des contraintes
        for (Constraint constraint : getConstraints())
            if (!constraint.isSatisfied())
                return false;

        return true;
    }

    @Override
    public String toString() {
        String varsString = vars.stream()
                .map(Variable::toString)
                .collect(Collectors.joining(", ", "[", "]"));
        String consString = cons.stream()
                .map(Constraint::toString)
                .collect(Collectors.joining(", ", "[", "]"));
        return "CSP Variables: " + varsString + "\nCSP Constraints: " + consString;
    }
}
