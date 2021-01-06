package com.effortguy.junit5.testMethodOrderAnnotation;

import org.junit.jupiter.api.MethodDescriptor;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrdererContext;
import org.junit.platform.commons.util.ClassUtils;

import java.lang.reflect.Method;
import java.util.Comparator;

public class MethodNameReverse implements MethodOrderer {

    @Override
    public void orderMethods(MethodOrdererContext context) {
        context.getMethodDescriptors().sort(comparator);
    }

    private static final Comparator<MethodDescriptor> comparator = Comparator.<MethodDescriptor, String>
            comparing(descriptor -> descriptor.getMethod().getName())
            .thenComparing(descriptor -> parameterList(descriptor.getMethod())).reversed();

    private static String parameterList(Method method) {
        return ClassUtils.nullSafeToString(method.getParameterTypes());
    }
}
