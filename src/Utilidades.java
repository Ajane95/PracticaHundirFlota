import java.util.Scanner;

public class Utilidades {

    private static final Scanner SC = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);

    /**
     * Devuelve un número entero aleatorio entre min y max (ambos incluidos).
     */
    public static int numeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    /**
     * Convierte una coordenada tipo "A5" en fila.
     * Suponemos que la parte numérica es la fila.
     * Consideramos que EXISTE LA FILA 0.
     * Ejemplo: "A5" -> 5
     * Si la coordenada no es válida, debe devolver -1.
     */
    public static int convertirFila(String coord) {
        // TODO: extraer la parte numérica y convertirla a int
        char coordenada = coord.charAt(0);
        int fila = Character.getNumericValue(coordenada);
        if (fila >= 0 && fila <= 9){
            return fila;
        }else{
            return -1;
        }
    }

    /**
     * Convierte una coordenada tipo "A5" en columna.
     * La letra indica la columna: A=0, B=1, C=2, ...
     * Si la coordenada no es válida, puede devolver -1.
     */
    public static int convertirColumna(String coord) {
       // TODO
        char  coordenada = coord.charAt(0);
        if(coordenada == 'A'){
            return 0;
        }else if(coordenada == 'B'){
            return 1;
        }else if(coordenada == 'C'){
            return 2;
        }else if(coordenada == 'D'){
            return 3;
        }else if(coordenada == 'E'){
            return 4;
        }else if(coordenada == 'F'){
            return 5;
        }else if(coordenada == 'G'){
            return 6;
        }else if(coordenada == 'H'){
            return 7;
        }else if(coordenada == 'I'){
            return 8;
        }else if(coordenada == 'J'){
            return 9;
        }else{
            return -1;
        }
    }

    /**
     * Lee una línea de texto de la entrada estándar.
     */
    public static String leerLinea() {
        return SC.nextLine();
    }

    //TODO: Validar la coordenada (formato mínimo, longitud, etc.)
    public static boolean coordenadaValida(String coord, int maxFilas, int maxColumnas) {
        if (coord.length() < 2){
            return false;
        }

        char letra = coord.charAt(0);
        char[] letrasValidas ={'A','B','C','D','E','F','G','H','I','J',};
        boolean letraValida = false;

        for(int i = 0; i < letrasValidas.length; i++){
            if(letra == letrasValidas[i]){
                letraValida = true;
                break;
            }
        }
        if(!letraValida){
            return false;
        }

        char[] digitosValidos={'0','1','2','3','4','5','6','7','8','9'};
        for(int i = 1; i < coord.length(); i++){
            char digito = coord.charAt(i);
            boolean digitoValido = false;

            for(int j = 0; j < digitosValidos.length; j++){
                if(digito == digitosValidos[j]){
                    digitoValido = true;
                    break;
                }
            }
            if(!digitoValido){
                return false;
            }
        }
        return true;
    }
}