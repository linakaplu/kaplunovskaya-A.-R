 #--coding:utf-8 --
A = int(input("первое число:"))
B = int(input('второе число:'))
if A >= B:
    print('второе число должно быть больше')
for i in range (A, B+1):
    print (i)