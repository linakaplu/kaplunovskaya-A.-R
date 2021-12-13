#--coding: utf-8--

from tkinter import *
from tkinter import ttk
from tkinter import messagebox

def x1():
    k = txt1.get()
    N = int(k)
    i = 1
    result = ""
    while i ** 2 < N:
        result += str(i**2)
        i += 1
        result = result + " "
    out1.configure(text = result)
    messagebox.showinfo("квадраты чисел", result)

def x2():
    k = txt2.get()
    N = int(k)
    i = 2
    while N % i != 0:
        i += 1
    out2.configure(text = i)
    messagebox.showinfo("наименьший общий делитель", i)

def x3(): 
    k = txt3.get()
    N = int(k)
    chis = 2
    step = 1
    while N >= chis:
        chis *= 2
        step += 1
    result=str(step-1) + ", " + str(chis//2)
    out3.configure(text = result)
    messagebox.showinfo("показатель степени, степень", result)

def x4():
    x = int(txt4_1.get())
    y = int(txt4_2.get() )
    n = 1
    while x < y:
        x = x*0.1 + x
        n += 1
    result = str(n)
    out4.configure(text = result)
    messagebox.showinfo("номер дня", result)


window = Tk()
window.title("практика №6")  #название окна
window.geometry("800x400")
tab_control = ttk.Notebook(window)
tab1 = ttk.Frame(tab_control)
tab2 = ttk.Frame(tab_control)
tab3 = ttk.Frame(tab_control)
tab4 = ttk.Frame(tab_control)

tab_control.add(tab1, text="№1")
tab_control.add(tab2, text="№2")
tab_control.add(tab3, text="№3")
tab_control.add(tab4, text="№4")


lbl1 = Label(tab1, text="введите число", font=("Arial bold", 12), padx=5, pady=5) #текст 
lbl1.grid(column=0, row=0)
lbl2 = Label(tab2, text="введите число", font=("Arial bold", 12), padx=5, pady=5)  
lbl2.grid(column=0, row=0)
lbl3 = Label(tab3, text="введите число", font=("Arial bold", 12), padx=5, pady=5) 
lbl3.grid(column=0, row=0)
lbl4 = Label(tab4, text="введите числа", font=("Arial bold", 12), padx=5, pady=5) 
lbl4.grid(column=0, row=0)

txt1 = Entry(tab1, width=7, font=(12))
txt1.grid(column=1, row=0)
txt2 = Entry(tab2, width=7, font=(12))
txt2.grid(column=1, row=0)
txt3 = Entry(tab3, width=7, font=(12))
txt3.grid(column=1, row=0)
txt4_1 = Entry(tab4, width=7, font=(12))
txt4_1.grid(column=1, row=0)
txt4_2 = Entry(tab4, width=7, font=(12))
txt4_2.grid(column=1, row=1)

btn1 = Button(tab1, text="тык", command=x1, bg="yellow", fg="black") #кнопка
btn1.grid(column=3, row=0)
btn2 = Button(tab2, text="тык", command=x2, bg="yellow", fg="black") 
btn2.grid(column=3, row=0)
btn3 = Button(tab3, text="тык", command=x3, bg="yellow", fg="black") 
btn3.grid(column=3, row=0)
btn4 = Button(tab4, text="тык", command=x4, bg="yellow", fg="black") 
btn4.grid(column=3, row=1)

inp1 = Label(tab1, text = "ответ: ", font=("Arial bold", 12)) 
inp1.grid(column=4, row=2)
inp2 = Label(tab2, text = "ответ: ", font=("Arial bold", 12)) 
inp2.grid(column=4, row=2)
inp3 = Label(tab3, text = "ответ: ", font=("Arial bold", 12)) 
inp3.grid(column=4, row=2)
inp4 = Label(tab4, text = "ответ: ", font=("Arial bold", 12)) 
inp4.grid(column=4, row=2)

out1 = Label(tab1, text=" ", font=("Arial bold", 12)) 
out1.grid(column=5, row=2)
out2 = Label(tab2, text=" ", font=("Arial bold", 12)) 
out2.grid(column=5, row=2)
out3 = Label(tab3, text=" ", font=("Arial bold", 12)) 
out3.grid(column=5, row=2)
out4 = Label(tab4, text=" ", font=("Arial bold", 12)) 
out4.grid(column=5, row=2)

tab_control.pack(expand=1, fill='both')
window.mainloop()