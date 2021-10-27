#--coding:utf-8 --
s = input()
if s.count('h') <= 1:
    print("букв h должно быть больше!!")
else:
    print(s[:s.find('h')] + s[s.rfind('h')+1:])
    
