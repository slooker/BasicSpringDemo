package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Calendar;
import java.util.HashMap;

@Controller
@RequestMapping("/")
public class HelloController {
    // Since there's no value in the RequestMapping for this, it will only match the RequestMapping of "/" declared above the class declaration
    // This will also only match on a GET request.
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "hello";
    }


    // This only matches if we go to / from the RequestMapping above the class declaration AND
    // if its a POST request
    @RequestMapping(value ="test", method = RequestMethod.POST)
    // Return whatever format we've configured in the spring XML (in this case mvc-dispatcher-servlet.xml)
    @ResponseBody
    public HashMap handlePost(@RequestBody HashMap map) {
        // Check if there's a password
        if (map.containsKey("password")) {
            // Remove password
            map.remove("password");
        }
        // Add date
        map.put("date", Calendar.getInstance().getTime().toString());
        return map;
    }
}