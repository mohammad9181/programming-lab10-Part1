
/**
 * Write a description of class EventPost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EventPost extends Post
{
    // instance variables - replace the example below with your own
    private String caption;

    /**
     * Constructor for objects of class EventPost
     */
    public EventPost(String author, String text)
    {
        super(author);
        caption = text;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getCaption()
    {
        return caption;
    }
}