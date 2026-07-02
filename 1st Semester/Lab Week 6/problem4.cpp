//Write a C++ Program for Increment and Decrement an Integer Using a Pointer. 

#include <iostream> 

using namespace std;

int main() {
	int num, *ptr;
	
	cout << "enter the number: ";
	cin >> num;
	
	ptr = &num;
	
	cout << "intial value of num = " << num << endl;
	
	(*ptr)++;
	cout << "after increment (using pointer) num = " << num << endl;
	
	(*ptr)--;
	cout << "after decrement (using pointer) num = " << num << endl;
	
	return 0;
	
}
