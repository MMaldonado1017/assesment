public class assessmentWk3 {
    //Question 1
    public static void printName() {
        System.out.println("Miguel Maldonado");
    }
    //Question 2
    public static String greetUser(String username) {
        return "Welcome to my website, " + username + "!";
    }
    //Question 3
    public static int starBucks(int dollars) {
        int coffeeChange  = dollars - 1;
        return coffeeChange;
    }
    //Question 4
    public static void myHobbies(String[] hobbies) {
        System.out.println("My hobbies are :");
        for (String hobby : hobbies) {
            System.out.println("- " + hobby);
        }
    }
    //Question 5
    public static String checkWeather(String weatherCondition, int temperature) {
        if (weatherCondition.equals("hot") && temperature > 80) {
            return "Wear shorts";
        } else if (weatherCondition.equals("cool") && temperature > 50) {
            return "Wear wind breakers";
        } else if (weatherCondition.equals("cold") && temperature <= 50) {
            return "Wear a jacket";
        } else {
            return "No such weather condition";
        }
    }
    //Question 6
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }
//Question 7???


    //Question 8


    public static void main(String[] args) {
        printName();
        String username = "MMaldonado1017";
        String greeting = greetUser(username);
        System.out.println(greeting);
        int coffeeChange1 = starBucks(2);
        System.out.println("Your change from your coffee is $ " + coffeeChange1);
        int coffeeChange2 = starBucks(8);
        System.out.println("Your change from your coffee is $ " + coffeeChange2);
        String[] myHobbies = {"watching sports", "video games", "hanging with friends"};
        myHobbies(myHobbies);
        System.out.println(checkWeather("hot", 90));
        double base = 12.0;
        double height = 24.0;
        double area = areaOfTriangle(base, height);
        System.out.println("Area of triangle with base " + base + " and height " + height + " is " + area);



    }




    }





