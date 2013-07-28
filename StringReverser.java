package home;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Free Lunch
 * Date: 7/22/13
 * Time: 6:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringReverser
{
    private String forwards, reverse;

    public StringReverser()
    {
        forwards = "";
        reverse = "";
    }

    public String getForwards()
    {
        return forwards;
    }

    public String getReverse()
    {
        return reverse;
    }

    public void reverser()
    {
        forwards = JOptionPane.showInputDialog("What string would you like to reverse?");
        reverseString();
        displayString();
    }

    private void reverseString()
    {
        for (int i = 1; i <= forwards.length(); i++)
        {
            reverse += forwards.charAt(forwards.length() - i);
        }
    }

    private void displayString()
    {
        String msg = "<html>We've reversed the string for you!<br><b>Original String: </b>" + forwards
                + "<br><b>Reversed String: </b>" + reverse + "</html>";
        JLabel label = new JLabel (msg);
        label.setFont(new Font("serif", Font.PLAIN, 14));
        JOptionPane.showMessageDialog(null, label );
    }
}
