#include<iostream>
#include <bits/stdc++.h>
using namespace std;
void selectionSort(int a[], int n) {
   int i, j, min, temp;
   for (i = 0; i < n - 1; i++) {
      min = i;
      for (j = i + 1; j < n; j++)
         if (a[j] < a[min])
            min = j;
      temp = a[i];
      a[i] = a[min];
      a[min] = temp;
   }
}
int main()
{
  int n,c;
        std::cin>>n>>c;

        int mugs[n];
        for (int i = 0; i < n; ++i) {
            std::cin>>mugs[i];
        }

       selectionSort(mugs,n);
        int t = 0;
        for (int i = 0; i < n ; ++i) {
            t += mugs[i];
            if (mugs[i] <= c && t <= c) {
                continue;
            } else {
                std::cout<<"NO";
                exit(0);
            }
        }
  std::cout<<"YES";
    }