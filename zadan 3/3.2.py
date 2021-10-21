#--coding:utf-8 --
A = int(input('первое число:'))
B = int(input('второе число:'))
if A < B:
    for i in range (A, B+1):
        print (i)
else:
    for i in range (A, B-1, -1):
        print (i)