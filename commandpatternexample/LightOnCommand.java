package digitalnurture.commandpatternexample;

public class LightOnCommand implements Command{
    private Light light;
    public LightOnCommand(Light light) {
        this.light= light;
    }
    public String execute(){
        return light.turnOn();
    }
}
    

