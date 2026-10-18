//Write a C++ program to print the transpose of a given matrix using a function. 

#include <iostream>

using namespace std;

void printTranspose(int mat[][100], int rows, int cols) {
	cout << "transpose of matrix is: ";
	for(int i=0; i<cols; i++) {
		for(int j=0; j<rows; j++) {
			cout << mat[j][i] << " ";
		}
		cout << endl;
	}
}

int main() {
	int rows, cols;
	cout<< "enter a number of rows: ";
	cin >>  rows;
	
	cout<< "enter a number of cols: ";
	cin >>  cols;
	
	int mat[100][100];
	
	cout << "enter elements of matrix: ";
	for(int i=0; i<rows; i++) {
		for(int j=0; j<cols; j++) {
			cin >> mat[i][j];
		}
	}
	
	printTranspose(mat, rows, cols);
	
	return 0;
}
