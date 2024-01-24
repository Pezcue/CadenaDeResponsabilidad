public class SoporteAvanzado implements ManejadorSolicitud {
    private ManejadorSolicitud siguienteNivel;

    @Override
    public void setSiguienteNivel(ManejadorSolicitud siguienteNivel) {
        this.siguienteNivel = siguienteNivel;
    }

    // Que hace con la solicitud
    @Override
    public void manejarSolicitud(String solicitud) {
        if (solicitud.equals("Problema complicado")) {
            System.out.println("Solicitud manejada por Soporte Avanzado. 😜✅👍");
        } else if (siguienteNivel != null) {
            System.out.println("No puedo manejar la solicitud. Pasando al siguiente nivel. ❌");
            siguienteNivel.manejarSolicitud(solicitud);
        } else {
            System.out.println("Nadie puede manejar la solicitud. Lo siento. Chau :( 😭☠️");
        }
    }
}
