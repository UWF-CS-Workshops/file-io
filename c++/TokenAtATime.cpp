#include <vector>
#include<iostream>
#include<fstream>
#include<string>

int main() {
   std::ifstream in;
   std::string word;
   in.open("words.txt");
   while (in >> word)
   {
      std::cout << word << std::endl;
   }
}