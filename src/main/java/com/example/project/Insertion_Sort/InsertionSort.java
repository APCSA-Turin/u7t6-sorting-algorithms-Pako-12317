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
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int totalIterations = 0;
        for (int i = 1; i < words.size(); i++) {
            String currentWord = words.get(i);
            int j = i - 1;
            while (j >= 0 && words.get(j).compareTo(currentWord) > 0) {
                words.set(j + 1, words.get(j));
                j--;
                totalIterations++;
            }
            words.set(j + 1, currentWord);
        }
        System.out.println("Insertion Sort: Total iterations = " + totalIterations);
        return words;
    }
    
    public static void selectionSortWordList(ArrayList<String> words) {
        int totalIterations = 0;
        for (int i = 0; i < words.size() - 1; i++) {
            int smallestIdx = i;
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(j).compareTo(words.get(smallestIdx)) < 0) {
                    smallestIdx = j;
                }
                totalIterations++;
            }
            String swap = words.get(i);
            words.set(i, words.get(smallestIdx));
            words.set(smallestIdx, swap);
        }
        System.out.println("Selection Sort: Total iterations = " + totalIterations);
    }

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
