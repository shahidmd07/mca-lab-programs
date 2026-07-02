//Write a C++ program to concatenate two strings using pointers.

#include <iostream> 

using namespace std;

int main() {
	char str1[100], str2[100];
	char *ptr1, *ptr2;
	
	cout << "enter first string: ";
	cin >> str1;
	cout << "enter second string: ";
	cin >> str2;
	
	ptr1 = str1;
	
	while(*ptr1 != '\0') {
		ptr1++;
	} 
	
	ptr2 = str2;
	while(*ptr2 != '\0') {
		*ptr1 = *ptr2;
		ptr1++;
		ptr2++;
	}
	
	*ptr1 = '\0';
	
	cout << " concatenated string: " << str1 << endl;
	
	return 0;
}
