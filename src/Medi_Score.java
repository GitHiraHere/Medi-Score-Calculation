public class Medi_Score {
    static void main(String[] args) {
        int score = Medi_Score.takeScore(); // Have to lead with medi_score has takeScore is defined in the class not under main

        System.out.println("Final score: " + score);
    }
    public static int takeScore(){ // the main function where the patients score will be recorded
        int score = 0; // where the final score will be stored
        Observations patientObs = new Observations(2, 0, 17, 95, 37.1);

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
        } else if(patientObs.getRespirationRate() >= 9 && patientObs.getRespirationRate() <= 11){
            System.out.println("Respiratory rate is low, no points added.");
            score += 1;
        } else if(patientObs.getRespirationRate() >= 12 && patientObs.getRespirationRate() <= 20){
            System.out.println("Respiratory rate is good, 0 points have been added");
            // Score 0
        } else if(patientObs.getRespirationRate() >= 21 && patientObs.getRespirationRate() <= 24){
            System.out.println("Respiratory rate is concerning, 2 points have been added");
            score += 2;
        } else if(patientObs.getRespirationRate() >= 25){
            System.out.println("Respiration rate is high, 3 points have been added.");
            score += 3;
        }

        //SpO2 will need to measure if someone is on oxygen or not as well as their spo2 level to determine score
        if(patientObs.getSpO2() <= 83){
            System.out.println("SpO2: Added 3 points to the score.");
                score += 3;
        } else if (patientObs.getSpO2() >= 84 && patientObs.getSpO2() <= 85){
            System.out.println("SpO2: Added 2 points to the score.");
            score += 2;
        } else if (patientObs.getSpO2() >= 86 && patientObs.getSpO2() <= 87){
            System.out.println("SpO2: Added 1 point to the score.");
            score += 1;
        }else if (patientObs.getSpO2() >= 88 && patientObs.getSpO2() <= 92) {
            System.out.println("SpO2: 0 points have been added.");
        }else if (patientObs.getairOrOxygen() == 0 && patientObs.getSpO2() >= 93) {
            System.out.println("SpO2: 0 points have been added.");
        }else if (patientObs.getairOrOxygen() == 2 && patientObs.getSpO2() >= 93 && patientObs.getSpO2() <= 94) {
            System.out.println("SpO2: 1 point has been added.");
            score += 1;
        }else if (patientObs.getairOrOxygen() == 2 && patientObs.getSpO2() >= 95 && patientObs.getSpO2() <= 96) {
            System.out.println("SpO2: 2 points have been added.");
            score += 2;
        }else if(patientObs.getairOrOxygen() == 2 && patientObs.getSpO2() >= 97){
            System.out.println("SpO2: 3 points have been added.");
            score += 3;
        }

        if(patientObs.getTemp() <= 35.0){
            System.out.println("Temp is concerning, added 3 points to the score.");
            score += 3;
        } else if(patientObs.getTemp() >= 35.1 && patientObs.getTemp() <= 36.0){
            System.out.println("Temp is mildly concerning, added 1 point to the score.");
            score += 1;
        } else if(patientObs.getTemp() >= 36.1 && patientObs.getTemp() <= 38.0){
            System.out.println("Temp is fine, 0 points have been added");
        } else if(patientObs.getTemp() <= 39.0) {
            System.out.println("Temp is mildly concerning, added 1 point to the score.");
            score += 1;
        } else if(patientObs.getTemp() >= 39.1){
            System.out.println("Temp is concerning, added 2 points to the score.");
            score += 2;
        }
        return score;
    }
}
