public class SensorLuminosidad extends Sensor {
    public SensorLuminosidad(String id, String ubicacion) {
        super(id, ubicacion);
    }
    @Override
    public double leer() { return 850.0; }
}
