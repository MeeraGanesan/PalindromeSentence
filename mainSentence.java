import java.util.*;
public class mainSentence
{
    public void main()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=SC.nextLine();;
        Sentence s = new Sentence(str);
        boolean pali=s.isPalindrome();
        if (pali==true)
        {
            System.out.println("Palindrome");
        }
        else
        System.out.println("Not palindrome");
    }
}