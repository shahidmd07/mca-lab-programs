# 1. Write a program to extract each digit from an integer in reverse order.
num=int(input("enter a number :- "))
temp=num
ans=[]

while temp!=0:
    rem=temp%10
    temp=temp//10
    ans.append(rem)    
print(ans)