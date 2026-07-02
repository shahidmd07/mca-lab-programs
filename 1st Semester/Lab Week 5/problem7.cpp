//Write a C++ program to count and display positive, negative, odd, and even numbers in an array.

#include <iostream>

using namespace std;

int main() {
    int n;
    cout << "Enter the number of elements in the array: ";
    cin >> n;

    int arr[n];

    cout << "Enter " << n << " elements: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int positive = 0, negative = 0, odd = 0, even = 0;

    for (int i = 0; i < n; i++) {
        if (arr[i] >= 0)
            positive++;
        else
            negative++;

        if (arr[i] % 2 == 0)
            even++;
        else
            odd++;
    }

    cout << "\nPositive numbers: " << positive;
    cout << "\nNegative numbers: " << negative;
    cout << "\nEven numbers: " << even;
    cout << "\nOdd numbers: " << odd;

    return 0;
}

