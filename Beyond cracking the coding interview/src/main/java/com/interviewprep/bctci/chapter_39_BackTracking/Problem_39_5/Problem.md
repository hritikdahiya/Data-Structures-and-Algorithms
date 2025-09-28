# THESAURUSLY

## Problem statement

Given a non-empty string, sentence, and a non-empty map, synonyms, where each key is a single word in the sentence, and
its value is a non-empty list of synonyms, return all possible sentences that can be created by replacing the words in
the sentence with their synonyms. Words without synonyms should remain unchanged. The input sentence only contains
lowercase letters and spaces, while the words in synonyms only contain lowercase letters. The order of the generated
sentences in the output does not matter.

## Constraints

- sentence consists of lowercase letters and spaces.
- The length of sentence is at most 500 characters.
- sentence contains at most 100 words.
- The synonyms map contains at most 8 entries.
- The length of each synonym list is at most 6.
- Each word in sentence or in the synonym lists is at most 10 characters.

## Example 1

### Input

sentence = "one does not simply walk into mordor"
synonyms = {
"walk": ["stroll", "hike", "wander"],
"simply": ["just", "merely"]
}

### Output

[
"one does not just stroll into mordor",
"one does not just hike into mordor",
"one does not just wander into mordor",
"one does not merely stroll into mordor",
"one does not merely hike into mordor",
"one does not merely wander into mordor"
]

## Example 2

### Input

sentence = "walk"
synonyms = {
"walk": ["stroll"]
}

### Output

["stroll"]