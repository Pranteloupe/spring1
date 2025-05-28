package aspects;

import models.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    //@Around("execution(* services.*.*(..))") //executes *-any type, services package, *-all classes, *-all methods,
    // (..)-any parameters
    @Around("@annotation(main.ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        logger.info("Method: " + methodName + " with parameters " + Arrays.asList(args) + " will execute.");

        Comment comment = new Comment();
        comment.setText("HEHEHEHHE");
        Object[] newArgs = {comment};
        Object returnedByMethod = joinPoint.proceed(newArgs);

        logger.info("Method executed and return " + returnedByMethod);

        return "FAILED";
    }
}
