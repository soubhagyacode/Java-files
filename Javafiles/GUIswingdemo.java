import javax.swing.*;

public class GUIswingdemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Swing Example");
        JButton button = new JButton("Click Me");

        button.setBounds(130, 100, 100, 40);

        // button.addActionListener(e -> {
        //     JOptionPane.showMessageDialog(frame, "Hello, you clicked the button!");
        // });

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(button);

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

