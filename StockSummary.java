import java.util.HashMap;

public class StockList {

    public static String stockSummary(String[] stockList, String[] categories) {    
        // Verificar si la lista de existencias o la lista de categorías están vacías o nulas
        if (stockList == null || stockList.length == 0 || categories == null || categories.length == 0) {
            return "";
        }

        // Crear un HashMap para almacenar el total de libros de cada categoría
        HashMap<String, Integer> categoryTotals = new HashMap<>();

        // Recorrer el hashmap para comprobar si la categoría está en la lista de categorías e iniciar el total a 0
        for (int i = 0; i < categories.length; i++) {
            categoryTotals.put(categories[i], 0);
        }

        // Recorrer la lista de existencias de cada libro y separa el código y la cantidad
        for (int i = 0; i < stockList.length; i++) {
            String[] parts = stockList[i].split(" ");
            String code = parts[0];
            int quantity = Integer.parseInt(parts[1]);  //convertir la cantidad a entero para poder sumarla después

            // Obtener la categoría del código (primer carácter)
            String categoryLetter = String.valueOf(code.charAt(0));

            // Verificar si la categoría está en la lista de categorías
            if (categoryTotals.containsKey(categoryLetter)) {
                // Crear un nuevo total para la categoría actual al que se suma la última cantidad obtenida
                int currentTotal = categoryTotals.get(categoryLetter);
                categoryTotals.put(categoryLetter, currentTotal + quantity);
            }
        }

        String result = ""; //Mostrar el resultado en un string
        for (int i = 0; i < categories.length; i++) {   //Recorrer la lista de categorías para obtener los totales de cada una
            String category = categories[i];   //Crear la variable categoría para almacenar la categoría actual         
            int totalStock = categoryTotals.get(category);   //Crear la variable totalStock para almacenar el total de libros de la categoría actual
            // Actualizar el resultado con la categoría y el total
            result += "(" + category + " : " + totalStock + ")";
            // Agregar el separador si no es el último elemento
             if (i < categories.length - 1) {
                result += " - ";
                }
        }
        return result;  //Devolver el resultado de la función que muestra el total de libros de cada categoría  
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        String[] stockList = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"};
        String[] categories = {"A", "B", "C", "W"};

        String result = stockSummary(stockList, categories);
        System.out.println(result); // Salida esperada: "(A : 20) - (B : 114) - (C : 50) - (W : 0)"
    }
}
