public class BirthdayParadox {

    /**
     * This method will find duplicates within random birthdays by comparing them in an array
     * @param int number of people 
     */

    //First, I need a method to find duplicates
    public static boolean DuplicateFinder(int num_people) {
        //Array to store random birthdays
        Birthday[] random_birthday_list = new Birthday[num_people];

        // Random birthdays made using the no-parameter constructor
        //Storing each random birthday in my birthday list array
        for (int i = 0; i < num_people; i++) {
            random_birthday_list[i] = new Birthday();  
        }

        // Check for duplicates and return true if duplicate has been found
        for (int i = 0; i < num_people; i++) {
            for (int j = i + 1; j < num_people; j++) {
                if (random_birthday_list[i].equals(random_birthday_list[j])) {
                    return true; 
                }
            }
        }

        return false; 
    }

    /**
     * This method will find duplicates within random birthdays by comparing them in an array
     * @param int number of people 
     * @param int number of trials
     */

    //Secondly, I need a method to keep track of my positive trials 
    public static int positiveTrial(int num_people, int num_trials) {
        //Note that a positive trial means that there was at least one pair of people with the same birthday. 
        //There could be more than one pair with the same birthday in a trial, but that only counts as one positive trial.
        int positive_trials = 0;

        for (int i = 0; i < num_trials; i++) {
            //If I find a duplicate birthday, I increment my positive trials counter
            if (DuplicateFinder(num_people)) {
                positive_trials++;
            }
        }

        return positive_trials;
    }


    public static void main(String[] args) {
        // magic number for experiments
        int num_trials = 30;

        //Extra-credit part

        if (args.length > 0) {
            //parseInt used to convert argument from a string to integer
            num_trials = Integer.parseInt(args[0]); 
        } else {
            //resort to default value
            num_trials = 30; 
        }



        // Formatting for the output table
        System.out.printf("%-15s%-17s%-19s%-9s%n", "# People", "# Trials", "# Positive", "Pct");
        System.out.println("--------       --------         ----------      ------");

        // Run the experiment with different numbers of people: from 5 to 100 people, in 5-person increments.
        for (int num_people = 5; num_people <= 100; num_people += 5) {
            int num_positive_trials = positiveTrial(num_people, num_trials);

            // Calculating Pct of positive trials
            double percentage = (num_positive_trials * 100.0) / num_trials;

            // Print the result in table format
            System.out.printf("%8d%15d%19d%12.1f%n", num_people, num_trials, num_positive_trials, percentage);
        }
    }
}
