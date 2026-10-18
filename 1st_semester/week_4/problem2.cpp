//Write a C++ program to perform the addition of two numbers without using + operator.

#include <iostream>

using namespace std;

int main() {
    int a, b;
    cout << "Enter two numbers: ";
    cin >> a >> b;

    while (b != 0) {
        int carry = a & b;   
        a = a ^ b;           
        b = carry << 1;      
    }

    cout << "Sum = " << a;
    return 0;
}

