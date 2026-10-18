//Write a C++ programs that use recursive functions to solve towers of Hanoi problem. 

#include <iostream>

using namespace std;

void towerOfHanoi(int n, char src, char dest, char helper) {
    if (n == 1) {
    	cout << "transfer disk " << n << " from " << src << " to " << dest << endl;
        return;
    }
    towerOfHanoi(n - 1, src, helper, dest);
	cout << "transfer disk " << n << " from " << src << " to " << dest << endl;
    towerOfHanoi(n - 1, helper, dest, src);
}

int main() {
    int n;
    cout << "enter a number of disk = ";
    cin >> n;
    towerOfHanoi(n, 'S', 'D', 'H');
    return 0;
}

