package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallestIdx]) {
                    smallestIdx = j;
                }
            }
            int swap = arr[i];
            arr[i] = arr[smallestIdx];
            arr[smallestIdx] = swap;
        }

        return arr;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> wordArray) {
        for (int i = 0; i < wordArray.size() - 1; i++) {
            int smallestIdx = i;
            for (int j = i + 1; j < wordArray.size(); j++) {
                if (wordArray.get(j).compareTo(wordArray.get(smallestIdx)) < 0) {
                    smallestIdx = j;
                }
            }
            String swap = wordArray.get(i);
            wordArray.set(i, wordArray.get(smallestIdx));
            wordArray.set(smallestIdx, swap);
        }
        return wordArray;
    }

    //call this method to load 1000 words into list. Use it to test Part B
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordArray) {
        try {
            Scanner fileScanner = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (fileScanner.hasNext()) {
                String term = fileScanner.next();
                wordArray.add(term);
                fileScanner.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordArray;
    }
}
