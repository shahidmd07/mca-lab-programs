# 2. Write a program to count the total number of digits in a number using a while loop
num=int(input("enter a number :- "))
temp=num
rev=0
count=0
while temp>0:
    temp=temp//10
    count+=1
print(count)