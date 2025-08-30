# ACTION LOG ANOMALIES

## Problem statement

You are given an action log, log, from a tech support system. Each entry is a tuple [agent, action, ticket_number],
where the ticket number is a positive integer, the agent is a string, and the action is "open" or "close". The log is
sorted chronologically.

Your goal is to find all the tickets with anomalies, in any order. A ticket doesn't have anomalies if:

- It is opened and closed once, in that order.
- The opening and closing agent is the same.
- The agent didn't do any action for a different ticket between opening and closing.

## Constraints

- 0 ≤ log.length ≤ 10^5
- Each ticket_number is a positive integer less than 10^6
- Each agent is a non-empty string
- Each action is either "open" or "close"
- The log is sorted chronologically

## Example 1

### Input

log = [
["Dwight", "close", 2],
["Dwight", "open", 2],
["Drew", "open", 32],
["Drew", "close", 32],
["Drew", "open", 32],
["Drew", "close", 32],
["Susa", "open", 7],
["Jo", "close", 7],
["Susa", "open", 33],
["Jo", "open", 8],
["Jo", "open", 36],
["Jo", "close", 8],
["Susa", "close", 33]
]

### Output

[2, 32, 7, 8, 36]
Explanation:

- 2 was closed before it was opened.
- 32 was opened multiple times.
- 7 was opened and closed by different agents.
- 8 was opened and closed, but the agent did something in between.
- 36 was not closed.

## Example 2

### Input

log = [["Alice", "open", 1], ["Alice", "close", 1]]

### Output

[]
Explanation: The ticket was opened and closed once, in order, by the same
agent.

## Example 3

### Input

log = [["Alice", "open", 1], ["Alice", "open", 1]]

### Output

[1]
Explanation: The ticket was opened multiple times.## Example 4

### Input

log = [
["Drew", "open", 32],
["Drew", "close", 2],
["Drew", "close", 32]
]

### Output

[2, 32]
Explanation:

- 2 was closed without being opened
- 32 was opened but Drew did another action (closing ticket 2) before closing
  it

## Example 5

### Input

log = [
["Dwight", "close", 2],
["Dwight", "open", 2],
["Drew", "open", 32],
["Drew", "open", 2],
["Drew", "close", 32]
]

### Output

[2, 32]
Explanation:

- 2 was closed before being opened, and later opened by a different agent
- 32 was opened but Drew did another action (opening ticket 2) before closing
  it

