# 4. Write a program to use a loop to find the factorial of a given number
num=int(input("enter a number :- "))
fact=1
for i in range(1,num+1):
    fact=fact*i
print(fact)
    