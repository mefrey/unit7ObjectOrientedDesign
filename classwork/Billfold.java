
public class Billfold
{
    private Card card1;
    private Card card2;


    public Billfold(Card cerd1, Card cerd2)
    {
        card1 = cerd1;
        card2 = cerd2;
    }


    public void addCard(Card cerd)
    {
        if(card1.equals(null))
        {
            card1 = cerd;
        }
        else if(card2.equals(null))
        {
            card2 = cerd;
        }
        else
        {
            
        }
        
    }
    
    public String formatCards()
    {
        if(card1!=null && card2!=null)
        {
            return card1.format()+"\n"+card2.format();
        }
        else if(card1!=null)
        {
            return card1.format();
        }
        else if(card2!=null)
        {
            return card2.format();
        }
        else
        {
            return null;
        }
    }


}
