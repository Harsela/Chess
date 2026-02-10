package chess.study;
public class CustomExp{
public static class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
    public class Validation {
        static void validate(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Invalid Age");
            } else {
                System.out.println("Log in success");
            }
        }
    }
        public static void main(String[]args){
            try {
                Validation.validate(17);
            } catch (InvalidAgeException e) {
               System.out.println(e.getMessage());
            }
        }
    }

