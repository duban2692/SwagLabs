#language:es
#Author: dutapias@qvision.com.co
@CompraProductos
Característica: Compra de productos
  Yo como usuario ganador el el portal de la empresa SWAGLABS
  Quiero iniciar sessión
  Para interacturar con el portal y realizar compras de productos

  Escenario: scenario: Compra Productos
    Dado que el usuario quiere iniciar sesion con sus credenciales
      | username        | password          |
      | usuarioStandard | propertyPassword1 |
    Cuando sus credenciales son correctas
    Entonces el usuario selecciona sus productos y posteriormente los confirma






