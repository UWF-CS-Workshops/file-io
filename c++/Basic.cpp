 
#include <fstream>
#include <iostream>
#include <cstdlib>

const int NAME_LENGTH = 20;

int main( )
{
    using namespace std;
    ifstream in_stream;
    ofstream out_stream;

    in_stream.open("infile.txt");
    if (in_stream.fail( ))
    {
        cout << "Input file opening failed.\n";
        exit(1);
    }

    out_stream.open("outfile.txt");
    if (out_stream.fail( ))
    {
        cout << "Output file opening failed.\n";
        exit(1);
    }
    int first, second, third;
    in_stream >> first >> second >> third;
    out_stream << "The sum of the first 3\n"
               << "numbers in infile.txt" << endl
               << "is " << (first + second + third)
               << endl;
    in_stream.close( );
    out_stream.close( );

    cout << "End of Program.\n";
    return 0;
}

