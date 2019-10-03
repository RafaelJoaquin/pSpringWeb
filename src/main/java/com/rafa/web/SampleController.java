package com.rafa.web;

import com.rafa.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rafael
 */


@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;
    
    public SampleController(SampleService sampleSevice){
        this.sampleService = sampleSevice;
    } 
    
    /**
     * Mapeamos las url y sus metodos correspondientes
     */
    
    @RequestMapping(value = "/welcome/{userName}", method = RequestMethod.GET)
    public String welcome(
            @PathVariable("userName") String userName
    ){
         return sampleService.welcome(userName);
    }
    
}
