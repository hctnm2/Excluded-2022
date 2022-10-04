import pyqrcode  
 

text = "Text here"  
  
qr = pyqrcode.create(text)  
 
#write file name you wish to save and scale 
qr.png("qrcode.png",scale=2) 
 
qr.show() 
