# Hundir la flota

## Introducción
Ismael ya lo ha editado
Este es el ejercicio de programación básica para la 1ª evaluación de programación en DAM. Es un ejercicio pensado para hacer en conjunto. En este ejercicio de programación básica practicaremos: 

- Uso de bucles
- Uso de condicionales
- Uso de arrays y arrays de arrays
- Tipos básicos
- Entrada/salida de datos por teclado y pantalla

Está basado en el popular juego de Hundir la Flota. 

Jugaremos contra una CPU que NO tiene inteligencia (disparará a posiciones aleatorias). 

## Convenciones

Seguiremos las siguientes convenciones: 

- No se permite disparar a una casilla a la que ya se ha disparado.
- Si se dispara fuera del tablero, se pierde el turno.
- Las casillas se representan como A0, A1.. A7; B0, B1 .. B7. Como en hundir la flota tradicional, la LETRA SE CORRESPONDE CON LA COLUMNA.
- Cuando imprimimos tableros, hay que imprimir también una columna con los números de fila al principio, y una fila con las letras abajo - simulando un tablero real.
- Para no complicarnos con índices de arrays, y tener que poner "+1" para transformar de casilla a fila+columna, consideramos que existe la fila 0, y consideramos que la columna A es la columna 0

## Estructuras de datos utilizadas en el proyecto 

Hay un array de tamaños de barcos para indicar cuantos barcos y de qué tamaño serán, compartido por ambos jugadores; el siguiente ejemplo nos indica que cada jugador tiene 5 barcos en total, su barco 0 es de 5 casillas, el barco 1 es de 4 casillas, etc.

`int[] tamanosBarcos = {5, 4, 3, 3, 2};`

Hay un array de impactos de barcos para cada jugador, del mismo tamaño que el arary de tamaños. El siguiente array indicaría que el barco 0 tiene 2 impactos, y el barco 5 tiene 1 impacto: 
`{2, 0, 0, 0, 2}`

Hay dos tableros de barcos, uno para cada jugador, que NO se mostrarán nunca directamente. El tablero es un array bidimensional que guarda el valor "-1" donde no hay barcos, y guarda el id del barco donde sí. Por ejemplo, en las posiciones donde está el barco 0 (que tiene tamaño 5), guardará el 0.

Hay dos tableros de disparos, uno para cada jugador (disparos que ha HECHO). Estos disparos mostrarán agua `~` donde ha habido disparo y no había barco, `.` donde todavía no ha disparado, `T` si ha habido un impacto en un barco que todavía no está hundido, `H` donde ha habido impacto y el barco está hundido.


## Estructura del proyecto 

Tenemos 5 clases en el proyecto: 

### Barcos

Incluye métodos estáticos para ser llamados desde otras clases, por ejemplo, ` public static boolean sePuedeColocarBarco(int[][] tablero, int fila, int columna, int tamano, boolean horizontal)`, que dado un tablero nos indica si se puede colocar un barco en la fila/columna pedida

### Disparos

Incluye métodos estáticos para ser llamados desde otras clases, referentes a realización de disparos. Por ejemplo, `public static boolean yaDisparado(char[][] tableroDisparos, int fila, int columna)` nos indica si ya existe un disparo en el tablero de disparos que se le pasa, en la posición que se le pide. 

### Tablero

Incluye métodos estáticos para ser llamados desde otras clases, referentes a la creación y manipulación de tableros. Por ejemplo, crearlos, imprimirlos...

### Utilidades

Incluye métodos estáticos genéricos para ser llamados desde otras clases. Por ejemplo, `Utilidades.convertirColumna("A7")`, nos devolverá el número cero: la A es 0, la B es 1...

### Main

Es la clase que implementa la partida por turnos, hasta que un jugador pierde. 


## Trabajo a realizar 

Se espera que se implementen correctamente todos los TODO del código. 

El esqueleto de la clase Main ya está implementado, falta hacer las llamadas correctas a las funciones de las otras clases, y los bucles adecuados (por ejemplo, para solicitar de nuevo una coordenada si nos dieron una coordenada en formato incorrecto).

Casi todas las funciones de las clases que no son Main tienen que ser implementadas. 

## Consejos

**_No es necesario saber cómo funciona un motor de explosión para apretar una tuerca en el motor o cambiar el aceite._** El proyecto está dividido con múltiples TODO a propósito, cada TODO es una tarea que se puede realizar de forma independiente. Aunque no entendáis el proyecto en su totalidad, podéis implementar las funcionalidades que se piden.

**No necesitáis el proyecto completo para probar lo que implementáis.** Podéis crear una nueva clase de pruebas para ir probando vuestros métodos; por ejemplo, creáis una clase de pruebas "MisTests", y en su main llamáis a `Utilidades.convertirFila(input)` para probar que funciona correctamente. Esta clase NO tenéis que subirla al repositorio.

**Repartid bien las tareas.** Trabajad en coordinación. Aseguráos de que no estáis trabajando en la misma funcionalidad que un compañer@. Llevad un log común que indique en qué tarea trabaja cada uno. 

**Haced backups.** Puede ser que la liéis al hacer push/pull al repositorio común. El objetivo de la práctica no es aprender a usar Git, sino hacer tareas de programación. Haced copias locales del proyecto (de la carpeta src) para aseguraros de que si alguien del grupo machaca por error lo que ha hecho un compañero, podéis recuperarlo sin pelearos con Git.


