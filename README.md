# Optional
Ejercicios optional

Los opcional son la forma de controlar el null en programacion funcional que este no existe,
estos contienen informacion y tiene las operaciones fundamentales de los steams con excepcion 
del .reduce().

# Operadores

.of() -> carga el optional pero no permite null
.ofNullable() -> carga el optional pero permite null
.get() -> se optiene el valor del optional con el problema que puede arrojar null pointer exception siempre debe ser evaluadao.
.isPresent() -> evalua si hay un optional esta vacio retorna false caso contrario retorna un true
.isEmpty() -> esta es la negacion del .isPresent() en caso de estar vacio retorna verdadero (disponible en java 11)
.ifPresentOrElse() -> este evalua el optional y puedeje ejecutar dos acciones si se encuentra lleno o no el optional
.orElse() -> en caso de no haber coincidencias despues de manipular el optinal se realiza una operacion
orElseGet() -> similar al anterior solo que este retorna un objeto
.orElseThrow() -> este es similar al .orElse() solo que este lanza un exepcion






