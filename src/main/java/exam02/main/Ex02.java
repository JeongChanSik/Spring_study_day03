package exam02.main;

import exam02.aopex.*;
import exam02.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex02 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Calculator cal = ctx.getBean(Calculator.class);
        long result= cal.factoryal(10);
        System.out.printf("cal = %d%n", result);
        System.out.println();

        result= cal.factoryal(10);
        System.out.printf("cal = %d%n", result);
        System.out.println();

        result= cal.factoryal(10);
        System.out.printf("cal = %d%n", result);
        System.out.println();

        result= cal.factoryal(10);
        System.out.printf("cal = %d%n", result);
        System.out.println();

        result= cal.factoryal(10);
        System.out.printf("cal = %d%n", result);
        System.out.println();

        result= cal.factoryal(10);
        System.out.printf("cal = %d%n", result);
        System.out.println();

        result= cal.factoryal(10);
        System.out.printf("cal = %d%n", result);
        System.out.println();

        result= cal.factoryal(10);
        System.out.printf("cal = %d%n", result);
        System.out.println();

        ctx.close();

    }
}
