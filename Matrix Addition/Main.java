#include<iostream>
#include<stdlib.h>

using namespace std;

void arrayAdd(int firstArray[], int secondArray[], int targetArray[], int size){
    int *firstPtr = firstArray;
    int *secondPtr = secondArray;
    int *tragetPtr = targetArray;

   while (firstPtr <= &firstArray[size] ){
       //add the first two array elements 
       *tragetPtr = (*firstPtr + *secondPtr);

      // point to the next location
      *firstPtr++;
      *secondPtr++;
      *tragetPtr++;
   }
}


int main() {

    int totalElements,m,n;
    const size_t ARRAY_SIZE = 50;
    int firstIntegerArray[ARRAY_SIZE];
    int secondIntegerArray[ARRAY_SIZE];
    int thirdIntegerArray[ARRAY_SIZE];

   std:: cin >> m>>n;
   totalElements=m*n;

    for(int i = 1; i <= totalElements; i++){
        cin >> firstIntegerArray[i];
    }

    for(int i = 1; i <=totalElements; i++){
        cin >> secondIntegerArray[i];
    }

    //run our arrayAdd function 
    arrayAdd(firstIntegerArray, secondIntegerArray, thirdIntegerArray, totalElements);
    for(int i =1; i <=totalElements; i++){
        cout << thirdIntegerArray[i] << " ";
      if(i%n==0)
        std::cout<<"\n";
    }

    return 0;

}