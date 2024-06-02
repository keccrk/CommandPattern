public class Main {
    public static void main(String[] args) {
        //Receiver
        Light livingRoomLight = new Light();

        //Concrete Commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        //Invoker
        RemoteControl remote = new RemoteControl();

        //Işığı aç
        remote.setCommand(lightOn);
        remote.pressButton();

        //Işığı kapat
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}