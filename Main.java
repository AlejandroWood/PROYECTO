public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("FAH", 3,8, false);
        System.out.println(e1.calcularCosteJornada(5));
        e1.MostrarFicha();
    }
}
