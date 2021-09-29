# Java Sorting App


This is an example of a simple sorting app. The program provides the user with the ability to generate an array of a given length, then choose the method in which it should be sorted.

### Table of Contents
- ######  BubbleSort
- ######  MergeSort
- ######  QuickSort

## BubbleSort
BubbleSort will sort an array by 'floating' higher values towards the end of the array, allowing lower values to 'sink' to the start.

__Algorithm__

![A picture](ReadmeExtras/BubbleSortAlgo.png)

__PseaudoCode__

![A picture](ReadmeExtras/BubbleSortPseudo.png)

__Demonstration__

![A picture](ReadmeExtras/Bubble-sort-anim.gif)

__Space and Time Complexity__

![A picture](ReadmeExtras/BubbleSortStats.png)

###### Wikipedia Link - more info
https://en.wikipedia.org/wiki/Bubble_sort



## MergeSort
MergeSort implements a 'divide and conquer' like algorithm. It breaks an array into ever smaller arrays, before merging them back together, sorting them as they go. Finally we end up with one array again, all sorted.

__Algorithm__

![A picture](ReadmeExtras/MergeSortAlgo.png)

__PseaudoCode__

![A picture](ReadmeExtras/MergeSortPseudo.png)

__Demonstration__

![A picture](ReadmeExtras/Merge-sort-anim.gif)

__Space and Time Complexity__

![A picture](ReadmeExtras/MergeSortStats.png)

###### Wikipedia Link - more info
https://en.wikipedia.org/wiki/Merge_sort



## QuickSort
Quicksort works by picking a pivot in the array, the elements of the array are then sorted based on whether they are higher or lower than the pivot, left for low, right for high. The pivot then moves based on the values left and right of it, sorting based on higher/lower at every pivot point.

__Algorithm__

![A picture](ReadmeExtras/QuickSortAlgo.png)

__PseaudoCode__

![A picture](ReadmeExtras/QuickSortPseudo.png)

__Demonstration__

![A picture](ReadmeExtras/Sorting_quicksort_anim.gif)

__Space and Time Complexity__

![A picture](ReadmeExtras/QuickSortStats.png)

###### Wikipedia Link - more info
https://en.wikipedia.org/wiki/Quick_sort