public class Principal {

    // 🎫 Clase Entrada con constructor y método mostrarInformacion()
    public static class Entrada {
        String nombreEvento;
        double precio;

        // 🔧 Constructor que recibe los valores de nombre y precio
        public Entrada(String nombreEvento, double precio) {
            this.nombreEvento = nombreEvento;
            this.precio = precio;
        }

        // 🖨️ Método para mostrar la información
        public void mostrarInformacion() {
            System.out.println("Evento: " + nombreEvento + " | Precio: $" + precio);
        }
    }

    public static void main(String[] args) {
        // 🎟️ Crear objetos de tipo Entrada
        Entrada entrada1 = new Entrada("Obra de Teatro", 450.0);
        Entrada entrada2 = new Entrada("Concierto de Rock", 750.0);

        // 📢 Mostrar información de las entradas
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
    }
}
