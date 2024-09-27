public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodos de ordenamiento");

        int [] arreglo = {10,5,2,0,3};
        int [] arregloArreglado = {};

        MetodosOrdenamiento mO = new MetodosOrdenamiento();

        arregloArreglado = mO.MethodSort(arreglo, false);
        mO.printArray(arregloArreglado);

        arregloArreglado = mO.MethodSort(arreglo, true);
        mO.printArray(arregloArreglado);

    }
}
