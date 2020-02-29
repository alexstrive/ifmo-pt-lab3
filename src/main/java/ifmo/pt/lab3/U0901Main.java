package ifmo.pt.lab3;

class U0901Main {
    public static void main(String... args) {
        Integer intArr[] = { 10, 20, 15 };
        var insWorkArrayInt = new U0901WorkArray<Integer>(intArr);
        System.out.println("Sum of int array: " + insWorkArrayInt.sum());

        Float floatArr[] = new Float[10];
        var insWorkArrayFloat = new U0901WorkArray<Float>(floatArr);
        for (int i = 0; i < 10; i++) {
            floatArr[i] = (float) (Math.random() * 10);
        }

        System.out.println("Float array: " + java.util.Arrays.toString(floatArr));
        System.out.println("Sum of float array: " + insWorkArrayFloat.sum());
    }
}