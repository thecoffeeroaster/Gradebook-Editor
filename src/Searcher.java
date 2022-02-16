/************************************************************************************************
 * CLASS: Searcher (Searcher.java)
 *
 * DESCRIPTION
 * (ENTER DESCRIPTION)
 *
 * COURSE AND PROJECT INFORMATION
 * CSE 205 Object Oriented Programming and Data Structures, Spring A 2022
 * Project Number: project-3
 *
 * AUTHORS: Joshua McKenzie, ASU ID: 1209056897, jsmckenz@asu.edu
 *        | Sean Loehr, ASU ID: 1222435526, smloehr@asu.edu
 ************************************************************************************************/
import java.util.ArrayList;




// * This is the iterative binary search algorithm for the searching class.
// *
// * @param pList ArrayList<Student>
// * @param pFromIndex int
// * @param pToIndex int
// * @return -1
//



public class Searcher {
    public static int search(ArrayList<Student> pList, String pKey)
    {
        int pLow = 0;
        int pHigh = pList.size() - 1;
        while (pLow < pHigh)
        {
            int pMiddle = (pLow + pHigh) / 2;
            int compare = pKey.compareToIgnoreCase(pList.get(pMiddle).getLastName());
            if (compare == 0) {
                return pMiddle;
            } else if (compare < 0) {
                pHigh = pMiddle - 1;
            } else {
                pLow = pMiddle + 1;
            }

        }
        return -1;
    }
}

//    public static int search(ArrayList<Student> pList, String pKey)
//    {
//        for(int i = 0; i < pList.size(); i++)
//        {
//            if(pKey.equals(pList.get(i).getLastName()))
//            {
//                return i;
//            }
//        }
//        return -1;
//    }
