package Lesson_2;

import Lesson_2.sort.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArray.isRepeat = false;
        MyArray.isShuffle = true;
        final int SIZE = 50000;
        Integer[] arr = MyArray.getArray(SIZE, 2);

//        System.out.println(Arrays.toString(arr));

        SpeedTest.startTime();

        //sort при 50000
        SelectionSort.sort(arr); //2062

        SpeedTest.endTime();

//        System.out.println(Arrays.toString(arr));

    }
}
