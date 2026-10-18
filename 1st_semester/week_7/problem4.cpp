/*Write a C++ program to create three objects for a class named pntr_obj with data 
members such as roll_no & name. Create a member function set_data() for setting the 
data values and a print() member function to print which object has invoked it using the 
'this' pointer.*/

#include <iostream>
#include <cstring>

using namespace std;

class pntr_obj {
	int roll_no;
	string name;
public: 
	void set_data(int r, string n) {
		this->roll_no = r;
		this->name = n;
	}
	
	void print() {
		cout << "object at address " << this << " invoked print()" << endl;
		cout << "roll no: " << roll_no << ", name: " << name << endl;
	}
};

int main() {
	pntr_obj obj1, obj2, obj3;
	
	obj1.set_data(101, "Rahul");
	obj2.set_data(102, "Amit");
	obj3.set_data(103, "Neha");
	
	obj1.print();
	obj2.print();
	obj3.print();	
	
	return 0;
	
	
}
