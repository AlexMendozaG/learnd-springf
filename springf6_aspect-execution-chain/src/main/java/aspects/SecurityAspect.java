package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Order(1)
@Component
public class SecurityAspect {

    private Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around("execution(* services.*.*(..))")
    public Object  secure(ProceedingJoinPoint joinPoint) throws Throwable {

        logger.info("Secure Aspect: Calling the intercepted method");
        Object returnValue = joinPoint.proceed();
        logger.info("Secure Aspect: method executed and returning value: " + returnValue);
        return returnValue;

    }
}
