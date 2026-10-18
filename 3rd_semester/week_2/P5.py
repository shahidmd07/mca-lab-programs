# 5. Write a program to find the sum of the digits of a supplied integer.
num=int(input("enter a number :- "))
sum=0
temp=num
while temp!=0:
    rem=temp%10
    sum+=rem
    temp=temp//10
print(sum)