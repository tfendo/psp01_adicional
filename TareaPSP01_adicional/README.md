# Tarea adicional PSP01

## Creación de procesos  
Para probar la portabilidad de la aplicación \"**CrearProcesos**", la he ejecutado en tres sistemas operativos distintos para verificar su correcto funcionamiento.  

* **Ejecutando en macOS**  
En primer lugar la he ejecutado desde la terminal de un sistema operativo **macOS Sierra** probando que captura las posibles excepciones adecuadamente.  

![Excepciones macOS](https://github.com/tfendo/psp01_adicional/blob/master/TareaPSP01_adicional/Capturas/CapturaExMac.png)  

Seguidamente ejecuto la instrucción `java -jar CrearProcesos.jar 4`, y el resultado se puede apreciar en la siguiente captura:  

![Ejecutando en macOS](https://github.com/tfendo/psp01_adicional/blob/master/TareaPSP01_adicional/Capturas/CapturaMac.png)  

* **Ejecutando en Windows**  
A continuación pruebo el programa en un SO **Windows 10**. Abro una ventana del simbolo del sistema, me sitúo en la carpeta que contiene el ejecutable de la aplicación y ejecuto la instrucción `java -jar CrearProcesos.jar 5`. En la captura se comprueba su funcionamiento.  

![Ejecutando en Windows](https://github.com/tfendo/psp01_adicional/blob/master/TareaPSP01_adicional/Capturas/CapturaWindows.JPG)  

* **Ejecutando en Linux**  
Por último accedo a una distro **Ubuntu 16.04** y sigo unos pasos similares. Accedo desde una terminal al archivo .jar del programa y lo ejecuto con la instrucción `java -jar CrearProcesos.jar 3`. El resultado es el siguiente:  

![Ejecutando en Linux](https://github.com/tfendo/psp01_adicional/blob/master/TareaPSP01_adicional/Capturas/CapturaLinux.JPG)  

***

### Aclaración  

En el enunciado de la tarea se pide facilitar la portabilidad entre distintas máquinas. Mi programa funciona tomando como referencia que, el programa **Editor** del cual se crean distintos procesos, se encuentra en el directorio que crea el IDE NetBeans por defecto en cada uno de los sistemas operativos probados. Si el usuario cambia la ubicación de este directorio, el programa **CrearProcesos** no se caería, pero no sería capaz de encontrar la ubicación del otro programa y de abrir las instancias solicitadas.  
Una posible solución sería obligar al usuario a pasar la ubicación del programa como parámetro utilizando una instrucción del tipo  

```
java -jar CrearProcesos.jar 4 <ruta de acceso al archivo>
``` 
