//Write a C++ program to use this pointer and return the pointer reference.

#include <iostream>

using namespace std;

class Student {
	int rollNo;
	string name;
public:
	Student(int r, string n) {
		rollNo = r;
		name = n;
	}
	
	Student* getReference() {
		return this;
	}
	
	void display() {
		cout << "Roll: " << rollNo << ", Name: " << name << endl;
	}
};

int main() {
	Student s1(101, "Rahul");
	
	Student *ref = s1.getReference();
	
	ref->display();
	
	return 0;
}
