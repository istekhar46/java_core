interface interface1{
    void  meth1();
}
interface interface2 extends interface1{
    void  meth2();
}
class sample implements interface2{
    @Override
    public void meth1() {
        System.out.println("Method 1");
    }
    public void meth2() {
        System.out.println("Method 2");
    }
}
interface camera{
    void recordingVid();
    void takingPictures();

    // <Default method and private methods int interface ....>

//    private void gps(){
//        System.out.println("taking picture with location");
//    }

    // The default method can be called without creating this method in implementing classes
    default void recording4KVideo(){
        System.out.println("Recording the 4K video ");
    }
}

interface wifi{
    String [] network();
    void connectToNetworks(String network);
}

class shellphone{
    void calling(String number){
        System.out.println("calling the phone number "+number);
    }
    void pickingTheCall(String number){
        System.out.println("incoming call from "+number);
    }
}
class MySmartPhone extends shellphone implements camera,wifi{
    public void recordingVid(){
        System.out.println("Recording the video");
    }
   public void takingPictures(){
       System.out.println("Taking the pictures..");
   }
   public String [] network(){
        System.out.println("Getting the network");
        String [] network={"airtel 5g","jio fiber"};
        return network;
    }
   public void connectToNetworks(String network){
        System.out.println("connecting to "+network);
    }
//    public void recording4KVideo(){
//        System.out.println("Recording the 4K video with 60fps ");
//    }


}
public class Interface_practice {
    public static void main(String[] args) {
      MySmartPhone sc = new MySmartPhone();
      sc.recordingVid();
     String [] arr=sc.network();
     for(String item:arr){
         System.out.println(item);
     }
      sc.connectToNetworks("airtel 5g");
     sc.calling("9794883638....");
     sc.pickingTheCall("9794883638");
     sc.recording4KVideo();

     sample obj = new sample();
     obj.meth1();
     obj.meth2();

     // polymorphism concept is based dynamic dispatch of methods
        // Here the implementation of polymorphism is demonstrated.

        camera cam = new MySmartPhone();
        cam.recording4KVideo();
        //  cam.calling(); this will throw error because it has only permission to use camera only...


    }
}
