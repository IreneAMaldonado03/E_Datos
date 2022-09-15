#Creacion de lista vacia
Lista=[]
#Relleno de lista 
for valor in range(1,11):
    Lista.append(valor)
print(Lista)

#Asignacion de sublistas 
triada1=Lista[:3]
print(triada1)

triada2=Lista[3:6]
print(triada2)

triada3=Lista[6:9]
print(triada3)

sobrante=Lista[9:]
print(sobrante)

#Añadir 3 elementos al final 
Lista.append(11)
Lista.append(12)
Lista.append(13)
print(Lista)

#Añadir 1 elemento al inicio
Lista.insert(0,0)
print(Lista)

#Añadir 3 elementos al final 
Lista.insert(12,11.5)
Lista.insert(14,12.5)
print(Lista)

#Concatenar las sublistas
ListaR=sobrante+triada3+triada2+triada1
print (ListaR)
