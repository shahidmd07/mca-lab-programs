/*Write a C++ program to implement a flight class with data members as flight number, 
source, destination, and fare. Write a member function to display the flight information 
using this pointer.*/

#include <iostream>

using namespace std;

class Flight {
	int flightNumber;
	string source;
	string destination;
	float fare;
	
public:
	Flight(int fNo, string src, string dest, float fr) {
		flightNumber = fNo;
		source = src;
		destination = dest;
		fare = fr;
	}
	
	void display() {
		cout << "Flight Number: " << this->flightNumber << endl;
		cout << "Source: " << this->source << endl;
		cout << "Destination: " << this->destination << endl;
		cout << "Fare: " << this->fare << endl;
	}
};

int main() {
	Flight f1(171, "dubai international airport", "haneda international airport", 4500.50);
	Flight f2(657, "O`hare chicago international airport", "john f kennedy international airport", 4500.50);
	Flight f3(654, "heathrow international airport", "singapore changi international airport", 4500.50);
	Flight f4(890, "king abdul aziz international airport", "zayed international airport", 4500.50);
	Flight f5(245, "al maktoum international airport", "hamad international airport", 4500.50);
	Flight f6(785, "king fahad international airport", "baghdad international airport", 4500.50);
	Flight f7(425, "cairo international airport", "armsterdam international airport", 4500.50);
	Flight f8(271, "hartsfield-jackson atlanta international airport", "istanbul international airport", 4500.50);
	
	f1.display();
	f2.display();
	f3.display();
	f4.display();
	f5.display();
	f6.display();
	f7.display();
	f8.display();
	return 0;
} 
