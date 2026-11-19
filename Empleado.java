public abstract class Empleado {
    // CREAMOS LOS ATRIBUTOS PROTEGIDOS
    private static int contador = 0;
    private String idEmpleado;
    private String nombre;
    private double tarifaHora;
    private boolean disponible;

    // AÑADIMOS EL CONSTRUCTOR COMPLETO
    public Empleado(String newNombre, double newTarifaHora, boolean newDisponible) {
        contador++;
        this.idEmpleado = String.format("EMP-%02d", contador);
        this.nombre = newNombre;
        this.tarifaHora = newTarifaHora;
        this.disponible = newDisponible;
    }

    // AÑADIMOS LOS GETTERS Y SETTERS
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // MÉTODOS
    public double calcularCosteJornada(int horas) {
        return horas * tarifaHora;
    }

    public abstract void MostrarFicha();
}
