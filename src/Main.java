import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Birth Year : ");
        int year = sc.nextInt();
        sc.close();

        int result = year % 12;
        String output = "";

        switch(result){
            case 0 :
                output = "Monkey";
                break;
    
            case 1 :
                output = "Rooster";
                break;
                
            case 2 :
                output = "Dog";
                break;

            case 3 :
                output = "Pig";
                break;
    
            case 4 :
                output = "Rat";
                break;
                
            case 5 :
                output = "Ox";
                break;

            case 6 :
                output = "Tiger";
                break;
    
            case 7 :
                output = "Rabbit";
                break;
                
            case 8 :
                output = "Dragon";
                break;
            
            case 9 :
                output = "Snake";
                break;
    
            case 10 :
                output = "Horse";
                break;
                
            case 11 :
                output = "Sheep";
                break;

        }

        System.out.println("Your Chinese Zodiac Sign is " + output);
    }
}
