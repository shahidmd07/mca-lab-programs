//Write a C++ Program for the Length of a String Using a Pointer.

#include <iostream>

using namespace std;

int main() {
	char str[100];
	cout << "enter a string: ";
	cin.getline(str, 100);
	
	char *ptr = str;
	int length = 0;
	
	while(*ptr != '\0') {
		length++;
		ptr++;
	}
	
	cout << "Length of string using pointer: " << length << endl;
	
	return 0;
}
