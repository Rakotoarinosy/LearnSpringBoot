package com.example.projetSpring;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ServiceRest {
    private static final Logger
    Logger = LoggerFactory.getLogger(ServiceRest.class);
    @GetMapping(value="/")
    public ResponseEntity<String> pong(){
        Logger.info("Demmarage du service OK ..............");
        return new ResponseEntity<String>("Bonjour, Response du server"+
                HttpStatus.OK.name(),HttpStatus.OK);
    }
    
    @PostMapping(value = "/")
    public ResponseEntity<String> ping(){
        Logger.info("Demmarage du service OK .........");
        return new ResponseEntity<>("Post Réponse du serveur"+
            HttpStatus.OK.name(),HttpStatus.OK);
    }
}
