//Write a program for reading elements using a pointer into the array and display the values using an array. 

#include <iostream>

using namespace std;

int main() {
	int n;
	cout << "enter the number of elements: ";
	cin >> n;
	
	int arr[100];
	int *ptr;
	
	ptr = arr;
	
	cout << "enter " << n << " elelemts: ";
	for(int i=0; i<n; i++) {
		cin >> *(ptr + i);
	}
	
	cout << "you entered: ";
	for(int i=0; i<n; i++) {
		cout << arr[i] << " ";
	}
	
	cout << endl;
	
	return 0;	
}
