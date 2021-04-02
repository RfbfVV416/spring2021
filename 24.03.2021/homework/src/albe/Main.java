package albe;

public class Main {

    public static void main(String[] args) {
        FreeSoftArt myArt = new FreeSoftArt("art1");
        try{
            NftToken.of(myArt); //всё ок
        } catch (KeyAlreadyExistsException ex){
            System.out.println(ex.getMessage());
        }
        FreeSoftArt mySecondArt = new FreeSoftArt("art1");
        try{
            NftToken.of(mySecondArt); //исключение
        }catch (KeyAlreadyExistsException ex){
            System.out.println(ex.getMessage());
        }
    }
}
