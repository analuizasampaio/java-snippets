package conditional.examples;

public class IfElse {
    public static void main(String[] args) {
        int x = 20;
        int y = 20;

        if (x < y){
            System.out.println("X é menor que Y");
        } else if ( x == y){
            System.out.println("X é igual a Y");
        } else {
            System.out.println("X é maior a Y");
        }
    }
}
