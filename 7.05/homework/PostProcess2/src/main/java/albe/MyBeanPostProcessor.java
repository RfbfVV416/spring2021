package albe;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        boolean fl = false;
        String objToString = "";
        try{
            Method[] methods = bean.getClass().getDeclaredMethods();
            for (Method method: methods) {
                if (method.isAnnotationPresent(ToStr.class)){
                    Class obj = bean.getClass();
                    objToString  += obj.getName() + "{";
                    Field [] fields = obj.getDeclaredFields();
                    for (Field field: fields) {
                        objToString += field.getName() + "=" + field.get(bean) + ", ";
                    }
                    objToString += "}";
                    System.out.println("My str " + objToString);
                }
            }
        }
        catch (IllegalAccessException ex){
            ex.printStackTrace();
        }
        return bean;
    }
}