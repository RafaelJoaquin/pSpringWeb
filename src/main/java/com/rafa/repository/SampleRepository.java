package com.rafa.repository;

import com.rafa.mapper.SampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rafael
 */

@Repository
public class SampleRepository {

    @Autowired
    private SampleMapper sampleMapper;

    public SampleRepository(SampleMapper sampleMapper){
        this.sampleMapper=sampleMapper;
    }
    
    public String getMessageByUser(String userName){
        //String language = sampleMapper.
    }
}
