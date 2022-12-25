public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Task 1");
        int i = 1;
        byte b = 2;
        short s = 123;
        long l = 123456849L;
        float f = 134.55f;
        double db = 3423423423.432432;
        System.out.println("The value of the variable i of the type int is " + i);
        System.out.println("The value of the variable b of the type byte is " + b);
        System.out.println("The value of the variable s of the type short is " + s);
        System.out.println("The value of the variable l of the type long is " + l);
        System.out.println("The value of the variable f of the float is " + f);
        System.out.println("The value of the variable db of the type double is " + db + "\n");

    }

    public static void task2 () {
        System.out.println("Task 2 (no output) \n");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2786;
        int d = 569;
        float e = -159f;
        var df = 27897;
        byte bb = 67;
    }
    public static void task3 () {
        System.out.println("Task 3");
        int liudmila = 23;
        int anna = 27;
        int kate = 30;
        int paperSheets = 480;
        double sheetsPerStudent = paperSheets / (liudmila + anna + kate);
        System.out.println("For each student " + sheetsPerStudent + " paper sheets are available\n");
    }

    public static void task4 () {
        System.out.println("Task 4");
        int bottles = 16; // pieces
        int timeBottles = 2; // min
        int eff = bottles / timeBottles; // pieces/min
        int time1 = 20;
        int time22 = 1;
        int time2 = time22*24;
        int time33 = 3;
        int time3 = 3*24;
        int time4 = 1;
        int time44 = time4*30*24;
        int bottles1 = eff  * time1;
        int bottles2 = eff * time2;
        int bottles3 = eff * time3;
        int bottles4 = eff * time44;
        System.out.println("In " + time1 + " minutes the machine produced " + bottles1 + " bottles");
        System.out.println("In " + time22 + " day the machine produced " + bottles2 + " bottles");
        System.out.println("In " + time33 + " days the machine produced " + bottles3 + " bottles");
        System.out.println("In " + time4 + " month the machine produced " + bottles4 + " bottles\n");

    }
    public static void task5 () {
        System.out.println("Task 5");
        int overallPaintPieces = 120;
        int whitePerRoom = 2;
        int brownPerRoom = 4;
        int rooms = overallPaintPieces / (whitePerRoom + brownPerRoom);
        int whiteOverall = rooms * whitePerRoom;
        int brownOverall = rooms * brownPerRoom;
        //System.out.println("At school with " + rooms + " rooms, they need " + whiteOverall + " jars of white paint and " + brownOverall + " jars of brown paint\n");
        System.out.printf("At school with %d rooms, they need %d jars of white paint and %d jars of brown paint\n\n", rooms, whiteOverall, brownOverall);
    }
    public static void task6 () {
        System.out.println("Task 6");
        int bananas = 5; //pieces
        int weightBanana = 80; //g
        int milk = 200; //mL
        float densityMilk = 1.05f; //kg/L
        int eggs = 4;
        int weightEgg = 70;
        double totalWeightG = bananas*weightBanana + milk*densityMilk + eggs*weightEgg;
        double totalWeightKG = totalWeightG/1000;
        System.out.printf("Total weight os the sports breakfast is %.0f g, or %.3f kg\n\n",totalWeightG, totalWeightKG);


    }
    public static void task7 () {
        System.out.println("Task 7");
        int WeightToLose = 7; //kg
        float LosePerDayMin = 0.25f; //kg
        float LosePerDayMax = 0.5f; //kg
        float LosePerDayAve = (LosePerDayMax + LosePerDayMin)/2;
        float daysMin = WeightToLose / LosePerDayMin;
        float daysMax = WeightToLose / LosePerDayMax;
        float daysAve = WeightToLose / LosePerDayAve;
        System.out.printf("To lose weight a sportsman will need %.1f days at least, %.1f days at maximum or %.1f days on average\n\n", daysMin, daysMax, daysAve);
    }
    public static void task8 () {
        System.out.println("Task 8");
        float salaryRaise = 1.1f; //salary raise per year
        int Masha = 67760; //roubles per month
        int Denis = 83690;
        int Kristina = 76230;
        float MashaRaise = Masha * salaryRaise;
        float DenisRaise = Denis * salaryRaise;
        float KristinaRaise = Kristina * salaryRaise;
        int MashaPerYear = Masha * 12;
        int DenisPerYear = Denis * 12;
        int KristinaPerYear = Kristina * 12;
        float MashaRaisePerYear = MashaRaise * 12;
        float DenisRaisePerYear = DenisRaise * 12;
        float KristinaRaisePerYear = KristinaRaise * 12;
        float diffMasha = MashaRaisePerYear - MashaPerYear;
        float diffDenis = DenisRaisePerYear - DenisPerYear;
        float diffKristina = KristinaRaisePerYear - KristinaPerYear;
        System.out.printf("Now Masha wil be earning %.0f roubles. Her year income increased by %.0f roubles\n", MashaRaise, diffMasha);
        System.out.printf("Now Denis wil be earning %.0f roubles. His year income increased by %.0f roubles\n", DenisRaise, diffDenis);
        System.out.printf("Now Kristina wil be earning %.0f roubles. Her year income increased by %.0f roubles\n", KristinaRaise, diffKristina);
    }
}