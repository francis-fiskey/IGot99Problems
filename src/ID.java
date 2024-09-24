import java.time.LocalDate;

public class ID {
    // Properties
    private final int _DRINKING_AGE_MINIMUM;
    private String _CustomerBirthday; // needs exception handling or int

    // Constructor(s)
    public ID(int drinkingAgeMinimum, String customerBirthday) {
        this._DRINKING_AGE_MINIMUM = drinkingAgeMinimum * 365;// tech debt - off because of leap yr
        this._CustomerBirthday = customerBirthday;
        System.out.println(CalculateMinimumDrinkingAgeDate());
    }

    // Implementations    
    public boolean CheckDrinkingAge() {
        LocalDate birthday = LocalDate.parse(this._CustomerBirthday);
        LocalDate minDate = LocalDate.parse(this.CalculateMinimumDrinkingAgeDate());
        
        Boolean dateCheck = LocalDate.

        // check if birthday is greater than min drinking age date (which is wrong)
        if ()
    }

    // Helpers
    private String CalculateMinimumDrinkingAgeDate() {
        LocalDate minDrinkingDate = LocalDate.now().minusDays(this._DRINKING_AGE_MINIMUM);
        return minDrinkingDate.toString();
        //Date todayDate = new Date()
    }
}
