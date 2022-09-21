package com.springexample.demo.Controller;

import com.springexample.demo.Model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MyController {

    @RequestMapping("/Courses")
    public List<Course> retrieveData() {

        return Arrays.asList(new Course(1, "Java", "Javatpoint"),
                new Course(2, "Java", "Javatpoint"),
                new Course(3, "Java", "Javatpoint"),
                new Course(4, "Java", "Javatpoint"),
        new Course(5, "Java", "Javatpoint")
        );
    }
        @GetMapping("/Map")
        public Map<String, String> sayHello() {
            HashMap<String, String> map = new HashMap<>();
            map.put("key", "value");
            map.put("foo", "bar");
            map.put("aa", "bb");
            return map;

    }
}
