#include <iostream>
using namespace std;
int main() 
{
 
  int i , u = 1, sum = 0;
  int start,end;
  std::cin>>start;
  std::cin>>end;
  i=start;
  while (i <= end) 
  {
    while (u <= end) 
    {
      if (u < i) 
      {
        if (i % u == 0)
          sum = sum + u;
      }
      u++;
    }
    if (sum == i) {
      std::cout << i << " ";
    }
    i++;
    u = 1;
    sum = 0;
  }
}