//Write a program using a pointer variable to the sum of n elements from the array. 

#include <iostream>

using namespace std;

int main() {
	int n, *ptr, arr[100], sum =0;
	
	cout << "enter number of elements: ";
	cin >> n;
	
	cout << "enter " << n << " elements: ";
	for(int i=0; i<n; i++) {
		cin >> arr[i];
	}
	
	ptr = arr;
	
	for(int i=0; i<n; i++) {
		sum += *ptr;
		ptr++;
	}
	cout << "sum of elements = " << sum << endl;
	
	return 0;
}
