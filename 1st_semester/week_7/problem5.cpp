//Develop a C++ program to find the greatest of two numbers using this pointer, which returns the member variable. 

#include <iostream>

using namespace std;

class compare {
	int a, b;
public:
	void set_data(int x, int y) {
		this->a = x;
		this->b = y;
	}
	int greatest() {
		if(this->a > this->b) {
			return this->a;
		} else {
			return this->b;
		}
	}
};

int main() {
	compare num;
	int x, y;
	cout << "enter two numbers: ";
	cin >> x >> y;
	
	num.set_data(x, y);
	
	int result = num.greatest();
	
	cout << "Greatest number is: " << result << endl;
	
	return 0;
}
