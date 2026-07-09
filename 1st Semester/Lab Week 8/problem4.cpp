//Write a C++ program that reads a line of text and counts all occurrences of a particular word.

#include <iostream>
#include <cstring>

using namespace std;

int main() {
	string line, word, temp = "";
	int count = 0;
	cout << "enter a line of text: ";
	getline(cin, line);
	
	cout << "enter the word to search: ";
	cin >> word;
	
	line += ' ';
	
	for(int i=0; i<line.length(); i++) {
		if(line[i] != ' ') {
			temp += line[i];
		} else {
			if(word == temp) {
				count++;
			}
			temp = "";
		}
	}
	
	cout << "the word '" << word << "' occurs " << count << " times.";
	
	return 0;
	
	
}
 
