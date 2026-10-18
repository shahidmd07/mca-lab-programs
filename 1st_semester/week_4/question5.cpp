// Write a C++ program to generate all the prime numbers between 1 and n, where n is a value supplied by the user.

#include <iostream>
using namespace std;

bool isPrime(int num) {
	// 0, 1 are not prime 
    if (num <= 1) {
    	return false;
	}     
	
	// 2 is special case prime 
    if (num == 2) {
    	return true; 
	}
		        
	// even number > 2 are not prime 
    if (num % 2 == 0) {
    	return false;
	}
		   
	// only check odd divisor 
    for (int i = 3; i * i <= num; i += 2) { 
        if (num % i == 0) {
        	return false;
		}
            
    }
    return true;
}

int main() {
    int n;
    cout << "Enter the value of n: ";
    cin >> n;

    cout << "Prime numbers between 1 and " << n << " are: ";

    for (int i = 0; i <= n; i++) {
        if (isPrime(i)) {
            cout << i << " ";
        }
    }

    cout << endl;
    return 0;
}

 
