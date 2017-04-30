# Stacktest

Test two type of stacks created from StackFactory.jar

# Result

| Method  | Capacity() | isEmpty() | isFull() | peek() | pop() | push() | size() |
|---------|------------|-----------|----------|--------|-------|--------|--------|
| Type 1  | No         | No        | No       | No     | No    | Yes    | No     |
| Type 2  | No         | No        | Yes      | No     | No    | Yes    | Yes    |

# Issue
-For type 1 

Method <b>push()<b>
when add an element over the capacity it should catch <b>IllegalStateException<b>

-For type 2 :
Method <b>push()<b>:
when add an element over the capacity it should catch <b>IllegalStateException<b>
Method <b>isFull()<b>:
when stack is full. It must return true.
Method <b>size()<b>:
when add an element in the stack the size should be 1
