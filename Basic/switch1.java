
public  class switch1 {
    public static void whichWeekDay(int day) {
        String result;
        result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        }; 
        System.out.println(result);
    }
    public static void main(String[] args) {
        whichWeekDay(2);
    }
}