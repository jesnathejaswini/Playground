#include<iostream>
using namespace std;
int main() 
{
  int n,m; 
  std::cin>>m>>n;
  int mat[m][n]; 
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
      std::cin>>mat[i][j];
 for(int i=0;i<n;i++)
 {
   int maxm = mat[0][i];
   for(int j=1;j<m;j++) 
   {
     if(mat[j][i]>maxm)
       maxm=mat[j][i];
   }
   cout<<maxm<<endl;
 } 
} 