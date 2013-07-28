package home;
import javax.swing.*;
import java.awt.*;

/**
 * @author theghv
 * @version 1.0
 * Date: 7/22/13
 * Time: 7:21 PM
 */
public class Palindrome
{
    private String inputStr, reverseStr;
    private boolean isPalindrome;

    public Palindrome()
    {
        inputStr = "";
        reverseStr = "";
        isPalindrome = false;
    }

    public void getPalindrome()
    {
        inputStr = JOptionPane.showInputDialog("What word would you like to determine is a palindrome?");
        StringReverser reverser = new StringReverser(inputStr);
        reverser.reverseString();
        reverseStr = reverser.getReverse();
        if (inputStr.equalsIgnoreCase(reverseStr))
        {
            isPalindrome = true;
        }
        displayData();
    }

    private void displayData()
    {
        String msg = "<html><b>You input: </b>" + inputStr + "<br><b>Reversed, the string is: </b>" + reverseStr +
                             "<br><b>Is this string a palindrome? </b>" + isPalindrome + "</html>";
        JLabel label = new JLabel(msg);
        label.setFont(new Font("serif", Font.PLAIN, 14));
        JOptionPane.showMessageDialog(null, label);
    }
}
