# ACCOUNT SHARING DETECTION

## Problem statement

You've compiled a list of IP addresses of all the clients connected to your service and the username associated with
each one. Assume all IPs are unique and username lengths are between 1 and 30. We say a username is being shared if it
appears in two connections.

If usernames are being shared, return an IP of any of them. Otherwise, return an empty string.

## Constraints

- The length of connections is at most 10^5
- All IPs are unique
- Username lengths are between 1 and 30 characters
- All usernames contain only lowercase letters

## Example 1

### Input

connections = [("203.0.113.10", "mike"), ("298.51.100.25", "bob"),
("292.0.2.5", "mike"), ("203.0.113.15", "bob2")]

### Output

"203.0.113.10".

User "mike" is connected from that IP and "292.0.2.5", so "292.0.2.5" would also be a valid output.

## Example 2

### Input

connections = [("203.0.113.10", "mike"), ("298.51.100.25", "bob"),
("292.0.2.5", "mike"), ("203.0.113.15", "bob2")]

### Output

"111.0.0.0".

Any of the IPs would be a valid output.

## Example 3

### Input

connections = [("111.0.0.0", "mike"), ("111.0.0.1", "mike2"),
("111.0.0.2", "mike3"), ("111.0.0.3", "mike4")]

### Output

""
