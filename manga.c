#include <stdio.h>

FILE *arq;
int _quantLinhas = 80;
char _mangaArq[80] = "manga.txt";
char filename[32];

void NemGostoN() {
    int i;
    while (i < 1000) {
        sprintf(filename, "manga%d.txt", i);
        arq = fopen(filename, "w");
        i++;
    }
    
}

void main()
{
    NemGostoN();
}



