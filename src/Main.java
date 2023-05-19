import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Ventana MainForm = new Ventana();
        MainForm.setContentPane(MainForm.getMainPanel());
        MainForm.setBounds(100,100,500,500);
        MainForm.setVisible(true);
        MainForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    int n = 5;
     public int Factorial(int n){
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
           return fact;
     }

     public int FactorialRecursivo(int n){
         if (n == 0) {
            return 1;
        } else {
            int resultado = n * FactorialRecursivo(n - 1);
            return resultado;
        }
     }



}