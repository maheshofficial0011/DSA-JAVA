# Day 1 — Second Largest Distinct Dry Run

Input: {10, 5, 8, 20, 20, 3}

Initial largest = 10 and hasSecondLargest = false.

| Current | Action | largest | secondLargest | hasSecond |
|---:|---|---:|---:|---|
| 5 | first valid lower candidate | 10 | 5 | true |
| 8 | better than 5 | 10 | 8 | true |
| 20 | new largest; old largest becomes second | 20 | 10 | true |
| 20 | duplicate of largest; ignore | 20 | 10 | true |
| 3 | not better than 10 | 20 | 10 | true |

Final answer: 10.
