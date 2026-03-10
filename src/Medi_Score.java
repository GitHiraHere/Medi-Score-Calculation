public class Medi_Score {
    private int airOrOxygen; // 0 = not on oxygen, 1 = they are on oxygen
    private int consciousnessLevel; // 0 = alert, 1 = confused, 2 = concerning, 3 = CVPU
    private int respirationRate;
    private int SpO2;
    private double temp;


    public Medi_Score(int airOrOxygen, int consciousnessLevel, int respirationRate, int spO2, double temp){ //parameters
        this.airOrOxygen = airOrOxygen;
        this.consciousnessLevel = consciousnessLevel;
        this.respirationRate = respirationRate;
        this.SpO2 = spO2;
        this.temp = temp;
    }

    // getters - gets the information
    public int getairOrOxygen(){
        return airOrOxygen;
    } public int getConsciousnessLevel(){
        return consciousnessLevel;
    } public int getRespirationRate(){
        return respirationRate;
    } public int getSpO2(){
        return SpO2;
    } public double getTemp(){return temp;
    }

    public String toString(){
        return "Air or oxygen: " + airOrOxygen + ", Conciousness level: " +
                consciousnessLevel + ", Respiration rate: "  + respirationRate +
                ", SpO2 level: " + SpO2 + ", Temperature: " + temp;
    }
}
