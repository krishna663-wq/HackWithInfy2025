# Problem 01 - TwoDArray.java – Interval Overlap Counter

This Java program sorts a 2D array of intervals by their start time and counts how many intervals overlap with the previous one.

## 📄 Java File

[👉 Click here to open `TwoDArray.java`](./Greedy%20Approach/TwoDArray.java)


## 🧠 What It Does

- Sorts the 2D array using the first value in each sub-array.
- Iterates through the array to count how many intervals overlap.

## 🔢 Sample Input
```java
int[][] arr = {{1, 3},{2, 4},{3, 5},{0, 6},{5, 7},{8, 9}};
```

## ✅ Output
```
[[0, 6], [1, 3], [2, 4], [3, 5], [5, 7], [8, 9]]
4
```
