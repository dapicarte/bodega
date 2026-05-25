# Microservicio de Bodega

## server.port=8093

## Endpoints

### POST `/api/v1/bodega`
Crea una nueva bodega.

**JSON de entrada:**
```json
{
    "nombreBodega": "Bodega Central",
    "capacidadMax": 500,
    "activa": true,
    "idSucursal": 1,
    "idInventario": 1
}
```

---

### GET `/api/v1/bodega`
Lista todas las bodegas sin datos enriquecidos.

---

### GET `/api/v1/bodega/{id}`
Obtiene una bodega por su id.

---

### GET `/api/v1/bodega/{id}/detalle`
Obtiene el detalle de una bodega con datos de Sucursal e Inventario.

**Respuesta con MS levantados:**
```json
{
    "idBodega": 1,
    "nombreBodega": "Bodega Temuco",
    "capacidadMax": 100,
    "activa": true,
    "direccionSucursal": "Av. Libertad 123",
    "capacidadOcupada": 22
}
```

**Respuesta sin MS levantados:**
```json
{
    "idBodega": 1,
    "nombreBodega": "Bodega Temuco",
    "capacidadMax": 100,
    "activa": true,
    "direccionSucursal": null,
    "capacidadOcupada": null
}
```

---

### GET `/api/v1/bodega/listar_con_capacidad`
Lista todas las bodegas con su capacidad ocupada y dirección de sucursal.

---

### DELETE `/api/v1/bodega/{id}`
Elimina una bodega por su id.

---

## Dependencias
| MS | Puerto | Para qué |
|---|---|---|
| MS Sucursal | 8092 | Obtener dirección de la sucursal asociada |
| MS Inventario | 8091 | Obtener capacidad ocupada |