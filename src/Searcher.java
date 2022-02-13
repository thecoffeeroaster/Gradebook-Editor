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

public class Searcher //Josh is going to complete
{
    public static int search(ArrayList<Student> pList, String pKey)
    {
        for(int i = 0; i < pList.size(); i++)
        {
            if(pKey.equals(pList.get(i).getLastName()))
            {
                return i;
            }
            else
            {
                return -1;
            }
        }
    }
}
