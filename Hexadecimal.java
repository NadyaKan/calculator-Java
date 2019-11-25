
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
    public boolean isHex ;
    protected JPanel hexButtons;
    //protected JCheckBox checkbox;
    
    
    public Hexadecimal(CalcHex engine)
        {
          super(engine);
          makeFrameHex();
        }
    
    
    protected void makeFrameHex()
    {
        
        JPanel contentPane = (JPanel)frame.getContentPane();
       
        hexButtons = new JPanel(new GridLayout(1, 6));
        
            addButton(hexButtons, "A");
            addButton(hexButtons, "B");
            addButton(hexButtons, "C");
            addButton(hexButtons, "D");
            addButton(hexButtons, "E");
            addButton(hexButtons, "F");
            
            
            JPanel switchButton = new JPanel(new GridLayout(1,1));
           
           
            contentPane.add(hexButtons, BorderLayout.PAGE_END);
            
            hexButtons.setVisible(false);
            
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
        
        boolean hex = checkbox.isSelected();
        
        if (hex)
        {
            redisplay();
        }
        else
        {
          super.redisplay();  
        }
   
    }

  protected void redisplay() {
       
      int value = calc.getDisplayValue();
      String hexValue = Integer.toHexString(value).toUpperCase();
      display.setText(hexValue);
    }
  
   protected void switchCalc(){
       isHex=checkbox.isSelected();
        if(checkbox.isSelected()){
        hexButtons.setVisible(true);
        
        }
        else{
        hexButtons.setVisible(false);
        
        }
        calc.toggle(isHex);
        
    }
}
