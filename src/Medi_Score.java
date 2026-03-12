public class Medi_Score {
    public static int takeScore(){ // the main function where the patients score will be recorded7
        int score = 0; // where the final score will be stored
        Observations patientObs = new Observations(0, 0, 12, 88, 36.1);

        if(patientObs.getairOrOxygen() == 0){
            System.out.println("The patient is not on oxygen!");
        } else if(patientObs.getairOrOxygen() == 2){ // if the patient is on oxygen they score 2 to maintain oxygen saturation level (Spo2)
            score += 2;
            System.out.println("The patient is on oxygen!");
            // score is 0, nothing added
        } else{
            System.out.println("Invalid input, error occurred.");
        }

        if(patientObs.getConsciousnessLevel() == 0){
            System.out.println("Patient is conscious.");
            // score is 0, nothing added
        } else {
            System.out.println("CVPU - added 3 to the score.");
            score += 3;
        }

        if(patientObs.getRespirationRate() <= 8){
            System.out.println("Respiratory rate concerningly low, 3 points added.");
            score += 3;
        } else if(patientObs.getRespirationRate() == 9 || patientObs.getRespirationRate() == 10 ||
                patientObs.getRespirationRate() == 11){
            System.out.println("Respiratory rate is mildly low, no points added.");
            score += 1;
        } else if(patientObs.getRespirationRate() >= 12 && patientObs.getRespirationRate() <= 20){
            System.out.println("Respiratory rate is good, 0 points have been added");
            // Score 0
        } else if(patientObs.getRespirationRate() == 21 || patientObs.getRespirationRate() == 22 ||
                patientObs.getRespirationRate() == 23 ||  patientObs.getRespirationRate() ==24){
            System.out.println("Respiratory rate is concerning, 2 points have been added");
            score += 2;
        } else if(patientObs.getRespirationRate() >= 25){
            System.out.println("Respiration rate is high, 3 points have been added.");
            score += 3;
        }

        return score;
    }
}
