#include<iostream>
using namespace std;
int main()
{
  int m,n;
  std::cin>>m>>n;
  int mat[m][n];
  for(int i=0;i<m;i++)
    for (int j=0;j<n;j++)
      std::cin>>mat[i][j];
  int maxElement =0;
  for (int i = 0; i < m; i++) 
  {
    for (int j = 0; j < n; j++)
    {
      if (mat[i][j] > maxElement)
      {
        maxElement = mat[i][j];
      }
    }
  }
  std::cout<<"The maximum element is "<<maxElement; 
}