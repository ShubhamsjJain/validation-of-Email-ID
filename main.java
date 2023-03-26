package SIMPLILEARN.assignmentsSelflearningVideo.validationOfEmailID;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Type number of email Id's you want to add: ");
        int n = keyboardInput.nextInt();

        emailID em = new emailID();

        for (int i = 0; i < n; i++) {
            System.out.print("Type your email id: ");
            String email = keyboardInput.next();
            em.arrayOfEmailIDs(email);
        }

        System.out.println("Type ID to search: ");
        String IDtoSearch = keyboardInput.next();
        em.searchID(IDtoSearch);







    }
}
