public class SensorHumedad extends Sensor {
    public SensorHumedad(String id, String ubicacion) {
        super(id, ubicacion);
    }
    @Override
    public double leer() { return 67.2; }
}
