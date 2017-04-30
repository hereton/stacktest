# Stacktest

Test two type of stacks created from StackFactory.jar

# Result

| Method  | Capacity() | isEmpty() | isFull() | peek() | pop() | push() | size() |
|---------|------------|-----------|----------|--------|-------|--------|--------|
| Type 1  | No         | No        | No       | No     | No    | Yes    | No     |
| Type 2  | No         | No        | Yes      | No     | No    | Yes    | Yes    |

# Issue
- For type 1 <br>
Method <b>push()</b> :<br>
when add an element over the capacity it should catch <b>IllegalStateException</b>

- For type 2<br>
Method <b>push()</b> :<br>
when add an element over the capacity it should catch <b>IllegalStateException</b><br>
Method <b>isFull()</b> :<br>
when stack is full. It must return true.<br>
Method <b>size()</b> :<br>
when add an element in the stack the size should be 1<br>
