public class SixDays {
    public static void printDayTwo () {
        System.out.println("two turtle doves, and");
    }
    public static void printDayThree () {
        System.out.println("three french hens,");
    }
    public static void printDayFour () {
        System.out.println("four calling birds,");
    }
    public static void printDayFive () {
        System.out.println("five gold rings,");
    }
    public static void printDaySix () {
        System.out.println("six geese a-laying,");
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
        System.out.println("a partridge in a pear tree.");
    }

    public static void printIntro(int dayInt) {
        // Translate a number day into a word day. This
        // can also be done with if() statements. i.e.
        // if (day == 1) { } etc.
        String day = "";
        switch (dayInt) {
            case 1: day = String.format("%dst", dayInt); break;
            case 2: day = String.format("%dnd", dayInt); break;
            case 3: day = String.format("%drd", dayInt); break;
            case 4: day = String.format("%dth", dayInt); break;
            case 5: day = String.format("%dth", dayInt); break;
            case 6: day = String.format("%dth", dayInt); break;
        }
        System.out.format("On the %s day of Christmas, my true love sent to me", day);
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