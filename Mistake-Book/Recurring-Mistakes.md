# Recurring Mistakes

| Mistake | Prevention |
|---|---|
| Starting max/min from 0 | Initialize from the first element |
| Forgetting zero-based indexing | Last index is length - 1 |
| Not dry-running loops | Trace variables iteration by iteration |
| Ignoring edge cases | Test duplicates, negatives, and small inputs |
| Using nested loops unnecessarily | Look for a one-pass invariant |
| Printing outside the correct branch | Keep success/failure mutually exclusive |

## Rule

Do not just fix a bug. Record why it happened and how to prevent it next time.
