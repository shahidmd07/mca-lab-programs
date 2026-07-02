//Write a C++ Example Program for swapping numbers Using Pointers. 

#include <iostream>

using namespace std;

void swapNumbers(int *x, int *y) {
	int temp;
	temp = *x;
	*x = *y;
	*y = temp;
}

int main() {
	int num1, num2;
	
	cout << "enter first number: ";
	cin >> num1;
	cout << "enter second number: ";
	cin >> num2;
	
	cout << " before swapping: num1 = " << num1 << ", num2 = " << num2 << endl;
	
	swapNumbers(&num1, &num2);
	
	cout << " after swapping: num1 = " << num1 << ", num2 = " << num2 << endl;
	
	return 0;
	
} 
