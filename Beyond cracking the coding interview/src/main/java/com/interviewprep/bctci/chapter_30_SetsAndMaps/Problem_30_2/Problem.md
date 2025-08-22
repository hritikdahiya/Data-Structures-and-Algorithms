# MOST SHARED ACCOUNT

## Problem statement

You've compiled a list of IP addresses of all the clients connected to your service and the username associated with
each one. Assume all IPs are unique and username lengths are between 1 and 30. We say a username is being shared if it
appears in two (or more) connections. Return the most shared username. In case of a tie, return any of them.

## Constraints

- The length of connections is at most 10^5
- All IPs are unique
- Username lengths are between 1 and 30 characters
- All usernames contain only lowercase letters

## Example 1

### Input

connections = [("203.0.113.10", "mike"), ("208.51.100.25", "bob"),
("202.0.2.5", "mike"), ("203.0.113.15", "bob2")]

### Output

"mike". User "mike" is connected twice, while other users are
connected once.

## Example 2

### Input

connections = [("1.1.1.1", "alice"), ("1.1.1.2", "bob"),
("1.1.1.3", "alice"), ("1.1.1.4", "bob")]

### Output

"alice". Both "alice" and "bob" are connected twice, so either would
be a valid output.

## Example 3

### Input

connections = []

### Output

None. There are no connections.