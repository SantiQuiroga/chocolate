## Questions:

1. Identify if this problem can be solved with dynamic programming and/or a greedy algorithm.

a) If you say that can be solved with dynamic programming:

  i. Analyze the problem based on sub-problems.

  ii. Identify where the overlap occurs.

  iii. What is the time complexity of your solution?

b) If you say that can be solved with a greedy algorithm:

  i. Identify the greedy choice.

  ii. Explain the optimal substructure.

  iii. What is the time complexity of your solution?

## Answers:

a) 

b) This problem can be solved with a greedy algorithm.

i. The greedy choice here is to always subtract the largest possible number from the current length of the chocolate bar that hasn't been used before. This is because the largest number will always yield the most pieces when the bar is divided.

ii. The optimal substructure comes from the fact that the maximum number of pieces that can be obtained from a bar of length `n` is 1 plus the maximum number of pieces that can be obtained from a bar of length `n - k`, where `k` is the largest integer that hasn't been used before and is less than or equal to `n`.

iii. The time complexity of the solution is O(n), because in the worst case we have to iterate from 1 to n to find the largest number that hasn't been used before and is less than or equal to `n`.
