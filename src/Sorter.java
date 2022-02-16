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

/**
 * public class Quicksort {
 * public void quicksort (int[] A) {
 * private void quicksort (int[] A, int low, int high) {
 * private void swap (int[] A, int indexl, int index2) {
 * // returns random pivot index between low and high inclusive.
 * private int getPivot (int low, int high) {
 * // moves all n < pivot to left of pivot and all n > pivot
 * // to right of pivot, then returns pivot index.
 * private int partition(int[] A, int low, int high) (
 * public static void main (String[] args) {
 */
public class Sorter
{
    public static void sort(ArrayList<Student> pList)
    {
        quickSort(pList, 0,pList.size() - 1);
    }

    private static int partition(ArrayList<Student> pList, int pFromIndex, int pToIndex)
    {
        //int pivot = pFromIndex + ((int) (Math.random() * pToIndex));
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
        return rightPointerSlider; //???
    }

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

    private static void swap(ArrayList<Student> pList, int pFromIndex, int pToIndex)
    {
        Student temp = pList.get(pFromIndex);

        pList.set(pFromIndex, pList.get(pToIndex));
        pList.set(pToIndex, temp);
    }
}
