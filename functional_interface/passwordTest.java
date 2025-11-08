interface SecurityUtils{
    static boolean isValidPassword(String password){
        if(password.length() < 8) return false;
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
        for(char ch : password.toCharArray()){
            if(Character.isUpperCase(ch)) hasUpper = true;
            else if(Character.isLowerCase(ch)) hasLower = true;
            else if(Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}