//Write a C++ program using pointers to compute the sum, mean, and standard deviation of all elements stored in an array of n real numbers. 

#include <iostream>
#include <cmath>

using namespace std;

int main() {
	int n;
	cout << "enter number of elements: ";
	cin >> n;
	
	double arr[n];
	
	cout << "enter " << n << " real numbers: ";
	for(int i=0; i<n; i++) {
		cin >> arr[i];
	}
	
	double *ptr = arr;
	double sum = 0.0;
	
	//	step 1 = Calculate sum
	for(int i=0; i<n; i++) {
		sum += *(ptr + i);
	}
	
	double mean = sum / n;
	double variance, stddev;
	
	for(int i=0; i<n; i++) {
		variance += pow(*(ptr + i) - mean, 2);
	}
	
	stddev = sqrt(variance / n);
	
	cout << "sum = " << sum << "\n";
	cout << "mean = " << mean << "\n";
	cout << "sd = " << stddev << "\n";
	
	return 0;
	
	
}
