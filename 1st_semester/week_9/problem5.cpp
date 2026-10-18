//Write a C++ program to display all array elements using recursion.

#include <iostream>

using namespace std;

void displayArray(int arr[], int n, int i) {
	if(i == n) {
		return;
	}
	
	cout << arr[i] << " ";
	
	displayArray(arr, n, i+1);
}

int main() {
	int n;
	cout << "enter a number of elements: ";
	cin >> n;
	
	int arr[n];
	
	cout << "enter " << n << " elements into a array: ";
	for(int i=0; i<n; i++) {
		cin >> arr[i];
	}
	
	displayArray(arr, n, 0);
	
	return 0;
}
