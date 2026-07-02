//Write a C++ program to reverse a string using pointers.

#include <iostream>
#include <cstring>  
using namespace std;

int main() {
    char str[100];
    cout << "Enter a string: ";
    cin.getline(str, 100);   

    char *start = str;                 
    char *end = str + strlen(str) - 1; 

    while (start < end) {
        
        char temp = *start;
        *start = *end;
        *end = temp;

        
        start++;
        end--;
    }

    cout << "Reversed string: " << str << endl;
    return 0;
}
 


