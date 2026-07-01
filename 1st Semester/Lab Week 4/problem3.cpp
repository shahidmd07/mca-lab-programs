/*Write a C++ program to evaluate the arithmetic expression ((a + b / c * d - e)
* (f - g)). Read the values a, b, c, d, e, f, g from the standard input device.*/

#include <iostream>

using namespace std;

int main() {
	int a, b, c, d, e, f, g;
	
	cout << "enter a values of a, b, c, d, e, f, g: ";
	cin >> a >> b >> c >> d >> e >> f >> g;
	
	int result = ((a + b / c * d - e) * (f - g));
	
	cout << "Result: " << result << endl;
	
	return 0;
}
