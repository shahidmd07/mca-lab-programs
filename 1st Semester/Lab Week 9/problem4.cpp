//Write a C++ program to swap two numbers by both call by value and call by reference mechanisms,
//using two functions swap_value() and swap_reference respectively, by getting the choice from the user and executing the user's 
//choice using switch-case.

#include <iostream>

using namespace std;

void swap_value(int x, int y) {
	int temp = x;
	x = y;
	y = temp;
	
	
}

void swap_reference(int &x, int &y) {
	int temp = x;
	x = y;
	y = temp;
}

int main() {
	int a, b, ch;
	
	cout << "enter a number a: ";
	cin >> a;
	
	cout << "enter a number b: ";
	cin >> b;
	
	string str;
	
	cout << "enter a function you want to use for swap: ";
	cin >> ch;
	
	switch(ch) {
		case 1: 
			swap_value(a, b);
			cout << "after swapping a = " << a << " and b = " << b << endl;
			break;
		
		
		case 2:
			swap_reference(a, b);
			cout << "after swapping a = " << a << " and b = " << b << endl;
			break;
		
		
		default: 
			cout << "invalid choice, please choose again. " << endl;
			break;			
	}
	
	return 0;
	
	
}
