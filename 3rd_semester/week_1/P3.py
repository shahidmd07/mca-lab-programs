# 3. Write a program to iterate through a supplied list of 20 numbers and 
#    print only those numbers which are divisible by 5.

arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
n = len(arr)

arr2 = []

for i in range(n):
    if arr[i]%5 == 0:
        arr2.append(arr[i])

print(arr2)