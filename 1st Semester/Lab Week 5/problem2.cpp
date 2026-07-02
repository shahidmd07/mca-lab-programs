//Write a C++ program to find the sum of all the array elements.

#include <iostream>

using namespace std;

int main() {
	int n;
	cout << "enter number of elements: ";
	cin >> n;
	
	int arr[n];
	int sum = 0;
	
	cout << "enter " << n << " elements: ";
	for(int i=0; i<n; i++) {
		cin >> arr[i];
	}
	
	cout << "Sum of all elemets of array: ";
	for(int i=0; i<n; i++) {
		sum += arr[i];
	}
	
	cout << sum << endl;
	
	return 0;
}
