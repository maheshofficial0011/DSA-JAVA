# Day 1 — Arrays in Java

## Zero-Based Indexing

For the array {4, 7, 1, 9, 2}, indexes are 0, 1, 2, 3, 4.

The last index is array.length - 1.

## Array Length

array.length returns the number of elements.

## Traversal

A standard traversal is:

    for (int i = 0; i < numbers.length; i++) {
        // process numbers[i]
    }

## Important Edge Case

An empty array has length 0, so accessing numbers[0] causes ArrayIndexOutOfBoundsException.
