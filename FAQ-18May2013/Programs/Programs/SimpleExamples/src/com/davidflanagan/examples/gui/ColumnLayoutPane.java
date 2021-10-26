
package com.davidflanagan.examples.gui;
import java.awt.*;
import javax.swing.*;

public class ColumnLayoutPane extends JPanel {
    public ColumnLayoutPane() {
	// Get rid of the default layout manager.
	// We'll arrange the components ourselves.
	this.setLayout(new ColumnLayout(5, 5, 10, ColumnLayout.RIGHT));

	// Create some buttons and set their sizes and positions explicitly
	for(int i = 0; i < 6; i++) {
	    int pointsize = 8 + i*2;
	    JButton b = new JButton("Point size " + pointsize);
	    b.setFont(new Font("helvetica", Font.BOLD, pointsize));
	    this.add(b);
	}
    }
}
