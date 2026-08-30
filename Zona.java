import java.util.ArrayList;
import java.util.List;

public class Zona {
    private String nombre;
    private List<Sensor> sensores;

    public Zona(String nombre) {
        this.nombre = nombre;
        this.sensores = new ArrayList<>();
    }

    public void agregarSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    public String getNombre() { return nombre; }
    public List<Sensor> getSensores() { return sensores; }
}
