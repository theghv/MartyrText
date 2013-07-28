package home;
import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: Free Lunch
 * Date: 7/22/13
 * Time: 7:21 PM
 * To change this template use File | Settings | File Templates.
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

    }
}
