package com.rafa.mapper;

import org.apache.ibatis.annotations.Param;



/**
 *
 * @author rafael
 */
public interface SampleMapper {
    String getLanguageByUser(@Param("userName") String userName);
    String getMessageByLanguage(@Param("language") String language);
}
