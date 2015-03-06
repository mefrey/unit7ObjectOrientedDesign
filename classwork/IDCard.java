
public class IDCard extends Card
{
    private String idNumber;

    public IDCard(String n, String id)
    {
        super(n);
        idNumber = id;
    }

    public String format()
   {
      return super.format()+idNumber;
   }
   
   public boolean equals(Object otherObject)
    {
        if (this.getClass() == otherObject.getClass())
        {
            IDCard other = (IDCard) otherObject;
            return this.getName().equals(other.getName()) 
                    && this.idNumber.equals(other.idNumber);
        }
        return false;
    }

}
