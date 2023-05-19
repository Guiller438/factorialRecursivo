import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
    private JButton btnfactorial;
    private JTextArea recursivo;
    private JTextArea norecursivo;
    private JPanel MainPanel;

    public Ventana() {
    btnfactorial.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Main obj = new Main();
            recursivo.setText("Factorial recursivo"+obj.FactorialRecursivo(5));
            norecursivo.setText("Factorial no recursivo"+obj.Factorial(5));
        }
    });
}
    public JPanel getMainPanel() {
        return MainPanel;
    }
}
