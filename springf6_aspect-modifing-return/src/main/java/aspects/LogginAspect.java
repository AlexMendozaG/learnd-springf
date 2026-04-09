package aspects;

import models.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LogginAspect {

    Logger logger = Logger.getLogger(LogginAspect.class.getName());

    @Around("execution(* services.*.*(..))")
    public String AspectForMethod(ProceedingJoinPoint pjp) throws Throwable {


        logger.info("values recived of the method: "+pjp.getArgs().toString());
        pjp.proceed();
        Comment comment = new Comment();
        comment.setAuthor("Alex Mendoza");
        comment.setText("writing from aspect");

        Object[] newArgs = {comment};
        Object returnByMethod = pjp.proceed(newArgs);

        logger.info("new values of method: "+returnByMethod.toString());

        return "ASPECT CLOSE";
    }
}
