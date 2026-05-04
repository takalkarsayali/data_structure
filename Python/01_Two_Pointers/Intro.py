"""
~ Core Concept ~

Definition:
    An algorithm that uses two variables (pointers) representing indices or positions in a data structure (like an array or linked list).

The Problem it Solves: 
    Traditional nested loops take O(n^2) time. 
    Two pointers often reduce this to O(n) by taking advantage of the data's "predictable dynamics" (e.g., sorted order).

~ Key Traversal Strategies ~

Inward Traversal: 
    Pointers start at opposite ends and move toward each other.
    Best for: Comparing elements from different ends (e.g., Pair Sum - Sorted or Is Palindrome Valid).

Unidirectional Traversal: 
    Both pointers start at the same end and move in the same direction.
    Best for: One pointer finding data while the other tracks a specific location (e.g., Shift Zeros to the End).

Staged Traversal: 
    The first pointer searches for a specific condition; once met, the second pointer performs a task.
    Best for: Multi-step logic (e.g., Next Lexicographical Sequence).

~ When to Apply It ~
(Predictable Dynamics)

1. Linear Data Structures: 
     Use with arrays or linked lists.
2. Sorted Data: 
    When the input is sorted, you can predict how moving a pointer will change the value (e.g., moving right increases the value).
3. Pair/Triplet Search: 
    When the problem asks for a pair of values or a result derived from two specific elements.

~ Real-World Application ~

Garbage Collection: 
    Used in memory compaction -> 
        A "scan" pointer identifies live objects while a "free" pointer tracks available space to relocate them, efficiently grouping live objects together.

"""
print("Introduction to Two Pointer")