public class maillon {

 // variables privées -----------------------------------------------------------------------------

    private int value;

    private maillon next;

 // constructeur ----------------------------------------------------------------------------------

    maillon( int value )
    {
        setValue(value);
        setNext(null);
    }

    maillon(int value, maillon next)
    {
        setValue(value);
        setNext(next);
    }

 // méthodes --------------------------------------------------------------------------------------

    public void add( int value )
    {
        if ( next == null )
            next = new maillon( value );
        else next.add( value );
    }

    public int getLastValue()
    {
        return ( next == null ? getValue() : next.getLastValue() );
    }

    public int getValue()
    {
        return value;
    }

    public maillon next()
    {
        return next;
    }

    public void remove( int value )
    {
        if ( next != null )
            if ( next.getValue() == value )
                next = next.next;
            else next.remove( value );
    }

    public void setNext( maillon next )
    {
        this.next = next;
    }

    public void setValue( int value )
    {
        this.value = value;
    }

    public int size()
    {
        return ( next == null ? 1 : next.size() + 1 );
    }

    public String toString()
    {
        String result = Integer.toString( getValue() );

        if ( next != null )
            result += ", " + next.toString();

        return result;
    }
}