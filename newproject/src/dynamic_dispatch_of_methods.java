class phone {
    public void on() {
        System.out.println("Turning on the phone....");
    }  public void showTime() {
        System.out.println("Time is 11pm....");
    }
}

class SmartPhone extends phone {
    @Override //overriding annotation...
    public void on(){
        System.out.println("Turning  on smartphone....");
    }
    public void playingMusic(){
        System.out.println("Playing music....");
    }
}
public class dynamic_dispatch_of_methods {

    public static void main(String[] args) {
           phone obj = new SmartPhone(); //it is allowed
           // SmartPhone obj = new phone(); it is not allowed
        obj.on();
        obj.showTime();
//        obj.playingMusic(); can not call methods of smartphone from phone except overriding methods
    }
}
