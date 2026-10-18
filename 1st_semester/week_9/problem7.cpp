//Write a C++ program to find an array's maximum and minimum elements using recursion. 

#include <iostream>

using namespace std;

int findMaximum(int arr[], int n, int i) {
	if(i == n-1) {
		return arr[i];
	}
	
	int max = findMaximum(arr, n, i+1);
	
	return (arr[i] > max) ? arr[i] : max;
	
}

int findMinimum(int arr[], int n, int i) {
	if(i == n-1) {
		return arr[i];
	}
	
	int min = findMinimum(arr, n, i+1);
	
	return (arr[i] < min) ? arr[i] : min;
	
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
	
	int maximum = findMaximum(arr, n, 0);
	int minimum = findMinimum(arr, n, 0);
	
	cout << "maximum element in array: " << maximum << endl;
	cout << "minimum element in array: " << minimum << endl;
	
	return 0;
}
