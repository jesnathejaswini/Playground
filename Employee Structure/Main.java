#include <iostream>
using namespace std;
 
struct Employee {
    char name[50];
    int salary;
    int id;
    int age;
    char designation[20];
};
 
int main() {
    Employee e;
     
    cout << "Enter name:\n";
    cin.get(e.name, 50);
    cout << "Enter ID:\n";
    cin>>e.id;
    cout<<"Enter age:\n";
    cin>>e.age;
    cout<<"Enter designation:\n"; 
    cin>>e.designation;
    cout << "Enter Salary: ";
    cin >> e.salary;
     
    // Printing employee details 
    cout << "\nEmployee Details" << endl;
    cout << "Name of the Employee : " << e.name << "\nID of the Employee : " << e.id << endl;
    cout << "Age of the Employee : " << e.age<< endl << "Designation of the Employee : " << e.designation;
    cout<<"\nSalary of the Employee : "<<e.salary;
    return 0;
}