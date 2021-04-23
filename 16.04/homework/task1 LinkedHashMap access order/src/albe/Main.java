package albe;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException{
        UsersMenu menu = new UsersMenu();
        menu.printMenu();
        while(true){
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            if (menu.getMenuUseOrder().containsKey(input)){
                Method method = menu.getMenuUseOrder().get(input);
                if ("добавить пункт меню".equals(input)){
                    System.out.println("введите имя нового пункта");
                    String newItemName = in.nextLine();
                    method.invoke(menu, newItemName);
                    System.out.println("Метод добавлен\n");

                }
                else if ("изменить порядок пунктов меню".equals(input)){
                    System.out.println("в порядке добавления/в порядке использования?");
                    String newOrder = in.nextLine();
                    method.invoke(menu, newOrder);
                    System.out.println("Порядок изменен\n");

                }
                else{
                    System.out.println("Был вызван метод " + input + "\n");

                }
                menu.printMenu();

            }
        }

    }
}
