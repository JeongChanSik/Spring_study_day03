package exam01;

public class ImplCalculator implements Calculator {

    @Override
    public long factoryal(long num) {
        long total = 1;
        for (long i = num; i > 0; i--) {
            total *= i;
        }

        return total;
    }
}