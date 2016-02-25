package reddit_dailyprogrammer;

//https://www.reddit.com/r/dailyprogrammer/comments/1berjh/040113_challenge_122_easy_sum_them_digits/
public class SumThemDigits {
    
    public static void main( String[] args ) {
        int number = 753853495;
        int result = sumDigits (number);
        
        System.out.println("Sum of " + number + " equals to " + result);
    }
    
    private static int sumDigits ( int number )
    {
        if (number > 9)
        {
            int sum = 0;
            char digits[] = ( String.valueOf( number ) ).toCharArray();
            for ( char digit : digits )
                sum = sum + ( Integer.parseInt( String.valueOf( digit ) ) );
            return sumDigits( sum );
        }
        else
            return number;
    }
}
