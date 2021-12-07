#--coding:utf-8 --
def n():
    s = (input("строка "))
    if s.count ('h')>1:
        k=(s[:s.find('h')] + s[s.rfind('h')+1:])
        print (k)
    else:
        print ("букв h должно быть больше")
n()