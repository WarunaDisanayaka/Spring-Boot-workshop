package com.example.demo.controllers;

import com.example.demo.httpentities.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class AuthController {

    @RequestMapping(method = RequestMethod.POST,path = "/lang/{language}/login")
    public ResponseEntity<String> doLogin(@PathVariable String language,@RequestBody LoginRequest logindata){
//        return ResponseEntity.ok(language);
//        return ResponseEntity.ok(logindata.getEmail()+" "+logindata.getPassword());

        if(logindata.getEmail().equals("user@gmail.com") && logindata.getPassword().equals("12345")){
            return ResponseEntity.ok("{}");

        }
            return ResponseEntity.status(401).body("{}");
    }

}
