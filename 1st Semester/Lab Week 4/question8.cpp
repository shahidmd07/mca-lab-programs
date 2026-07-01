// Write a C++ program to check whether a given 3-digit number is an Armstrong number.

#include<iostream>
#include<cmath>

using namespace std;

int main() {

    long num, real_num;
    int a[3];
    int i = 0, res;

    cout << "Please Enter a 3-DIGIT number: ";
    cin >> num;

    real_num = num;

    while(num > 0) {
        res = num % 10;
        a[i] = res;
        num = num/10;
        i++;
    }

    long counter;

    counter = pow(a[0], 3) + pow(a[1], 3) + pow(a[2], 3);

    if(counter == real_num) {
        cout << "This Number is a ARMSTRONG Number: " << real_num << endl;
    }
    else {
        cout << "Not a ARMSTRONG Number";
    }
    return 0;
}
