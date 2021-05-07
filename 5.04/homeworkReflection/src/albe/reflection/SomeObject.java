package albe.reflection;

public class SomeObject {
    public String name1 = "somePublicField"; //ок
    public static String name2 = "somePublicStaticField"; //ок
    //private String name = "someObj1"; //NoSuchFieldException при .getField
    //public final String name = "someObj1"; //IllegalAccessException при .set
    private String name3 = "somePrivateField";
    private final String name4 = "somePrivateFinalField";
    private final static String name5 = "somePrivateFinalStaticField";

    public static String getName5() {
        return name5;
    }

}
