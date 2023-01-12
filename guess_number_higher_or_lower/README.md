<b>#374. Guess Number Higher or Lower</b>
<br><b>Easy</b>

We are playing the Guess Game. The game is as follows:<br>

I pick a number from 1 to n. You have to guess which number I picked.<br>

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.<br>

You call a pre-defined API int guess(int num), which returns three possible results:<br>

-1: Your guess is higher than the number I picked (i.e. num > pick).<br>
1: Your guess is lower than the number I picked (i.e. num < pick).<br>
0: your guess is equal to the number I picked (i.e. num == pick).<br>
Return the number that I picked.<br>

<b>Example 1:</b><br>
Input: n = 10, pick = 6<br>
Output: 6<br>

<b>Example 2:</b><br>
Input: n = 1, pick = 1<br>
Output: 1<br>

<b>Example 3:</b><br>
Input: n = 2, pick = 1<br>
Output: 1<br>

<b>Constraints:</b><br>
1 <= n <= 2 to the 31th power - 1<br>
1 <= pick <= n


