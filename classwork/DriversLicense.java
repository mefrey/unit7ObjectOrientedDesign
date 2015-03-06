import java.util.GregorianCalendar;
public class DriversLicense extends Card
{
    private String expirationDate;
    
   public DriversLicense(String n, String expDate)
   {
        super(n);
        expirationDate = expDate;
   }


    public String format()
   {
      return super.format()+expirationDate;
   }
   
   public boolean isExpired()
   {
       GregorianCalendar calendar = new GregorianCalendar();
       int intExpirationDate = Integer.parseInt(this.expirationDate);
       int todaysDate = calendar.get(calendar.YEAR);
       if (todaysDate > intExpirationDate)
       {
           return true;
        }
        else
        {
            return false;
        }
    }

}
