package ifmo.pt.lab3;

class U0901WorkArray<T extends Number> {
    T[] arrNums;

    U0901WorkArray(T[] numP) {
        arrNums = numP;
    }

    double sum() {
        double doubleWork = 0;
        for (T value : arrNums) {
            doubleWork += value.doubleValue();
        }
        return doubleWork;
    }
}