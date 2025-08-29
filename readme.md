# Lista de BUGS (pistas para equipos)

* [x] Imports faltantes en `Factura` (`List`, `ArrayList`).
* [ ] División por cero en `Factura.calcularPromedioEntero()` si la lista está vacía.
* [ ] Posible `NullPointerException` por permitir `null` en `agregarProducto`.
* [ ] Precio negativo debe lanzar `PrecioInvalidoException`.
* [ ] `Calculadora.raizCuadrada` lanza `RaizNegativaException` pero no declara `throws` si se define como *checked*.
* [ ] `RaizNegativaException`: ¿debe ser *checked* (`extends Exception`) o *unchecked* (`RuntimeException`)? *(discusión de diseño)*.
* [ ] Acceso inseguro a `args[0]` sin validar longitud.
* [ ] División por cero en `Calculadora.dividir` si `b == 0`.
* [ ] Import innecesario en `App` *(higiene de código)*.
* [ ] Validaciones de dominio: `Producto.setNombre` debería validar nulos/vacíos.
