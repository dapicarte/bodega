# Microservicio de Bodega
### server.port=8093
Funcionando conexion con MS Inventario y MS Sucursal

JSON que entrega con conexiones:
```json
{
    "activa": true,
    "capacidadMax": 100,
    "capacidadOcupada": 22,
    "direccionSucursal": "Av. Libertad 123",
    "idBodega": 1,
    "nombreBodega": "Bodega Temuco"
}
```

JSON que entrega sin conexiones: 
```json
{
    "activa": true,
    "capacidadMax": 230,
    "capacidadOcupada": null,
    "direccionSucursal": null,
    "idBodega": 3,
    "nombreBodega": "Bodega Concepcion"
}
```