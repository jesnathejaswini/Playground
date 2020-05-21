#include<bits/stdc++.h> 
using namespace std;
  
    void printArray(int result[], int no_of_rows) { 
        for (int i = 0; i < no_of_rows; i++) { 
            cout<< result[i]<<"\n"; 
        } 
  
    } 
  
  
    int main() 
    { 
      int n,m;
      std::cin>>m>>n;
        int arr[m][n]; 
      for(int i=0;i<m;i++)
        for (int j=0;j<n;j++)
          std::cin>>arr[i][j];
        int i = 0;
        int max = 0; 
        int result[m]; 
        while (i < m) { 
            for (int j = 0; j < n; j++) { 
                if (arr[i][j] > max) { 
                    max = arr[i][j]; 
                } 
            } 
            result[i] = max; 
            max = 0; 
            i++; 
  
        } 
        printArray(result,m); 
  
    } 