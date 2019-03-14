package main.java.http.server.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Validate {

    enum ValidateType {
        NUMBER,
        STRING
    }

    enum Require {
        TRUE,
        FALSE
    }

    ValidateType type() default ValidateType.STRING;

    Require require() default Require.FALSE;
}
