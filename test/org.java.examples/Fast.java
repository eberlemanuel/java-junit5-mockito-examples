/**
 * Own defined custom annotation to separate tests
 *
 * @author  ebeman12
 * @version 0.1
 * @date   09.09.2022
 */

package org.java.examples;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Tag;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Tag("fast")
public @interface Fast { }
