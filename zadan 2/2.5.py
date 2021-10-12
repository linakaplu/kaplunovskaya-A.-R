# -- coding: utf-8 --
def add (a, b, c):
    if a<=b and a<=c:
        return a 
    if b<=a and b<=c:
        return b
    else:
        return c 
print(add (int(input('число a:')), int(input('число b:')), int(input('число c:'))))
