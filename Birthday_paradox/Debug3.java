/**
 * Original program contains errors.
 * @author Abid Jeem
 *
 * Document the problems you found in comments, i.e., describe what
 * caused the problem in comments.  Make clear that you understand the
 * issues and.  Comment out the original and write the corrected code.
 * 
 * Note that one error is an access modifier error that is not good 
 * OO style.
 * 
 * Make as few changes to the code as necessary to make the code work.
 */

// public class Debug3 {
        
    
    //1. Good OO style dicatates that instance variable should be private
//     // instance variable
//     public int oneVar;

//     // constructor
//     //2. Constructor name should match the class name in Java
       //3. Parameter data type was not declared (we always need to specify data type
       // during declaration in java)
//     public Assign( param ) {
//         oneVar = param;
//         //3. Constructor have NO Return value in Java
//         return this;
//     }

//     //4. Getter method is returning int oneVar but missing return type in signature
//     // an accessor method
//     public getOneVar() {
//         return oneVar;
//     }

    //5. Mutator method should NOT have a return type because it does not have a return value
//     // a mutator method
//     public int increment() {
//         oneVar++;
//     }
    
//     public static void main(String[] args) {

//         //6. We need the new keyword when calling the constructor
            //Calling constructor must match constructor name and, hence, class name
//         Assign3 assign3Var = Assign3(8);

        //7. Method call is missing parentheses: common syntax error
//         System.out.println("assign3var's oneVar is " + assign3Var.getOneVar);

// 	assign3Var.increment();
	
//         int actualValue = assign3Var.getOneVar();
//         int expectedValue = 9;

// 	System.out.println("assign3Var's incremented oneVar is " + actualValue);
	
//         if( actualValue != expectedValue ) {
//             System.out.println("Error incrementing oneVar!");   
//         }
//     }

// }

public class Debug3 {

    // instance variable
    private int oneVar;

    // constructor
    public Debug3( int param ) {
        oneVar = param;
    }

    // an accessor method
    public int getOneVar() {
        return oneVar;
    }

    // a mutator method
    public void increment() {
        oneVar++;
    }
    
    public static void main(String[] args) {

        Debug3 assign3Var = new Debug3(8);

        System.out.println("assign3var's oneVar is " + assign3Var.getOneVar());

	assign3Var.increment();
	
        int actualValue = assign3Var.getOneVar();
        int expectedValue = 9;

	System.out.println("assign3Var's incremented oneVar is " + actualValue);
	
        if( actualValue != expectedValue ) {
            System.out.println("Error incrementing oneVar!");   
        }
    }

}
