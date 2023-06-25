#include <fstream>
#include <iostream>
#include <string>
#include <vector>
#include <math.h>
using namespace std;

int convertBinaryVectorToDec(vector<int>& n)
{
    int dec = 0;
    int i = 0;
    int rem;

    for (int v = n.size() - 1; v >= 0; v--)
    {
        dec += pow(2, i) * n[v];
        i++;
    }
    return dec;
}

int main()
{
    ifstream inputFile("../inputs/day_3");

    int rows = 0;
    string line;
    getline(inputFile, line);

    int cols = line.length();
    vector<int> sums(cols, 0);
    vector<int> sums_inv(cols, 0);
    inputFile.seekg(0);

    while (getline(inputFile, line))
    {
        rows++;
        for (int i = 0; i < cols; i++)
        {
            sums[i] += line[i] - '0';
        }
    }

    int threshold = rows / 2;

    for (auto& ele : sums){
        if (ele > threshold){
            ele = 1;
        }
        else {
            ele = 0;
        }
    }

    int gamma = convertBinaryVectorToDec(sums);
    
    for (auto& ele : sums){
        ele = abs(1-ele);
    }
    int eps = convertBinaryVectorToDec(sums);
    cout << gamma * eps << endl;
}
