#include"iodemo.hpp"
#include<sstream>
#include<vector>

void IODemo::processFile()
{
  std::ifstream in;
  in.open("People.csv");
  if(in.fail())
  {
    std::cout << "open failed" << std::endl;
    exit(-1);
  }
  std::string line;
  std::vector<std::string> tokens; 
  while (std::getline(in, line))
  {
    std::stringstream check1(line);    
    std::string intermediate; 
      
    // Tokenizing w.r.t. space ',' 
    while(getline(check1, intermediate, ',')) 
    { 
        tokens.push_back(intermediate); 
    } 
      
    // Printing the token vector 
    for(int i = 0; i < tokens.size(); i++) 
        std::cout << tokens[i] << '\n'; 
    tokens.clear(); 
  }
}