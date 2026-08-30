public class SensorCalidadAire extends Sensor {
    public SensorCalidadAire(String id, String ubicacion) {
        super(id, ubicacion);
    }
    @Override
    public double leer() { return 42.0; }
}
