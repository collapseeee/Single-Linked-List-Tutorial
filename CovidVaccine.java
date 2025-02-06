import java.util.ArrayList;

public class CovidVaccine {
    private int SID;
    private String firstName;
    private String lastName;
    private String[] vaccineList;

    public CovidVaccine(int SID, String firstName, String lastName, String[] vaccineList) {
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.vaccineList  = vaccineList;
    }

    public String vaccineListToString() {
        String result = "";
        if (vaccineList.length == 0) {
            return "none.";
        }
        for (int i=0; i<=vaccineList.length-2; i++) {
            result = result + vaccineList[i] + ", ";
        }
        result = result + vaccineList[vaccineList.length-1];
        return result;
    }
    @Override
    public String toString() {
        return "[ " + SID + ", " + firstName + " " + lastName + "   Vaccine Taken (" + vaccineList.length + ") : " + vaccineListToString() + ". ]";
    }
}
