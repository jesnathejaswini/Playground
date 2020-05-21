#include<iostream>

int main()
{
    char str1[50];char str2[50];
    int i=0; int flag=0;
    scanf("%s",str1);
    scanf("%s",str2);
    while(str1[i]!='\0' && str2[i]!='\0')
{
         if(str1[i]!=str2[i])
{
             flag=1;
             break;
}
         i++;
    }
    if(flag==0&&(str1[i]=='\0'&&str2[i]=='\0'))
    printf("It is correct");
    else
    printf("It is wrong");
    return 0;
}