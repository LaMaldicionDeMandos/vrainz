# vrainz
Examen de VRainz

La aplicación se construye con maven, para compilar correr maven `maven install`

Maven generará dentro de la carpeta "target" un jar con una main class llamado examen-1.0-SNAPSHOT.jar

Para correr la aplicació ejecutar el siguiente comando `java -classpath examen-1.0-SNAPSHOT.jar com.vrainz.examen.Main <pathfile>`, donde "pathfile" es el path completo donde está el archivo con los comandos a ejecutar.

En la carpeta raiz se encuentra un archivo "data.txt" como ejemplo de los comandos que se pueden ejecutar.

Es importante aclarar que la aplicación solo recibe como atributo un archivo, el cual contiene una lista de comandos los cuales se ejecutan uno tras otro.

Los comandos que se pueden usar son los siguientes

Todos los comandos reciben como primer parametro, el nombre de la figura, luego opcionalmente, color, x e y.

La sintaxis de los comandos es la siguiente <comando> <nombre> [<nombre del parametro>:<valor del parametro>]

Por ejemplo:
`square cuadrado1 side:10 color:red x:2 y:4` este comando genera un cuadrado llamado cuadrado1 con un tamño de 10 de lado, color rojo y posicionado en 2, 4. 


* **square:** Crea un cuadrado, recibe como parametro obligatorio "side" Ejemplo `square cuadrado1 side:10`
* **triangle:** Crea un triangulo, recibe como parametros obligatorios "base" y "height" Ejemplo `triangle t base:10 height:5 `
* **circle:** Crea un circulo, recibe como parametro obligatorio "radius" Ejemplo `circle c1 radius:10`
* **move:** mueve una figura a la posicion deseada, recibe como parametros obligatorios "x" e "y" Ejemplo `move c1 x:2 y:4`
* **color:** cambia el color de una figura, recibe como parametros obligatorios "color" Ejemplo `color c1 color:red`

La aplicación no realiza manejo de errores.
