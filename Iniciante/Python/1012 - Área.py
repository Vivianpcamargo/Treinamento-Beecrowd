A, B, C = input().split()

A = float(A)
B = float(B)
C = float(C)

area_triangulo = A * C / 2
area_circulo = 3.14159 * C ** 2
area_trapezio = (A + B) * C / 2
area_quadrado = B * B
area_retangulo = A * B

print(f'TRIANGULO: {area_triangulo:.3f}')
print(f'CIRCULO: {area_circulo:.3f}')
print(f'TRAPEZIO: {area_trapezio:.3f}')
print(f'QUADRADO: {area_quadrado:.3f}')
print(f'RETANGULO: {area_retangulo:.3f}')
