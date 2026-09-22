# Day 1 — Reverse Array Attempt

Simply traversing an array from the last index to the first does not reverse the original array.

The array must actually be modified.

## Correct Pattern

Use two pointers:

- left = 0
- right = numbers.length - 1

While left < right, swap the values and move both pointers inward.

## Complexity

- Time: O(n)
- Auxiliary space: O(1)

O(n/2) simplifies to O(n).
