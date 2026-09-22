# Day 1 — Concept Mistakes

## Even Number Check

Correct condition:

```java
number % 2 == 0
```

## Reverse

Traversing backward does not modify the array. Use two pointers, swap, then move inward.

## Max/Min Initialization

Do not initialize max/min to 0 because an all-negative array would fail.

```java
int maximum = numbers[0];
int minimum = numbers[0];
```

## `!hasSecondLargest`

`hasSecondLargest` means a valid second-largest distinct value has been found. Therefore `!hasSecondLargest` means no valid second-largest distinct value has been found yet.
