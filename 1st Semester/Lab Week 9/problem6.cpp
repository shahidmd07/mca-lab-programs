//Write a C++ program to find the sum of elements of an array using recursion. 

#include <iostream>

using namespace std;

int printSum(int arr[], int n, int i, int sum) {
	if(i == n) {
		return sum;
	}
	
	sum += arr[i];
	
	return printSum(arr, n, i+1, sum);
	
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
	
	int result = printSum(arr, n, 0, 0);
	
	cout << "sum of array: " << result;
	
	return 0;
}
