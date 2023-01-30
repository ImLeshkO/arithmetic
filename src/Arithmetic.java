public class Arithmetic {
    public int a;
    public int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Arithmetic() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int subtraction() {
        return a - b;
    }

    public int multiplication() {
        return a * b;
    }

    public int maxAB() {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public int minAB() {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
