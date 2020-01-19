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
import javax.swing.*;
import gpdraw.*;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import java.util.*;
/**
 * This class handles the graphical component of the game; the textfields, the player avatars, and
 * the live score. 
 *
 * @author Alexander Lin, Karthik Talluri, Rohan Maletira
 * @version 20181129
 */
public class DiceRollerGUI extends JPanel implements ActionListener{
    int x,y;
    Rectangle2D r;
    private BufferedImage person1, person2, person3, person4;
    private static Game game; 
    public static int currentPlayer = 1;
    public static int currentRoll = 0;
    public static int numRolls = 0;
    public static int num1;
    public static void main(String[] args) {
        JFrame window = new JFrame("Dice Roller");
        DiceRollerGUI GUI = new DiceRollerGUI();
        GUI.begin();
        window.setContentPane(GUI);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(120,70);
        window.setSize(1200,750);
        window.setVisible(true);

    }
    private static JTextField players;
    private static JButton enter;
    private static JLabel picLabel;//NEW
    private static JLabel picLabel2;//NEW
    private static JLabel picLabel3;//NEW
    private static JLabel picLabel4;//NEW
    private static JLabel scoreLabel1;//NEW
    private static JLabel scoreLabel2;//NEW
    private static JLabel scoreLabel3;//NEW
    private static JLabel scoreLabel4;//NEW

    private static int score1;
    private static int score2;
    private static int score3;
    private static int score4;
    private static ArrayList<Integer> coins = new ArrayList<Integer>();
    public DiceRollerGUI() {
        try{
            person1 = ImageIO.read(new File("BartGod.png"));//NEW
            
            person2 = ImageIO.read(new File("Lisa_Simpson.png"));
            person3 = ImageIO.read(new File("Homer_Simpson.png"));//NEW
            
            person4 = ImageIO.read(new File("Marge_Simpson.png"));
            picLabel = new JLabel(new ImageIcon(person1));//NEW

            picLabel2 = new JLabel(new ImageIcon(person2));//NEW

            picLabel3 = new JLabel(new ImageIcon(person3));//NEW

            picLabel4 = new JLabel(new ImageIcon(person4));//NEW
            
            for(int i = 0;i<num1;i++){
                coins.add(Game.allplayers[i].coins);
            }
            switch(coins.size()){
                case 1: score1 = coins.get(0);
                break;
                case 2: score1 = coins.get(0);
                score2 = coins.get(1);
                break;
                case 3: score1 = coins.get(0);
                score2 = coins.get(1);
                score3 = coins.get(2);
                break;
                case 4: score1 = coins.get(0);
                score2 = coins.get(1);
                score3 = coins.get(2);
                score4 = coins.get(3);
                break;
            }

            scoreLabel1 = new JLabel(Integer.toString(score1));
            scoreLabel2 = new JLabel(Integer.toString(score2));
            scoreLabel3 = new JLabel(Integer.toString(score3));
            scoreLabel4 = new JLabel(Integer.toString(score4));

        } catch(IOException ex){
            System.out.println("This is invalid");
        }

    }

    public void begin(){
        players = new JTextField("Enter Number of Players: Max Four for Graphics Effect and minimum of Two");
        players.setBackground(Color.WHITE);
        players.addActionListener(this);

        enter = new JButton("Enter");
        enter.addActionListener(this);

        JPanel inputPanel = new JPanel();  
        inputPanel.setLayout( new GridLayout(1,2) );
        inputPanel.setSize(100, 200);
        inputPanel.add(players);
        inputPanel.add(enter);
        //inputPanel.add(picLabel);

        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(2,4));
        gamePanel.setSize(100,100);
        gamePanel.add(picLabel);
        gamePanel.add(picLabel2);
        gamePanel.add(picLabel3);
        gamePanel.add(picLabel4);

        
        gamePanel.setLayout(new GridLayout(2,4));
        gamePanel.setSize(300,100);
        
        gamePanel.add(scoreLabel1);
        gamePanel.add(scoreLabel2);
        gamePanel.add(scoreLabel3);
        gamePanel.add(scoreLabel4);

        /*JFrame frameOne = new JFrame("Game");
        frameOne.setLayout(new GridLayout(1, 4));
        frameOne.setSize(400, 250);
        frameOne.setForeground(Color.BLUE);
        frameOne.setResizable(false);
        frameOne.setVisible(true);*/
        //r = new Rectangle2D.Double(10,20,20,10);

        setLayout(new GridLayout(1, 3));
        add(inputPanel);
        add(gamePanel);
        setBorder( BorderFactory.createLineBorder(Color.GREEN, 2) );
    }

    /*public void paintComponent(Graphics g)
    //overriding paintComponent method with my own drawing instructions
    {
    r = new Rectangle2D.Double(x,y,20,10);
    Graphics2D g2 = (Graphics2D) g;
    g2.setColor(Color.RED);
    g2.fill(r);
    }*/

    public void actionPerformed(ActionEvent evt){
        Object source = evt.getSource();  

        if (source == enter) {
            
            String text = players.getText();
            num1 = Integer.parseInt(text);
            game = new Game();
            game.begin(num1);
            game.players = num1;
            /*
            scoreLabel1.setText(Integer.toString(0));
            scoreLabel2.setText(Integer.toString(0));
            scoreLabel3.setText(Integer.toString(0));
            scoreLabel4.setText(Integer.toString(0));
            */
            while(game.running){
                game.play(currentPlayer, currentRoll, numRolls);

                this.numRolls++;
                
                switch(num1){
                case 1: scoreLabel1.setText(Integer.toString(Game.allplayers[0].coins));
                scoreLabel2.setText("N/A");
                scoreLabel3.setText("N/A");
                scoreLabel4.setText("N/A");
                break;
                case 2: scoreLabel1.setText(Integer.toString(Game.allplayers[0].coins));
                scoreLabel2.setText(Integer.toString(Game.allplayers[1].coins));
                scoreLabel3.setText("N/A");
                scoreLabel4.setText("N/A");
                break;
                case 3: scoreLabel1.setText(Integer.toString(Game.allplayers[0].coins));
                scoreLabel2.setText(Integer.toString(Game.allplayers[1].coins));
                scoreLabel3.setText(Integer.toString(Game.allplayers[2].coins));
                scoreLabel4.setText("N/A");
                break;
                
                case 4: scoreLabel1.setText(Integer.toString(Game.allplayers[0].coins));
                scoreLabel2.setText(Integer.toString(Game.allplayers[1].coins));
                scoreLabel3.setText(Integer.toString(Game.allplayers[2].coins));
                scoreLabel4.setText(Integer.toString(Game.allplayers[3].coins));
                break;
                
            }
                
                repaint();
                super.update(this.getGraphics());
            }
            

        }
        //continue here
    }
    /*
    @Override
    public void paintComponent(Graphics g) {
    super.paintComponent(g);

    ArrayList<Integer> coins = new ArrayList<Integer>();
    for(int i = 0;i<num1;i++){
    coins.add(Game.allplayers[i].coins);
    }

    for(int j = 0;j<coins.size();j++){
    g.drawString(Integer.toString(coins.get(j)),1200,500);

    }
    g.drawImage(person1, 0, 0, this); 

    }
     */

}
 