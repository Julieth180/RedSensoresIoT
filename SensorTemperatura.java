public class SensorTemperatura extends Sensor {
    public SensorTemperatura(String id, String ubicacion) {
        super(id, ubicacion);
    }
    @Override
    public double leer() { return 24.5; }
}
