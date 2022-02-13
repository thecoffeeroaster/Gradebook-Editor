import java.util.ArrayList;
import java.lang.Comparable;

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
//public class QuickSort
//{
    //public void quicksort (int[] A)
    //{
    //private void quicksort (int[] A, int low, int high)
    //{
    //private void swap (int[] A, int index1, int index2)
    //{
    //private int getPivot(int low, int high)
    //{
    //private int partition (int[] A, int low, int high)
    //{

    public static void sort(ArrayList<Student> pList)
    {
        quickSort(pList, 0, pList.size() -1);
    }

    private static int partition(ArrayList<Student> pList, int pFromIdx, int pToIdx)
    {
        return (pFromIdx + pToIdx)/2;
    }

    private static void quickSort(ArrayList<Student> pList, int pFromIdx, int pToIdx)
    {
        int i =pFromIdx, j =pToIdx;
        Student pvt = pList.get(partition(pList, pFromIdx, pToIdx));
    }

    private static void swap(ArrayList<Student> pList, int pIdx1, int pIdx2)
    {
        //args
    }
}
