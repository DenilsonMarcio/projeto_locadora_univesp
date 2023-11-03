package br.univesp.projeto.locadora.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class HelloController {

    @GetMapping()
    public ResponseEntity<String> testController(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello Univesp!!!");
    }

}
