# Lista de BUGS (pistas para equipos)

* [x] Imports faltantes en `Factura` (`List`, `ArrayList`).
* [x] División por cero en `Factura.calcularPromedioEntero()` si la lista está vacía.
* [x] Posible `NullPointerException` por permitir `null` en `agregarProducto`.
* [x] Precio negativo debe lanzar `PrecioInvalidoException`.
* [x] `Calculadora.raizCuadrada` lanza `RaizNegativaException` pero no declara `throws` si se define como *checked*.
* [x] `RaizNegativaException`: ¿debe ser *checked* (`extends Exception`) o *unchecked* (`RuntimeException`)? *(discusión de diseño)*.
* [x] Acceso inseguro a `args[0]` sin validar longitud.
* [x] División por cero en `Calculadora.dividir` si `b == 0`.
* [x] Import innecesario en `App` *(higiene de código)*.
* [ ] Validaciones de dominio: `Producto.setNombre` debería validar nulos/vacíos.
