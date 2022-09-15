
class node:
    def __init__(self, value = None, sig = None):
        self.value = value
        self.sig = sig

class lista_ligada: 
    def __init__(self):
        self.head = None
        
    def is_empty(self):
        return self.head == None
    
    def agregarInicio(self, value):
        self.head = node(value=value, sig=self.head)  
        
    def agregarFinal(self, value):
        if not self.head:
            self.head = node(value=value)
            return
        temp = self.head
        while temp.sig:
            temp = temp.sig
        temp.sig = node(value=value)
        
    def imprimirlista( self ):
        node = self.head
        while node != None:
            print(node.value, end =",")
            node = node.sig
            
    def imprimirlistaVacia( self ):
        node = self.head
        if node != None:
            imprimirlista
        else: print("Lista vacia")
            
            
s = lista_ligada()
s.imprimirlistaVacia()
s.agregarInicio(9)
s.agregarInicio(8)
s.agregarInicio(7)
s.agregarInicio(6)
s.agregarInicio(5)
s.agregarInicio(4)
s.agregarInicio(3)
s.agregarInicio(2)
s.agregarInicio(1)
s.agregarInicio(0)
s.imprimirlista()
    

        

        
     
