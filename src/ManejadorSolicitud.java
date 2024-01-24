public interface ManejadorSolicitud {

    // Lo que evaluara si para al siguiente nivel o no. Declara la operación para manejar una solicitud
    void manejarSolicitud(String solicitud);

    // Le dice a donde va a ir
    void setSiguienteNivel(ManejadorSolicitud siguienteNivel);
}
