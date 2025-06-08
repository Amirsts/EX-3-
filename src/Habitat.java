public class Habitat {
    private String environmentType;
    private double temperature;

    public Habitat(String environmentType, double temperature){
        this.environmentType = environmentType;
        this.temperature = temperature;
    }

    public String getInfo(){
        return environmentType + " TEMP: " + temperature + "°C)";
    }

    //getters
    public String getEnvironmentType() {
        return environmentType;
    }
}