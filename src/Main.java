public class Main {
    public static void main(String[] args) {
        // Crear instancias de los manejadores
        ManejadorSolicitud soporteBasico = new SoporteBasico();
        ManejadorSolicitud soporteAvanzado = new SoporteAvanzado();

        // Meotdo q configura la cadena
        soporteBasico.setSiguienteNivel(soporteAvanzado);

        // Probando con diferentes solicitudes
        System.out.println("🔴 BIENVENIDO AL SISTEMA DE CLARO 🔴");
        System.out.println(" ");
        System.out.println("## CONSULTA SIMPLE");
        soporteBasico.manejarSolicitud("Consulta simple");
        System.out.println(" ");
        System.out.println("## CONSULTA COMPLICADA");
        soporteBasico.manejarSolicitud("Problema complicado");
        System.out.println(" ");
        System.out.println("## CONSULTA IMPOSIBLE");
        soporteBasico.manejarSolicitud("Solicitud desconocida");
    }
    }
