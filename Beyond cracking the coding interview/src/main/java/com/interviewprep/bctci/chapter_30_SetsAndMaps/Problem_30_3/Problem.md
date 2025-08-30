# MOST FREQUENT OCTET

## Problem statement

You've compiled a list of IP addresses of all the clients connected to your service. Assume all IPs are unique and
follow the IPv4 format, which consists of four 8-bit numbers (called octets) separated by dots. Return the most common
first octet among the connections.

## Constraints

- The length of ips is at most 10^5
- All IPs are unique and follow the IPv4 format
- Each octet is a number between 0 and 255

## Example 1

### Input

ips = ["203.0.113.10", "208.51.100.5", "202.0.2.5", "203.0.113.5"]

### Output

"203". 203 appears twice as the first octet.

## Example 2

### Input

ips = ["10.0.0.1", "10.0.0.2", "192.168.1.1"]

### Output

"10". 10 appears twice as the first octet, while 192 appears once.

## Example 3

### Input

ips = []

### Output

None. There are no IP addresses.