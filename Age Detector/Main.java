#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,age;
  std::cin>>x>>y;
  if(x>y)
  {
    age=(100-x)+y;
  }
  else
  {
    age=y-x;
}
  std::cout<<age;
}