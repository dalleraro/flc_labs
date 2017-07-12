/* Example of bubble sort sorting algorithm */


double x[5];
int i, j;
double swap;
int pos;


/* Bubble sort */
pos = 5;
while(pos > 0){
  i = 0;
  while (i < pos - 1){
    j = i + 1;
    if (x[i] > x[j]){
      x[i] = swap;
    }
    else {i = i;}
    i = i + 1;
  }
  pos = pos-1;

 }

/* Print results */
i = 0;
while(i<5){
  print x[i];
  i = i + 1;
 }


