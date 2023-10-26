package exam01;

public class RecCalculator implements Calculator{

    @Override
    public long factoryal(long num) {
            if (num < 1) {
                return 1;
            }
            return num * factoryal(num - 1);

    }
}
