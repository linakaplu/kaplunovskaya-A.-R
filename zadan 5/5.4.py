#--coding:utf-8 --

x = int(input("Введите x: "))
y = int(input("Введите y: "))
n = 1
while x < y:
    x *= 1.1
    n += 1
print (n)