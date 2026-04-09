package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LogginAspect {

    private Logger logger = Logger.getLogger(LogginAspect.class.getName());
    @Around("execution(* services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().getName() + " matching joinpoint...");
        joinPoint.proceed();//this is the method call - joinpoint
        logger.info("Method executed successfully");
    }
}
