import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;


public class Finestra extends JFrame {
Finestra(){
	setTitle("Finestra");
	setBounds(300, 0, 400, 400);
	
	Container contantPane=getContentPane();
	setLayout(new GridLayout(9,1));
	contantPane.add(new PanelFlow());
	contantPane.add(new PanelGird());
	contantPane.add(new PanelFlow());
	contantPane.add(new PanelGird());
	contantPane.add(new PanelFlow());
	contantPane.add(new PanelGird());
	contantPane.add(new PanelFlow());
	contantPane.add(new PanelGird());
	contantPane.add(new PanelFlow());
	setVisible(true);
}
public static void main(String[] args) {
	Finestra f1 = new Finestra();
}
}
