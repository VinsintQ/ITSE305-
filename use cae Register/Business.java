
public class Business {
    // validate inputs

    // mathod validate variables is not empty
    // Improvement suggestion: Renaming the method to 'isEmpty' for clarity
    // and removing unnecessary if-else statement to simplify the code.
    public boolean Empty(String V) {
        if (V.isEmpty()) {

            return true;
        } else {
            return false;
        }

    }
    // Improvement suggestion: Renaming the method to 'NotNum' to be more descriptive,
    // and simplifying the return statement by directly returning the result of the matches method.
    public boolean NotNum(String Num) {

        if (Num.matches("[0-9]+")) {
            return false;
        } else {
            return true;
        }

    }

}
