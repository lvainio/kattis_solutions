#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;

    int* bus_numbers = new int[n];
    for (int i = 0; i < n; i++) {
        cin >> bus_numbers[i];
    }
    sort(bus_numbers, bus_numbers + n);

    for (int i = 0; i < n; i++) {
        if (i >= n-2) {
            cout << bus_numbers[i] << " ";

        } else if (bus_numbers[i] != bus_numbers[i+1] - 1) {
            cout << bus_numbers[i] << " ";
        
        } else if (bus_numbers[i+1] != bus_numbers[i+2] - 1) {
            cout << bus_numbers[i] << " ";

        } else {
            int last = i;
            for (int j = i; j < n-1; j++) {
                if (bus_numbers[j] != bus_numbers[j+1]-1) {
                    break;
                }
                last++;
            }
            cout << bus_numbers[i] << "-" << bus_numbers[last] << " ";
            i = last;
        }
    }
    return 0;
}