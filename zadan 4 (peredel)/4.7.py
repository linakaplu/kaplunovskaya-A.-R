#--coding:utf-8 --
def n():
    s = (input("строка "))
    if s.count ('h')>1:
        a = s[:s.find('h')]
        b = s[s.rfind('h')+1:]
        k=(a + b)
        print (k)
    else:
        print ("букв h должно быть больше")
n()