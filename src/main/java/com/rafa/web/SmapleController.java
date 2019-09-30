package com.rafa.web;

import com.rafa.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author rafael
 */


@Controller
public class SmapleController {

    @Autowired
    private SampleService sampleService;
    
    //public Samplecontroller 
    
}
