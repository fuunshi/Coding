import javax.swing.*;

public class UsingDialogInput {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello " + name);
    }
}