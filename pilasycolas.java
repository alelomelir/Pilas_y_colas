import java.util.Scanner; //importa la clase scanner que permite obtener la entrada de datos
import java.util.Stack; /*PILA; importa la clase stack que permite el ultimo elemneto insertado es el primero en salir*/
import java.util.LinkedList;/*importa la clase linkedlist que nos permite trabajr con listas enlazadas (dato que contiene un puntero 
                            hacia otro dato del mismo tipo)*/
import java.util.Queue;/*COLA; el primer elemento insertado es el primero en salir*/

public class pilasycolas { // se declara la clase principal y se tiene que llamar igual que el archivo
    public static void main(String[] args) { /*
                                              * es un metodo; lleva parentesis con argumentos; void signiica que recibe
                                              * datos pero no regresa ninguno; main porque es la clase principal y es en
                                              * la que comienza a ejecutarse el programa; static: indica que main
                                              * pertenece a la clase en si misma; args: array de cadenas
                                              */
        Stack<Integer> pila = new Stack<>(); /*
                                              * se utiliza para pilas; creamos un objeto de la clase stack; Stack:
                                              * objeto de la clase Stack hace operaciones como push (agregar elemento),
                                              * pop (quitar elemento) y peek (ver el elemento en la cima sin
                                              * eliminarlo); Integer: datos de tipo int; pila: es el nombre
                                              * que se le asigna; new Stack: se crea una nueva instancia de la clase
                                              * stack
                                              */
        Queue<Integer> cola = new LinkedList<>();/*
                                                  * se utiliza para colas; creamos un objeto de la clase Queue; Queue:
                                                  * estructura de objeto queue, hace operaciones como offer (agregar
                                                  * elemento), poll (quitar y devolver el primer elemento) y peek (ver
                                                  * el primer elemento sin quitarlo); Integer: datos de tipo int; cola:
                                                  * es el nombre que se le asigna; new: se crea una nueva instancia de
                                                  * la clase; LinkedList: es una lista enlazada
                                                  */
        Scanner scanner = new Scanner(System.in); /*
                                                   * se crea el objeto de la clase Scanner; Scanner es utilizado para
                                                   * leer datos que introduce el usuario; new Scanner: isntancia creada
                                                   * para la clase; System.in: se accede a las funciones de la clase
                                                   * System ("."acceder, "in"entrada de datos)
                                                   */
        int opcion, elemento; /*
                               * inicializamos las variables opcion(se utiliza en el switch para que el
                               * usuario escoga una opcion de las proporcionadas; elemento:¿?)
                               */

        do { /*
              * ciclo "do" hace que lo que este dentro de el se ejecute n veces hasta que ya
              * no
              * se cumpla la condicion establecida en while
              */
            System.out.println("Menu:"); /*
                                          * se implementa la clase system; ".out" accedemos a los metodos de out;
                                          * println: metodo que imprime una cadena y despues hace un slato de linea; se
                                          * imprime la palabra menu indicando que lo que vendra a continuacion es un
                                          * menu de opciones y el usuario tiene que escoger una
                                          */
            System.out.println("1. Agregar elemento"); /* se agrega un elemento a la cola y a la pila */
            System.out.println("2. Borrar elemento");/* se elimina un elemento de los anteriormente ingresados */
            System.out.println("3. Mostrar Pila");/* se muestra la pila con los elementos ingresados */
            System.out.println("4. Mostrar Cola");/* se muestra la cola con los elementos ingresados */
            System.out.println("0. Salir");/* sale del bucle */
            System.out.print("Seleccione una opcion: "); /*
                                                          * el usuario tiene que digitar una opcion de las
                                                          * proporcionadas, imprime sin dar un salto de linea
                                                          */
            opcion = scanner.nextInt();/*
                                        * opcion: variable donde se almacenara el entero proporcionado (opcion que
                                        * digito el usuario; scanner: lee datos dentro de la consola; nextInt: indica
                                        * que el siguiente dato sea un entero, en caso de ser asi lo lee y lo devuelve;
                                        * (): porque es un metodo y no lleva argumentos)
                                        */

            switch (opcion) { /*
                               * condicional switch: seleccion entre conjunto de opciones (opcion): contiene
                               * el valor que se va a comparar con los diferentes casos, es el numero de
                               * opcion que digito el usuario
                               */
                case 1: /* caso 1, primer opcion */
                    System.out.print("Ingrese el elemento a agregar: "); /*
                                                                          * imprime la indicaion para agregar un
                                                                          * elemento
                                                                          */
                    elemento = scanner.nextInt();/*
                                                  * elemento: es la variable en la que se almacenara el dato; lee y
                                                  * devuelve el dato
                                                  */
                    pila.push(elemento);/*
                                         * llamamos la variable pila porque asi nombramos al objeto "."accedemos a los
                                         * metodos de push; push: agrega un elemento en la parte superior de la pila;
                                         * (elemento): variable que guarda el elemento que se desea agregar
                                         */
                    cola.add(elemento);/*
                                        * llamamos la variable cola porque asi nombramos al objeto; "."accedemos a los
                                        * metodos de add; add: agrega un elemento en la parte final de la cola;
                                        * (elemento): variable que guarda el elemento que se desea agregar
                                        */
                    break; /* finaliza */

                case 2: /* caso 2, segunda opción */
                    if (!pila.isEmpty() && !cola.isEmpty()) { /*
                                                               * condicional if que verifica dos opciones;
                                                               * !pila.isEmpty() este metodo devuelve el valor 1 (true)
                                                               * si hay un campo vacío; de lo contrario, devuelve el
                                                               * valor 0 (false); verifica si la pila no esta vacia; &&
                                                               * porque comparamos dos opciones; !cola.isEmpty()
                                                               * verifica si la cola no esta vacia; si estas condicones
                                                               * se cumplen se ejecutaran las instrucciones dentro del
                                                               * if
                                                               */
                        System.out.println("Elemento eliminado de la Pila: " + pila.pop()); /*
                                                                                             * System funcion para
                                                                                             * imprimir valores; se
                                                                                             * imprime el contenido que
                                                                                             * esta dentro de los
                                                                                             * parentesis ; el + se
                                                                                             * utiliza para unir una
                                                                                             * cadena de texto con el
                                                                                             * resultado de la llamada
                                                                                             * al metodo; llama al
                                                                                             * metodo pop en el objeto
                                                                                             * pila que elimina y
                                                                                             * devuelve el elemento
                                                                                             * superior de la pila
                                                                                             */
                        System.out.println("Elemento eliminado de la Cola: " + cola.poll());/*
                                                                                             * imprime que se ha
                                                                                             * eliminado un elelento de
                                                                                             * la cola; llama al metodo
                                                                                             * poll() en el objeto cola,
                                                                                             * que elimina y devuelve el
                                                                                             * primer elemento de la
                                                                                             * cola.
                                                                                             */
                    } else { /*
                              * si no se cumplen las condiciones del if se ejecutan las instrucciones del if
                              */
                        System.out.println("La Pila y la Cola están vacías."); /*
                                                                                * imprime un mensaje de que estan vacias
                                                                                * la cola y la pila
                                                                                */
                    }
                    break;/* finaliza */

                case 3: /* caso 3; tercera opción */
                    mostrarPila(pila); /*
                                        * llama al metodo llamado mostrarPila; se pone entre parentesis el nombre del
                                        * objeto porque es una funcion
                                        */
                    break;/* finaliza */

                case 4: /* caso 4; cuarta opción */
                    mostrarCola(cola); /*
                                        * llama al metodo llamado mostrarCola; se escribe entre parentesis el nombre
                                        * del objeto porque s una funcion
                                        */
                    break;/* finaliza */

                case 0: /* con esta opcion termina el programa */
                    System.out.println("Saliendo del programa. ¡Hasta luego!"); /* indica que el salio del programa */
                    break; /* finaliza */

                default: /*
                          * si no se escoge ninguna de las opciones o ninguno de los casos coincide se
                          * ejecutara esta parte del programa
                          */
                    System.out.println("Opción no válida. Intente de nuevo."); /*
                                                                                * se imprime que la opcion digitada no
                                                                                * es valida para la ejecucion del
                                                                                * programa
                                                                                */
            } /* se termina el switch */

        } while (opcion != 0); /* se ejecutara mientras la opcion (variable) sea diferente que cero */

        scanner.close(); /* cierra el objeto scanner ??? */
    }

    private static void mostrarPila(Stack<Integer> pila) { /*
                                                            * metodo privado y estatico que toma como argumentos numeros
                                                            * enteros que esten en la pila, se encarga de mostrar los
                                                            * elementos anteriormente agregados a la pila
                                                            */
        System.out.print("Elementos de la Pila: ");/* imprime los elementos de la pila en la misma linea */
        for (Integer elemento : pila) {/* bucle for-each que va entre los elementos de la pila, */
            System.out.print(elemento + " ");/*
                                              * en cada iteracion el valor se almacena en la variable elemento para
                                              * despues imprimirse entre las comillas
                                              */
        }
        System.out.println();/*
                              * se coloca para que imprima una nueva linea y cada elemento que se imprima en
                              * el bucle sea en una liea diferente
                              */
    }

    private static void mostrarCola(Queue<Integer> cola) { /*
                                                            * metodo privado estatico que toma como argumentos los
                                                            * elementos de la cola, se encarga de mostrar los elementos
                                                            * anteriormente agregados a la cola
                                                            */
        System.out.print("Elementos de la Cola: ");/* imprime los elementos de la cola en la misma linea */
        for (Integer elemento : cola) { /*
                                         * bucle for-each( es un tipo especial de bucle que permite recorrer estructuras
                                         * que contienen varios elementos (como matrices, recursos u objetos) sin
                                         * necesidad de preocuparse por el número de elementos.) que va entre los
                                         * elementos de la pila
                                         */
            System.out.print(elemento + " "); /*
                                               * en cada iteracion el valor se almacena en la variable elemento para
                                               * despues imprimirlo entre las comillas
                                               */
        }
        System.out.println();/*
                              * se coloca para imprimir una nueva linea y cada elemento que se imprima en el
                              * bucle este en una linea diiferente
                              */
    }
}

/*
 * >>Instancia: elemento que se genera a partir de la declaración de una clase;
 * Las instancias sirven para definir los objetos
 * y que estos ejecuten sus atributos de forma correcta dentro de la
 * programación del proyecto.
 * 
 * >>Objeto: tienen unos datos concretos y una serie de rutinas para que se
 * pueda
 * operar a partir de ellos; recopila y almacena datos; los métodos llevan a
 * cabo una serie de acciones en función de los atributos que definan al objeto
 * 
 * >>for-each:Integer elemento: Integer es el tipo de datos de cada
 * elemento de la colección sobre la que se está iterando; elemento es una
 * variable que representa cada elemento de la colección en cada iteración del
 * bucle.
 * : separa la declaración de la variable del
 * iterable sobre el que se está iterando.
 * pila: Es la colección sobre la que se está iterando.
 * 
 * 
 * = asignar valores o igualar
 * == comparar el valor que contiene una variable
 * === compara instancias, la variable completa
 * != representa que un operador NO es igual a otro
 * !== si dos operandos NO son iguales devuelve un resultado boolaneao
 */
