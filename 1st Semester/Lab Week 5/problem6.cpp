//Write a C++ program to perform the following:
//a. Addition of two matrices
//b. Multiplication of two matrices

#include <iostream>

using namespace std;

int main() {
    int r1, c1, r2, c2;

    cout << "Enter rows and columns of first matrix: ";
    cin >> r1 >> c1;
    int A[r1][c1];
    cout << "Enter elements of first matrix:\n";
    for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c1; j++) {
            cin >> A[i][j];
        }
    }

    cout << "Enter rows and columns of second matrix: ";
    cin >> r2 >> c2;
    int B[r2][c2];
    cout << "Enter elements of second matrix:\n";
    for (int i = 0; i < r2; i++) {
        for (int j = 0; j < c2; j++) {
            cin >> B[i][j];
        }
    }

	// Matrix Addition (only possible if r1==r2 and c1==c2)
    if (r1 == r2 && c1 == c2) {
        int sum[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        cout << "\nMatrix Addition Result:\n";
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                cout << sum[i][j] << " ";
            }
            cout << endl;
        }
    } else {
        cout << "\nMatrix addition not possible (dimension mismatch)\n";
    }

	// Matrix Multiplication (only possible if c1==r2)
    if (c1 == r2) {
        int mul[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        cout << "\nMatrix Multiplication Result:\n";
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                cout << mul[i][j] << " ";
            }
            cout << endl;
        }
    } else {
        cout << "\nMatrix multiplication not possible (dimension mismatch)\n";
    }

    return 0;
}

