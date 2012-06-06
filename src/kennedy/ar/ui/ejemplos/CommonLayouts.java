package kennedy.ar.ui.ejemplos;

import java.awt.*;
//import java.awt.event.*;
//import java.util.*;

import javax.swing.*;
import javax.swing.border.*;

//import javax.swing.event.*;

public class CommonLayouts extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CommonLayouts() {
		setTitle("Test de layouts");
		setSize(450, 780);

		JPanel content = (JPanel) getContentPane();
		content.setLayout(new GridLayout(4, 1));
		
		JPanel p = new JPanel();
		p.setBorder(new LineBorder(Color.black, 2));
		p.setLayout(new FlowLayout());
		p.add(new JButton("Flow-1"));
		p.add(new JButton("Flow-2"));
		p.add(new JButton("Flow-3"));
		p.add(new JButton("Flow-4"));
		content.add(p);

		p = new JPanel();
		p.setBorder(new LineBorder(Color.blue, 2));
		p.setLayout(new GridLayout(2, 2));
		p.add(new JButton("Grid-1"));
		p.add(new JButton("Grid-2"));
		p.add(new JButton("Grid-3"));
		p.add(new JButton("Grid-4"));
		content.add(p);

		p = new JPanel();
		p.setBorder(new LineBorder(Color.green, 2));
		p.setLayout(new BorderLayout());
		p.add(new JButton("North/1"), BorderLayout.NORTH);
		p.add(new JButton("East/2"), BorderLayout.EAST);
		p.add(new JButton("South/3"), BorderLayout.SOUTH);
		p.add(new JButton("Wet/4"), BorderLayout.WEST);
		p.add(new JButton("Center/5"), BorderLayout.CENTER);
		
		content.add(p);

		p = new JPanel();
		p.setBorder(new LineBorder(Color.black, 1));
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.add(new JButton("Box-1"));
		p.add(Box.createVerticalStrut(5));
		p.add(new JButton("Box-2"));
		p.add(Box.createGlue());
		p.add(new JButton("Box-3"));
		p.add(Box.createVerticalGlue());
		p.add(new JButton("Box-4"));
		content.add(p);

		setVisible(true);
	}

	public static void main(String argv[]) {
		new CommonLayouts();
	}
}
