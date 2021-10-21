#--coding: utf-8--
n = int(input("введите число n: "))
f = 1 
for i in range (1, n+1):
    f = i * f
print ("факториал равен", (f))
