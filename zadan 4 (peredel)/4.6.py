#--coding:utf-8 --

def n():
    s = input("строка ")
    if s.count('f') >= 2:
        a = s.find('f', s.find('f')+1)
        print (a)
    if s.count('f') == 1:
        b = -1
        print (b)
    if s.count('f') == 0:
        print (-2)
n()
