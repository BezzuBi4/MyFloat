package Float;
public class Main
{
    public static void main (String[] args)
    {
        MyFloat a = new MyFloat(141,1 );
        MyFloat b = new MyFloat(728, 2);

        a.sum(b);
        System.out.println("");
        a.minus(b);
    }
}
