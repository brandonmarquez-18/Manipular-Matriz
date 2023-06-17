public package matrizcuadrada;
import javax.swing.JOptionPane;
public class Matrizcuadrada {
    public static void main(String[] args) {
        int TamanoMatriz = Integer.parseInt(JOptionPane.showInputDialog("Digita el número de tu matríz cuadrada:"));
        int matrizCuadrada [][] = new int [TamanoMatriz][TamanoMatriz];
        for(int i=0;i<TamanoMatriz;i++){
            for(int j=0;j<TamanoMatriz;j++){
                matrizCuadrada[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digita el valor en la posición: " + "["+(i+1)+"]" + ", " + "["+(j+1)+"]"));
            }
        }
        int RepetirMenu = 1;
        while(RepetirMenu == 1){
            int Opc = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción del menú:\n"
            + "1.- Sumar una fila seleccionada por el usuario\n"
            + "2.- Sumar una columna seleccionada por el usuario\n"
            + "3.- Sumar la diagonal principal\n"
            + "4.- Buscar un elemento(Debe regresar la posición de los encontrados)\n"
            + "5.- Salir"));
            switch(Opc){
                case 1:
                    String mostrarMatriz = "";
                    for(int i=0;i<matrizCuadrada.length;i++){
                        for(int j=0;j<matrizCuadrada.length;j++){
                            mostrarMatriz += matrizCuadrada[i][j];
                            mostrarMatriz += "   ";
                        }
                        mostrarMatriz += "\n";
                    }
                    int sumaFila = 0;
                    int Fila = Integer.parseInt(JOptionPane.showInputDialog(null ,"Elige una fila para hacer la suma:\n"+mostrarMatriz));
                    Fila = Fila -1;
                    for(int i=0;i<matrizCuadrada.length;i++){
                        sumaFila += matrizCuadrada[Fila][i];
                    }
                    JOptionPane.showMessageDialog(null, "La suma de la fila que digitó " + "("+(Fila+1)+")" +" es: "+ sumaFila);
                    RepetirMenu = 1;
                    break;
                case 2:
                    String mostrarMatrizA = "";
                    for(int i=0;i<matrizCuadrada.length;i++){
                        for(int j=0;j<matrizCuadrada.length;j++){
                            mostrarMatrizA += matrizCuadrada[i][j];
                            mostrarMatrizA += "   ";
                        }
                        mostrarMatrizA += "\n";
                    }
                    int sumaColumna = 0;
                    int Columna = Integer.parseInt(JOptionPane.showInputDialog("Elige una columna para hacer la suma:\n"+mostrarMatrizA));
                    Columna = Columna -1;
                    for(int i=0;i<matrizCuadrada.length;i++){
                        sumaColumna += matrizCuadrada[i][Columna];
                    }
                    JOptionPane.showMessageDialog(null, "La suma de la columna selecionada es: " + sumaColumna);
                    RepetirMenu = 1;
                    break;
                case 3:
                    String mostrarMatrizAB = "";
                    for(int i=0;i<matrizCuadrada.length;i++){
                        for(int j=0;j<matrizCuadrada.length;j++){
                            mostrarMatrizAB += matrizCuadrada[i][j];
                            mostrarMatrizAB += "   ";
                        }
                        mostrarMatrizAB += "\n";
                    }
                    int suma = 0;
                    for(int i=0,j=0;i<matrizCuadrada.length;i++,j++){
                        suma += matrizCuadrada[i][j];
                    }
                    JOptionPane.showMessageDialog(null, mostrarMatrizAB + "\nLa suma de la diagonal principal es : " + suma);
                    RepetirMenu = 1;
                    break;
                case 4:
                    String mostrarMatrizABC = "";
                    for(int i=0;i<matrizCuadrada.length;i++){
                        for(int j=0;j<matrizCuadrada.length;j++){
                            mostrarMatrizABC += matrizCuadrada[i][j];
                            mostrarMatrizABC += "   ";
                        }
                        mostrarMatrizABC += "\n";
                    }
                    int numeroAbuscar = Integer.parseInt(JOptionPane.showInputDialog("Indica el número a buscar:\n"+mostrarMatrizABC));
                    int aux = 0;
                    for(int i=0;i<matrizCuadrada.length;i++){
                        for(int j=0;j<matrizCuadrada[0].length;j++){
                          if(matrizCuadrada[i][j] == numeroAbuscar){
                              aux = matrizCuadrada[i][j];
                              if(aux == numeroAbuscar){
                                  JOptionPane.showMessageDialog(null, "El número ingresado " + "("+numeroAbuscar+"), "+"Se encuentra en las dimensiones:"+"["+(i+1)+"]"+"["+(j+1)+"]");
                              }
                          }
                        }
                    }
                    if(aux != numeroAbuscar){
                        JOptionPane.showMessageDialog(null, "El número ingresado " + "("+numeroAbuscar+"), "+"No se encuentra en la matriz!");
                    }
                    RepetirMenu = 1;
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Hasta la próxima!!...");
                    RepetirMenu = 2;
                    break;
            }
        }
    }
} {
    
}
