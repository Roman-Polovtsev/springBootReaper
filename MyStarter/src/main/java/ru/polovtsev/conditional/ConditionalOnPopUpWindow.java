package ru.polovtsev.conditional;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Conditional(OnPopUpWindowCondition.class)
public @interface ConditionalOnPopUpWindow {
}
