#--coding:utf-8 --
def n():
    s = input("введите что-то ")
    if s.count('f')==1:
        x = s.find('f')
        print (x) 
    if s.count('f') >= 2:
        y = s.find('f'), s.rfind('f')
        print (y) 
n()