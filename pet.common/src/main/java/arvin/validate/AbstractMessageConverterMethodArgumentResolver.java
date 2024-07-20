package arvin.validate;

import org.springframework.core.MethodParameter;
import org.springframework.validation.annotation.ValidationAnnotationUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;

import java.lang.annotation.Annotation;

public abstract class AbstractMessageConverterMethodArgumentResolver implements HandlerMethodArgumentResolver {
    /**
     * Validate the binding target if applicable.
     * <p>The default implementation checks for {@code @javax.validation.Valid},
     * Spring's {@link org.springframework.validation.annotation.Validated},
     * and custom annotations whose name starts with "Valid".
     * @param binder the DataBinder to be used
     * @param parameter the method parameter descriptor
     * @since 4.1.5
     */
    protected void validateIfApplicable(WebDataBinder binder, MethodParameter parameter) {
        //获取参数上的所有注解
        Annotation[] annotations = parameter.getParameterAnnotations();
        for (Annotation ann : annotations) {
            //如果注解中包含了@Valid、@Validated或者是名字以Valid开头的注解就进行参数校验
            Object[] validationHints = ValidationAnnotationUtils.determineValidationHints(ann);
            if (validationHints != null) {
                //实际校验逻辑，最终会调用Hibernate Validator执行真正的校验
                //所以Spring Validation是对Hibernate Validation的二次封装
                binder.validate(validationHints);
                break;
            }
        }
    }
}
