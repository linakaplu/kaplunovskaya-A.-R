#--coding:utf-8 --
def n():
    s = (input("Введите два слова:"))
    print(s[s.find(' ')+1:] + " " + s[:s.find(' ')])
n()