package Lesson_2;

import Lesson_2.notebook.NoteBook;
import Lesson_2.sort.NotebookSort;
import Lesson_2.sort.SelectionSort;

import Lesson_2.lesson.MyArray;
import Lesson_2.lesson.SpeedTest;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArray.isRepeat = false;
        MyArray.isShuffle = true;

        NotebookArray.isShuffle = true;
        final int SIZE = 50000;
//        Integer[] arr = MyArray.getArray(SIZE, 2);
        NoteBook[] notebooks = NotebookArray.getArray(SIZE, 50);

//        System.out.println(Arrays.toString(arr));

        SpeedTest.startTime();

        //sort при 50000
//        SelectionSort.sort(arr); //2062
        NotebookSort.sort(notebooks);//150

        SpeedTest.endTime();

//        System.out.println(Arrays.toString(arr));
        for (NoteBook notebook: notebooks) {
            notebook.printNotebook();
        }

    }
}
