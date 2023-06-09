//Program to draw red rectangle and yellow circle

#include <graphics.h>
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int gd = DETECT, gm;~
    initgraph(&gd, &gm, NULL);
 
    circle(50, 50, 30);
 
    return 0;
}