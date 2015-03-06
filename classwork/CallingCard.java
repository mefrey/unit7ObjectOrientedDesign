
public class CallingCard extends Card
{
    private String callingCardNum;
    private String pinNum;


    public CallingCard(String n, String cardNum, String pin)
    {
        super(n);
        callingCardNum = cardNum;
        pinNum = pin;
    }

    public String format()
   {
      return super.format()+callingCardNum+pinNum;
   }
   
   public boolean equals(Object otherObject)
    {
        if (this.getClass() == otherObject.getClass())
        {
            CallingCard other = (CallingCard) otherObject;
            return this.getName().equals(other.getName()) 
                    && this.callingCardNum.equals(other.callingCardNum)
                    && this.pinNum == other.pinNum;
        }
        return false;
    }

}
