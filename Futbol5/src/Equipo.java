import java.util.ArrayList;
import java.util.List;

//Añadir datos de jugadores
class Jugador {
    String nombre;
    String apellido;
    String rol ;
    String numerocam;  
    String dni ; 
    String obrasocial ; 
    String aptomedico;

    public Jugador(String nombre, String apellido, String rol, String numerocam, String dni,
            String obrasocial, String aptomedico) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.rol = rol;
      this.numerocam = numerocam;
      this.dni = dni;
      this.obrasocial = obrasocial;
      this.aptomedico = aptomedico;
    }

    // Getters y setters

    public String getNombre() {
      return nombre;
    }
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
    public String getApellido() {
      return apellido;
    }
    public void setApellido(String apellido) {
      this.apellido = apellido;
    }
    public String getRol() {
      return rol;
    }
    public void setRol(String rol) {
      this.rol = rol;
    }
    public String getNumerocam() {
      return numerocam;
    }
    public void setNumerocam(String numerocam) {
      this.numerocam = numerocam;
    }
    public String getDni() {
      return dni;
    }
    public void setDni(String dni) {
      this.dni = dni;
    }
    public String getObrasocial() {
      return obrasocial;
    }
    public void setObrasocial(String obrasocial) {
      this.obrasocial = obrasocial;
    }
    public String getAptomedico() {
      return aptomedico;
    }
    public void setAptomedico(String aptomedico) {
      this.aptomedico = aptomedico;
    }
    
    
//Añadir datos de Equipos
    
}
public class Equipo {

    private List<Jugador> jugadores = new ArrayList<>();
    String nombredeequipo;
    int cantidad = 0;
    int puntosGanados = 0;

    public Equipo(String nombredeequipo) {
        this.nombredeequipo = nombredeequipo;
    }

    public String getNombredeequipo() {
        return nombredeequipo;
    }

    public void setNombredeequipo(String nombredeequipo) {
        this.nombredeequipo = nombredeequipo;
    }

    
    public int getPuntosGanados() {
        return puntosGanados;
    }

    public void setPuntosGanados(int puntosGanados) {
        this.puntosGanados = puntosGanados;
    }

    public void nuevoJugador(String nombre, String apellido, String rol, String numerocam, String dni,
            String obrasocial, String aptomedico) {
        Jugador j = new Jugador(nombre, apellido, rol, numerocam, dni, obrasocial, aptomedico);
        jugadores.add(j);
        cantidad++;
    }

    public Equipo() {
        // jugadores = new Jugador[App.jugEq];
    }

    public void puntosGanados(int puntosGanados) {
        this.puntosGanados += puntosGanados;
    }

    public void verJugadores() {

        // Listamos los jugadores de ese equipo
        for (int j = 0; j < jugadores.size(); j++) {
            System.out.println(jugadores.get(j).getNombre() + " " + jugadores.get(j).getApellido() + " "
                    + jugadores.get(j).getRol() + " camiseta n°" + jugadores.get(j).getNumerocam());

        }
        System.out.println("");
    }

    public int cantidadJugadores(){
        return jugadores.size();
    }
}

