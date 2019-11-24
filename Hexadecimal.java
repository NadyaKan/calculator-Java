
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 * Beschreiben Sie hier die Klasse Hexadecimal.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Hexadecimal extends UserInterface
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    //private JPanel hexButtons;
protected boolean isHex;
protected JPanel hexButtons;
    /**
     * Konstruktor für Objekte der Klasse Hexadecimal
     */
    
    public Hexadecimal(CalcEngine engine)
    {
      super(engine);
      makeFrameHex();
    }
    
    /*private void addButton(Container panel, String buttonText)
    {
        JButton button = new JButton(buttonText);
        button.addActionListener(this);
        panel.add(button);
    }*/
    
    protected void makeFrameHex()
    
    {
        
        
        JPanel contentPane = (JPanel)frame.getContentPane();
        //contentPane.setLayout(new BorderLayout(8, 8));
        //contentPane.setBorder(new EmptyBorder( 10, 10, 10, 10));

        
        //contentPane.add(display, BorderLayout.NORTH);

        hexButtons = new JPanel(new GridLayout(1, 6));
        
            
            
            addButton(hexButtons, "A");
            addButton(hexButtons, "B");
            addButton(hexButtons, "C");
            addButton(hexButtons, "D");
            
            addButton(hexButtons, "E");
            addButton(hexButtons, "F");
            
            
            
            JPanel switchButton = new JPanel(new GridLayout(3,1));
            switchButton.add(new JLabel(" "));
          
            addButton(switchButton, "Switch Calculator");
            switchButton.add(new JLabel(" "));
            
            
            
           
            
            
            
            contentPane.add(hexButtons, BorderLayout.SOUTH);
            

            
            contentPane.add(switchButton, BorderLayout.LINE_END);
            
            

            frame.pack();
            
    }
    
    public void actionPerformed(ActionEvent event)
    {
        super.actionPerformed(event);
        String command = event.getActionCommand();
        

        if(command.equals("A")){
           calc.numberPressed(10);
        }
        else if(command.equals("B")) {
            calc.numberPressed(11);
        }
        else if(command.equals("C")) {
            calc.numberPressed(12);
        }
        else if(command.equals("D")) {
            calc.numberPressed(13);
        }
        else if(command.equals("E")) {
           calc.numberPressed(14);
        }
        else if(command.equals("F")) {
            calc.numberPressed(15);
        }
        else if(command.equals("Switch Calculator")) {
            switchCalc();
        }
        
        // else unknown command.

        this.redisplay();
    }

  protected void redisplay() {
       
      int value = calc.getDisplayValue();
      String hexValue = Integer.toHexString(value).toUpperCase();
       display.setText(hexValue);
    }
   
    
    protected void switchCalc(){
        if(isHex){
        hexButtons.setVisible(true);
        isHex= false;
        }
        else{
        hexButtons.setVisible(false);
        isHex=true;
        }
    }
    
}
