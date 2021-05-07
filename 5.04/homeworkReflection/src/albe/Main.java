package albe;
import albe.reflection.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException{
        Class mClassObject = SomeObject.class;

        //меняем public поле name1
        Field publicField = mClassObject.getField("name1");
        SomeObject instance = new SomeObject();
        Object value = publicField.get(instance);
        System.out.println(value); //начальное значение поля класса
        publicField.set(instance, "someField");
        value = publicField.get(instance);
        System.out.println(value); //новое значение поля класса

        //меняем public static поле name2
        Field publicStaticField = mClassObject.getField("name2");
        SomeObject instance2 = new SomeObject();
        Object value2 = publicStaticField.get(instance2);
        System.out.println(value2);
        publicStaticField.set(instance2, "someField");
        value2 = publicStaticField.get(instance2);
        System.out.println(value2);

        //меняем private поле name3
        SomeObject instance3 = new SomeObject();
        Field privateField = SomeObject.class.getDeclaredField("name3");
        privateField.setAccessible(true);
        String fieldValue = (String) privateField.get(instance3);
        System.out.println(fieldValue);
        privateField.set(instance3, "SomeField");
        String fieldValueAfter = (String) privateField.get(instance3);
        System.out.println(fieldValueAfter);

        //меняем private final поле name4
        SomeObject instance4 = new SomeObject();
        Field privateFinalField = SomeObject.class.getDeclaredField("name4");
        privateFinalField.setAccessible(true);
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(privateFinalField, privateFinalField.getModifiers() & ~Modifier.FINAL);
        System.out.println(privateFinalField.get(instance4));
        privateFinalField.set(instance4, "someField");
        System.out.println(privateFinalField.get(instance4));

        //меняем private final static поле name5 (почему-то работает только если выполнять отдельно от остального)
        SomeObject instance5 = new SomeObject();
        Field privateFinalStaticField = SomeObject.class.getDeclaredField("name5");
        privateFinalStaticField.setAccessible(true);
        Field modifiersField2 = Field.class.getDeclaredField("modifiers");
        modifiersField2.setAccessible(true);
        modifiersField2.setInt(privateFinalStaticField, privateFinalStaticField.getModifiers() & ~Modifier.FINAL & ~Modifier.STATIC);
        System.out.println(privateFinalStaticField.get(instance5));
        privateFinalStaticField.set(instance5, "someField");
        System.out.println(privateFinalStaticField.get(instance5));





    }
}
