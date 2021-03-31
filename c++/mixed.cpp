#include<iostream>
#include<fstream>
#include<string>

int main()
{
   int anInt; 
   float aFloat; 
   std::string aString;
   std::ifstream in;
   
   in.open("mixed.txt");
   if(in.fail())
   {
     exit(-1);
   }
   while(in >> anInt >> aFloat >> aString)
   {
     std::cout << anInt << " " << aFloat << " " << aString << std::endl;
   }
}