package rest;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ClientController {
    @RequestMapping("calculatorSum")
    public double sum(@RequestParam(value="number", defaultValue = "0") double a, double b) {
        return a+b;
    }
    @RequestMapping("calculatorDiff")
    public double diff(@RequestParam(value="number", defaultValue = "0") double a, double b) {
        return a-b;
    }
    @RequestMapping("calculatorMultiply")
    public double multiply(@RequestParam(value="number", defaultValue = "0") double a, double b) {
        return a*b;
    }
    @RequestMapping("calculatorQuotient")
    public double quotient(@RequestParam(value="number", defaultValue = "0") double a, double b) {
        if(b!=0)return a/b;
        else return Integer.MAX_VALUE;
    }


}

