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
        //frame.setMinimumSize(new Dimension(500, 700));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setContentPane(new MeinPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
