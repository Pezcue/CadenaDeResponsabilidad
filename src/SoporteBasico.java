public class SoporteBasico implements ManejadorSolicitud {


    private ManejadorSolicitud siguienteNivel;

    // A donde va sino puede
    @Override
    public void setSiguienteNivel(ManejadorSolicitud siguienteNivel) {
        this.siguienteNivel = siguienteNivel;
    }

    // Que hace con la solicitud
    @Override
    public void manejarSolicitud(String solicitud) {
        if (solicitud.equals("Consulta simple")) {
            System.out.println("Solicitud manejada por Soporte Básico.✅😁👍");
        } else if (siguienteNivel != null) {
            System.out.println("No puedo manejar la solicitud. Pasando al siguiente nivel.⏩️");
            siguienteNivel.manejarSolicitud(solicitud);
        } else {
            System.out.println("Nadie puede manejar la solicitud. Lo siento.");
        }
    }
}


