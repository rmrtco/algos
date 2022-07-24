
from inspect import stack


def push(stack, elem):
    stack.append(elem)
    print("element ", elem, " pushed to stack successfully")


def pop(stack):
    if(stack):
        return stack.pop()
    else:
        print("stack is empty")


stack = []
push(stack, 23)
push(stack, 33)
push(stack, 43)
push(stack, 53)
print("poped element stack and element is ", pop(stack))
print("stack after popping is :", str(stack))
