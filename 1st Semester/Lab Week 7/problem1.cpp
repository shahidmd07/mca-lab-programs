//Write a C++ Program to Count vowels in a String Using a Pointer 

#include <iostream>
#include <cstring>

using namespace std;

int main() {
	char str[100];
	cout << "enter a string: ";
	cin.getline(str, 100);
	
	char *ptr = str;
	int count = 0;
	
	while(*ptr != '\0' ) {
		char ch = *ptr;
		if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o'|| ch == 'u' || ch == 'A' || ch == 'E'|| ch == 'I' || ch == 'O'|| ch == 'U') {
			count++;
		}
		ptr++;
	}
	
	cout << "number of vowels in string is = " << count << endl;
	
	return 0;
}
