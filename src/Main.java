public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(3, 5);
        System.out.println(arithmetic.sum());
        System.out.println(arithmetic.multiplication());
        System.out.println("Минимальное число " + arithmetic.minAB());
    }
}
