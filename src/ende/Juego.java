package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */


public class Juego {

    public static void main(String[] args) {
        Jugador p1 = new Jugador();
        Jugador p2 = new Jugador();
        boolean finDeJuego = false;
        int rondasJugadas = 0;    // Número de rondas jugadas
        int EXITOS_JUGADOR1 = p1.éxitos;
        int EXITOS_JUGADOR2 = p2.éxitos;
        int empates = 0;
        String OPCION_JUGADOR1, OPCION_JUGADOR2;

        // Bucle de juego
        do {
            System.out.println("***** Ronda: " + rondasJugadas + " *********************\n");
            System.out.println("Numero de empates: " + empates + "\n");
            OPCION_JUGADOR1 = p1.opcion_al_azar();
            System.out.println("Jugador 1: " + OPCION_JUGADOR1 + "\t Jugador 1 - Partidas ganadas: " + EXITOS_JUGADOR1);
            OPCION_JUGADOR2 = p2.opcion_al_azar();
            System.out.println("Jugador 2: " + OPCION_JUGADOR2 + "\t Jugador 2 - Partidas ganadas: " + EXITOS_JUGADOR2);

            if ((OPCION_JUGADOR1.equals("piedra")) && (OPCION_JUGADOR2.equals("papel"))) {
                System.out.println("Jugador 2 GANA");
                EXITOS_JUGADOR2 = ++p2.éxitos;

            } else if ((OPCION_JUGADOR1.equals("papel")) && (OPCION_JUGADOR2.equals("piedra"))) {
                EXITOS_JUGADOR1 = ++p1.éxitos;
                System.out.println("Jugador 1 GANA");
            } else if ((OPCION_JUGADOR1.equals("piedra")) && (OPCION_JUGADOR2.equals("tijeras"))) {
                EXITOS_JUGADOR1 = ++p1.éxitos;
                System.out.println("Jugador 1 GANA");
            } else if ((OPCION_JUGADOR1.equals("tijeras")) && (OPCION_JUGADOR2.equals("piedra"))) {
                EXITOS_JUGADOR2 = ++p2.éxitos;
                System.out.println("Jugador 2 GANA");
            } else if ((OPCION_JUGADOR1.equals("tijeras")) && (OPCION_JUGADOR2.equals("papel"))) {
                EXITOS_JUGADOR1 = ++p1.éxitos;
                System.out.println("Jugador 1 GANA");
            } else if ((OPCION_JUGADOR1.equals("papel")) && (OPCION_JUGADOR2.equals("tijeras"))) {
                EXITOS_JUGADOR2 = ++p2.éxitos;
                System.out.println("Jugador 2 GANA");
            }
            if (OPCION_JUGADOR1 == OPCION_JUGADOR2) {
                empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            rondasJugadas++;
            if ((p1.éxitos >= 3) || (p2.éxitos >= 3)) {
                finDeJuego = true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while (finDeJuego != true);
    }
}
