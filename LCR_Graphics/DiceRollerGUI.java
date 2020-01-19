import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import gpdraw.*;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiceRollerGUI extends JPanel implements ActionListener{
    int x,y;
    Rectangle2D r;
    private BufferedImage person1;
    private static Game game; 
    public static void main(String[] args) {
            JFrame window = new JFrame("Dice Roller");
            DiceRollerGUI GUI = new DiceRollerGUI();
            GUI.begin();
            window.setContentPane(GUI);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
            
        
    }
    
    private static JTextField players;
    private static JButton b;
    private static JButton enter;
    
    /*
    public DiceRollerGUI() {
        try{
        person1 = (ImageIO.read(new File("BartGod")));
       } catch(IOException ex){
        System.err.println("That is invalid");
       }
        
    }
    */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(person1, 0, 0, this); // see javadoc for more info on the parameters            
    }
    
    public void begin(){
        
        players = new JTextField(20);
        players.setBackground(Color.WHITE);
        players.addActionListener(this);
    
        
        
        b = new JButton("Roll the Dice");
        b.addActionListener(this);
        enter = new JButton("Enter");
        enter.addActionListener(this);
        
       JPanel inputPanel = new JPanel();  
       inputPanel.setLayout( new GridLayout(1,3) );
       inputPanel.setSize(400, 250);
       inputPanel.add(players);
       inputPanel.add(enter);
       inputPanel.add(b);
       
       /*JFrame frameOne = new JFrame("Game");
        frameOne.setLayout(new GridLayout(1, 4));
        frameOne.setSize(400, 250);
        frameOne.setForeground(Color.BLUE);
        frameOne.setResizable(false);
        frameOne.setVisible(true);*/
        //r = new Rectangle2D.Double(10,20,20,10);
      
        
        setLayout(new GridLayout(1, 2));
        add(inputPanel);
        
        
    }
    /*
    
    public void actionPerformed(ActionEvent evt){
        Object source = evt.getSource();  
        
        if (source == enter) {
          String text = players.getText();
          int num1 = Integer.parseInt(text);
          game = new Game();
          game.begin(num1);
          game.players = num1;
          game.play();

       }
        
        

        //continue here
    }
    
     */



    
 
    
    public DiceRollerGUI() {

        game = new Game();
        players = new JTextField("Number of Players"); 
        int num1 = Integer.parseInt(players.getText());
      	game.begin(num1);
        players.setBackground(Color.WHITE);
        players.addActionListener(this);
        b = new JButton("Roll the Dice");
        
        setLayout(new GridLayout(2, 2));
        add(b);
        add(players);
        
    }
    /*
    public void paintComponent(Graphics g)
    //overriding paintComponent method with my own drawing instructions
    {
        r = new Rectangle2D.Double(x,y,20,10);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        g2.fill(r);
    }
    */
    
    public void actionPerformed(ActionEvent evt) {
        JFrame frameOne = new JFrame("Coins");
        frameOne.setLayout(new GridLayout(1, 2));
        frameOne.setSize(400, 250);
        frameOne.setResizable(false);
        frameOne.setVisible(true);
      	game = new Game();
      	
      
        //continue here
    }
    
     

//connect the game class to the dice rolling class continuing on the "actionPerformed" method in the diceRolling class 
//for every coin taking away or coin given delete or add a rectangle
/*
	public void actionPerformed(ActionEvent e){ 
             
            if(e.getSource()==b){
                String text= b.getText();
                txtfd.setText(txtfd.getText()+text);
            }
            
             
        }   
        */
        
    }


