package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */
public class Juego {

    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        boolean finDeJuego = false;
        int rondasJugadas = 0;    // Número de rondas jugadas
        int exitosJugador1 = jugador1.getExitos();
        int exitosJugador2 = jugador2.getExitos();
        int empates = 0;
        String opcionJugador1;
        String opcionJugador2;

        // Bucle de juego
        do {
            System.out.println("***** Ronda: " + rondasJugadas + " *********************\n");
            System.out.println("Numero de empates: " + empates + "\n");
            opcionJugador1 = jugador1.opcionAlAzar();
            System.out.println("Jugador 1: " + opcionJugador1 + "\t Jugador 1 - Partidas ganadas: "
                    + exitosJugador1);
            opcionJugador2 = jugador2.opcionAlAzar();
            System.out.println("Jugador 2: " + opcionJugador2 + "\t Jugador 2 - Partidas ganadas: "
                    + exitosJugador2);

            if ((opcionJugador1.equals("piedra")) && (opcionJugador2.equals("papel"))) {
                System.out.println("Jugador 2 GANA");
                jugador2.setExitos();
                exitosJugador2 = jugador2.getExitos();

            } else if ((opcionJugador1.equals("papel")) && (opcionJugador2.equals("piedra"))) {
                jugador1.setExitos();
                exitosJugador1 = jugador1.getExitos();
                System.out.println("Jugador 1 GANA");
            } else if ((opcionJugador1.equals("piedra")) && (opcionJugador2.equals("tijeras"))) {
                jugador1.setExitos();
                exitosJugador1 = jugador1.getExitos();
                System.out.println("Jugador 1 GANA");
            } else if ((opcionJugador1.equals("tijeras")) && (opcionJugador2.equals("piedra"))) {
                jugador2.setExitos();
                exitosJugador2 = jugador2.getExitos();
                System.out.println("Jugador 2 GANA");
            } else if ((opcionJugador1.equals("tijeras")) && (opcionJugador2.equals("papel"))) {
                jugador1.setExitos();
                exitosJugador1 = jugador1.getExitos();
                System.out.println("Jugador 1 GANA");
            } else if ((opcionJugador1.equals("papel")) && (opcionJugador2.equals("tijeras"))) {
                jugador2.setExitos();
                exitosJugador2 = jugador2.getExitos();
                System.out.println("Jugador 2 GANA");
            }
            if (opcionJugador1.equals(opcionJugador2)) {
                empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            rondasJugadas++;
            if ((exitosJugador1 >= 3) || (exitosJugador2 >= 3)) {
                finDeJuego = true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while (finDeJuego != true);
    }
}
