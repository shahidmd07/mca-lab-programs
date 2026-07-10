//Write C programs that use both recursive and non-recursive functions to find:
//a) The factorial of a given integer.
//b) To find the greatest common divisor of two given integers.

#include <iostream>

using namespace std;

//Recursive Factorial
int factRecursive(int n) {
	if(n == 1 || n == 0) {
		return 1;
	}
	int fact = factRecursive(n-1);
	int calFact = n * fact;
	
	return calFact;
}

//Non-Recursive Factorial
int factNon_recursive(int n) {
	int fact = 1;
	
	int i;
	for(i=1; i<=n; i++) {
		fact *= i;
	}
	
	return fact;
}

// Recursive GCD
int gcdRecursive(int a, int b) {
    if (b == 0)
        return a;
    else
        return gcdRecursive(b, a % b);
}

// Non-recursive GCD
int gcdNon_recursive(int a, int b) {
    int temp;
    while (b != 0) {
        temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

int main() {
    // Factorial
	int n;
	cout << "enter a number = ";
	cin >> n;
	int resFact1 = factRecursive(n);
	cout << "Recursive Factorial: " << resFact1 << endl;
	int resFact2 = factNon_recursive(n);
	cout << "Non-Recursive Factorial: " << resFact2 << endl; 
    
	// Greatest Common Divisor
    int a, b;
    cout << "enter a number: ";
    cin >> a;
    cout << "enter b number: ";
    cin >> b;
    int resGCD1 = gcdRecursive(a, b);
	cout << "Recursive GCD: " << resGCD1 << endl;
	int resGCD2 = gcdNon_recursive(a, b);
	cout << "Non-Recursive GCD: " << resGCD2 << endl; 
    
    return 0;
}
