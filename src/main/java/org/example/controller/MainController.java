package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    /**
     * @see <a href="http://localhost:8080">localhost</a>
     */
    @GetMapping("/")
    public String getHomePage() {
        return "home page";
    }

    /**
     * @see <a href="http://localhost:8080/getSquare/3">localhost</a>
     */
    @GetMapping("/getSquare/{id}")
    public String getSquare(@PathVariable int id) {
        return String.valueOf(Math.pow(id, 2));
    }
}
