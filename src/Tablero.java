public class Tablero {

    /**
     * Crea un tablero de barcos y lo inicializa a -1 (sin barco).
     * En las posiciones del barco, guardaremos su id más adelante.
     * Lo devuelve como resultado!
     */
    public static int[][] crearTableroBarcos(int filas, int columnas) {
        // TODO
        int[][] tablero = new int[filas][columnas];
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                tablero[i][j] = -1;
            }
        }
        return tablero;
    }

    /**
     * Crea un tablero de disparos y lo inicializa a '~' (no disparado).
     */
    public static char[][] crearTableroDisparos(int filas, int columnas) {
        // TODO
        char[][] tablero = new char[filas][columnas];
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                tablero[i][j] = '~';
            }
        }
        return tablero;
    }



    /**
     * Muestra un tablero de disparos (del jugador o de la CPU).
     * Recuerda que tienes que imprimir también el número de fila, y el número de columna,
     * como un tablero real.
     *
     * Recibe como entrada el tablero a imprimir, no devuelve nada de salida, simplemente lo imprime.
     */
    public static void mostrarTableroDisparos(char[][] tableroDisparos) {
       // TODO
        int filas = tableroDisparos.length;
        int columnas = tableroDisparos[0].length;

        System.out.print("   ");
        for(int j = 0; j < columnas; j++){
            System.out.print(j + " ");
        }
        System.out.println();

        for(int i = 0; i < filas; i++){
            System.out.print(i + " ");
            for(int j = 0; j < columnas; j++){
                System.out.print(tableroDisparos[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * Muestra el tablero del jugador con sus barcos y el estado de disparos
     * de la CPU (agua, tocado, hundido). EL objetivo de esta función es mostrar
     * al usuario sus barcos junto a los disparos del enemigo (en un sólo tablero).
     *
     * tableroBarcos: IDs de barcos o -1
     * tableroDisparosCPU: qué ha disparado la CPU sobre este tablero
     *
     * Por ejemplo, si en la posición 1,1:
     * - hay agua y no ha habido disparos, '.'.
     * - hay agua y ha habido disparo, '~'.
     * - había un barco y hubo un disparo, pero el barco sigue activo: 'T'
     * - había un barco y hubo un disparo, el barco está hundido: 'H'
     * - hay un barco, el barco "1": 1
     */
    public static void mostrarTableroConBarcos(int[][] tableroBarcos, char[][] tableroDisparosCPU) {
        // TODO
        int filas = tableroBarcos.length;
        int columnas = tableroBarcos[0].length;

        System.out.print("   ");
        for(int j = 0; j < columnas; j++){
            System.out.print(j + " ");
        }
        System.out.println();

        for(int i = 0; i < filas; i++){
            System.out.print(i + " ");

            for(int j = 0; j < columnas; j++){
                char simbolo;

                if (tableroBarcos[i][j] == -1){
                    if(tableroDisparosCPU[i][j] == '.'){
                        simbolo = '.';
                        System.out.print(simbolo + " ");
                    }else{
                    simbolo ='~';
                        System.out.print(simbolo + " ");
                    }
                }else{
                    if(tableroDisparosCPU[i][j] == '.'){
                        System.out.print(tableroBarcos[i][j] + " ");
                    }else if(tableroDisparosCPU[i][j] == 'T'){
                        simbolo = 'T';
                        System.out.print(simbolo + " ");
                    }else{
                        simbolo = 'H';
                        System.out.print(simbolo + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    /**
     * Comprueba si una coordenada está dentro del tablero. Devuelve "true" si está, "false" si no está.
     */
    public static boolean esCoordenadaValida(int fila, int columna, int filas, int columnas) {
         // TODO
        return false;
    }
}