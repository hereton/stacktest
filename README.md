# Stacktest

Test two type of stacks created from StackFactory.jar

# Result

|Method|error found   | Type II|
|:-----:|:-------:|:--------:|
|Capacity()|No|No|
|isEmpty()|No|No|
|isFull()|No|Yes|
|peek()|No|No|
|pop()|No|No|
|push()|Yes|Yes|
|size()|No|Yes|

# Issue
- For type 1 

Method <b>push()<b>:
when add an element over the capacity it should catch <b>IllegalStateException<b>

- For type 2 :
Method <b>push()<b>:
when add an element over the capacity it should catch <b>IllegalStateException<b>
Method <b>isFull()<b>:
when stack is full. It must return true.
Method <b>size()<b>:
when add an element in the stack the size should be 1
