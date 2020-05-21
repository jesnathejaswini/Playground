#include<stdio.h>
int main()
{
    int n,i,j,k,s;
    scanf("%d",&n);
    s=n;
  for(i=1;i<=4;i++)
    {
        for(k=1;k<=i;k++)
        {
            printf("%d",s);
        }
        s++;
        printf("\n");
    }
    s--;
    for(i=4;i>=1;i--)
    {
        for(k=1;k<=i;k++)
        {
            printf("%d",s);
        }
        s--;
        printf("\n");
    }
    return 0;
}