#include<stdio.h>
int main(){
	double A,B,MEDIA = 0;
	scanf("%f",&A);
	scanf("%f",&B);
	A = A * 3.5;
	B = B * 7.5;
	MEDIA = (A + B) / 11;
	printf("MEDIA = %2.5f\n", MEDIA);
	return 0;
}
