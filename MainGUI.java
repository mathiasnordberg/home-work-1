
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * @ Mathias Nordberg
 * 2014
 *
 */
 
 public class MainGUI extends JFrame{
             
    private JMenuBar menu;
    private JMenu archive, about;
    private JMenuItem terminate, copyright, help;
     
     
     
     public MainGUI(){
	 this.GUI();
     }
     public void GUI(){
	 /*
	  * Inställningar för JFramen
	  */
	 this.setTitle("Test");
	 this.setSize(300,400);
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 /*
	 * Skapar menyerna
	 */
	
	this.menu = new JMenuBar();
	this.archive = new JMenu("Arkiv");
	this.terminate = new JMenuItem("Avsluta programmet");
	this.about = new JMenu("Om");	
	this.copyright = new JMenuItem("Om programmet");
	this.help = new JMenuItem("Hjälp");
	
	this.setJMenuBar(menu);
	this.menu.add(archive);
	this.menu.add(about);
	this.archive.add(terminate);
	
	this.about.add(copyright);
	this.about.add(help);
	
	this.terminate.addActionListener( new ActionListener() {
	@Override
	public void actionPerformed( ActionEvent e ){
	    System.exit(0);
	}
	
	});
	this.copyright.addActionListener( new ActionListener(){
	    @Override
	    public void actionPerformed(ActionEvent e){
		JOptionPane.showMessageDialog(null, "\u00a9 Mathias Nordberg 2014");
	    }
	});
	
	this.help.addActionListener( new ActionListener(){
	    @Override
	    public void actionPerformed(ActionEvent e){
		JOptionPane.showMessageDialog(null, "Om programmet");
	    }
	});
	
	 
	 
     }
     
 public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new Runnable(){
         public void run(){
             new MainGUI().setVisible(true);
         }
      });
 
 
 }
 }