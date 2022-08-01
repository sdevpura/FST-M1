class car:
    'This is a Car class'
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer+" "+self.model+" is moving")
    def stop(self):
        print(self.manufacturer+" "+self.model+" has stopped")


c1=car("Kia", "Sonnet", "2021", "IMT", "White")
c2=car("Hyundai", "i20", "2010", "Manual", "Black")
c3=car("Maruti", "Balero", "2015", "Automatic", "Red")

c1.accelerate()
c1.stop()