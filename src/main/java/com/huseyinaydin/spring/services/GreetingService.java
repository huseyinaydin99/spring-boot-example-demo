package com.huseyinaydin.spring.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.huseyinaydin.spring.dto.ExampleDto;
import com.huseyinaydin.spring.dto.Greeting;
import com.huseyinaydin.spring.validators.ObjectsValidator;

/**
 * @author Hüseyin Aydın
 */
@Service
@RequiredArgsConstructor
public class GreetingService {

  private final ObjectsValidator<Greeting> greetingValidator;
  private final ObjectsValidator<ExampleDto> exampleDtoValidator;
  public String saveGreeting(Greeting greeting) {
    greetingValidator.validate(greeting);
    final String greetingMsg =
        "Greeting message <<" +
            greeting.getMsg()
            + ">> from: " +
            greeting.getFrom().toUpperCase() +
            " to: " +
            greeting.getTo().toUpperCase();
    return greetingMsg;
  }

  /*
  throw Exception() <==> return
   */

  public String throwException() {
    throw new IllegalStateException("Some exception happened");
  }
}
