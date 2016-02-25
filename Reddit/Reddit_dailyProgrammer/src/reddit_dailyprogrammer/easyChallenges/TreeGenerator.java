package reddit_dailyprogrammer.easyChallenges;

//https://www.reddit.com/r/dailyprogrammer/comments/1t0r09/121613_challenge_145_easy_tree_generation/
public class TreeGenerator {
            
    public static void main( String[] args ) {
        int numberOfBaseLeafs = 15;
        String trunkCharacter = "|";
        String leafsCharacter = "^";
        
        if ( numberOfBaseLeafs % 2 == 0)
            numberOfBaseLeafs--;
        
        String leafs = generateTree ( numberOfBaseLeafs, leafsCharacter, 0 );
        String trunk = generateTrunk ( numberOfBaseLeafs, trunkCharacter );
        String tree = leafs + trunk;
        
        System.out.println(tree);
    }
    
    private static String generateTree ( int numberOfBaseLeafs, String leafsCharacter, int level )
    {
        String tree = "";
        if ( numberOfBaseLeafs  <= 2 )
            tree = alignLevel ( level, "*" ) + "\n";
        else
        {
            for ( int i = 0; i < numberOfBaseLeafs; i++ )
                tree = tree + leafsCharacter;
            tree = alignLevel( level, tree ) + "\n";
            tree = generateTree( numberOfBaseLeafs - 2, leafsCharacter, level + 1 ) + tree;
        }
        return tree;
    }
    
    private static String generateTrunk ( int numberOfBaseLeafs, String trunkCharacter )
    {
        String trunk = trunkCharacter + trunkCharacter + trunkCharacter;
        int whiteSpaces = ( numberOfBaseLeafs - 3 ) / 2;
        
        for ( int i = 0; i < whiteSpaces; i++ )
            trunk = " " + trunk + " ";
        return trunk;
    }
    
    private static String alignLevel ( int numberOfSpaces, String line )
    {
        for (int i = 0; i < numberOfSpaces ; i++)
            line = " " + line + " ";
        return line;
    }
}
