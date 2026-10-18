# 1. Write a program to find the product of two user-supplied integers and 
#    if the product is equal to or lower than 5000, then return the sum of the two numbers.

a = int(input("enter a first number: "))
b = int(input("enter a second number: "))

if a * b <= 5000:
    print(a + b)
else:
    print(a * b)
