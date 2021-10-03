# -- coding: utf-8 --
def add():
    print('Введите год:')
    y = int(input())
    if (y % 4 == 0) and (y % 100 > 0) or (y % 400 == 0):
        return 'Да'
    else:
        return 'Нет'
print (add())