package com.agmtopy.axonsimple.domain.metrics;

import com.alibaba.fastjson.serializer.PropertyFilter;

/**
 * JSONPropertyFilter
 * 这应该算是工具类,工具类要归纳在domain下嘛?
 */
public class JSONPropertyFilter implements PropertyFilter {

    public static JSONPropertyFilter singleton = new JSONPropertyFilter();

    @Override
    public boolean apply(Object object, String name, Object value) {
        if(name.equalsIgnoreCase("context")){
            return false;
        }
        if(name.equalsIgnoreCase("extValues")){
            return false;
        }
        return true;
    }
}
