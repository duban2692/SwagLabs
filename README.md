# Introduction 
TODO: el proyecto fue realizado con maven, donde consiste en el ingreso a la web de la compañia SwagLabs para realizar compra de los productos que vende la compañia.
# CONTENIDO
##	Adecuacion del proyecto: 
Para configurar el proyecto en la maquina para su modificación se recomienda seguir los siguientes pasos:
- Ingresar a la url donde se encuentra almancenado el proyecto,https://github.com/duban2692/SwagLabs.git
y clonar el repositorio.
- Importar el proyecto clonado en su IDE de preferencia, se recomienda trabajar con Eclipe o IntelliJ IDEA
- Instalar dependencias requeridas para su correcto funcionamiento. 

## Explicacion del proyecto:
- El proyecto cuenta con un paquete llamado feature, el cual se encuentra en el folder src/test/resources. En este paquete feature estan todos los escenarios que se están validando en la automatizacion. 
Si se desea agregar nuevos escenarios de prueba se deben agregar en el archivo .feature que mas se relacione con lo que se desee probar, en estos archivos .feature es donde se dejan consignados los datos de prueba, por lo que si se requeire cambiar los datos de prueba se debe recurrir a los archivos feature y hacer sus respectivas modificaciones de datos.
- Se cuenta con un archivo serenity.properties que se encuentra en la raíz del proyecto, en el cual se encuentra el nombre del navegador web con el cual se hará la prueba, por el momento se tienen parametrizados los navegadores Google Chrome, Internet Explorer y Microsft Edge. Se recomienda realizar las pruebas con chrome ya que es el navegador más estable a la hora de hacer pruebas mediante controlador webdriver.

## Alcance
El proyecto cuenta con la automatización:
-Compra de productos cliente

## Ejecucion:
Para ejecutar el proyecto se puede usar Junit o desde maven, se recomienda ejecutar mediante maven en la línea de comandos para que quede la evidencia que el framework de serenity brinda tras la ejecucion de una prueba.
Para ejecucion con JUnit se deben requiere enviar los siguientes parametros:
En maven:mvn clean verify -Dcucumber.options="--tags @CompraProductos" -DUrlWeb=https://www.saucedemo.com  -DusuarioStandard=standard_user -DpropertyPassword1=secret_sauce -DusuarioPerformance=performance -DpropertyPassword2=secret_sauce
IDE: -e -DUrlWeb=https://www.saucedemo.com  -DusuarioStandard=standard_user -DpropertyPassword1=secret_sauce -DusuarioPerformance=performance -DpropertyPassword2=secret_sauce


______________________________________URLs_______________________________________________
																					      |
La Url de pruebas es: https://github.com/duban2692/SwagLabs.git

__________________________________________________________________________________________|
