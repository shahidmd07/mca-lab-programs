//Write a C++ Program to Add Two Numbers Using a Pointer.

#include <iostream>

using namespace std;

int main() {
	int num1, num2, sum;
	int *ptr1, *ptr2;
	
	cout << "enter first number: ";
	cin >> num1;
	cout << "enter first number: ";
	cin >> num2;
	
	ptr1 = &num1;
	ptr2 = &num2;
	
	sum = *ptr1 + *ptr2;
	
	cout << "sum = " << sum << endl;
	
	return 0;
	
} 
