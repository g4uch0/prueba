
"""x = 10
y = 2
z = x + y

print ( x, " + ", y, "=", z)
print (id(x), id(y))

#Tipos int, float, String, Bool

x = 10
print (x)
print(type(x))

x = 14.5
print (x)
print(type(x))

x = "Hola"
print (x)
print(type(x))

x = True
print (x)
print(type(x))"""


num1 = int(input("Ingrese un numero: "))

if(num1 % 2 == 0):
    print ("El numero es par")
else:
    print ("El numero es impar")
