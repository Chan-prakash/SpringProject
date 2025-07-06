package com.chan.SpringRESTJOB.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Component
@Aspect

public class loggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(loggingAspect.class);
    @Before("execution(* com.chan.SpringRESTJOB..*(..))")
    public void Logmethodcall(){
        LOGGER.info("Logging method called");
    }

}
