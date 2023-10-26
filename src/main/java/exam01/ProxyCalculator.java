package exam01;

public class ProxyCalculator implements Calculator {

    private Calculator calculator = new ImplCalculator();

    public ProxyCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
    @Override
    public long factoryal(long num) { // 공통 기능

        long stime = System.nanoTime();
        try {
            long result = calculator.factoryal(num); // 핵심 기능(대신 수행)

            return result;
        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린 시간 : %d%n", etime - stime);
        }

    }
}
