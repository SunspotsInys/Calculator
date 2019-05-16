package top.sunspotsinys.calculator;

import javax.swing.*;
import java.awt.*;

/**
 * @author SunspotsInys
 * @date 2019/5/16
 */
public class Ui extends JFrame {

    private Container container = getContentPane();
    JTextField jTextField = new JTextField(2);
    private String s = "";
    private final String button = "789+456-123*.0=/";

    private void Opt(JButton jButton) {
        s += jButton.getText();
    }

    public Ui(String title) {
        this.setVisible(true);
        this.setTitle(title);
        this.setLayout(new GridLayout(2, 0));
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public void setMenu() {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu helpMenu = new JMenu("帮助");
        this.setJMenuBar(jMenuBar);
        helpMenu.setMnemonic('H');
        JMenuItem aboutItem = new JMenuItem("关于");
        aboutItem.addActionListener(e -> new AboutDialog(Ui.this).setVisible(true));
        helpMenu.add(aboutItem);
        jMenuBar.add(helpMenu);
    }

    public void setTextField() {
        JPanel jPanel1 = new JPanel(new GridLayout(1, 1));
        jPanel1.add(jTextField);
        container.add(jPanel1);
    }

    public void setButton() {
        JPanel jPanel2 = new JPanel(new GridLayout(4, 4));
        for (int i = 0; i < button.length(); ++i) {
            JButton jButton = new JButton(button.substring(i, i+1));
            jPanel2.add(jButton);
            jButton.addActionListener(e -> {
                Opt(jButton);
                jTextField.setText(s);
            });
        }
        container.add(jPanel2);
    }

    public void create() {
        setMenu();
        setTextField();
        setButton();
    }

}

class AboutDialog extends JDialog {
    public AboutDialog(JFrame jFrame) {
        super(jFrame, "关于", true);
        Container container = getContentPane();
        this.setLayout(new GridLayout(4, 1));
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        JPanel jPanel1 = new JPanel();
        ImageIcon image = new ImageIcon("src/image/cal.png");
        JLabel jLabel = new JLabel(image);
        jPanel1.add(jLabel);
        JPanel jPanel2 = new JPanel();
        JLabel jLabel2 = new JLabel("<html><body><p align=\\\"center\\\">项目开源地址：<br/>https://github.com/SunspotsInys/Calculator</p></body></html>", JLabel.CENTER);
        jPanel2.add(jLabel2);
        container.add(new JPanel());
        container.add(jPanel1);
        container.add(jPanel2);

    }
}
