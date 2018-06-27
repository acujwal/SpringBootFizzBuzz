package com.example.fizzbuzz;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class HomeController {

        @GetMapping("/") /*-- load the fizzbuzz page --*/
        public String loadfizzBuzz(Model model) {
            model.addAttribute("fizzbuzz", new fizzBuzz());
            return "fizzbuzz";
        }

        @PostMapping("/process")
        /*---validating and getting values entered by the user using @ModelAttribute---*/
        public String processFizzBuzz(@Valid @ModelAttribute("fizzbuzz") fizzBuzz fizzbuzz, BindingResult resultError, Model model) {
            /*---if the validation error is true the error message is printed---*/
            if (resultError.hasErrors()) {
                return "fizzbuzz";
            }

            else {
                ArrayList<String> pullvalue = fizzbuzz.buzz(fizzbuzz.getStart(), fizzbuzz.getEnd());
                model.addAttribute("print", pullvalue);
                return "result";
            }
        }

    }

