/*Write a program for reading elements using a pointer into an array and display the values using an array. 
i. Declare a set of elements. 
ii. Declare the pointer and initialize it to the first element's address of a set of elements(array). 
iii. Repeat the loop until the pointer reaches to the last element and displays each element.*/

#include <iostream>
using namespace std;

int main() {
    int arr[5];                  
    int *ptr;                    
    ptr = arr;                   

    cout << "Enter 5 elements: " << endl;

    for (int i = 0; i < 5; i++) {
        cin >> *(ptr + i);      
    }

    cout << "Elements are: ";
    for (int i = 0; i < 5; i++) {
        cout << arr[i] << " ";   
    }

    cout << endl;
    return 0;
}

