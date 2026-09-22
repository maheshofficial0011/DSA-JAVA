# Day 1 — Debugging Lessons

## Bug 1 — Output Branch

A version printed the no-second-largest message and then printed the numeric variable afterward.

Fix: make success and failure output mutually exclusive with if/else.

## Bug 2 — Sentinel Confusion

Using Integer.MIN_VALUE as a marker is risky because it is a valid integer input.

Fix: use a state flag when necessary.

## Bug 3 — Unnecessary Nested Loops

The first second-largest attempt used nested loops.

Fix: maintain the required state while scanning once.

## Debugging Habit

1. Reproduce the failure.
2. Find the smallest input that exposes it.
3. Trace variables line by line.
4. Find the first incorrect state.
5. Fix the cause.
6. Retest normal and edge cases.
