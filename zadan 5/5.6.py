#--coding:utf-8 --
len = 0
sum = 0
n = int(input('Введите числа: '))
while n != 0:
    sum += n 
    len += 1
    n = int(input())
print(sum/len)
