# TO BE OR NOT TO BE

## Problem statement

Inspired by Shakespeare's iconic line, you decide to write a function, shakespearify(), which takes in a string,
sentence, consisting of lowercase letters and spaces. For each word in the string, the function chooses if it should "
be" or "not be" included in the sentence, returning all possible outcomes. The order of the output strings does not
matter.

## Constraints

- The sentence consists of lowercase letters and spaces.
- The sentence has at most 12 words and at most 100 characters.

## Example 1

### Input

sentence = "I love dogs"

### Output

[
"",
"I",
"love",
"dogs",
"I love",
"I dogs",
"love dogs",
"I love dogs"
]

## Example 2

### Input

sentence = "hello"

### Output

[
"",
"hello"
]

## Example 3

### Input

sentence = ""

### Output

[
""
]