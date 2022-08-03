package co.develhope.FirstApi03.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
    public class StringController {

        @GetMapping("/strings{s1}{s2}")

        public String concatenation(@RequestParam(required = true) String s1, @RequestParam(required = false) String s2) {
            if (s2 == null) {
                return s1;
            } else {
                return s1 + " " + s2;
            }
        }


        }