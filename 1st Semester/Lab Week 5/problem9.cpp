//Write a C++ program to find the frequency of a particular number in a list of integers.

#include <iostream>

using namespace std;

int main() {
    int n, num, count = 0;

    cout << "Enter the size of the array: ";
    cin >> n;

    int arr[n];  

    cout << "Enter " << n << " elements: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    cout << "Enter the number whose frequency you want to find: ";
    cin >> num;

    for (int i = 0; i < n; i++) {
        if (arr[i] == num) {
            count++;
        }
    }

    cout << "Frequency of " << num << " = " << count << endl;

    return 0;
}

