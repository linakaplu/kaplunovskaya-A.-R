#--coding:utf-8 --
s = (input("Введите два слова:"))
print(s[s.find(' ')+1:] + ' ' + s[:s.find(' ')])
