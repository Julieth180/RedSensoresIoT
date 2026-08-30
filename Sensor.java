import java.util.ArrayList;
import java.util.List;

public abstract class Sensor {
    private String id;
    private String ubicacion;
    private boolean activo;
    private List<Lectura> lecturas;

    public Sensor(String id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.activo = false;
        this.lecturas = new ArrayList<>();
    }

    public void activar() { activo = true; }
    public void desactivar() { activo = false; }
    public abstract double leer();

    public void registrarLectura() {
        lecturas.add(new Lectura(leer()));
    }

    public String getId() { return id; }
    public String getUbicacion() { return ubicacion; }
    public boolean isActivo() { return activo; }
}
