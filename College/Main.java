#include<stdio.h>
#include<string.h>
struct College{char name[100];
              char city[100];
               int establishmentYear;
               float passPercentage;
              }S1[20],temp;
int main(){
  
  int n,i,j;
  printf("Enter the number of colleges\n");
  scanf("%d",&n);
  for(i=0;i<n;i++){
    printf("Enter the details of college %d\n",i+1);
    printf("Enter name\n");
    scanf("%s",S1[i].name);
    printf("Enter city\n");
    scanf("%s",S1[i].city);
    printf("Enter year of establishment\n");
    scanf("%d",&S1[i].establishmentYear);
    printf("Enter pass percentage\n");
    scanf("%f",&S1[i].passPercentage);
  }
   for (i = 1; i < n; i++)
      for (j = 0; j < n - i; j++) {
         if (strcmp(S1[j].name, S1[j + 1].name) > 0) {
            temp = S1[j];
            S1[j] = S1[j + 1];
            S1[j + 1] = temp;
         }
      }
 printf ("Details of colleges\n");
   for (i = 0; i < n; i++) {
     if(i==0)
      printf("College:%d\nName:%s\nCity:%s\nYear of establishment:%d\nPass percentage:%.1f\n",i+1,S1[i].name,S1[i].city,S1[i].establishmentYear,S1[i].passPercentage);
     else
       printf("College:%d\nName:%s\nCity:%s\nYear of establishment:%d\nPass percentage:%.2f\n",i+1,S1[i].name,S1[i].city,S1[i].establishmentYear,S1[i].passPercentage);
  
   }
  return 0;
}