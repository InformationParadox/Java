package Book;

public class Novel implements Readable 
{
    @Override
    public void read() 
    {
        System.out.println("Reading a Novel.");
    }
}
