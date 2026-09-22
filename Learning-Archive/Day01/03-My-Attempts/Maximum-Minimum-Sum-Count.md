# Day 1 — My First Array Attempts

## Maximum

Store the first element as the current maximum. Traverse from index 1 and replace it when a larger value is found.

Key idea: keep the best value found so far.

Complexity: O(n) time, O(1) auxiliary space.

## Minimum

Use the same pattern as maximum, but compare using less-than.

## Sum

Start with sum = 0 and add every element.

## Count Even Numbers

An even number satisfies number % 2 == 0.

## Important Correction

Initializing max or min with 0 is unsafe for all-negative arrays. Initialize from numbers[0].
