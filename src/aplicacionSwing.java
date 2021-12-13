
/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
 
/**
 * This example, like all Swing examples, exists in a package:
 * in this case, the "start" package.
 * If you are using an IDE, such as NetBeans, this should work 
 * seamlessly.  If you are compiling and running the examples
 * from the command-line, this may be confusing if you aren't
 * used to using named packages.  In most cases,
 * the quick and dirty solution is to delete or comment out
 * the "package" line from all the source files and the code
 * should work as expected.  For an explanation of how to
 * use the Swing examples as-is from the command line, see
 * http://docs.oracle.com/javase/javatutorials/tutorial/uiswing/start/compile.html#package
 */
//package start;
 
/*
 * HelloWorldSwing.java requires no other files. 
 */
import javax.swing.*;
import javax.swing.border.Border;   
import java.awt.*;
 
public class aplicacionSwing {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame ventanaMain = new JFrame("Poligonos");
        ventanaMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panelMain = new JPanel();
        
        ventanaMain.getContentPane().add(panelMain, BorderLayout.NORTH);
        
        panelMain.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
 
        JPanel panelPintar = new JPanel();
        
        ventanaMain.getContentPane().add(panelPintar, BorderLayout.CENTER);
        
        panelPintar.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        
        JPanel panelEtiqueta = new JPanel();
        
        ventanaMain.getContentPane().add(panelEtiqueta, BorderLayout.SOUTH);
        
        panelEtiqueta.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
       
        
        
        //Panel main
        
        JButton menos = new JButton();
        JButton mas = new JButton();
        
        panelMain.add(menos);
        panelMain.add(mas);
        
        JLabel label = new JLabel("Lados");
        panelMain.add(label);
        
        JTextField lados = new JTextField("0");
        panelMain.add(lados);
        
 
        
        //Panel etiqueta
        
        //Metodo para validar el numero de lados del cuadro de texto lados
        
        String nombrePoligono = calcularNombrePol(lados);
        
        JLabel labEtiqueta = new JLabel("Cuadrado");
        
        //Add the ubiquitous "Hello World" label.
//        JLabel label = new JLabel("Hello World");
//        ventanaMain.getContentPane().add(label);
        
 
        //Display the window.
        ventanaMain.pack();
        ventanaMain.setVisible(true);
    }
 
    private static String calcularNombrePol(JTextField lados) {
		// TODO Auto-generated method stub
    	switch(lados.getText()) {
    	case "0": break;
    	case "1": break;
    	case "2": break;
    	case "3": break;
    	case "4": break;
    	case "5": break;
    	case "6": break;
    	case "7": break;
    	case "8": break;
    	case "9": break;
    	case "10": break;
    	case "11": break;
    	case "12": break;
    	}
    	
		return null;
	}

	public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}