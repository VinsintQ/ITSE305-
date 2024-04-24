
public class Business {
    // validate inputs

    // mathod validate variables is not empty
    public boolean Empty(String V) {
        if (V.isEmpty()) {

            return true;
        } else {
            return false;
        }

    }

    public boolean NotNum(String Num) {

        if (Num.matches("[0-9]+")) {
            return false;
        } else {
            return true;
        }

    }

}
