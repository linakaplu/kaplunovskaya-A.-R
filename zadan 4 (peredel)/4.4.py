#--coding:utf-8 --
def n():
    s = (input("Введите два слова:"))
    a = s[s.find(' ')+1:]
    b = s[:s.find(' ')]
    print(a, b)
n()