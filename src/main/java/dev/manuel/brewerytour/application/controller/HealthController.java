package dev.manuel.brewerytour.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public record HealthController() {

  @GetMapping
  public ResponseEntity<?> getHealth(){
    return new ResponseEntity<>("All OK!", HttpStatus.OK);
  }
}
