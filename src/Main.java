public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public Integer sum(Integer a, Integer b) {
        if (a == null || b == null) {
            return null;
        }
        return a + b;
    }
    public Integer multiply(Integer a, Integer b) {
        if (a == null || b == null) {
            return null;
        }
        return a * b;
    }
}