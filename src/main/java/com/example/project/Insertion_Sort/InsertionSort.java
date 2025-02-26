package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int count = 0;
        for (int i = 1; i < elements.length; i++) {
            int currentElement = elements[i];
            int j = i - 1;
            while (j >= 0 && elements[j] > currentElement) {
                elements[j + 1] = elements[j];
                j--;
                count++;
            }
            elements[j + 1] = currentElement;
        }
        System.out.println(count);
        return elements;
    }


    public static void selectionSort(int[] elements) {
        int count = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            int smallestIdx = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] < elements[smallestIdx]) {
                    smallestIdx = j;
                }
                count++;
            }
            int swap = elements[i];
            elements[i] = elements[smallestIdx];
            elements[smallestIdx] = swap;
        }
        System.out.println(count);
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
            input.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }


}
