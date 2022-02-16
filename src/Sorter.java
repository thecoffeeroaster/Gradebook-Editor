import java.util.ArrayList;
import java.lang.Math;
/************************************************************************************************
 * CLASS: Sorter (Sorter.java)
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


public class Sorter
{
    /**
     * This method calls the quicksort method from 0 to pList.size() - 1
     *
     * @param pList ArrayList<Student>
     */
    public static void sort(ArrayList<Student> pList)
    {
        quickSort(pList, 0,pList.size() - 1);
    }

    /**
     * This is the partitioning algorithm for the sorting class.
     * The pivot is chosen by the first element in the list.
     * This incorporates several while loops to iterate through the list,
     * swapping contents as the sliders move towards each other.
     *
     * @param pList ArrayList<Student>
     * @param pFromIndex int
     * @param pToIndex int
     * @return rightPointerSlider int
     */
    private static int partition(ArrayList<Student> pList, int pFromIndex, int pToIndex)
    {
        int pivot = pFromIndex;

        int leftPointerSlider = pFromIndex - 1; // Starts on the left side and moves up the list
        int rightPointerSlider = pToIndex + 1; // Starts on the right side and moves down the list

        while(leftPointerSlider < rightPointerSlider)
        {
            leftPointerSlider ++;
            while(pList.get(leftPointerSlider).getLastName().compareTo(pList.get(pivot).getLastName()) < 0)
            {
                leftPointerSlider ++;
            }

            rightPointerSlider --;
            while(pList.get(rightPointerSlider).getLastName().compareTo(pList.get(pivot).getLastName()) > 0)
            {
                rightPointerSlider --;
            }
            if(leftPointerSlider < rightPointerSlider)
            {
                swap(pList, leftPointerSlider, rightPointerSlider);
            }
        }
        return rightPointerSlider;
    }

    /**
     * This method calls itself recursively to sort the items
     *
     * @param pList ArrayList<Student>
     * @param start int
     * @param end int
     */
    private static void quickSort(ArrayList<Student> pList, int start, int end)
    {
        if (start >= end || end < 0)
        {
            return;
        }
        int theSplit = partition(pList, start, end);

        quickSort(pList, start, theSplit - 1);
        quickSort(pList, theSplit + 1, end);
    }

    /**
     * Swaps the items from pFromIndex to pToIndex
     *
     * @param pList ArrayList<Student>
     * @param pFromIndex int
     * @param pToIndex int
     */
    private static void swap(ArrayList<Student> pList, int pFromIndex, int pToIndex)
    {
        Student temp = pList.get(pFromIndex);

        pList.set(pFromIndex, pList.get(pToIndex));
        pList.set(pToIndex, temp);
    }
}
