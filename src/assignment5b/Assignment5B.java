//Armando Galan-Cedeño  Assignment5B
//CS121 Spring 2020
//March 26, 2020
//Purpose: Temp Convertion Application

package assignment5b;
import javax.swing.JOptionPane;

public class Assignment5B 
{
    public static void main(String[] args) 
    {
        int answer, option;
        double VALUE = 5.0;
        double VALUE2 = 9.0;
        double VALUE3 = 32;
        double temp, C, F;
        
        JOptionPane.showMessageDialog(null,"Welcome to the Temp Conversion Application.");
        
        answer = Integer.parseInt(JOptionPane.showInputDialog("Enter any number "
            + "to begin or a -1 to exit the program."));
        
        while (answer != -1)
        {
            option = Integer.parseInt(JOptionPane.showInputDialog("Enter a 1 to "
                + "find the Celsius equivalent of a Fahrenheit temperature or "
                + "enter a 2 to find the Fahrenheit equivalent of a Celsius "
                + "temperature."));
            
            while (option == 1)
            {
                C = Double.parseDouble(JOptionPane.showInputDialog("Provide a "
                    + "Fahrenheit temperature to find its Celsius equivalent:"));
                
                while (C < -400 || C > 400)
                {
                    C = Double.parseDouble(JOptionPane.showInputDialog("Invalid "
                        + "input: The temperature must be between -400 and 400 "
                        + "degrees."));
                }
                
                temp = celsius(VALUE, VALUE2, VALUE3, C);
                
                String message = String.format("The Fahrenheit temperature of %.1f "
                    + "degrees is the equivalent to %.1f degrees Celsius.", C, temp);
                JOptionPane.showMessageDialog(null, message);
                
                break;
            }
           
            while (option == 2)
            {
                F = Double.parseDouble(JOptionPane.showInputDialog("Provide a "
                    + "Celsius temperature to find its Fahrenheit equivalent:"));
                
                while (F < -400 || F > 400)
                {
                    F = Double.parseDouble(JOptionPane.showInputDialog("Invalid "
                        + "input: The temperature must be between -400 and 400 "
                        + "degrees."));
                }
                
                temp = fahrenheit(VALUE, VALUE2, VALUE3, F);
                
                String message = String.format("The Celsius temperature of %.1f "
                    + "degrees is the equivalent to %.1f degrees Fahrenheit.", F, 
                    temp);
                JOptionPane.showMessageDialog(null, message);
                
                break;
            }
            answer = Integer.parseInt(JOptionPane.showInputDialog("Enter any number "
                + "to continue or a -1 to exit the program."));
        }
    }
    
    public static double celsius(double VALUE, double VALUE2, double VALUE3, double temp)
    {
        double Cel = VALUE / VALUE2 * (temp - VALUE3);
        
        return Cel;
    }
    
    public static double fahrenheit(double VALUE, double VALUE2, double VALUE3, double temp)
    {
        double Fah = VALUE2 / VALUE * temp + VALUE3; 
        
        return Fah;
    }
}
