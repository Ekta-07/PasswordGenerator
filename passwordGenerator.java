import java.util.*;

public class passwordGenerator {

    public static void main(String[] args) {
        password p = new password();
        p.display();
    }
}

class password {

    private String radomPassGenerator() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String Lowerletters = "abcdefghijklmnopqrstuvwxyz";
        String Upperletters = Lowerletters.toUpperCase();
        String number = "1234567890";
        String symbols = "!@#$%^&*";
        String passwordGenerator = "";
        String password = "";

        System.out.println("Enter the length of your password :");
        int size = sc.nextInt();

        System.out.println(
                "Enter the character set :\n1.Letters Only\n2.Numbers Only\n3.Mix of Letters,Numbers,Special Characters");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                passwordGenerator = Lowerletters + Upperletters;
                break;
            case 2:
                passwordGenerator = number;
                break;
            case 3:
                passwordGenerator = Lowerletters + number +Upperletters + symbols;
                break;
            default:
                System.out.println("Wrong Choice!!!");
        }
        
        for (int i =0 ; i<size;i++){
           int num = random.nextInt(passwordGenerator.length());
           password = password + passwordGenerator.charAt(num);
        }
        
        return password;
    }

    public void display (){
        System.out.println(radomPassGenerator());
    }

}