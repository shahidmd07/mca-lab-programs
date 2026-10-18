# 3. Write a program to display all prime numbers within a range.
start=int(input("enter first number :- "))
end=int(input("enter second number:- "))
ans=[]
if start<2:
    print("enter greater number ")
else:    
    for i in range(start,end):
        flag = True
        for j in range(2,i):
            if i%j==0:
                flag = False               
        if flag:
            ans.append(i)
print(ans)

    
        
    

    