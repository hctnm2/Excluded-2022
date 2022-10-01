#include <iostream>
#include <string.h>
using namespace std;

typedef class Employee
{
    public:
    string name;
    int age;
    int salary;
    void gibdetails(string e_name, int e_age,int e_salary );
    void printdetails(void)
    {
        cout << endl << "Name : " << name ;
        cout << endl << "Age : " << age ;
        cout << endl << "Salary" << salary;

    }
}emp;

    void Employee :: gibdetails(string e_name, int e_age, int e_salary )
    {
        name = e_name;
        age = e_age;
        salary = e_salary;
    }

int main()
{
    emp ram;
    ram.gibdetails("Ram",18,25000);
    ram.printdetails();

    emp shyam;
    shyam.gibdetails("Shyam",40, 50000);
    shyam.printdetails();
 


return 0;
}