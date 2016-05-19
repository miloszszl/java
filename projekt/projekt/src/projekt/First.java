/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Dimension;

/**
 *
 * @author student
 */
public class First extends JFrame
{
    public First()
    {
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        this.setLocation(200, 200);

    }
}
