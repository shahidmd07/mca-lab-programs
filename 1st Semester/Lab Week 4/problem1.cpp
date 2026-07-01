//Write a C++ program to check whether a number is even or odd using ternary operator.

#include <iostream>

using namespace std;

void even_odd(int n) {
	string result = (n % 2 == 0) ? "even" : "odd";
	cout << "the number is: " << result << endl;
}

int main() {
	int n;
	cout << "enter a number: ";
	cin >> n;
	 
	if(n != 0) {
		even_odd(n);
	} else {
	 	cout << "the number you entered is niether even nor odd.";
	} 
	return 0;
}
