# -- coding: utf-8 --
n=int(input('Введите количество минут:'))
hour = 0
min = 0
hour = n//60
min = n % 60
while hour>23:
    hour = hour - 23
print('часы:', hour, 'минуты:', min)
