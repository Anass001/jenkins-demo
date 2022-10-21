package com.example.jenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping("/add")
    public int add(@RequestParam(value = "n1", defaultValue = "0") int n1, @RequestParam(value = "n2", defaultValue = "0") int n2) {
        return n1 + n2;
    }

    @GetMapping("/sub")
    public int sub(@RequestParam(value = "n1", defaultValue = "0") int n1, @RequestParam(value = "n2", defaultValue = "0") int n2) {
        return n1 - n2;
    }

    @GetMapping("/mult")
    public int mult(@RequestParam(value = "n1", defaultValue = "0") int n1, @RequestParam(value = "n2", defaultValue = "0") int n2) {
        return n1 * n2;
    }

    @GetMapping("/div")
    public float div(@RequestParam(value = "n1", defaultValue = "0") int n1, @RequestParam(value = "n2", defaultValue = "0") int n2) {
        if (n2 != 0)
            return (float) n1 / n2;
        else return 0;
    }
}
