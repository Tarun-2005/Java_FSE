package digitalnurture.commandpatternexample;

public class LightOffComand  implements Command{
    private Light light;
    public LightOffComand(Light light) {
        this.light = light;
    }
    public String execute(){
        return light.turnOff();
    }
    
}
