#include<iostream>
using namespace std;
int main()
{
  int m,n;
  std::cin>>m>>n;
  int mat[m][n];
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
      std::cin>>mat[i][j];
  for (int i = 0; i < m; i++) 
  {
    int sum = 0;
    for (int j = 0; j < n; j++) 
    {
      sum += mat[i][j];
    } 
    std::cout<<sum<<"\n";
  }
}