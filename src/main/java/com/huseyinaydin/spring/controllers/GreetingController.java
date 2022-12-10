package com.huseyinaydin.spring.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huseyinaydin.spring.dto.Greeting;
import com.huseyinaydin.spring.services.GreetingService;

/**
 * @author Hüseyin Aydın
 */
@RestController
@RequestMapping("/api/v1/greetings")
@RequiredArgsConstructor
public class GreetingController {

  private final GreetingService service;

  @PostMapping
  public ResponseEntity<String> postGreeting(
      @RequestBody Greeting greeting
  ) {
    final String greetingMsg = service.saveGreeting(greeting);
    return ResponseEntity
        .accepted()
        .body(greetingMsg);
  }

  @GetMapping("/error")
  public ResponseEntity<?> throwException() {
    return ResponseEntity.ok(service.throwException());
  }

}
