package ru.javawebinar.topjava.util;

import org.springframework.util.Assert;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class ValidateForJdbc {
    public static final Validator VALIDATOR = Validation.buildDefaultValidatorFactory().getValidator();

    public static <T> void validate(T object) {
        Set<ConstraintViolation<T>> violations = VALIDATOR.validate(object);

        if (!violations.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (ConstraintViolation<T> constraintViolation : violations) {
                sb.append(constraintViolation.getMessage());
            }
            throw new ConstraintViolationException("Error occurred: " + sb, violations);
        }
        Assert.notNull(object, "meal must not be null");
    }
}
