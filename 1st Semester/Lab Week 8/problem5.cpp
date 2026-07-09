//Write a C++ program that displays the position or index in the string S where the string T begins, or 1 if S doesn't contain T.

#include <iostream>

using namespace std;

int main() {
	string str, subStr;
	cout << "enter a string: ";
	getline(cin, str);
	
	cout << "enter the substring: ";
	getline(cin, subStr);
	
	int pos = -1;
	for(int i=0; i<=str.length() - subStr.length(); i++) {
		int j;
		for(j=0; j<subStr.length(); j++) {
			if(str[i+j] != subStr[j]) {
				break;
			}
		}
		if(j == subStr.length()) {
			pos = i;
			break;
		}
	}
	
	if(pos != -1) {
		cout << "substring found at index: " << pos << endl;
	} else {
		cout << "1" << endl;
	}
	
	return 0;
	
}
