public class TutorialFifthMain {
    public static void main(String[] args) {
        LinkedList VaccineList = new LinkedList();
        // Students Vaccine List
        CovidVaccine[] applicants = new CovidVaccine[10];
        applicants[0] = new CovidVaccine(101, "Alice", "Johnson", new String[]{"Sinovac", "AstraZeneca"});
        applicants[1] = new CovidVaccine(102, "Bob", "Smith", new String[]{"Pfizer", "Moderna"});
        applicants[2] = new CovidVaccine(103, "Charlie", "Brown", new String[]{"Johnson & Johnson"});
        applicants[3] = new CovidVaccine(104, "David", "Miller", new String[]{"Moderna", "Pfizer", "Sinopharm"});
        applicants[4] = new CovidVaccine(105, "Emily", "Clark", new String[]{"AstraZeneca", "Sinovac"});
        applicants[5] = new CovidVaccine(106, "Frank", "Davis", new String[]{"Sinovac"});
        applicants[6] = new CovidVaccine(107, "Grace", "Wilson", new String[]{"Pfizer", "Moderna", "AstraZeneca"});
        applicants[7] = new CovidVaccine(108, "Henry", "White", new String[]{"Johnson & Johnson", "Pfizer"});
        applicants[8] = new CovidVaccine(109, "Isabella", "Martinez", new String[]{"Moderna", "AstraZeneca"});
        applicants[9] = new CovidVaccine(110, "Jack", "Taylor", new String[]{"Sinopharm", "Sinovac", "Moderna"});
        // End of Students list

        // Insert all student objects from the appliance array to the linked list.
        for (CovidVaccine list : applicants) {
            VaccineList.insert(list);
        }
        divider();
        VaccineList.traverse();
    }

    public static void divider() { // Divider method to separate output action in the console.
        System.out.println("=====================================================================================");
    }
}