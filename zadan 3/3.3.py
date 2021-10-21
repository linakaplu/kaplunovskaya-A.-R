 #--coding:utf-8 --
A = int(input('первое число:'))
B = int(input('второе число:'))
if A<B:
    print('первое число должно быть больше')
else:
    for i in range (A, B-1, -2):
        if (i%2==1):
            print (i)
        else:
            print (i-1)