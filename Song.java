
/**
 * Programming with Java lyrics
 * 
 * @danielamoreno 
 * @oct72016
 */
public class Song
{
    public void refrain () {
        System.out.println();
        System.out.println("I once wrote a program that wouldn't compile");
        System.out.println("I don't know why it wouldn't compile,");
        System.out.println("My TA just smiled.");
    }

    public void verse1 () {
        // verse 2
        System.out.println("So I added some a println()" ); // new lines for this verse
        System.out.println("But it was not fine " ); // new lines for this verse

    }

    public void verse2 () {
        System.out.println("Inserted some comments in Javadoc format" ); // new lines for this verse
        System.out.println("But I was still striking out at bat" ); // new lines for this verse
    }

    public void verse3 (){
        System.out.println("Tried returning a value instead of a void" ); // new lines for this verse
        System.out.println("But problems continued I could not avoid" ); // new lines for this verse

    }

    public void fullSong ()
    {
        refrain ();
        
        refrain ();
        verse1 ();

        refrain ();
        verse1 ();
        verse2 ();

        refrain ();
        verse1 ();
        verse2 ();
        verse3 ();

       
    }
}