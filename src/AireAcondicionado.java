public class AireAcondicionado {
    private boolean encendido;
    private int temperatura;
    private String modo;

    // Constructor
    public AireAcondicionado() {
        this.encendido = false;
        this.temperatura = 24; // temperatura por defecto
        this.modo = "Frío";
    }

    // Método 1: Encender el aire acondicionado
    public void encender() {
        encendido = true;
        System.out.println("Aire acondicionado encendido.");
    }

    // Método 2: Apagar el aire acondicionado
    public void apagar() {
        encendido = false;
        System.out.println("Aire acondicionado apagado.");
    }

    // Método 3: Cambiar la temperatura
    public void cambiarTemperatura(int nuevaTemperatura) {
        temperatura = nuevaTemperatura;
        System.out.println("Temperatura ajustada a " + temperatura + "°C.");
    }

    // Método 4: Cambiar el modo (Frío, Calor, Ventilación)
    public void cambiarModo(String nuevoModo) {
        modo = nuevoModo;
        System.out.println("Modo cambiado a: " + modo);
    }

    // Método 5: Mostrar el estado actual
    public void mostrarEstado() {
        System.out.println("Encendido: " + (encendido ? "Sí" : "No"));
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Modo: " + modo);
    }

    // Método principal para probar los métodos
    public static void main(String[] args) {
        AireAcondicionado ac = new AireAcondicionado();
        ac.encender();
        ac.cambiarTemperatura(22);
        ac.cambiarModo("Calor");
        ac.mostrarEstado();
        ac.apagar();
    }
}
