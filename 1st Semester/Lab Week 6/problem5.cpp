//Write a C++ Program to Print a String Using a Pointer.

#include <iostream>
#include <string>

using namespace std;

int main() {
	char str[] = "Hello World";
	char *ptr = str;
	
	cout << "string printed using pointer: ";
	
	while(*ptr != '\0')  {
		cout << *ptr;
		ptr++;
	}

	cout << endl;	
	return 0;
}
