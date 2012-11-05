package org.spockframework.runtime.extension.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.spockframework.runtime.extension.ExtensionAnnotation;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@ExtensionAnnotation(EnvironmentEndPointExtension.class)
public @interface EnvironmentEndPoint
{
	
}
