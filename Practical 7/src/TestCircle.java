/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class TestCircle {
    Circle[] circles = {new ComparableCircle(1.50), new ComparableCircle(2.50)};
    
    public static Circle[] selectionSort(Circle[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int indexOfSmallest = i; // assign the first index of the subarray as the initial indexOfSmallest
            for (int j = i+1; j < arr.length; ++j) {
                if (arr[j].compareTo(arr[indexOfSmallest]) < 0) // if the current array element is smaller than the
                    indexOfSmallest = j; // element at indexOfSmallest, update indexOfSmallest
            }
            // swap the element at indexOfSmallest with the current subarray's first element
            Circle tempArr = arr[indexOfSmallest];
            arr[indexOfSmallest] = arr[i];
            arr[i] = tempArr;
        }
        return arr;
    }
}