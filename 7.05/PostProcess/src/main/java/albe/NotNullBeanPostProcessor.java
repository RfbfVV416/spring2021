package albe;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class NotNullBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        try{
            Field [] fields = bean.getClass().getDeclaredFields(); //только 1 эл т к 1 поле в MagazineRating
            for (Field field: fields){
                if (field.isAnnotationPresent(NotNegative.class) && field.getFloat(bean) < 0){
                    try{
                        return new MagazineRating(Math.abs(field.getFloat(bean)), "some description from 1st if");
                    }
                    catch (IllegalAccessException ex){
                        ex.printStackTrace();
                    }
                }
                if (field.isAnnotationPresent(NotNull.class) && field.get(bean) == null){
                    return new MagazineRating((float)0.0, "some description from 2nd if");
                }
            }
        }
        catch (IllegalAccessException ex){
            ex.printStackTrace();
        }
        return bean;
    }
}
