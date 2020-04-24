public class PasswordChecker {

    // a class can have methods and instance varaibles.

    public boolean checkPasswordStrength(String password) {

        int len = password.length();
        if(len < 10)
            return false;

        // String is just an array of characters.
        // abcd : 'a', 'b', 'c', 'd'
        int numcount = 0;
        for (int index = 0; index < len; index++) {
            char ch = password.charAt(index);

            if(ch >= '0' && ch <= '9')
                numcount++;
        }

        if(numcount < 2)
            return false;

        return true;
    }

}
