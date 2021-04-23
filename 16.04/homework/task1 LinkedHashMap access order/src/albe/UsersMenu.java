package albe;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Objects;

public class UsersMenu {

    public LinkedHashMap<String, Method> menuAddOrder = new LinkedHashMap<String, Method>(16, .75f, false);
    public  LinkedHashMap<String, Method> menuUseOrder = new LinkedHashMap<String, Method>(16, .75f, true);
    public boolean accessOrder = false;

    UsersMenu() throws NoSuchMethodException{
        menuUseOrder.put("добавить пункт меню", this.getClass().getMethod("addItem", String.class));
        menuAddOrder.put("добавить пункт меню", this.getClass().getMethod("addItem", String.class));
        menuUseOrder.put("изменить порядок пунктов меню", this.getClass().getMethod("changeOrder", String.class));
        menuAddOrder.put("изменить порядок пунктов меню", this.getClass().getMethod("changeOrder", String.class));
    }

    public void addItem(String str){
        Objects.requireNonNull(str, "Null str obj");
        menuAddOrder.put(str, null);
        menuUseOrder.put(str, null);
    }

    public void changeOrder(String str){
        if ("в порядке добавления".equals(str)) accessOrder = false;
        else if ("в порядке использования".equals(str)) accessOrder = true;
    }

    public void printMenu(){
        if (!accessOrder){
            for (String str: menuAddOrder.keySet()) {
                System.out.println(str);
            }
        }
        else{
            for (String str: menuUseOrder.keySet()) {
                System.out.println(str);
            }
        }
    }

    public LinkedHashMap<String, Method> getMenuUseOrder() {
        return menuUseOrder;
    }

}
