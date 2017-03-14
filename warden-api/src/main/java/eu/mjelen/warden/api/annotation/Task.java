package eu.mjelen.warden.api.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Task {
    Class parent() default Object.class;
}
