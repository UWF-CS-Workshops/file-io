
#include <iostream>
#include <fstream>
#include <cstdlib>
#include <iomanip>
using namespace std;

void make_neat(ifstream& messy_file, ofstream& neat_file,
             int number_after_decimalpoint, int field_width);

int main( )
{
    ifstream fin;
    ofstream fout;

    fin.open("rawdata.dat");
    if (fin.fail( ))
    {
        cout << "Input file opening failed.\n";
        exit(1);
    }

    fout.open("neat.dat");
    if (fout.fail( ))
    {
        cout << "Output file opening failed.\n";
        exit(1);
    }

    make_neat(fin, fout, 5, 12);

    fin.close( );
    fout.close( );

    cout << "End of program.\n";
    return 0;
}
//Uses iostream, fstream, and iomanip:
void make_neat(ifstream& messy_file, ofstream& neat_file,
              int number_after_decimalpoint, int field_width)
{
    neat_file.setf(ios::fixed);
    neat_file.setf(ios::showpoint);
    neat_file.setf(ios::showpos);
    neat_file.precision(number_after_decimalpoint);
    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.setf(ios::showpos);
    cout.precision(number_after_decimalpoint);

    double next;
    while (messy_file >> next)
    {
        cout << setw(field_width) << next << endl;
        neat_file << setw(field_width) << next << endl;
    }
}

