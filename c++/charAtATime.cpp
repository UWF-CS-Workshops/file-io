/**********************************************************
  Demo: reading a char at a time
 **********************************************************/
#include <fstream>
#include <iostream>
#include <cstdlib>
using namespace std;

void openInput(ifstream& in, string name);
void openOutput(ofstream& out, string name);
void add_plus_plus(ifstream& in_stream, ofstream& out_stream);

int main( )
{
    ifstream fin;
    ofstream fout;

    cout << "Begin editing files.\n";
    openInput(fin, "cad.txt");
    openOutput(fout,"cplusad.txt");
    add_plus_plus(fin, fout);
    fin.close( );
    fout.close( );

    cout << "End of editing files.\n";
    return 0;
}

void openInput(ifstream& in, string name)
{
  in.open(name);
  if (in.fail( ))
  {
     cout << "Input file " << name << " did not open" << endl;
     exit(-1);
  }
}

void openOutput(ofstream& out, string name)
{
  out.open(name);
  if (out.fail( ))
  {
     cout << "Output file " << name << " did not open" << endl;
     exit(-1);
  }
}


void add_plus_plus(ifstream& in_stream, ofstream& out_stream)
{
    char next;
    in_stream.get(next);
    while (! in_stream.eof( ))
    {
        if (next == 'C')
            out_stream << "C++";
        else
            out_stream << next;

        in_stream.get(next);
    }
}
