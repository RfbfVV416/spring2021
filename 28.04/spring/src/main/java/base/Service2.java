package base;

public class Service2 {
    public void setService1(Service1 service1) {
        this.service1 = service1;
    }

    private Service1 service1;
    private Service2(Service1 service1){
        this.service1 = service1;
    }

}
