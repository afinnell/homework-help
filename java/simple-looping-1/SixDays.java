public class SixDays {
    public static void printDayTwo () {
        System.out.println("Two Turtle Doves");
    }
    public static void printDayThree () {
        System.out.println("Three French Hens");
    }
    public static void printDayFour () {
        System.out.println("Four Calling Birds");
    }
    public static void printDayFive () {
        System.out.println("Five Gold Rings");
    }
    public static void printDaySix () {
        System.out.println("Six Geese a-Laying");
    }

    /**
     * This method relies on the fact that switch
     * statements will fall through if a break or return
     * is not used. This way the program does not have
     * to loop through each day. 
     */
    public static void printChristmasSong(int dayInt) {
        printIntro(dayInt);
        switch (dayInt) {
            // NO break;, it will fall through
            case 6: printDaySix();
            case 5: printDayFive();
            case 4: printDayFour();
            case 3: printDayThree();
            case 2: printDayTwo();
            default: printOutro(dayInt);
        }
    }
    
    public static void printOutro(int day) {
        if (day > 1) {
            System.out.print("and ");
        } 
        System.out.println("a Partridge and a Pear Tree.");
    }

    public static void printIntro(int dayInt) {
        // Translate a number day into a word day. This
        // can also be done with if() statements. i.e.
        // if (day == 1) { } etc.
        String day = "";
        switch (dayInt) {
            case 1: day = "First"; break;
            case 2: day = "Second"; break;
            case 3: day = "Third"; break;
            case 4: day = "Fourth"; break;
            case 5: day = "Fifth"; break;
            case 6: day = "Sixth"; break;
            default: day = "Unknown Day"; break;
        }
        System.out.format("On the %s day of Christmas my true love sent to me", day);
        System.out.println();
    }

    public static void main (String[] args) {
        // If a number is specified on the command line
        // print that day of christmas instead. 
        int DAY_OF_CHRISTMAS = 6;
        if (args.length > 0) {
            DAY_OF_CHRISTMAS = Integer.parseInt(args[0]);
        }
        for (int day = 1; day <= DAY_OF_CHRISTMAS; day++) {
            printChristmasSong(day);
            System.out.println();
        }
        
    }
}