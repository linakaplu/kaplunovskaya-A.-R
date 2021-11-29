 #--coding:utf-8 --
N = int(input("Введите число: "))
chis = 2
step = 1
while N >= chis:
    chis *= 2
    step += 1
print (step-1, chis//2)
