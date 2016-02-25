package reddit_dailyprogrammer;

//https://www.reddit.com/r/dailyprogrammer/comments/45w6ad/20160216_challenge_254_easy_atbash_cipher/
import java.util.ArrayList;
import java.util.List;

public class AtbashCipher {
    
    public static void main( String[] args ) {
        System.out.println("foobar -> " + AtbashCodeDecode("foobar"));
        System.out.println("wizard -> " + AtbashCodeDecode("wizard"));
        System.out.println("/r/dailyprogrammer -> " + AtbashCodeDecode("/r/dailyprogrammer"));
        System.out.println("gsrh rh zm vcznkov lu gsv zgyzhs xrksvi -> " + AtbashCodeDecode("gsrh rh zm vcznkov lu gsv zgyzhs xrksvi"));
        System.out.println("hello world! -> " + AtbashCodeDecode("hello world!"));
    }
    
    private static String AtbashCodeDecode ( String chain )
    {
        String result = "";
        List<Character> alphabet = generateAlphabet( false );
        char[] chainSplitted = chain.toCharArray();
        
        for ( int x = 0; x < chainSplitted.length; x++ )
        {
            int index = alphabet.indexOf( chainSplitted[x] );
            if ( index > -1 )
                result = result + alphabet.get( ( alphabet.size() - 1 ) - index );
            else
                result = result + chainSplitted[x];
        }
        return ( result );
    }
    
    private static List<Character> generateAlphabet( boolean upperCase )
    {
        List<Character> alpha = new ArrayList<>();
        int unicodeStart = 97;
        
        if ( upperCase )
            unicodeStart = 65;
        
        for( int x = 0; x < 26; x++ )
            alpha.add( ( char ) ( unicodeStart + x ) );
        return ( alpha );               
    }
}
