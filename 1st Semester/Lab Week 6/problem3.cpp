//Write a C++ Program to print the address of the Variable Using a Pointer. 

#include <iostream> 

using namespace std;

int main() {
	int num, *ptr;
	
	cout << "enter first number: " << endl;
	cin >> num;
	
	ptr = &num;
	
	cout << "value of num = " << num << endl;
	cout << "Address of num (using &num) = " << &num << endl;
	
	cout << "Address of num (using pointer) = " << ptr << endl;
	cout << "value at that address (using *ptr) = " << *ptr << endl;	
	
	return 0;
	
}
