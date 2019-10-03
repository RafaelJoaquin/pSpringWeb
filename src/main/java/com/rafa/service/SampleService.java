package com.rafa.service;

import com.rafa.repository.SampleRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafael
 */

@Service
public class SampleService {

    private SampleRepository sampleRepository;
    
    public SampleService (SampleRepository sampleRepository){
        this.sampleRepository = sampleRepository;
    }
    
    public String welcome(String username){
        //sampleRepository.
        return null;
    }
    
    
}
