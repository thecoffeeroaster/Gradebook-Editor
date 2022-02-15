import java.util.ArrayList;
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
        quickSort(pList, 0,pList.size() -1);
    }

    private static int partition(ArrayList<Student> pList, int start, int end)
    {
        Student p = pList.get(start);

        int pFromIdx= start -1;
        int pToIdx= end+1;

        while(pFromIdx < pToIdx)
        {
            pFromIdx++;

            while (pList.get(pFromIdx).compareTo(p) < 0)
            {
                pFromIdx++;
            }
            pToIdx--;

            while (pList.get(pFromIdx).compareTo(p) > 0)
            {
                pToIdx--;
            }

            if (pFromIdx < pToIdx)
            {
                swap(pList, pFromIdx, pToIdx);
            }
        }
        return pToIdx;
    }

    private static void quickSort(ArrayList<Student> pList, int start, int end)
    {
        if (start >= end)
        {
            return;
        }
        int p =partition(pList, start, end);

        quickSort(pList, start, end);
        quickSort(pList, p + 1, end);
    }

    private static void swap(ArrayList<Student> pList, int pFromIdx, int pToIdx)
    {
        Student temp = pList.get((pFromIdx));

        pList.set(pFromIdx, pList.get(pToIdx));
        pList.set(pToIdx, temp);
    }
}
