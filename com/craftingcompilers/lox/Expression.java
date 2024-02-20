package  com.craftingcompilers;

abstract class Expr {
    static class Binary extends Expr{
        Binary(Expr left, Token operator, Expr right){
            this.left = left;
            this.right = right;
            this.operator = operator;
        }
        final Expr left;
        final Expr right;
        final Token operator;
    }
}

