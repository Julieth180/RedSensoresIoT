import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sensor temperatura =
                new SensorTemperatura("T001", "Zona Norte");
        Sensor humedad =
                new SensorHumedad("H001", "Zona Norte");
        Sensor calidadAire =
                new SensorCalidadAire("A001", "Zona Sur");
        Sensor luminosidad =
                new SensorLuminosidad("L001", "Zona Sur");

        List<Sensor> sensores = new ArrayList<>();
        sensores.add(temperatura);
        sensores.add(humedad);
        sensores.add(calidadAire);
        sensores.add(luminosidad);

        ServicioEnvioDatos servicio = new ServicioEnvioDatos();
        EstacionMonitoreo estacion =
                new EstacionMonitoreo("Estación Central");

        for (Sensor sensor : sensores) {
            sensor.activar();

            double valor = sensor.leer();
            sensor.registrarLectura();

            System.out.println(
                    sensor.getId() + " | "
                    + sensor.getUbicacion()
                    + " | Activo: " + sensor.isActivo()
                    + " | Lectura: " + valor
            );

            servicio.enviar(sensor.getId(), valor);
            estacion.monitorear(sensor);
            System.out.println();
        }
    }
}
