package com.mirai.boot.anno;

import org.springframework.stereotype.Component;

/**
 * @author mirau on 2021/5/25.
 * @version 1.0
 */
@Component
public class AnnotationBean {

    public String echo(String value) {
        return value;
    }
}
