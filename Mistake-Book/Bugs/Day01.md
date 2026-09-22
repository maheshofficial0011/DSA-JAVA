# Day 1 — Bug Log

## Bug 1: Printing after the if/else

The code printed the 'no second largest' message and then printed the numeric value anyway.

**Lesson:** Make success and failure output mutually exclusive with `if/else`.

## Bug 2: Sentinel value confusion

Using `Integer.MIN_VALUE` as a marker is risky because it is a valid integer input.

**Lesson:** Use a boolean state such as `hasSecondLargest` when the candidate can legitimately equal the sentinel.

## Bug 3: Nested loops

The first second-largest attempt used two loops.

**Lesson:** Maintain the largest and best distinct candidate in one traversal to achieve O(n).
