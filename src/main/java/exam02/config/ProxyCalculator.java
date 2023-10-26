package exam02.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Order(2)
@Aspect
public class ProxyCalculator {

    /*@Pointcut("execution(* exam02.aopex..*(..))")
    public void publicTarget() {}*/


    /*@Around("publicTarget()")*/
    //@Around("execution(* (exam02.aopex..*(..))")
    @Around("CommonPointcut.publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        long stime = System.nanoTime();


        /* Signature sig = joinPoint.getSignature();
        System.out.println(sig.toLongString()); */
        Object[] args = joinPoint.getArgs();
        long num = (long)args[0];
        System.out.println(num);

        try {

            Object result = joinPoint.proceed(); // factorial(..) - 핵심 기능을 대신 수행한다.
            return result;
        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린 시간 : %d%n", etime - stime);
        }
    }

}
