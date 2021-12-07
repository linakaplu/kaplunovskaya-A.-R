#--coding:utf-8 --
def n():
    s=input()
    print(s[(len(s) + 1) // 2:] + s[:(len(s) + 1) // 2])
n()