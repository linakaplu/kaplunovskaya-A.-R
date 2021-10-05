# -- coding: utf-8 --
seconds = int(input("Введите количество секунд: "))
day = seconds // 86400
hour = seconds // 60 // 60 % 24
min = seconds // 60 % 60
sec = seconds % 60
print (day,'дней',hour,'часов',min,'минут',sec)
