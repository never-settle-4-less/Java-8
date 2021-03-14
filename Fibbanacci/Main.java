public class Main {

    public static void main(String[] args) {
        Fib fib = new Fib();
        System.out.println("ITERATIVE:");
        fib.iterative(10);
        System.out.println("");
        System.out.println("RECURSIVE:");
        System.out.println(fib.recursive(10));
    }
    
}
