public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodos de ordenamiento");

        int [] arreglo = {10,5,2,0,3};
        int [] arregloArreglado = {};

        MetodosOrdenamiento mO = new MetodosOrdenamiento();

        arregloArreglado = mO.MethodSort(arreglo);
        mO.printArray(arregloArreglado);

    }
}
