package definition;

public class ConstraintEq extends Constraint {

    public ConstraintEq(Variable var1, Variable var2) {
        super(var1, var2);
    }

    @Override
    public boolean isSatisfied() {
        throw new UnsupportedOperationException("Vous devez implémenter la méthode isSatisfied() de la classe ConstraintEq");
    }

    @Override
    public boolean isPossible() {
        throw new UnsupportedOperationException("Vous devez implémenter la méthode isPossible() de la classe ConstraintEq");
    }

    @Override
    public boolean allInstantiated() {
        throw new UnsupportedOperationException("Vous devez implémenter la méthode allInstantiated() de la classe ConstraintEq");
    }

}
