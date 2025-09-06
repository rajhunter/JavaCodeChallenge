# JavaCodeChallenge
# Q1. Restore Finishing Order
**Difficulty:** Easy  
**Points:** 3

---

## Problem Statement
You are given an integer array `order` of length `n` and an integer array `friends`.

- `order` contains every integer from `1` to `n` exactly once, representing the IDs of the participants of a race in their finishing order.
- `friends` contains the IDs of your friends in the race sorted in strictly increasing order.
- Each ID in `friends` is guaranteed to appear in the `order` array.

**Task:**  
Return an array containing your friends' IDs **in their finishing order**.

---

## Examples

### Example 1
**Input:**
```text
order = [3,1,2,5,4]  
friends = [1,3,4]  
