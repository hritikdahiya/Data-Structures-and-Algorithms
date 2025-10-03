# PARALLEL COMPILATION

## Problem statement

A compiler needs to compile a program consisting of n packages, numbered from 0 to n - 1. We are given an array of n
positive integers, seconds, where seconds[i] indicates the time it takes to compile package i, in seconds. An additional
array, imports, of length n, specifies the package dependencies, where imports[i] is the list of packages that package i
depends on.

Determine the minimum time required to compile the entire program.

## Constraints

- There are no circular dependencies (no cycles in the dependency graph).
- We cannot start compiling a package until all the packages it depends on have finished compiling.
- There is no limit to how many packages can be compiled in parallel, provided they don't depend on each other.
- The program is considered fully compiled when all packages are compiled.

## Example 1

### Input

seconds = [10, 20, 30],
imports = [
[],
[],
[0, 1]
]

### Output

50

Packages 0 and 1 can be compiled in parallel.
Package 2 takes 30s and cannot start until packages 0 and 1 finish, which
takes 20s.

## Example 2

### Input

seconds = [10, 20, 30],
imports = [
[],
[],
[]
]

### Output

30

We can compile all packages in parallel.