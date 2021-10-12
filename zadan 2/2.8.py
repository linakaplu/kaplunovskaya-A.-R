# -- coding: utf-8 --
def add (a, b, c):
    if a==b and a==c:
        return ('3')
    if a==b or a==c or b==c:
        return ('2')
    else:
        return ('0')
print (add (int(input('a: ')), int(input('b: ')), int(input('c: '))))