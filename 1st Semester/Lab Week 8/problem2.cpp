//Write a C++ program to determine whether the given string is a palindrome. 

#include <iostream>

using namespace std;

int main() {
	string str;
	cout << "enter a string: ";
	cin >> str;
	
	int i = 0, j = str.length() - 1;
	bool isPalindrome = true;
	
	while(i < j) {
		if(str[i] != str[j]) {
			isPalindrome = false;
			break;
		}
		i++;
		j--;
	}
	
	if(isPalindrome) {
		cout << str << " is a Palindrome" << endl;
	} else {
		cout << str << " is not a Palindrome" << endl;
	}
	
	return 0;
}
