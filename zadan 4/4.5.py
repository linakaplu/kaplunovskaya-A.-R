#--coding:utf-8 --
s = input()
if s.count('f')==1:
    print(s.find('f'))
if s.count('f') >= 2:
    print(s.find('f'), s.rfind('f'))