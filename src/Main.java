/* $$    $ $$     $ $$$$$$$  $$$$$$       $$  $$$$$$  $$$  */
/*  $$  $$ $$     $ $$      $$    $      $$  $$    $    $$ */
/*   $$$$  $$     $ $$      $$          $$   $$          $$*/
/*    $$   $$     $ $$$$$$   $$$$$$     $$   $$          $$*/
/*    $$    $$   $$ $$            $     $$   $$          $$*/
/*    $$     $$ $$  $$      $$    $      $$  $$    $    $$ */
/*    $$      $$$   $$$$$$$  $$$$$$       $$  $$$$$$  $$$  */
/*                                                         */
/* Copyright © *********************************************/ 
/* Created by Grigorcea Ana on 01/02/17 ********************/
/* From Project: SwingStart ********************************/

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ramocika");
        frame.setMinimumSize(new Dimension(600, 315));
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setResizable(false);
        frame.setContentPane(new StartPanel());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
