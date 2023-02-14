public class AssassinCreed {

  public static void main(String[] args) {

    // PLease take a year to be checked.
    int year = 1947;
    boolean leap = false;

    // formula
    if (year % 4 == 0) {

      
      if (year % 100 == 0) {

        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      
    
      else
        leap = true;
    }
    
    else
    	 leap = false;
    // final statement print with answer

    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
  }
}