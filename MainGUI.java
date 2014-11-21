import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * @ Mathias Nordberg
 * 2014-11-21
 *
 */
 
 public class MainGUI extends JFrame{
             
    private JMenuBar menu;
    private JMenu archive, about;
    private JMenuItem terminate, copyright, help; 
    private JPanel panel1;
    private JLabel NbrOfHorses;
    private JTextField txf_horses;
    private JButton btn_start, btn_handicap, btn_create;
    private Dimension dimTxf;
    private Game race;        
     public MainGUI(){
	 this.initMyGUI();
         race = new Game();
         
     }
     private void initMyGUI(){
	 /*
	  * Inställningar för JFramen
	  */
	 this.setTitle("Horse Race");
	 this.setSize(1000,400);
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.panel1 = new JPanel();
         this.add(panel1);
	 /*
	 * Skapar menyerna
	 */
	
	this.menu = new JMenuBar();
	this.archive = new JMenu("Arkiv");
	this.terminate = new JMenuItem("Avsluta programmet");
	this.about = new JMenu("Om");	
	this.copyright = new JMenuItem("Om programmet");
	this.help = new JMenuItem("Hjälp");
	this.NbrOfHorses = new JLabel("Hur många hästar?");
        this.btn_start = new JButton("Start");
        this.btn_handicap = new JButton("Set handicaped horses");
        this.btn_create = new JButton("Create horses");
        this.txf_horses = new JTextField();
        this.dimTxf = new Dimension(100, 25);
        
        this.txf_horses.setPreferredSize(dimTxf);
	this.setJMenuBar(menu);
	this.menu.add(archive);
	this.menu.add(about);
	this.archive.add(terminate);
	this.about.add(copyright);
	this.about.add(help); 
        
        this.panel1.add(NbrOfHorses);
        this.panel1.add(txf_horses);
        this.panel1.add(btn_start);
        this.panel1.add(btn_handicap);
        this.panel1.add(btn_create);
	
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
	/*
        Knapp för att starta ett race
        */
        this.btn_start.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){ 
                race.runRace();
            }
        });
        /*
        Knapp för att skapa hästarna
        */
        this.btn_create.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               
               try{
                   race.createHorses(Integer.parseInt(txf_horses.getText()));
                }catch(NumberFormatException error){
                    String msg = "Please enter a number in the Textfield\n";
                    JOptionPane.showMessageDialog(null, msg); 
                }
            }
        });
        /*
        Knapp som ger NormalHorse ett litet försprång
        */
        this.btn_handicap.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                race.setHandicapHorses();
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