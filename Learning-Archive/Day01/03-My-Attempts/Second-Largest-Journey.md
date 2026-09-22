# Day 1 — Second Largest Distinct Journey

## Challenge

Input: {10, 5, 8, 20, 20, 3}

Expected result: 10.

20 is the largest and 10 is the second-largest distinct value.

## First Approach

A nested-loop approach was attempted.

### Problem

Two nested loops lead to O(n²) time, while the target was O(n).

## One-Pass Idea

Track largest, secondLargest, and hasSecondLargest.

### Invariant

After each element, largest is the largest value seen so far and, when available, secondLargest is the largest distinct value below it.

## Duplicate Handling

For {20, 20, 10}, the second 20 must not become the second-largest distinct value. The candidate must therefore be below largest.

## Why hasSecondLargest?

It tells us whether a valid second distinct value has actually been found. This avoids depending on Integer.MIN_VALUE as a special marker because Integer.MIN_VALUE can be a real input.

## Target Complexity

- Time: O(n)
- Auxiliary space: O(1)
