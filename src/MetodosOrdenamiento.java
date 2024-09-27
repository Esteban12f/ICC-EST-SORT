public class MetodosOrdenamiento {

    public int[] MethodSort(int[] arreglo, boolean ascendente){
        int lengthArray = arreglo.length;

        if (ascendente){
            for ( int i = 0; i < lengthArray; i++){
                int indice = i;
    
                for (int j = i + 1; j < lengthArray; j++){
                    if (arreglo[j] < arreglo[indice]){
                        indice = j;
                    }
                }
                // Intercambio de indice
                int aux = arreglo[indice];
                arreglo[indice] = arreglo[i];
                arreglo[i] = aux;
            }
        } else {
            for ( int i = 0; i < lengthArray; i++){
                int indice = i;
    
                for (int j = i + 1; j < lengthArray; j++){
                    if (arreglo[j] > arreglo[indice]){
                        indice = j;
                    }
                }
                // Intercambio de indice
                int aux = arreglo[indice];
                arreglo[indice] = arreglo[i];
                arreglo[i] = aux;
            }
        }
        return arreglo;
    }

    public void printArray (int [] arreglo){
        System.out.println();
        for (int elemento : arreglo){
            System.out.println(elemento + " ");
        }
    }


}
