//Write a C++ program to find a string within a sentence and replace it with another string.

#include <iostream>

using namespace std;

int main() {
	string line, toFind, toReplace, temp = "", result = "";
	cout << "enter a sentence: ";
	getline(cin, line);
	
	cout << "enter the word to find: ";
	cin >> toFind;
	
	cout << "enter the word to replace: ";
	cin >> toReplace;
	
	line += ' ';
	
	for(int i=0; i<line.length(); i++) {
		if(line[i] != ' ') {
			temp += line[i];
		} else {
			if(toFind == temp) {
				result += toReplace + " ";
			} else {
				result += temp + " ";
			}
			temp = "";
		}
	}
	
	cout << "Modified sentence: " << result << endl;
	
	return 0;
}

