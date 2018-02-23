/**
 *Text genereted by Simple GUI Extension for BlueJ
 */
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;

public class GUI_project extends JFrame {
    private JMenuBar menuBar;
    private JButton button1;
    private JComboBox combobox1;
    private JPanel panel1;
    private JPasswordField passwordfield1;
    private JTextArea textarea1;
    private JTextArea textarea2;
    private Boolean can_check = false ; 
    
    //Constructor 
    public GUI_project(){

        this.setTitle("GUI_project");
        this.setSize(500,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));

        button1 = new JButton();
        button1.setBounds(313,241,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Button1");
        button1.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    act(evt);
                }
            });

        combobox1 = new JComboBox();
        combobox1.setBounds(5,5,90,35);
        combobox1.setBackground(new Color(214,217,223));
        combobox1.setForeground(new Color(0,0,0));
        combobox1.setEnabled(true);
        combobox1.setFont(new Font("sansserif",0,12));
        combobox1.setVisible(true);

        panel1 = new JPanel(null);
        panel1.setBorder(BorderFactory.createEtchedBorder(1));
        panel1.setBounds(1,2,494,393);
        panel1.setBackground(new Color(214,217,223));
        panel1.setForeground(new Color(0,0,0));
        panel1.setEnabled(true);
        panel1.setFont(new Font("sansserif",0,12));
        panel1.setVisible(true);

        passwordfield1 = new JPasswordField();
        passwordfield1.setBounds(16,264,90,35);
        passwordfield1.setBackground(new Color(214,217,223));
        passwordfield1.setForeground(new Color(0,0,0));
        passwordfield1.setEnabled(true);
        passwordfield1.setFont(new Font("sansserif",0,12));
        passwordfield1.setVisible(true);

        textarea1 = new JTextArea();
        textarea1.setBounds(11,49,150,100);
        textarea1.setBackground(new Color(255,255,255));
        textarea1.setForeground(new Color(0,0,0));
        textarea1.setEnabled(true);
        textarea1.setFont(new Font("sansserif",0,12));
        textarea1.setText("JTextArea");
        textarea1.setBorder(BorderFactory.createBevelBorder(1));
        textarea1.setVisible(true);

        textarea2 = new JTextArea();
        textarea2.setBounds(7,154,150,100);
        textarea2.setBackground(new Color(255,255,255));
        textarea2.setForeground(new Color(0,0,0));
        textarea2.setEnabled(true);
        textarea2.setFont(new Font("sansserif",0,12));
        textarea2.setText("JTextArea");
        textarea2.setBorder(BorderFactory.createBevelBorder(1));
        textarea2.setVisible(true);
        //Set action for key events
        //Call defined method
        textarea2.addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent evt){
                    change(evt);
                }
            });

        //adding components to contentPane panel
        panel1.add(button1);
        panel1.add(combobox1);
        contentPane.add(panel1);
        panel1.add(passwordfield1);
        panel1.add(textarea1);
        panel1.add(textarea2);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    public void settxt (String a) 
    {
        textarea1.setText(a);
    }

    public String gettxt () 
    {
        return textarea2.getText();
    }

    public String getpriv () 
    {
        return passwordfield1.getText();
    }

    public  void act (MouseEvent evt) 
    {
        this.can_check =true ;
       
    }
    public void setF()
    {
        this.can_check = false;
    }
    MouseEvent evt;
    public String in()
    {
        
        if (can_check = true)
        {
            return gettxt();
        }
        else 
        {
            return "";    
        }
    }

    //Method mouseClicked for button1
    //Method keyTyped for textarea2
    private void change (KeyEvent evt) 
    {

    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");

        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }

    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    //new GUI_project();
                }
            });
            Game.main();
    }

}