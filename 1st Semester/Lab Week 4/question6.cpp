/*A character is entered through keyboard. Write a C++ program to determine
whether the character entered is a capital letter, a small case letter, a digit or a
special symbol using if-else and switch case. The following table shows the range of ASCII values for various characters.
Characters ASCII values A - Z: 65 - 90, a - z: 97 - 122, 0 - 9: 48 - 57
Special symbols 0 - 47, 58 - 64, 91 - 96, 123 - 127 */

#include<iostream>

using namespace std;

int main() {

    char ch;
    int n;

    cout << "Enter the character: ";
    cin >> ch;

    n = int(ch);
    
    if(n >= 0 && n <=47) {
        cout << "The character is a special symbol" << endl;
    }
    else if(n >= 48 && n <= 57) {
        cout << "The character is a 0-9 digit";
    }
    else if(n >= 58 && n <= 64) {
        cout << "The character is a special symbol";
    }
    else if(n >= 65 && n <= 90) {
        cout << "The character is a Capital Letter";
    }
    else if(n >= 91 && n <= 96) {
        cout << "The character is a special symbol";
    }
    else if(n >= 97 && n <= 122) {
        cout << "The character is a small letter";
    }
    else if(n >= 123 && n <= 127) {
        cout << "The character is a special character";
    }
    else {
        cout << "wrong Input";
    }


    return 0;
}
