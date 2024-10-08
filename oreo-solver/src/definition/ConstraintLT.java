package definition;

public class ConstraintLT extends Constraint {

    public ConstraintLT(Variable var1, Variable var2) {
        super(var1, var2);
    }

    @Override
    public boolean isSatisfied() {
        throw new UnsupportedOperationException("Vous devez implémenter la méthode isSatisfied() de la classe ConstraintLT");
    }

    @Override
    public boolean isPossible() {
        throw new UnsupportedOperationException("Vous devez implémenter la méthode isPossible() de la classe ConstraintLT");
    }

    @Override
    public boolean allInstantiated() {
        throw new UnsupportedOperationException("Vous devez implémenter la méthode allInstantiated() de la classe ConstraintLT");
    }

}
