#--coding: utf-8--
n = int(input("введите n: "))
f = 1
sum = 0
for i in range (1, n+1):
    f = f * i
    sum = f + sum 
print ("сума факториалов", (sum))