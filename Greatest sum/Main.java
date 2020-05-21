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
  int idx = -1; 
    int maxSum = 0; 
  std:: cout<<"Sum of rows is ";
    for (int i = 0; i < m; i++) { 
        int sum = 0; 
        for (int j = 0; j < n; j++) { 
            sum += mat[i][j]; 
        } 
  std::cout<<sum<<" ";
        if (sum > maxSum) { 
            maxSum = sum;
            idx = i; 
        } 
    }
    cout << "\nRow " << idx+1 << " has maximum sum"; 
  idx = -1; 
  std::cout<<"\nSum of columns is ";
    maxSum =0; 
    for (int i = 0; i < m; i++) { 
        int sum = 0;  
        for (int j = 0; j < n; j++) { 
            sum += mat[j][i]; 
        } 
  std::cout<<sum<<" "; 
        if (sum > maxSum) { 
            maxSum = sum; 
            idx = i; 
        } 
    } 
  std::cout<<"\nColumn "<<idx+1<<" has maximum sum";
}