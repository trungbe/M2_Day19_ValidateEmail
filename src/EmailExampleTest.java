public class EmailExampleTest {

    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        String email = "a@gmail.com"; //kh hop le @gmail.com
        boolean isValid = emailExample.validate(email);
        System.out.println("Email is " + email +" is valid: "+ isValid);
    }
}
