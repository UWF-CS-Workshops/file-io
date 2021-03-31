#include"iodemo.hpp"

int main()
{
  IODemo * p = new IODemo();
  std::cout << "Processing file" << std::endl;
  p->processFile();
}