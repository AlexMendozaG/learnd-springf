package aspects;

import models.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LogginAspect {

    Logger logger = Logger.getLogger(LogginAspect.class.getName());

    @Around("execution(* services.*.*(..))")
    @Order(2)
    public Object log(ProceedingJoinPoint pjp) throws Throwable {

        logger.info("Loggin aspect: Calling the intercepted method");
        Object returnValue = pjp.proceed();

        logger.info("Loggin aspect: Method executed and returned: " + returnValue);

        return returnValue;
    }
}
