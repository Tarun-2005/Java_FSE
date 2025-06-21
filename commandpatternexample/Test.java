package digitalnurture.commandpatternexample;

public class Test {
    public static void main(String[] args) {
        Light light =new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffComand(light);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOnCommand);   
        remoteControl.pressButton(); 
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton(); 
    
}
}