package com.qvision.co.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PortalVistaProductos {

    public static final Target ICONO_PRODUCTOS = Target.the("Icono de la pagina principal de productos").located(By.xpath("//div[@class='peek']"));
    public static final Target LISTADO_PRODUCTOS = Target.the("Listado Productos").located(By.xpath("//div[@class='inventory_item_price']"));
    public static final Target BOTON_AGREGAR_CARRITO = Target.the("Listado Productos").located(By.xpath("//button[@class='btn_primary btn_inventory']"));
    public static final Target CARRITO_COMPRAS = Target.the("Carrito de compras").located(By.xpath("//*[name()='path' and contains(@fill,'currentCol')]"));

}
