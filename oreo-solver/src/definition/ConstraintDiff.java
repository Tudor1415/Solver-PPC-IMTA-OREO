package definition;

public class ConstraintDiff extends Constraint {

    public ConstraintDiff(Variable var1, Variable var2) {
        super(var1, var2);
    }

    @Override
    public boolean isSatisfied() {
        throw new UnsupportedOperationException("Vous devez implémenter la méthode isSatisfied() de la classe ConstraintDiff");
    }

    @Override
    public boolean isPossible() {
        throw new UnsupportedOperationException("Vous devez implémenter la méthode isPossible() de la classe ConstraintDiff");
    }

    @Override
    public boolean allInstantiated() {
        throw new UnsupportedOperationException("Vous devez implémenter la méthode allInstantiated() de la classe ConstraintDiff");
    }

}
