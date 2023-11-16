
import java.util.Random;
import java.util.Scanner;

public class App {

    static int numEqs = 4;
    static int jugEq = 9;
    static Equipo[] equipos = new Equipo[numEqs];
    static int contadorEquipos = 0;
    final static int MIN_JUGADORES = 9;
    final static int MAX_JUGADORES = 16;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        baseDatos();

        int opcion = 1;
        while (opcion != 0) {
            menu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 -> {
                    // "1: Crear Equipo"
                    if (contadorEquipos < numEqs) {
                        crearEquipo();
                    } else {
                        System.out.println(
                                "lo sentimos pero ya llegamos al limite actual de equipos. \nEl limite de equipos es "
                                        + numEqs + " y actualmente hay " + contadorEquipos + " equipos.");
                    }
                }

                case 2 -> // "2: Agregar jugador a equipo"

                    agregarJugadorEquipo();
                case 3 -> // "3: ver listado de equipos incriptos en el torneo"
                    verlistado();
                default -> {
                }

                case 4 -> // jugar partidos
                    torneo();
             case 5 -> // ver tabla de puntos
                   vertabla();
            }
        }

        sc.close();
    }

    public static void baseDatos() {
        Equipo e1 = new Equipo("RIVADAVIA");
        Equipo e2 = new Equipo("RIVER");
        Equipo e3 = new Equipo("CENTENARIO");
        Equipo e4 = new Equipo("CIUDAD NUEVA");

        e1.nuevoJugador("Claudio", "García", "capitan", "1", "si", "si", "si");
        e1.nuevoJugador("Emanuel", "Martínez", "subcapitan", "2", "si ", "si", "si");
        e1.nuevoJugador("Brian", "González", "jugador", "3", "si ", "si", "si");
        e1.nuevoJugador("Enzo", "Hernández", "jugador", "4", "si ", "si", "si");
        e1.nuevoJugador("Anselmo", "Pérez", "jugador", "5", "si ", "si", "si");
        e1.nuevoJugador("Alejandro", "Romero", "jugador", "6", "si ", "si", "si");
        e1.nuevoJugador("Francisco", "Sarlengo", "jugador", "7", "si ", "si", "si");
        e1.nuevoJugador("Fernando", "Torres", "jugador", "8", "si ", "si", "si");
        e1.nuevoJugador("Matias", "Flores", "jugador", "9", "si ", "si", "si");
        e1.nuevoJugador("Franco", "Ramírez", "jugador", "10", "si ", "si", "si");
        e1.nuevoJugador("Javier", "Cruz", "jugador", "11", "si ", "si", "si");
        e1.nuevoJugador("Guillermo", "Gómez", "jugador", "12", "si ", "si", "si");
        e1.nuevoJugador("Agustin", "Rodríguez", "jugador", "13", "si ", "si", "si");
        e1.nuevoJugador("Juan", "Cardozo", "jugador", "14", "si", "si", "si");
  

        e2.nuevoJugador("Mariano", "Otazua", "jugador", "1", "si", "si", "si");
        e2.nuevoJugador("Leonel", "Rodriguez", "jugador", "2", "si", "si", "si");
        e2.nuevoJugador("Nicolas", "Reinoso", "jugador", "3", "si", "si", "si");
        e2.nuevoJugador("Nahuel", "Velozo", "jugador", "4", "si", "si", "si");
        e2.nuevoJugador("Facundo", "Fraga", "jugador", "5", "si", "si", "si");
        e2.nuevoJugador("Sebastian", "Caro", "subcapitan", "6", "si", "si", "si");
        e2.nuevoJugador("Santiago", "Diaz", "jugador", "7", "si", "si", "si");
        e2.nuevoJugador("Mateo", "Sevillano", "jugador", "8", "si", "si", "si");
        e2.nuevoJugador("Federico", "Iriarte", "jugador", "9", "si", "si", "si");
        e2.nuevoJugador("Laureano", "Ferreira", "capitan", "10", "si", "si", "si");
        e2.nuevoJugador("Mauricio", "Romero", "jugador", "11", "si", "si", "si");
        e2.nuevoJugador("tomas", "acosta", "jugador", "12", "si", "si", "si");
        e2.nuevoJugador("Ezequiel", "Rotela", "jugador", "13", "si", "si", "si");
        e2.nuevoJugador("Joel", "Gomez", "jugador", "14", "si", "si", "si");
        e2.nuevoJugador("Enzo", "Acuña", "jugador", "15", "si", "si", "si");
        e2.nuevoJugador("Tomas", "Tonarelli", "jugador", "16", "si", "si", "si");

        e3.nuevoJugador("Gabriel", "Mendoza", "jugador", "1", "si", "si", "si");
        e3.nuevoJugador("Andrés", "Cruz", "jugador", "2", "si", "si", "si");
        e3.nuevoJugador("Sebastián", "Jiménez", "jugador", "3", "si", "si", "si");
        e3.nuevoJugador("Mateo", "Romero", "jugador", "4", "si", "si", "si");
        e3.nuevoJugador("Alejandro", "Vargas", "jugador", "5", "si", "si", "si");
        e3.nuevoJugador("Daniel", "Herrera", "jugador", "6", "si", "si", "si");
        e3.nuevoJugador("Santiago", "Paredes", "jugador", "7", "si", "si", "si");
        e3.nuevoJugador("Carlos", "Ramírez", "jugador", "8", "si", "si", "si");
        e3.nuevoJugador("Rafael", "González", "jugador", "9", "si", "si", "si");
        e3.nuevoJugador("José", "López", "jugador", "10", "si", "si", "si");
        e3.nuevoJugador("Juan", "Torres", "jugador", "11", "si", "si", "si");
        e3.nuevoJugador("Eduardo", "Castro", "jugador", "12", "si", "si", "si");
        e3.nuevoJugador("Fernando", "Gómez", "capitan", "13", "si", "si", "si");
        e3.nuevoJugador("Nicolás", "Silva", "subcapitan", "14", "si", "si", "si");
        e3.nuevoJugador("Luis", "Rodríguez", "jugador", "15", "si", "si", "si");
        e3.nuevoJugador("Antonio", "Martínez", "jugador", "16", "si", "si", "si");
       
         e4.nuevoJugador("Pedro","Gonzalez","jugador","1","si","si","si");
         e4.nuevoJugador("Luis","Hernandez","jugador","2","si","si","si");
         e4.nuevoJugador("Javier","Ramirez","jugador","3","si","si","si");
         e4.nuevoJugador("Sergio","Pacheco","capitan","4","si","si","si");
         e4.nuevoJugador("Alejandro","Jimenez","jugador","5","si","si","si");
         e4.nuevoJugador("Nicolas","Virgili","jugador","6","si","si","si"); 
         e4.nuevoJugador("Gabriel","Castro","jugador"," 7","si","si","si");
         e4.nuevoJugador("Francisco","Ortega","jugador","8","si","si","si");
         e4.nuevoJugador("Juan","Dominguez","jugador","9","si","si","si");
         e4.nuevoJugador("Esteban","Flores","jugador","10","si","si","si");
         e4.nuevoJugador("Juan","Torres","jugador","11","si","si","si");
         e4.nuevoJugador("Miguel","Vargas","jugador","12","si","si","si");
         e4.nuevoJugador("Enzo","Morales","subcapitan","13","si","si","si");
         e4.nuevoJugador("Fernando","Reyes","jugador","14","si","si","si");
         e4.nuevoJugador("Daniel","Silva","jugador","15","si","si","si");
         e4.nuevoJugador("Raúl","Acosta","jugador","16","si","si","si"); 
      

        equipos[0] = e1;
        equipos[1] = e2;
        equipos[2] = e3;
        equipos[3] = e4;
        contadorEquipos = 4;

    }

    public static void menu() {
        System.out.println("\n   [---MENU DE OPCIONES---] ");
        System.out.println("Elija una opción: ");
        System.out.println("1: Crear Equipo");
        System.out.println("2: Agregar jugador a equipo");
        System.out.println("3: Ver Equipos inscriptos en el torneo");
        System.out.println("4: Torneo");
        System.out.println("5: Ver tabla de puntaje");
        System.out.println("0: Salir");
    }

    public static void crearEquipo() {
        

        System.out.println("BIENVENIDO " + "aqui vas a inscribir a tu equipo al torneo");
        System.out.println("Ingrese el nombre del equipo: ");
        String nombreEquipo = sc.nextLine();
        if (nombreEquipo.equals(nombreEquipo.toUpperCase())) {
            System.out.println("Indique la cantidad de jugadores del equipo: ");
            int cantidadJugadpres = sc.nextInt();
            sc.nextLine();
            if (MIN_JUGADORES <= cantidadJugadpres && cantidadJugadpres <= MAX_JUGADORES) {
                Equipo e = new Equipo(nombreEquipo.toUpperCase());

                for (int i = 0; i < cantidadJugadpres; i++) {
                    Jugador j = agregarJugador(i + 1);
                    e.nuevoJugador(j.getNombre(), j.getApellido(), j.getRol(), j.getNumerocam(), j.getDni(),
                            j.getObrasocial(), j.getAptomedico());
                }
                equipos[contadorEquipos] = e;
                contadorEquipos++;
                System.out.println("el equipo que usted inscribio es el siguiente " + (e.getNombredeequipo()));
                e.verJugadores();

            } else {
                System.out.println(
                        "El equipo tiene que tener un minimo de 9 integrantes y un maximo de 16 contando los comodines.");
            }
        } else {
            System.out.println("El nombre del equipo debe estar esrito en mayusculas ");
        }
    }

    public static Jugador agregarJugador(int i) {
        System.out.println("Ingrese el nombre del jugador " + i);
        String nombre = sc.nextLine();

        System.out.println("Ingrese el apellido del jugador " + i);
        String apellido = sc.nextLine();

        System.out.println("ingrese el rol del jugador, puede ser capitan, subcapitan y jugador");
        String rol = sc.nextLine();

        System.out.println("ingrese el numero de camiseta del jugador ");
        String numerocam = sc.nextLine();

        System.out.println("ingrese si el jugador dio la fotocopia dni");
        String Dni = sc.nextLine();

        System.out.println("ingrese si el jugador tiene obra social");
        String obrasocial = sc.nextLine();

        System.out.println("ingrese si el jugador tiene apto medico");
        String aptomedico = sc.nextLine();

        return new Jugador(nombre, apellido, rol, numerocam, Dni, obrasocial, aptomedico);
    }

    public static void agregarJugadorEquipo() {
        System.out.println("Ingrese el nombre del equipo: ");
        String nombreEquipo = sc.nextLine();
        Boolean encontrado = false;

        for (int i = 0; i < contadorEquipos && i < equipos.length; i++) {
            if (equipos[i].getNombredeequipo().equals(nombreEquipo) && equipos[i].cantidadJugadores() < 16) {
                encontrado = true;
                Jugador j = agregarJugador(equipos[i].cantidadJugadores() + 1);
                equipos[i].nuevoJugador(j.getNombre(), j.getApellido(), j.getRol(), j.getNumerocam(), j.getDni(),
                        j.getObrasocial(), j.getAptomedico());

                equipos[i].verJugadores();
                // IMPRIMIR EL EQUIPO CON LOS NUEVOS JUGADORES
                break;
            }
        }

        if (!encontrado) { // === if (encontrado == false)
            System.out.println(
                    "esta intentando agregar un jugador a un equipo inexistente, escribio mal el nombre o el equipo llego al maximo de jugadores inscriptos \nRECUERDE los nombres de los equipos van en mayusculas\nen el caso en el que no tenga equipo puede crearlo en la opcion 1 , la cual dice crear equipo");
        }
    }

    // imprimir cada equipo con sus respectivos jugadores y caracteristicas
    public static void verlistado() {

        // 3 Listamos los equipos
        for (int i = 0; i < contadorEquipos; i++) {
            System.out.println(equipos[i].getNombredeequipo());
            // Listamos los jugadores de ese equipo
            equipos[i].verJugadores();

        }
    }

    public static void torneo() {

        System.out.println(
                "ingrese el nombre de los equipos que van jugar el partido \n !!IMPORTANTE el equipo tiene que estar inscripto previamente");
        String equipo1 = sc.nextLine();
        String equipo2 = sc.nextLine();
        Random rnd = new Random();
        int ran = rnd.nextInt(7);
        int ran2 = rnd.nextInt(7);
        int puntosequipo1, puntosequipo2;
        puntosequipo1 = puntosequipo2 = 0;
        Equipo e1 = new Equipo();
        Equipo e2 = new Equipo();
        int control = 0;

        for (int i = 0; i < contadorEquipos && i < equipos.length; i++) {
            if (equipos[i].getNombredeequipo().equals(equipo1)) {
                e1 = equipos[i];
                control++;
                if (ran > ran2) {
                    equipos[i].puntosGanados(3);
                    puntosequipo1 = 3;
                }
                if (ran < ran2) {
                    equipos[i].puntosGanados(0);
                    puntosequipo1 = 0;
                }
                if (ran == ran2) {
                    equipos[i].puntosGanados(1);
                    puntosequipo1 = 1;
                }
            }

            if (equipos[i].getNombredeequipo().equals(equipo2)) {
                e2 = equipos[i];
                control++;
                if (ran > ran2) {
                    equipos[i].puntosGanados(0); // El equipo perdió el partido
                    puntosequipo2 = 0;
                }
                if (ran < ran2) {
                    equipos[i].puntosGanados(3); // El equipo ganó el partido
                    puntosequipo2 = 3;
                }
                if (ran == ran2) {
                    equipos[i].puntosGanados(1); // El equipo empató el partido
                    puntosequipo2 = 1;
                }
            }
        }

        if (control == 2) {
            System.out.println(equipo1 + ran + "-" + ran2 + " " + equipo2);
            System.out.println(equipo1 + "|" + equipo2);
            System.out.println(puntosequipo1 + "|" + puntosequipo2);
            System.out.println(e1.getPuntosGanados() + "|" + e2.getPuntosGanados());
        } else {
            System.out.println(
                    "el equipo que marco no esta inscripto en este torneo , por favor revise que el equipo este correctamente escrito !!todos los equipos estan inscriptos con letras mayusculas¡¡");
        }
    }
public static void ordenarEquiposPorPuntuacion() {
    // Utiliza el algoritmo de ordenamiento de burbuja
    for (int i = 0; i < contadorEquipos - 1; i++) {
        for (int j = 0; j < contadorEquipos - i - 1; j++) {
            if (equipos[j].getPuntosGanados() < equipos[j + 1].getPuntosGanados()) {
                // Intercambia los equipos si están en el orden incorrecto
                Equipo temp = equipos[j];
                equipos[j] = equipos[j + 1];
                equipos[j + 1] = temp;
            }
        }
    }
}


public static void vertabla() {
    ordenarEquiposPorPuntuacion();

    // Muestra la tabla de puntaje ordenada
    System.out.println("Tabla de Puntos:");
    System.out.println("Equipo\t\tPuntos");
    for (int i = 0; i < contadorEquipos; i++) {
        System.out.println(equipos[i].getNombredeequipo() + "\t\t" + equipos[i].getPuntosGanados());
    }
}
//AGREGAMOS ALGORITMO DE ORDENAMIENTO PARA LA TABLA
 }
       
   // System.out.println("A continuacion se muestran los respectivos equipos con sus puntos : ");
   // System.out.println( equipos [0]. getNombredeequipo() + " = " + equipos[0].getPuntosGanados());
   // System.out.println( equipos [1]. getNombredeequipo() + " = " + equipos[1].getPuntosGanados());
   // System.out.println( equipos [2]. getNombredeequipo() + " = " + equipos[2].getPuntosGanados());
   // System.out.println( equipos [3]. getNombredeequipo() + " = " + equipos[3].getPuntosGanados());
