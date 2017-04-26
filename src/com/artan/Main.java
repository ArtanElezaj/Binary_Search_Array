package com.artan;

public class Main {

    public static void main(String[] args) {
            int[]array = {0,2,4,8,9,13,20,34,35,65,67};
            System.out.println(binarySearch(array, 34));
        }

        public static String binarySearch(int[] arr, int target) {
            int min = 0;
            int max = arr.length;
            int median;

           while(min <= max){
               median = (min + max) / 2;
                if (arr[median] == target) {
                    return "Found: " + arr[median] + "\nin index: " + median;
                } else if (target < arr[median]) {
                    max = median - 1;
                } else {
                    min = median + 1;
                }

               if(min >= arr.length || max < 0){
                   return "Not found!";
               }
            }

            return "Not found!";
        }
    }

