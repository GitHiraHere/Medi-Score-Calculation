

public class Medi_Score {
    public static void takeScore(){ // the main function where the patients score will be recorded7
        int score; // where the final score will be stored
        Observations patientObs = new Observations(0, 0, 12, 88, 36.1);

        if(patientObs.getairOrOxygen() == 0){
            System.out.println("The patient is not on oxygen!");
        } else if(patientObs.getairOrOxygen() == 1){
            System.out.println("The patient is on oxygen!");
        } else{
            System.out.println("Invalid input, error occurred.");
        }

    }
}
