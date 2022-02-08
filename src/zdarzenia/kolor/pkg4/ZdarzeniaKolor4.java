/**
 * @author pawelstradomski
 */
package zdarzenia.kolor.pkg4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ZdarzeniaKolor4 extends JFrame
{

    public ZdarzeniaKolor4()
    {
        super("zdarzenia 4 sposob");
        this.setBounds(600, 300, 400, 400);
        initComponent();
        this.setDefaultCloseOperation(3);
    }
    public void initComponent()
    {
        this.getContentPane().add(panel);
        panel.add(przycisk);
        przycisk.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                panel.setBackground(Color.BLACK);
            }
        });
    }
    
    JPanel panel = new JPanel();
    JButton przycisk = new JButton("czarny");
    
    public static void main(String[] args) {
       
        new ZdarzeniaKolor4().setVisible(true);
    }
    
}
