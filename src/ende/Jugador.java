package ende;

/**
 *
 */
class Jugador {

    int exitos;      // número de partidas ganadas
    int winTotal;

    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcionAlAzar() {
        String opcion = "";
        int numeroOpcion = (int) (Math.random() * 3);
        switch (numeroOpcion) {
            case 0:
                opcion = ("piedra");
                break;
            case 1:
                opcion = ("papel");
                break;
            case 2:
                opcion = ("tijeras");
                break;
            default:
                opcion = ("error");
                break;
        }
        return opcion;
    }

    public void setExitos() {
        exitos++;
    }

    public int getExitos() {
        return exitos;
    }

}
