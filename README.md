Collatz
-------

Given any starting number, we can define a sequence using the following
rules to go from one number to the next:

n -> n/2 if n is even
n -> 3n+1 if n is odd

For example, if we start at 17 the sequence generated is

17 -> 52 -> 26 -> 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

It is conjectured that, starting from any positive integer, the sequence
will eventually reach 1.  (However, nobody knows how to prove this.)
It has been checked that this is true for all starting numbers smaller
than 2^60.

As you can see above, the length of the sequence starting at 17 and 
ending at 1 is 13.

Given a positive integer N, find the length of the longest sequence 
that starts at some number between 1 and N and ends as soon as it
reaches 1.

Input
-----

The input will be a single line of the form
k N_1 N_2 N_3 ... N_k
where k and each N_i is a positive integer less than one million.

Output
------

For each input N_i, you should output the length of the longest sequence
that starts at a number between 1 and N_i, and ends as soon as it reaches
1 for the first time.

Sample Input
------------

3 5 10 20

Sample Output
-------------

8
20
21
