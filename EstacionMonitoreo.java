public class EstacionMonitoreo {
    private String nombre;

    public EstacionMonitoreo(String nombre) {
        this.nombre = nombre;
    }

    public void monitorear(Sensor sensor) {
        System.out.println("Sensor: " + sensor.getId()
                + " | Lectura: " + sensor.leer());
    }
}
