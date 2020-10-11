#include<iostream>
int main()
{
  // Type your code here
  int num,digit=0;
    //user input
    std::cin>>num;
    //loop to find number digits
    do
    {
            num=num/10;
            digit++;
    }while(num!=0);
    //output
    std::cout<<digit;
    return 0;
}