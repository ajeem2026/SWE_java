import java.util.Random;

public class Birthday {
    
    //Random generator for whole class to share
    Random random = new Random();

    //States declared privately for encapsulation
    //Birthday month
    private String month;
    //Birthday day
    private int day;

    //Static, final array of integers representing number of days in each month

    private static final int [] MONTH_DAYS= {31,29,31,30,31,30,31,31,30,31,30,31};
    private static final String[] MONTHS={"January", "February", "March", "April", "May", "June",
                                    "July", "August", "September", "October", "November", "December"};

    /**
     * Create a new Birthday object with the characteristics as specified by the
     * parameters.
     * @param month of birthday
     * @param day of birthday
     */

    public Birthday(String month, int day) {
        this.month = month;
        this.day = day;
    }

    //Overloading constructor (takes in no parameters)
    public Birthday(){
        int index_month= random.nextInt(MONTHS.length);
        this.month=MONTHS[index_month];
        this.day= random.nextInt(MONTH_DAYS[index_month])+1;  
    }
//
    // ----------- GETTER METHODS ------------
    // (also Accessor methods)

    /**
     * Returns the name of birthday month
     * 
     * @return month
     */
    public String getMonth() {
        return this.month;
    }

    /**
     * Returns the birthday day
     * 
     * @return birthday day
     */
    public int getDay() {
        return day;
    }

    //
    // ------------- SETTERS ----------
    //

    /**
     * Sets month of birthday
     * 
     * @param m the name of the birth month
     */
    public void setMonth(String m) {
        month = m;
    }

    /**
     * Sets the day of birth
     * 
     * @param d the day of birth
     */
    public void setDay(int d) {
        day = d;
    }

    /* ------Part 3------- */

    /**
     * Returns a string representation of the birthday.
     * Format:
     * <br/>Birth Month: 
     * <br/>Birth Day: 
     *
     * @return a string representation of this BirthDay object
     */
    @Override
    public String toString() {
        // Use a StringBuilder: more efficient than concatenating strings.
        StringBuilder rep = new StringBuilder("Birth Month: ");
        rep.append(month);
        rep.append("\n\tBirth day: ");
        rep.append(day);
        return rep.toString();
    }


    @Override
    public boolean equals(Object o) {
        // Follows the _Effective Java_ process
        if( o == this ) {
            return true;
        }

        if( ! ( o instanceof Birthday ) ) {
            return false;
        }

        Birthday other = (Birthday) o;

        if( ! other.getMonth().equals(this.getMonth() ) ) {
            return false;
        }

        if( other.getDay() != this.getDay() ) {
            return false;
        }


        return true;
    }



/**
     * Tests the Birthday Class
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        
        // ---- Step 1: Start with some basic exercising of the 
        // class and use print statements to make sure 
        // class is working to some extent. ----
        
        // Day of Birth: 30, Month: April
        Birthday aBirthday = new Birthday("April", 30);

       
        System.out.println("Abid's birth month is " + aBirthday.getMonth() + " and his birthday is on the "
        + aBirthday.getDay() + "th!");

        // ---- Step 2: create automated tests of Birthday class ----
        //  First, just create an object and test a method, then another, ....
        //  Then, set it up to construct multiple objects and test them.
        System.out.println("\nAutomated testing ....");
        
        String[] month = {"January", "February"};
        int[] day = {10, 20};

        for( int i=0; i < month.length; i++ ) {
            Birthday thisBirthday = new Birthday( month[i], day[i]);

            if( !thisBirthday.getMonth().equals(month[i]) ) {
                System.err.println("Problem likely in constructor setting name");
                System.err.println("\tActual: " + thisBirthday.getMonth());
                System.err.println("\tExpected: " + month[i]);
            }

            if( thisBirthday.getDay() != day[i] ) {
                System.err.println("\tError in birth day " + i );
                System.err.println("\tActual: " + thisBirthday.getDay());
                System.err.println("\tExpected: " + day[i] );
            }

            thisBirthday.setMonth("March");
            thisBirthday.setDay(15);

            if( !thisBirthday.getMonth().equals("March")) {
                System.err.println("Problem likely in setMonth.");
            }

            if( thisBirthday.getDay() != 15) {
                System.err.println("Problem likely in setDay.");
            }
        }
        
        /*For part 3 */

        // Test the toString method
        String expectedRep = "Birth Month: April\n\tBirth day: 30";
        String actualRep = aBirthday.toString();

        if( ! actualRep.equals(expectedRep) ) {
            System.err.println("Problem in toString");
            System.err.println("\tActual: " + actualRep);
            System.err.println("\tExpected: " + expectedRep);
        }

        // Test equals method
       
        Birthday birthday1= new Birthday("January",30);
        Birthday birthday2= new Birthday( "January", 30);
        Birthday birthday3= new Birthday("February", 13);

        if (!birthday1.equals(birthday2)){
            System.err.println("Problem in equals");
            System.err.println("\tActual: " + birthday1.equals(birthday2) );
            System.err.println("\tExpected: " + true);
        }

        if (birthday1.equals(birthday3)){
            System.err.println("Problem in equals");
            System.err.println("\tActual: " + birthday1.equals(birthday3) );
            System.err.println("\tExpected: " + false);
        }

        /*Testing out for Part-4 */

        //Going to test getMonth(), getDay(), toString() and equals() methods 

        Birthday randomBirthday = new Birthday();

        System.out.println("Random month1: " +randomBirthday.getMonth());
        System.out.println("Random day1: " +randomBirthday.getDay());
        System.out.println("String rep: " +randomBirthday.toString());

        Birthday anotherBirthday = new Birthday();

        System.out.println("Random month1: " +anotherBirthday.getMonth());
        System.out.println("Random day1: " +anotherBirthday.getDay());
        System.out.println("String rep: " +anotherBirthday.toString());


        if(randomBirthday.equals(anotherBirthday)){
            System.out.println("Equal Test: No way! You have the same random birthday!");
        }
         else{
            System.out.println("Equal Test: Different random birthdays!");
        }

        //Testing constraints 

        //Check if month is valid

        boolean validMonth = false;

        for (String check_month: MONTHS){
            if (randomBirthday.getMonth().equals(check_month)){
                validMonth=true;
                System.out.println("Constraint test: Random month is valid!");
                break;
            }
        }

        if (!validMonth){
            System.out.println("Month is invalid!");
        }

        //Check if index of month is within range
        int index_month = 15;

        for (int i = 0; i <MONTHS.length;i++){
            if (randomBirthday.getMonth().equals(MONTHS[i])){
                index_month=i;
                System.out.println("Constraint test: Index of month is within range: " +index_month);
                break;
            }
        }

        //Check if correct days in month are assigned

        int correctDays= MONTH_DAYS[index_month];
        if (randomBirthday.getDay()>correctDays || randomBirthday.getDay()<1){
            System.out.print("Constraint test: Inavlid number of days in month!");
        }else{
            System.out.println("Constraint test: You are within the range of days of this month!");
        }
        


    }

}

