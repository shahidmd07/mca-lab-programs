//Write a C++ program to find the second-largest integer in a list of integers.

#include <iostream>

using namespace std;

int main() {
    int arr[] = {12, 35, 1, 10, 34, 2};
    int n = sizeof(arr) / sizeof(arr[0]);

    int largest = INT_MIN;
    int secondLargest = INT_MIN;

    for (int i = 0; i < n; i++) {
        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        }
        else if (arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i];
        }
    }

    if (secondLargest == INT_MIN) {
        cout << "No second largest element found!" << endl;
    } else {
        cout << "Second largest element is: " << secondLargest << endl;
    }

    return 0;
}

