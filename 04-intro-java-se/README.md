# Conocer a Java como lenguaje de programación

## ¿Qué es Java?

Java Standard Edition... Java tiene Standard Edition y Enterprise Edition.

1. Curso básico de Java SE
2. Curso de Java SE: Orientado a Objetos (Porque Java es por naturaleza orientado a objetos)
3. Curso de Java SE: Programación Funcional (Porque Java tiene elementos de programación funcional)

Java se un lenguaje de programación que nos servira para aplicar algoritmos y resolver problemas. Java fue creado en 1991 por James Gosling. Java es multiplataforma. James Gosling estuvo en Sun Microsystems. En el año 2009 Oracle compró Sun Microsystems, desde que Oracle compra Java. James Gosling decidió salir de Oracle en 2010.

Java es un lenguaje de programación de alto nivel. Mientras más alto nivel, mucho más moderno, mas fácil programar, más fácil manejar la memoria.

La filosofía de Java es Write Once Run Anywhere (WORA)

## Versiones de Java y JDK

**Java Development Kit**

Compuesto básicamente de 3 cosas:

- Java Runtime Environment JRE (La máquina virtual de Java + bibliotecas)
- Compilador de Java
- API de desarrollo

1995: JDK Beta
Enero 1996: JDK 1.0
Febrero 1997: JDK 1.1
Diciembre 1998: J2SE 1.2
Mayo 2000: J2SE 1.3
Febrero 2002: J2SE 1.4
Septiembre 2004: J2SE 5.0
Diciembre 2006: Java SE 6 (Primer Java SE)
Julio 2011: Java SE 7
Marzo 2014: Java SE 8 (LTS) (Long Term Support 3 años)
Septiembre 2017: Java SE 9 (Actualizaciones cada 6 meses)
Marzo 2018: Java SE 10
Septiembre 2018: Java SE 11 (LTS) Es la primera versión de Java en la que se cobra licencia. Free para ambientes de desarrollo y testing. 2.5 USD al mes por usuario de escritorio y 25 USD por procesador para aplicaciones de Servidor. La comunidad ya había creado la versión OpenJDK, donde podemos utilizar.
Marzo 2019: Java SE 12

OpenJDK es la versión open-source de Java SE Platform Edition. Existe desde Java SE 6. Lo ha impulsado Sun Microsystems desde el 2006. La comunidad se encarga de darle soporte y una comunidad muy fuerte que apoya muchísimo es la de Red Hat.

## Las herramientas más usadas de Java

Java 8 (LTS) es la versión más usada de Java hasta inicios del 2019, pero solo tendrá soporte hasta diciembre de 2020, luego de esta fecha tendremos que pagar una licencia para continuar con su soporte.

Java 10 introdujo algunos cambios en la forma de declarar variables.

La herramienta más usada para construir proyectos web con Java es Maven, pero también existen otras alternativoas como Gradle. También existen frameworks como Spring para trabajar con Java EE y ORMs como Hibernate para trabajar con bases de datos.

Los IDEs son entornos de desarrollo integrados, herramientas (apliccaciones, seguramente de escritorio) que nos ayudan a escribir nuestro código con editores, compiladores, depuradores y constructores de interfaz gráficas, todo en el mismo lugar.

El IDE recomendado por Oracle es NetBeans, pero también están Eclipse e IntelliJ IDEA, este último es el que más fuerza ha tomado gracias a Kotlin. Las tres herrameintas son gratuitas, pero IntelliJ IDEA también tiene una versión de pago. Un IDE es un entorno de programación que ha sido empaquetado como un programa de aplicación: Editor de código, compilador, depurador, constructor de interfaz gráfica.

## Creando un entorno de desarrollo en Java en Windows

Descargar e instalar IntelliJ IDEA del sitio de jetbrains.

También vamos al sitio de https://adoptopenjdk.net para descargar y instalar OpenJDK 11.

## Creando un entorno de desarrollo de Java en Mac

Descargar e instalar IntelliJ IDEA del sitio de jetbrains.

También vamos al sitio de https://adoptopenjdk.net para descargar y instalar OpenJDK 11.

## Creando un entorno de desarrollo en Java en Linux

> sudo apt-get update
>
> sudo apt-get upgrade
>
> sudo apt-get install openjdk-8-jre
>
> sudo add-apt-repository ppa:openjdk-r/ppa
>
> sudo apt update
>
> sudo apt install openjdk-11-jdk
>
> java -version

Esto es para cambiar de versión de Java:

> sudo update-alternative --config java

## Escribe tu primer Hola Mundo en Java

Los archivos de Java usan la extensión .java. Así que creamos un archivo HolaMundo.java

El método main es el unto de entrada de una aplicación en diferentes lenguajes como Java, Kotlin y C++. Sin este método nuestra aplicación no se ejecutará y mostrará un error.

En Java definimos este método de la siguiente manera:

```java
public static void main(String[] args){
    // Acciones
}
```

Y este será el código de nuestro HolaMundo.java

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.oute.println("Hola mundo!");
    }
}
```

## Etapas de la programación en Java

1. Estuvimos trabajando nuestros archivos .java, esto es el código fuente del programa.
2. Compilador javac, se encarga de compilar, cargar y verificar nuestros archivos con javac
3. La JVM (Java Virtual Machine) se encaraga de ejecutar el código de forma que funcione en cualquier dispositivo o sistema operativo.

Java es un lenguaje compilado e interpretado al mismo tiempo.

## La JShell de Java

> jshell

Pero no se como se sale del jshell

# Trabajar con variables en Java

## Variables en Java

Una variable es un espacio de memoria (RAM) que contiene un dato de tipo numérico, booleano, de texto u otros tipos de datos un poco más complejos.

Las variables en Java se componene de un nombre único y un valor que puede cambiar a lo largo de la ejecución del programa. Al declarar las variables debemos definir el tipo de dato que vamos a usar y un punto y coma al final

```java
public class Variables {
    public static void main(String[] args){
        // Una variable de tipo int
        int speed;
        speed = 10;
        int salary = 1000;
        String employeeName = "Fredy"
    }
}
```

## Actualizando variables

Java nos permite actualizar nuestras variables reutilizando los valores que tenían anteriormente de esta forma evitamos errores o incosistencias en nuestro código:

```java
public class UpdatingVaraible {
    public static void main(String[] args){
        int salary = 1000;
        salary = salary + 200;
        System.out.println(salary)

        salary += 300;
        System.out.prinln(salary)

        String employeeName = "Augusto";
        employeeName += " Castellón";
        System.out.println(employeeName);

        employeeName += " Bedoya";
        System.out.println(employeeName);

        employeeName = "Fredy " + employeeName;
        System.out.println(employeeName);
    }
}
```

## Convención de Nombres en Java

Una convención de nombres es un patrón que deben seguir los nombres de las variables para que el código esté organizado, entendible y sin repetidos.

- Java es sensible a mayúsculas y minúsculas, este punto es clave al seguir una convención.
- Las variables siempre deben comenzar con un símbolo de ltera, $ o \_.
- No puedes usar el simbolo - en ninguna parte de la variable.

Las variables, constantes son variables cuyo valor nunca va a cambiar, por lo que se deben escribir completamente en maýúsculas y usando el caracter \_.

No es lo mismo la variable celphone que la variable CelPhone pues java es case sensitive.

Se pueden iniciar variables así $countryName o _countryName. No pueden llamarse una variable country-name pero si puede llamarse country_name o country$name o countryname$ o countryname\_

Las constantes se definen:

final int POSITION = -5;

## Técnica de Naming: Camel Case

Camel Case es una convención muy popular para nombrar nuestras variables. Podemos usarlo en modo Upper Camel Case o Lower Camel Case, la diferencia es si comenzamos el nombre con mayúscula o minúscula.

```java
// Upper Camel Case
class SoyUnaClase {}

// Lower Camel Case
int sounUnNumeroInt = 10;
```

Deberiamos usar Upper Camel Case en los nombres de las clases y archivo. Y Lower Camel Case en los nombres de las variables o métodos.

De hecho las clases deben tener el mismo nombre del archivo.

## Tipos de datos numéricos

**Enteros**

Los tipos de datos enteros son utilizados para representar cualquier número que no sea decimal.

byte: Rango de -128 a 127. Utiliza 1 byte.
short: Rango de -32,768 a 32,767. Utiliza 2 bytes.
int: Rango de -2,147,483,648 a 2,147,483,647. Utiliza 4 bytes.
long: Rango de -9,223,372,036,854,775,808 a +9,223,372,036,854,775,807. Utiliza 8 bytes.

**Punto flotante**

float: Rango 1.40129846432481707e-45 a 3.40282346638528860e+38. Utiliza 4 bytes.
double: Rango 4.94065645841246544e-324d a 1.79769313486231570e+308d. Utiliza 8 bytes.

## Tipos de datos char y boolean

**Texto**

char: Rango Unicode. Utiliza 2 bytes. Utilizamos comilla simple '' es un solo caracter.

**Lógicos**

boolean: Rango true o false. utiliza 2 bytes.

**Java 10**

A partir de de Java 10 se puede utilizar la palabra clave var. Y Java va a inferir el tipo de dato.

```java
var salary = 1000;
var pension = salary * 0.03;
var totalSalary = salary - pension;
```

## Operadores de Asignación, Incremento y Decremento

Aquí vemos todos estos operadores:

```
+=
-=
*=
/=
%=
++
--

// Prefijo
--i

// Postfijo
i++
```

## Operaciones matemáticas

```java
public class MathOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Double.toString(Math.PI));
        System.out.println(Double.toString(Math.E));
        System.out.println(Double.toString(Math.ceil(x)));
        System.out.println(Double.toString(Math.floor(x)));
        System.out.println(Double.toString(Math.pow(x, y)));
        System.out.println(Double.toString(Math.max(x, y)));
        System.out.println(Double.toString(Math.sqrt(y)));
        // Area de un circulo
        // pi * r^2
        System.out.println(Double.toString(Math.PI * Math.pow(y, 2)));
        // Area de una esfera
        // 4*PI*r^2
        System.out.println(Double.toString(4 * Math.PI * Math.pow(y, 2)));
        // Volumen de una esfera
        // (4/3)*PI*r^3
        System.out.println(Double.toString(4/3 * Math.PI * Math.pow(y, 3)));
    }
}
```

## Cast en variables: Estimación y Exactitud

En la programación hay situaciones donde se necesita cambiar el tipo de dato, Estimación o Exactitud.

## Casteo entre tipos de datos

Java nos ayuda a realizar casteo automático de los tipos de datos más chicos a otros más grandes.

Digamos de byte a short, de short a int, de char a int, de int a long, de long a float, de float a double

En algunos casos vamos a necesitar realizar un cast manualmente. Regularmente cuando queremos castear de una variable grande a una más pequeña porque habrá truncamiento de iformación. Esto es de double a float, de float a log, de long a int, de int a short, de int a char, de char a short, de char a byte, de short a byte.

## Archivos JAR

Los archivo JAR (Java Archive) son archivos de Java con el código compilado de los archivos .class y comprimido con el formato ZIP para que más adelante sean interpretados y ejecutados por la máquina virtual de Java (JVM).

Cuando creamos JAR es por la necesidad de distribuir nuestro código.

Para generar estos archivos podemos entrar a File -> Project Structure -> Artifacts y selecionar la opción JAR -> From modules with dependencies. Luego de esto compilar nuestro proyecto desde Build -> Build Artifacts -> Build y podremos nuestros archivos ejecutables en la carpeta out/artifacts.

# Aplicar condicionales en Java

## Sentencia if

Los condicionales son la forma en que las computadoras toman decisiones, evaluaran si la condición para ejecutar una parte del código se cumple. Si el resultado de la operación es verdadero ejecutarán esta parte del código, en caso de que no, seguirán con las siguientes instrucciones.

La forma de programar condicionales es usando la sentencia if (hay más pero...):

```
if (condición) {
    // Instrucciones
}
```

```java
boolean isBluetoothEnabled = true;
int filesSended = 3;
if (isBluetoothEnabled){
    filesSended++;
    System.out.println("Archivo enviado");
}
```

## Sentencia Switch

La sentencia **Switch** nos ayuda a tomar decisiones con base en una o más condiciones, pero funciona un poco diferente:

**Switch hasta java 11**:

```java
switch (profe) {
    case "Anahí":
        System.out.println("¡Profesora de Java!");
        break;
    case "Oscar"
        System.out.println("¡Profesor de React.js!");
        break;
    case "JuanDC":
        System.out.println("Oye niño, ¿qué haces aquí?");
        break;
    default:
        System.out.println("¡Un nuevo profe!");
}
```

**Switch desde Java 12**: Esta en Beta...

```java
switch(edad){
    case 1 -> System.out.println("¡Tienes 1 año!");
    case 20 -> System.out.println("¡Tienes 20 año!");
    default -> System.out.println("Tu edad no es 1 ni 20");
}
```

## Alcance de las variables y sentencia Else

Mientras más crecen nuestros programas, más lógica y complejidad y niveles añadimos. Estos niveles son el alcance (scope) que tienen nuestras variables, es decir, los lugares dónde pueden ejecutarse o no.

Estos niveles (en parte) son representados por las llaves ({...}) que envuelven nuestro código. Por lo tanto entre más llaves envuelvan nuestro código, estaremos más niveles dentro y el alcance de las ariables que definimos será un poco más limitado.

Solo podemos usar una variable si la definimos antes, en el mismo nivel o alguno anterior. Pero si declaramos una variable en un nivel posterior al resto de nuestro código, no podremos modificarla a menos que el código esté en su mismo nivel.

Por ejemplo:

```java
// Primer nivel:
boolean condicion = true;
int numero1 = 1;

// Segundo nivel:
if (condicion) {
  // podemos modificar variables del primer nivel,
  // incluso desde el segundo nivel:
  numero1++;

  // También podemos crear y modificar
  // nuevas variables en este nivel:
  int numero2 = 10;
  numero2++;
}

// Si volvemos al primer nivel, podemos seguir usando
// y modificando las primeras variables:
numero1--;

// Pero si salimos del segundo nivel no podemos volver a acceder
// a las variables que creamos allí:
System.out.println(numero2); // ERROR!
```

La sentencia else es todo los contrario a la sentencia if: en vez de ejecutar una parte del código si la condición es verdadera, solo lo hará si la condición no se cumple:

```java
boolean isBluetoothEnabled = false;
int filesSended = 3;

if (isBluetoothEnabled) {
  fileSended++;
  System.out.println("Archivo enviado");
} else {
  System.out.println("El Bluetooth no está activado");
}
```

## Operadores lógicos y expresiones booleanas

Nuestros condicionales no solo pueden evaluar variables booleanas, también pueden evaluar si una operación es verdadero o falso.

Por ejemplo:

```java
boolean condicionA = true; // verdadero
boolean condicionB = false; // falso

boolean condicionC = 2 + 2 == 4; // verdadero
boolean condicionD = 2 + 2 == 5; // falso

boolean condicionE = "Pepito" == "Pepito"; // verdadero
boolean condicionF = "Pepito" == "Pepe"; // falso
```

Para esto debemos usar los operadores:

**Operadores de equidad**

- Igualdad: ==
- Desigualdad: !=

**Operadores relacionales**

- Menor que: <
- Mayor que: >
- Menor o igual que: <=
- Mayor o igual que: >=

  **Operadores lógicos**

- &&: AND (Evaluar si dos o más condicionales son verdaderas).
- ||: OR (Evalaur si al menos una de las condiciones es verdadera).
- !: NOT (Evaluar que la condición NO sea verdadera).

Ademas de las sentencias if y else podemos usar else if...

```java
if (noHayInternet) {
  System.out.println("No hay Internet");
} else if (hayInternetPeroMuyPoquito) {
  System.out.println("Tienes muy poquito Internet");
} else if (hayBuenInternetPeroNoEsSuficiente) {
  System.out.println("Casi casi, falta solo un poquito más");
} else {
  System.out.println("¡Tienes suficiente Internet!");
}
```

# Escribir funciones en Java

## ¿Para qué sirven las funciones?

Las funciones nos ayudan a ejecutar código que dependiendo de las opciones que le enviemos, transformará y devolverá un cierto resultado. Gracias a las funciones podemos organizar, modularizar, reutilizar y evitar repetidos en nuestro código.

Todas nuestras funciones deben tener un nombre. Opcionalmente, pueden recibir argumentos y devolver un resultado. También debemos especificar el tipo de dato de nuestros argumentos y el resultado final de nuestra función.

```java
// Signature de la función
// modo de accceso: public
// tipo de return: int
// nombre: suma
// argumentos: int a, int b

public int suma(int a, int b) {
  return a+b;
}
```

Si nuestra función No devuelve nintún tipo de datos podemos utilizar la palabra reservada void.

Para usar nuestras funciones solo debemos asignar el resultado de la función y sus parámetros a una variable con el mismo tipo de dato de la función:

```java
int c = suma(5, 7);
```

## Implementa Funciones en Java

```java
public class Funciones {

    public static double circleArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    public static double shpereArea(double radius){
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public static double sphereVolume(double radius){
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }
    public static void main(String[] args) {
        double y = 3;
        double area = circleArea(y);
        double sArea = sphereVolume(y);
        double sVolume = sphereVolume(y);
        System.out.println("The area of the circle with radius " + Double.toString(y) + " is " + Double.toString(area) + " square units.");
        System.out.println("The area of the sphere with radius " + Double.toString(y) + " is " + Double.toString(sArea) + " square units.");
        System.out.println("The volume of the sphere with radius " + Double.toString(y) + " is " + Double.toString(sVolume) + " square units.");
    }

}
```

## Java Docs

Los Java Docs son una herramienta usada por muchas otras herramientas y aplicaciones porque nos ayuda a documentar todo nuestro código usando comentarios. Además, nos permite visualizar la documentación en formato HTML.

```java
// Comentarios en una sola línea

/* Comentario
* en múltiples
* líneas*/

/**
 * Comentario para Java Docs
 * */
```

## Javadoc en funciones

```java
/**
 * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares.
 *
 * @param quantity Cantidad de dinero.
 * @param currency Tipo de moneda: (MXN o COP)
 * @return Devuelve la cantidad en dólares.
*/
public static double convertToDolar(double quantity, String currency){
  switch (currency){
    case "MXN":
      quantity = quantity * 0.052;
      break;
    case "COP":
      quantity = quantity * 0.00031;
      break;
  }
  return quantity;
}
```

Para que IntelliJ muestre la descripción y dicoumentación de las funciones debemos entrar a File -> Settings -> Editor -> General -> Code Completion y habilitar la opción Show the documentation popup.

## Tags Java Docs

- @author: Es el autor de la clase. @author name-text
- {@code}: Muestra texto en formato de c´dogio sin que sea interpretado como código HTML {@code text}
- {@docRoot}: Indica la ruta relativa al directorio raíz del documento gneerado desde cualquier página generada. {@docRoot}
- @deprecated: Se pone indicando que esta API no debe usarse más. @deprecated deprecatedtext
- @exception: Se indica cuando es vulnerable a lanzar una excepción, en seguida se ponen las clases de las excepciones posibles. @exception class-name description.
- { @inheritDoc }: Indica la herencia o implementación procedentora.
- { @link }: Hace un enlace al miembro indicado. { @link package.class#memberlabel }
- { @linkplain }: Lo mismo que en anterior excepto que la etiqueta del enlace se muestra en texto plano. { @linkplain package.class#memberlabel }
- @param: Añade parámetros con nobres específicos, seguido de su descripción. @param parameter-name description
- @return: Asigna un parámetro de retorno, seguido de su descripción. @return description
- @see: Se añade para manejar referencias, o información relacionada. @see reference.
- @serial: Se utiliza para indicar campos o clases serializables. @serial field-description include exclude
- @serialData: Se utiliza para documentar métodos que generan una seiralización. @serialData data-description
- @serialField: Se utiliza para documentar objetos serializados. @serialField fiel-name field-type field-description.
- @since: Se añade en el encabezado para especificar desde cuándo fue creado. @since release.
- @throws: Es sinónimo con la etiqueta @exception. @throws class-name description.
- {@value}: Cuando es usado sin argumento se usa para especificar un campo estático en otro caso se usa para mostrar el valor constante. { @value package.class#field }
- @version: Se añade en el subtítulo con la versión especificada. @version version-text

# Analizar e implementar Ciclos en Java

## Bucle do while

Los blucle (ciclos) nos ayudan a ejecutar una parte de nuestro código en una cantidad de veces hasta que se cumpla alguna condición y podamos continuar con la ejecución de nuestro código.

Existen diferentes bucles. Por ejemplo, el bucle do while:

```java
do {
  // instrucción
} while (condicion);
```

O el blucle while:

```java
while(condición) {
  // instrucciones
}
```

Los ciclos evaluarán si la condición se cumple y cuando deje de hacerlo no ejecutarán más el código del ciclo. Las instrucciones son las encargadas de que esta condición cambie de verdadero a falso. De otra forma, si las instrucciones nunca cambian de condición, el ciclo no se detendrá nunca, lo que conocemos como un ciclo infinito.

La clase Scanner le permite a los usuarios contestar algunas preguntas para que nuestro programe actúe de una forma u otra. Para usarla solo debemos importar la clase Scanner de las APIs de desarrollo de Java (Para leer del teclado en Java):

```java
import java.util.Scanner;

int reponse = 0;

Scanner sr = new Scanner(System.in);
response = Integer.valueOf(sc.nextLine());
```

## Operador ternario y bucle while

El Bucle While nos ayuda a ejecutar una parte del código mientras una condición se cumpla. Recuerda tener mucho cuidado y asegurarte de que la condición del ciclo while cambie en algún momento, de otra forma el ciclo no se detendrá nunca y sobrecargarás tu programa:

```java
while (isTurnOnLight) {
  printSOS();
}
```

Los operadores ternarios son otra forma de evaluar condiciones, así como los condicionales if y else:

```java
isTurnOnLIght = (isTurnOnLight) ? false : true;

if (isTurnOnLight) {
  isTurnOnLight = false;
} else {
  isTurnOnLight = true;
}
```

## Bucle for

El ciclo for también nos ayuda a ejecutar una parte de nuestro código las veces que sean necesarias para que se cumpla una condición. De hecho, el ciclo for nos da muchas ayudas para lograr este resultado de forma más fácil posible:

```java

for (inicialización; condición; incremento o decremento) {
}

for (int i = 1; i <= 10; i++ ) {
  printSOS();
}
```

## Break, continue y return

Estas son opciones para detener ciclos y así seguir controlando el flujo de tus programas:

**Break**

En Java esta sentencia la verás en dos situaciones especificamente:

1. En un Switch: en esta situación break hace que el flujo del switch no continúe ejecutándose a la siguiente comparación, esto con el objetivo de que solo se cumpla una sola condición.
2. Para salir de un blucle: como un break es capaz de detener el flujo en el código, en este caso detendremos el ciclo como tal terminándolo y haciendo que saltemos a la siguiente instrucción después del ciclo.

**Continue**
Continue en cierto modo también nos va a servir para detener un ciclo pero en lugar de terminarlo como en el caso de break, este volverá direto a la condición.

**Return**

Aunque en algunos lenguaje esta sentencia sirve como un tipo de goto, dónde se rompe el flujo del programa la mejor forma de usarlo en Java es en Funciones, cuando lo usamos así siempre viene acompañado de un valor, el cuál indica el dato que se estará devolviendo en la función.

## Arrays

Los arreglos o arryas son objetos en los que podemos guardar más de una variable, una lista de elementos. Los arrays son de una sola dimensión, pero si guardamos arrays dentro de otros arrays podemos obtener arrays multidimensionales.

Los arrays se definen en código de las siguiente maneras:

```java
/*
  1) Definir el nombre de la vriable y el tipo de dato
  que va a contener, cualquier de las siguientes dos
  opciones es válida:
*/

TipoData[] nombreVariable;
TipoDato nombreVariable[];

/*
  2. Definir el tamaño del array, la cantidad de elementos
  que podemos guardar en el array.
*/

TipoDato[] nombreVariable = new TipoDato[capacidad];

// Array de dos dimensiones:

TipoDato[][] cities = new String[númeroFilas][númeroColumnas];
```

Ya que los arrays pueden guardar multiples elementos, la convención es escribir los nombres de las variables en plural.

## Declarando Arreglos

```java
public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wensday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";

        String[][] cities = new String[4][2];
        cities[0][0] = "México";
        cities[0][1] = "CMDX";
        cities[1][0] = "México";
        cities[1][1] = "Guadalajara";

        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];
    }
}
```

## Indices y búsquedas de elementos en Arrays

Los índices son variables simples que nos ayudan a identificar las posibles posiciones en un arreglo. Estas variables siempre guradan números, comienzan en 0 e incrementan de abajo a arriba y de izquierda a derecha a medida que guardamos más elementos en nuestros arrays.

Para guardar un valor en alguna posición de nuestro array solo debemos usar el índice de la siguiente forma:

```java
nombreVariable[indice] = valor;
```

## Ciclos for anidados

## Continua con el curso de programación orientada a objetos en Java
