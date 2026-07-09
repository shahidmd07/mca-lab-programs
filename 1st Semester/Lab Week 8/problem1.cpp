/*Write a C++ program that uses functions to perform the following operations: 
i. To insert a substring into a given main string from a given position. 
ii. To delete n characters from a given position in a given string.*/

#include <iostream>
#include <string>

using namespace std;

int main() {
	string str, sub, result1 = "", result2 = "";
	int pos, n;
	
	cout << "enter a string: ";
	getline(cin, str);
	
	cout << "enter a subString: ";
	getline(cin, sub);
	
	cout << "enter a position: ";
	cin >> pos;
	
	for(int i=0; i<pos; i++) {
		result1 += str[i];
	}
	
	result1 += sub;
	
	for(int i=pos; i<str.size(); i++) {
		result1 += str[i];
	};
	
	cout << "after insert: " << result1 << endl;

	str = "abcdefghij";
	
	cout << "enter a position: ";
	cin >> pos;
	
	cout << "enter a number you want delete: ";
	cin >> n;
	
	for(int i=0; i<str.size(); i++) {
		if(i < pos || i >= pos+n) {
			result2 += str[i];
		}
	}
	
	cout << "after deletion: " << result2 << endl;
	
	return 0;
	
}
