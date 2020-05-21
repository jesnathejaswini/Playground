#include<iostream>
using namespace std;
int main()
{
  int x,m;
  std::cin>>x;
  m=x%2;
  (m==0)?std::cout<<"Possible":std::cout<<"Not possible";
}