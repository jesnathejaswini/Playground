#include<iostream>
int main()
{
	int a,b,c;int k;
  	std::cout<<"Enter first number :";
  	std::cin>>a;
  	std::cout<<" Enter second number :";
  	std::cin>>b;
  	std::cout<<" Menu";
  	std::cout<<"\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder";
  	std::cin>>k;
  	switch(k)
    {
      case 1: c=a+b;
        	  std::cout<<"\n"<<c;
        	  break;
      case 2: c=a-b;
        	  std::cout<<"\n"<<c;
        	  break;
      case 3: c=a*b;
        	  std::cout<<"\n"<<c;
        	  break;
      case 4: c=a/b;
        	  std::cout<<"\n"<<c;
        	  break;
      case 5: c=a%b;
        	  std::cout<<"\n"<<c;
        	  break;
      default: std::cout<<"\n"<<"Invalid operation";
    }
  return 0;
}