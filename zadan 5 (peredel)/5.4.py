#--coding:utf-8 --

x = int(input("Введите x: "))
y = int(input("Введите y: "))
n = 1
while x < y:
    x = x*0.1 + x
    n += 1
print (n)