#20. Valid Parentheses
<br><b>Easy</b>

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:<br>
1. Open brackets must be closed by the same type of brackets.<br>
2. Open brackets must be closed in the correct order.<br>
3. Every close bracket has a corresponding open bracket of the same type.<br>

<b>Example 1:<br>
Input: s = "()"<br>
Output: true <br>

Example 2:<br>
Input: s = "()[]{}" <br>
Output: true <br>

Example 3:<br>
Input: s = "(]"<br>
Output: false<br>

Constraints:<br>
1 <= s.length <= 10*4
s consists of parentheses only '()[]{}'