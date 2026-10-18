# 5. Write a program to calculate the cube of all numbers from 1 to a given number

n = int(input("enter last number: "))
ans = []

for i in range(1, n+1):
    ans.append(i * i * i)
    
print(ans)