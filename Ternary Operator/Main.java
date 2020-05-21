#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int a=n%2;
  (a==0) ? std::cout<<"Even" : std::cout<<"Odd";
}