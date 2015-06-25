/**
 * Copyright (c) 2012 Conversant Solutions. All rights reserved.
 *
 * Created on 12/6/12.
 */
package cn.com.sy.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for mapper to scan all DAOs
 *
 * @author jermmy.yang
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DataAccessRepository {

}
