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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MeinPanel extends JPanel implements MouseListener {

    public MeinPanel() {
        super();
        this.setSize(new Dimension(100, 200));
        JButton buttonStart = new JButton("START");
        this.add(buttonStart);
        this.setLayout(new FlowLayout(0, 200, 200));
        //this.add(Box.createHorizontalGlue());
        //this.add(Box.createVerticalGlue());


        buttonStart.setAlignmentY(Component.CENTER_ALIGNMENT);
        buttonStart.setAlignmentX(Component.CENTER_ALIGNMENT);



    }



    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
