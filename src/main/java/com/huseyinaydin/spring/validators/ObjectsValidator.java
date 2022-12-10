package com.huseyinaydin.spring.validators;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidationException;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.stereotype.Component;

import com.huseyinaydin.spring.dto.Greeting;
import com.huseyinaydin.spring.exceptions.ObjectNotValidException;

/**
 * @author Hüseyin Aydın
 */
@Component
public class ObjectsValidator<T> {

  private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
  private final Validator validator = factory.getValidator();

  public void validate (T objectToValidate) {
    Set<ConstraintViolation<T>> violations = validator.validate(objectToValidate);
    if (!violations.isEmpty()) {
      var errorMessages = violations
          .stream()
          .map(ConstraintViolation::getMessage)
          .collect(Collectors.toSet());
      throw new ObjectNotValidException(errorMessages);
    }
  }
}
