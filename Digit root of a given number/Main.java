#include<iostream>
int main()
{
      int n,rem;
      scanf("%d",&n);
      rem = n%9;
      if(n==0)
      {
              printf("0");
      }
      else
      {
              if(rem==0)
                        printf("9");
              else
                        printf("%d",rem);
      }
}