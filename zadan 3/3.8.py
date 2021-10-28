#--coding:utf-8 --
n = int(input("введите любое число от 1 до 9: "))
if n > 9: 
    print ("число должно быть меньше!")
else:
    for i in range(1, n + 1):
        for k in range(1, i + 1):
             print(k, sep='', end='')
        print()