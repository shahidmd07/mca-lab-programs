/*A Fibonacci sequence is defined as follows: The first and second terms in the
sequence are 0 and 1. Subsequent terms are found by adding the preceding two
terms in the sequence. Write a C++ program to generate the first n terms of the sequence.*/

#include <iostream>

using namespace std;

void fibonacci(int p, int q, int m) {
	int i = 3;
	while(i <= m) {
		int next = p + q;
		cout << next << " ";
		p = q;
		q = next;
		i++;
	}
}

int main() {
	int n;
	cout << "enter a number: ";
	cin >> n;
	
	if(n < 2) {
		exit;
	}
	
	int a = 0, b = 1;
	cout << "fibonacci sequence: ";
	cout << a << " " << b << " ";
	
	fibonacci(a, b, n);
	
	return 0;
}
