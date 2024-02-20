package Exercise5;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Maintodo {
    private List<Person> persons;
    private List<Passenger> passengers;
    private List<Flight> flights;
    private List<Airplane> airplanes;
    private List<Seat> seats;
private Scanner scanner;
    public Maintodo() {
        this.persons = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.flights = new ArrayList<>();
        this.airplanes = new ArrayList<>();
        this.seats = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public int mostrarOpciones() {
        String[] options = {"Agregar", "Modificar", "Eliminar", "Salir"};
        int option = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[3]);
        return option;
    }
    public int mostrarOpcionesAgregar() {
        String[] options = {"Persona", "Pasajero", "Vuelo", "Avión", "Asiento"};
        return JOptionPane.showOptionDialog(null, "Seleccione el objeto a agregar:", "Agregar",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
    }
    public int mostrarOpcionesModificar() {
        String[] options = {"Persona", "Pasajero", "Vuelo", "Avión", "Asiento"};
        return JOptionPane.showOptionDialog(null, "Seleccione el objeto a modificar:", "Modificar",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
    }

    public int mostrarOpcionesEliminar() {
        String[] options = {"Persona", "Pasajero", "Vuelo", "Avión", "Asiento"};
        return JOptionPane.showOptionDialog(null, "Seleccione el objeto a eliminar:", "Eliminar",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
    }

    public int obtenerIndice(List<?> lista, String mensaje) {
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < lista.size()) {
            return indice;
        } else {
            System.out.println("Índice inválido. Inténtelo de nuevo.");
            return -1;
        }
    }

    public Person getPerson() {
        return null;
    }

    public Passenger getPassenger() {
        return null;
    }

    public Airplane getAirplane() {
        return null;
    }

    public Flight getFlight() {
        return null;
    }

    public Seat getSeat() {
        return null;
    }

    public static void main(String[] args) {
        Maintodo todo = new Maintodo();
        int opcion = todo.mostrarOpciones();
        do {
            switch (opcion) {
                case 1:
                    opcion = todo.mostrarOpcionesAgregar();
                    switch (opcion) {
                        case 0:
                            todo.persons.add(todo.getPerson());
                            break;
                        case 1:
                            todo.passengers.add(todo.getPassenger());
                            break;
                        case 2:
                            todo.flights.add(todo.getFlight());
                            break;
                        case 3:
                            todo.airplanes.add(todo.getAirplane());
                            break;
                        case 4:
                            todo.seats.add(todo.getSeat());
                            break;
                    }
                    break;
            }
        } while (opcion != 4);
    }
}