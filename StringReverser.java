package home;

import javax.swing.*;
import java.awt.*;

/**
 * @author theghv
 * @version 1.0
 * Date: 7/22/13
 * Time: 6:16 PM
 */
public class StringReverser
{
    private String forwards, reverse;

    public StringReverser()
    {
        forwards = "";
        reverse = "";
    }

    public StringReverser(String forwards)
    {
        this.forwards = forwards;
        reverse = "";
    }

    public String getForwards()
    {
        return forwards;
    }

    public void setForwards(String forwards)
    {
        this.forwards = forwards;
    }

    public String getReverse()
    {
        return reverse;
    }

    public void setReverse(String reverse)
    {
        this.reverse = reverse;
    }

    public void reverser()
    {
        forwards = JOptionPane.showInputDialog("What string would you like to reverse?");
        reverseString();
        displayString();
    }

    public void reverseString()
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
