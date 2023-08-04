package com.app.client.components.productos;

public class ProductosComponent {

    private ProductosTemplate productosTemplate;

    public ProductosComponent(){
        this.productosTemplate = new ProductosTemplate(this);
    }

    public ProductosTemplate getProductosTemplate(){
        return this.productosTemplate;
    }
    
}
