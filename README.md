Crear el método stockSummary que contendrá un array de String llamado stocklist (contiene el código del libro y un número de unidades) y otro array de String llamado categories (contiene el total de categorías existentes).

Comprobar que tanto stocklist como categories no están vacías o son null.

Crear un HashMap con clave String y valor Integer llamado categoryTotals.

Recorrer categories y asignar 0 a cada categoría

Recorrer stocklist para separar el código (code) [0] de las unidades (quantity [1]).

Convertir las unidades en Integer para poder sumarlas.

Obtener la categoría de cada libro creando una String llamada categoryLetter a la que asignaremos en cada caso el índice 0 de code (la primera letra).

Verificar si una categoryLetter está en la lista de categorías.

Crear una variable para el total que teníamos de cada letra llamado currentTotal.

Asignar a cada categoryLetter su code y a este sumarle quantity.

Para mostrar el resultado, crear una variable String result, recorrer la lista de categories para obtener los totales de cada una, crear la variable category para almacenar la categoría actual y crear la variable totalStock para almacenar el total de libros de cada categoría.

Mostrar result con las variables category y totalStock.

Escribir el main con los valores del array stockList y los valores del array categories.

Almacenar el resultado en la variable result que llama al método stockSummary e imprimir result.
