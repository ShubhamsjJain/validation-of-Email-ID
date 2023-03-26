package SIMPLILEARN.assignmentsSelflearningVideo.validationOfEmailID;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class emailID {

    List <String> emailID = new ArrayList<String>();
    public void arrayOfEmailIDs(String email){

            emailID.add(email);
       // System.out.println(emailID);
    }

    public void searchID(String IDtoSearch){

//        Iterator<String> itr = emailID.iterator();
//
//        while(itr.hasNext()){
//            if(itr.next().equals(IDtoSearch)){
//                System.out.println("Email ID found in the array at index"+ emailID.indexOf(itr.next()));
//            }else{
//                System.out.println("Email ID not found.");
//            }
//            break;
//        }


        for (int i = 0; i < emailID.size(); i++) {

            if(emailID.get(i).equals(IDtoSearch)){
                System.out.println("Email ID found in the array at index"+ i);
            }
        }


    }



}
